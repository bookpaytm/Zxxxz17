package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	
	
	
	
public static String CapturedScreenshot(WebDriver driver){
File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String Screenshotpath=System.getProperty("user.dir")+"./Screenshots/salman2"+CurrentformatDateTime()+".png";
try {
	FileHandler.copy(f, new File(Screenshotpath));
	System.out.println("screen shot is captured");
} catch (IOException e) {
	System.out.println("screen shot is not captured");
}
return Screenshotpath;
}
public static String CurrentformatDateTime(){
	DateFormat format=new SimpleDateFormat("MM-dd-yyyy-hh-mm-ss");
	Date currentformat=new Date();
	return format.format(currentformat);
}

}
