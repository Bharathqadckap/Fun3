package base;

import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	
	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
		ExtentHtmlReporter report = new ExtentHtmlReporter(new File("./Report/test.html"));
		extent = new ExtentReports();
		extent.attachReporter(report);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		System.out.println("afterMethod");
		if(result.getStatus() == ITestResult.FAILURE) {
			logger.fail("This is fail");
		}
		
		else if(result.getStatus() == ITestResult.SUCCESS) {
			logger.pass("This is pass");
		}
		
		extent.flush();
	}

}
