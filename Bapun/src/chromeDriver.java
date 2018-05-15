import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\BHANU ECLIPSE\\Bapun\\driver\\ChromeSetup.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.quit();
	}

}
