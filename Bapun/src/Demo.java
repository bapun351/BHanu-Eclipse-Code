import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");

		WebElement wb = driver.findElement(By.id("irctc_tourism"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//a[text()='Tourist Train']")).click();

		Set<String> st = driver.getWindowHandles();
		System.out.println(st.size());
		Iterator<String> it = st.iterator();
		String pw = it.next();
		String cw = it.next();
		driver.switchTo().window(cw);
		driver.findElement(By.xpath("//div[@class='heritage']/div/span/a[text()='Book Now']")).click();
		// 3rd window
		Set<String> st1 = driver.getWindowHandles();
		System.out.println(st1.size());
		Iterator<String> it1 = st1.iterator();
		String pw1 = it1.next();
		String cw1 = it1.next();
		String cw2 = it1.next();
		driver.switchTo().window(cw2);

		WebElement wb1 = driver.findElement(By.xpath("//div[@class='container-fluid top-strip']/div/ul/li[2]/a"));
		WebElement wb2 = driver.findElement(By.xpath("//div[@class='container-fluid top-strip']/div/ul/li[3]/a"));
		System.out.println(wb1.getText());
		System.out.println(wb2.getText());
		driver.findElement(By.xpath("//a[text()='Book Now']")).click();
		driver.close();
		driver.switchTo().window(cw2);
		driver.close();
		driver.switchTo().window(cw1);
		driver.close();
		driver.switchTo().window(cw);
		driver.close();

	}

}
