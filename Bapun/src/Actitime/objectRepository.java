package Actitime;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class objectRepository {

	@FindBy(name = "username")
	WebElement userNameEdit;

	@FindBy(name = "pwd")
	WebElement passwordEdit;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	public void loginToApp(String userName, String password) {
		userNameEdit.sendKeys(userName);
		passwordEdit.sendKeys(password);
		loginBtn.click();
	}

}