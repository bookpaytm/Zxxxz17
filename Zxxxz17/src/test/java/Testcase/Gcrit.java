package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Baseclass;
import Pages.Pageobject;
import Utilities.Browserfactory;

public class Gcrit extends Baseclass {
	
	
	
	
	

@Test
public void launchapplication(){
logger=report.createTest("Gcrit");

System.out.println(driver.getTitle());
Pageobject login=PageFactory.initElements(driver, Pageobject.class);
logger.info("pass");
login.Gcrit(excel.getString("login", 0, 0), excel.getString("login", 0, 1), excel.getString("login", 0, 2), excel.getString("login", 0, 3), excel.getString("login", 0, 4));
logger.pass("excel sheet pass");
}


}
