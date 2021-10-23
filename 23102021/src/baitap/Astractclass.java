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

public class Astractclass {
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
		@BeforeMethod 
		public static void verify_homepage() {
			String ex_tile = "Welcome: Mercury Tours";
			String bf_title = driver.getTitle();
			Assert.assertEquals(bf_title, ex_tile);
		}
		@AfterMethod
		public static void back_homepage_2() {
			WebElement back_HP_2 = driver.findElement(By.xpath("//tr[@class='mouseOut']//a[text()='Home']"));
			back_HP_2.click();
		}
		@AfterTest
		public void close_browser() {
			driver.close();
		}
}
