
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\BHANU ECLIPSE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(5000);
		List<WebElement> lst = driver.findElements(By.xpath("//ul[@class='sbsb_b']/li"));
		for(WebElement wb:lst)
			System.out.println(wb.getText());
	}
}
