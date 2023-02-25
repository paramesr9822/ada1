package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report extends BaseClass{
	
	public static void generateJvmReport(String jsonFile) {
			
			File file = new File(getprojectpath()+"\\target");

			Configuration configuration = new Configuration(file, "Adactin Automation");
			
			configuration.addClassifications("OS", "Windows 11");
			configuration.addClassifications("Browser", "Chrome");
			configuration.addClassifications("Browser Version", "106");
			configuration.addClassifications("Sprint", "35");
			
			List<String> jsonFiles = new ArrayList<String>();
			jsonFiles.add(jsonFile);
			
			ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
			
			builder.generateReports();
	}
}
