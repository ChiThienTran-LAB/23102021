package baitap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Astractclass_2 {
	//Step: Start Web
		public String baseUrl = "http://demo.guru99.com/test/newtours/index.php";
		public String driverPath ="D:\\chrome\\chromedriver.exe";
		public String webdriver = "webdriver.chrome.driver";
		public static WebDriver driver;
		
		@BeforeTest
		public void open_browser() {
			System.setProperty(webdriver,driverPath);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get(baseUrl);
			driver.manage().window().maximize();
		}
		@AfterTest
		public void close_browser() {
			driver.close();
		}
}