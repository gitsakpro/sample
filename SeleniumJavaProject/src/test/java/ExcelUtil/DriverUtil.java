package ExcelUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {
 public static WebDriver getBrowserInstance(String browserName) {
	 
	 if(browserName.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		 return new ChromeDriver();
	 }
	return null;
	 
	 
	 
	 
 } 
	
}
