package captcha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Captcha {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Git\\Bapun\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://keith-wood.name/realPerson.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Setting the captcha values
		js.executeScript(
				"document.getElementsBy.xpath('//span[text()='Default real person:']/../div/div[1]')[0].setAttribute('value', '-897204064')");
		driver.findElement(By.name("defaultReal")).sendKeys("QNXCUL");
		// Submit the form
		driver.findElement(By.xpath(".//*[@id='default']/form/p[2]/input")).submit();
	}
}
