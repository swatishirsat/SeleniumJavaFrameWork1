package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestNg_Test_1 {

	LoginPage login ;
	WebDriver driver=null;

	@BeforeTest
	public void setupTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:/AutomationWoking/MavenProject/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		login= new LoginPage(driver);
	}


	@Test(priority =0)
	public void loginTest() {			
		login.enterUsername("ABC");
		login.enterPassword("xyz");		
		login.clickSubmit();	
	}

	@AfterTest
	public void testDownTest()
	{		
		driver.close();
		driver.quit();
		System.out.println("Setup Completed");
	}



}
