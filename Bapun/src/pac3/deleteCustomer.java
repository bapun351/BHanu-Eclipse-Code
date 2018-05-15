package pac3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class deleteCustomer {
	WebDriver d;

	@Parameters("browser")
	@Test(groups = { "ST" }, priority = 1)
	public void dCTest1(String BrowserName) {
		if (BrowserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "G:\\BHANU ECLIPSE\\Bapun\\driver\\IEDriverServer.exe");
			d = new InternetExplorerDriver();
		}
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("http://laptop-nu0oese7/login.do");

		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//input[@valign='absmiddle']")).click();

		d.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		d.findElement(By.xpath("//input[@value='Add New Customer']")).click();

		d.findElement(By.name("name")).sendKeys("pac6301");
		d.findElement(By.name("createCustomerSubmit")).click();

		d.findElement(By.xpath("//a[text()='pac6301']")).click();
		d.findElement(By.xpath("//input[@value='Delete This Customer']")).click();

		Alert alt = d.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();

		d.findElement(By.xpath("//img[@class='logoutImg']")).click();
		d.close();

	}

	@Test(groups = { "RT" }, priority = 2)
	public void dCTest2() {
		System.out.println("executed");
	}

}
