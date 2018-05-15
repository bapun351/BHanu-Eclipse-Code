package logIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Actitime.objectRepository;

public class ActimeLogin {
	@Test
	public void createCustomerTest() {

		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://laptop-nu0oese7/login.do");

		objectRepository login = PageFactory.initElements(d, objectRepository.class);
		login.loginToApp("admin", "manager");
	}
}