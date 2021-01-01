package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNgMultuBrowserDemo {

	WebDriver driver=null;
	static String projectPath = System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	public void setupTest(String browserName)
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe");
			driver = new ChromeDriver();	
		}
		
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectPath+"/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}


	@Test
	public void loginTest() throws Exception {			
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(4000);
	}

	@AfterTest
	public void testDownTest()
	{		
		driver.close();
		System.out.println("Setup Completed");
	}



}
