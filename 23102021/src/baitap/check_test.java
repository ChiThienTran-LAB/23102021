package baitap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(baitap.ListenerTest.class)
public class check_test extends Astractclass {
	
	@Test (priority = 1)
	public static void v_rfgis() {
		WebElement click_DangKy = driver.findElement(By.xpath("//tbody//td[@class='mouseOut']//a[text()='REGISTER']"));
		click_DangKy.click();
		String ex_regis = "Register: Mercury Tours";
		String bf_regis =driver.getTitle();
		Assert.assertEquals(bf_regis, ex_regis);	
	}
	@Test (priority = 2)
	public static void click_support() {
		WebElement c_support = driver.findElement(By.xpath("//a[text()='SUPPORT']"));
		c_support.click();
		String ex_tile_2 = "Under Construction: Mercury Tours";
		String bf_title_2 = driver.getTitle();
		Assert.assertEquals(bf_title_2, ex_tile_2);
	}

}
