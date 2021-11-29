package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.json.Json;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {

	public static void reporting(String json) {
		File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Report");
		Configuration config = new Configuration(file, "Flipkart Automation");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Version", "96");
		config.addClassifications("OS", "Windows 11");
		
		List<String> jsonFile = new ArrayList<String>();
		jsonFile.add(json);
		
		ReportBuilder report = new ReportBuilder(jsonFile, config);
		report.generateReports();

	}
	

}
