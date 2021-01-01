package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	//Locator for username field
	By uName = By.name("userName");

	//Locator for password field
	By pswd = By.name("password");

	//Locator for login button
	By loginBtn = By.name("submit");

	//Method to enter username
	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys(user);
	}

	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}

	//Method to click on Login button
	public void clickSubmit() {
		driver.findElement(loginBtn).click();
	}

}
