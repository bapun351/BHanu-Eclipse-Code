package windowHandle;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileUpload {
	public static void main(String[] args) throws IOException {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.naukri.com/");
		d.findElement(By.xpath("//input[@value='Register with us']")).click();
		d.findElement(By.xpath("//button[@title='I am a Fresher']")).click();
		d.findElement(By.name("uploadCV")).click();

		Runtime.getRuntime().exec("C:\\Users\\Bapun\\Desktop\\autoIt\\naukri.exe");
	}

}
