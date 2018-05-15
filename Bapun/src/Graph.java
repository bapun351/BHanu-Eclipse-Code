import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Graph {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\Git\\Bapun\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://emicalculator.net/");

		// Find the specific Graph svg & get the text.
		WebElement violeteBar = d.findElement(By.cssSelector(
				"#highcharts-2>svg>g.highcharts-series-group>g.highcharts-series.highcharts-series-0.highcharts-tracker>rect:nth-child(1)"));
		Actions act = new Actions(d);
		act.moveToElement(violeteBar).clickAndHold().build().perform();
		Thread.sleep(5000);
		List<WebElement> lst = d.findElements(By.cssSelector("#highcharts-2>svg>g.highcharts-tooltip>text>tspan"));
		for (WebElement wb : lst)
			System.out.println(wb.getText());
	}
}
