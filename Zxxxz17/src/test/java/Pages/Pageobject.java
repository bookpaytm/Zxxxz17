package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageobject {
	
	
	
	
	
WebDriver driver;
public Pageobject(WebDriver driver){
	this.driver=driver;
}
@FindBy(name="username1") WebElement user;
@FindBy(name="password") WebElement pass;
@FindBy(id="tdb1") WebElement button;
@FindBy(linkText="Online Catalog") WebElement Online;
@FindBy(linkText="create an account") WebElement create;
@FindBy(name="gender") WebElement gender1;
@FindBy(name="firstname") WebElement first1;
@FindBy(name="lastname") WebElement last1;
@FindBy(name="company") WebElement company1;
public void Gcrit(String Uname,String pwd,String first2,String last2,String company2){
user.sendKeys(Uname);
pass.sendKeys(pwd);
button.click();
Online.click();
create.click();
gender1.click();
first1.sendKeys(first2);
last1.sendKeys(last2);
company1.sendKeys(company2);
}

}
