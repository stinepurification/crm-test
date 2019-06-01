package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	@Test
	public void loginTest() {
		WebDriver driver = BrowserFactory.startBrowser("http://techfios.com/test/billing/?ng=admin/");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		//calling the method inside LoginPage
		loginPage.login("techfiosdemo@gmail.com", "abc123");
		driver.close();
		driver.quit();
	}
}