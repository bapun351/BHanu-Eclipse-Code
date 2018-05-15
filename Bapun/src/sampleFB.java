import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleFB {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\BHANU ECLIPSE\\Bapun\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		List<WebElement> wb = driver.findElements(By.id("month"));
		for (int i = 0; i < wb.size(); i++) {
			System.out.println(wb.get(i).getText());
		}
	}

}
