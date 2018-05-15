import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ieDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "G:\\BHANU ECLIPSE\\Bapun\\driver\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://www.google.com");
	}

}
