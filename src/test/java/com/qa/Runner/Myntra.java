package com.qa.Runner;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner;
import org.apache.commons.mail.EmailException;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.Helper.ScreenRecorderHelper;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
retryCount = 3,
detailedReport = true,
detailedAggregatedReport = true,
overviewReport = true,
//coverageReport = true,
jsonUsageReport = "target/cucumber-usage.json",
usageReport = true,
toPDF = true,
//excludeCoverageTags = {"@flaky" },
includeCoverageTags = {"@HomeTest" },
outputFolder = "target")
@CucumberOptions(features="E://cucumber_amazon_framework//src//test//java//com//qa//features",
glue={"stepDefinitions"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/myntra_Report.html","json:target/cucumber.json"
		,"usage:target/cucumber-usage.json"},
tags={"@DataTable"},
dryRun=true,
monochrome=true)


public class Myntra extends AbstractTestNGCucumberTests{
	
	@AfterClass()
	public static void report() throws Exception
	{
		File file=new File(System.getProperty("user.dir")+"//src//main//java//com//qa//config//extent-config.xml");
		com.cucumber.listener.Reporter.loadXMLConfig(file);
		System.out.println("Generating report");
		//Send_email.send_email();
		
		
	}
	 
	
}


