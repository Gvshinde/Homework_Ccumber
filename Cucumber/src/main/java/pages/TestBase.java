package pages;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	 
	 public static void initDriver() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	 } 
	 
	 public void takeScreenshot(WebDriver driver) {
		 //interface
		  TakesScreenshot ts=(TakesScreenshot)driver; //type casting 
		  File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		  SimpleDateFormat formatter=new SimpleDateFormat("MMDDyyyy_HHmmss");
		  Date date =new Date();
		  String label=formatter.format(date);
		  try {
			//FileUtils.copyFile(sourceFile,new File(System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png"));
			  FileUtils.copyFile(sourceFile,new File(System.getProperty("user.dir")+"/screenshot/"+label+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		 
	 }
	 
}
