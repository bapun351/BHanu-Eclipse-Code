package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class createCustomer {
	WebDriver d;

	@Parameters("browser")
	@Test(groups = { "ST" }, priority = 1)
	public void cCTest(String BrowserName) {
		if (BrowserName.equals("FIREFOX")) {
			d = new FirefoxDriver();
		}
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("http://laptop-nu0oese7/login.do");

		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//input[@valign='absmiddle']")).click();

		d.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		d.findElement(By.xpath("//input[@value='Add New Customer']")).click();

		d.findElement(By.name("name")).sendKeys("pac190");
		d.findElement(By.name("createCustomerSubmit")).click();

		d.findElement(By.xpath("//img[@class='logoutImg']")).click();
		d.close();
	}

	@Test(groups = { "RT" }, priority = 2)
	public void cCTest1() {
		System.out.println("executed");
	}

}
