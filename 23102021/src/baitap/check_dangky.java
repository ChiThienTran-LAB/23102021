package baitap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class check_dangky extends Astractclass_2 {
	@Test (priority = 0)
	public static void dangky() {
		WebElement click_DangKy = driver.findElement(By.xpath("//tbody//td[@class='mouseOut']//a[text()='REGISTER']"));
		click_DangKy.click();
	}
	@Test (priority = 1)
	public static void thongtin() {
		WebElement first_Name = driver.findElement(By.xpath("//input[@name='firstName']"));
		first_Name.clear();
		first_Name.sendKeys("TranChi");
		WebElement last_Name =driver.findElement(By.xpath("//input[@name='lastName']"));
		last_Name.clear();
		last_Name.sendKeys("Thien");
		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.clear();
		phone.sendKeys("0123456789");
		WebElement mail = driver.findElement(By.xpath("//input[@name='userName']"));
		mail.clear();
		mail.sendKeys("chithien@domain.com");
	}
	@Test (priority = 2)
	public static void mailling() {
		WebElement dia_chi = driver.findElement(By.xpath("//td/input[@name=\"address1\"]"));
		dia_chi.clear();
		dia_chi.sendKeys("1 Tran Hung Dao");
		WebElement city = driver.findElement(By.xpath("//td/input[@name=\"city\"]"));
		city.clear();
		city.sendKeys("Ho Chi Minh");
		WebElement state = driver.findElement(By.xpath("//td/input[@name=\"state\"]"));
		state.clear();
		state.sendKeys("District 1");
		WebElement post_code = driver.findElement(By.xpath("//td/input[@name=\"postalCode\"]"));
		post_code.clear();
		post_code.sendKeys("10000");
		WebElement VN = driver.findElement(By.xpath("//tr/td/select/option[@value=\"VIETNAM\"]"));
		VN.click();
	}
	@Test (priority = 3)
	public static void user_information() {
		WebElement username = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		username.clear();
		username.sendKeys("tranchithien");
		WebElement pass_w = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		String pass = "123123123";
		pass_w.clear();
		pass_w.sendKeys(pass);
		WebElement conf_pass = driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]"));
		conf_pass.clear();
		conf_pass.sendKeys(pass);	
	}
	@Test (enabled = false)
	public static String get_user_regis() {
		WebElement username_r = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		String str = username_r.getText();
		return str;
	}
	@Test (priority = 4)
	public static void submit_inf() {
		WebElement sub = driver.findElement(By.xpath("//input[@name=\"submit\"]"));
		sub.click();
	}
	@Test (priority = 5)
	public static void back_login() {
		WebElement back_login = driver.findElement(By.xpath("//a[text()=\" sign-in \"]"));
		back_login.click();
	}
	@Test (enabled = false)
	public static void chua_co_tk() {
		WebElement tao_tk = driver.findElement(By.linkText("registration form"));
		tao_tk.click();
	}
	@Test (priority = 6)
	public static void dangnhap() {
		WebElement user_name = driver.findElement(By.xpath("//input[@name=\"userName\"]"));
		user_name.clear();
		user_name.sendKeys("tranchithien");
		WebElement pass = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pass.clear();
		pass.sendKeys("123123123");
		WebElement go = driver.findElement(By.xpath("//input[@name=\"submit\"]"));
		go.click();
	}
	@Test (enabled = false)
	public static void dien_username() {
		WebElement user = driver.findElement(By.xpath("//input[@name=\"userName\"]"));
		user.clear();
		user.sendKeys(get_user_regis());
	}
	@Test (priority = 7)
	public static void verify_check_login() {
		WebElement txt = driver.findElement(By.xpath("//h3[text()=\"Login Successfully\"]"));
		String ex_txt = "Login Successfully";
		String bf_txt = txt.getText();
		Assert.assertEquals(bf_txt, ex_txt);
	}
}
