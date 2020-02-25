package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utilities.Browserfactory;
import Utilities.Configuredataprovider;
import Utilities.Exceldataprovider;
import Utilities.Helper;

public class Baseclass {
	
	
	
	
	
public WebDriver driver;
public Exceldataprovider excel;
public Configuredataprovider config;
public ExtentReports report;
public ExtentTest logger;

@BeforeSuite
public void suiteset(){
	excel=new Exceldataprovider();
	config=new Configuredataprovider();
	report=new ExtentReports();
ExtentHtmlReporter extent=new ExtentHtmlReporter(System.getProperty("user.dir")+"./Reports/salmanH"+Helper.CurrentformatDateTime()+".html");
report.attachReporter(extent);
	
}
@BeforeClass
public void setup(){
driver=Browserfactory.startapplication(driver, config.getbrowser(), config.getappURL());
}
@AfterClass
public void shutdown(){
Browserfactory.quitbrowser(driver);
}
@AfterMethod
public void CapturedFormatDateTime(ITestResult result) throws IOException{
	if(result.getStatus()==ITestResult.SUCCESS){
		
	logger.pass("Test case is pass",MediaEntityBuilder.createScreenCaptureFromPath(Helper.CapturedScreenshot(driver)).build());
	}
	report.flush();
}

}
