import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeCalculate {
	public static void main(String[] args) {
		/*long start = System.currentTimeMillis();
		System.setProperty("webdriver.gecko.driver", "G:\\BHANU ECLIPSE\\Bapun\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		long finish = System.currentTimeMillis();
		long totaltime = finish - start;
		System.out.println(totaltime);*/
		
		Date date = new Date();
		DateFormat dtf=new SimpleDateFormat("dd-MMM-yy hh:mm:ss");
		String strDate= dtf.format(date);  
	    System.out.println(strDate);  
				
				
	}
}