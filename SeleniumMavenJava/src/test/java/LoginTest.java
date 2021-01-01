

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {

		loginToApplication();
	}

	public static void loginToApplication()
	{
		System.setProperty("webdriver.chrome.driver", "C:/AutomationWoking/MavenProject/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");

		driver.close();
		driver.quit();
		System.out.println("Setup Completed");

	}
}
