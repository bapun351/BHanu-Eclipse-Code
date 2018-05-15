package b123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prja {

	public static void main(String[] args) {
		// test data
		String username = "admin";
		String password = "manager";
		String customerNAme = "hdfc16";
		String expMsg = "successfully created";

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-nu0oese7/login.do");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		driver.findElement(By.name("selectedCustomer")).sendKeys(customerNAme);
		driver.findElement(By.xpath("//input[@value='Add New Project']")).click();
		driver.findElement(By.xpath("//input[@value='']")).sendKeys(customerNAme);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
