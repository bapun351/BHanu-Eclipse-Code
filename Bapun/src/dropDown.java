import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("file:///C:/Users/Bapun/Desktop/dropDown.html");
		Select sel = new Select(d.findElement(By.name("sel")));
		if (sel.isMultiple()) {
			System.out.println("drop down is multiselect");
			for (int i = 1; i <= 5; i++) {
				sel.selectByIndex(i);
			}
		} else {
			System.out.println("single select");
			sel.selectByIndex(1);
		}
		// sel.deselectAll();
	}
}