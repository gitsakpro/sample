package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mew {
	WebDriver driver;
	@Test
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","E:\\dairy\\SeleniumJavaProject\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps");
	}

}
