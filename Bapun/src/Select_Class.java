import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select_Class {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\Git\\Bapun\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wt = new WebDriverWait(d, 20);
		// d.manage().window().maximize();
		d.get("http://automationpractice.com/index.php");
		Thread.sleep(5000);
		d.findElement(By.xpath("//a[text()='Tops']/../../../../li[2]/a")).click();
		Thread.sleep(5000);
		WebElement wb = d.findElement(By.id("selectProductSort"));
		Select sel = new Select(wb);
		List<WebElement> lst = sel.getOptions();
		for (WebElement w1 : lst)
			System.out.println(w1.getText());
		sel.selectByVisibleText("Price: Lowest first");
	}
}
