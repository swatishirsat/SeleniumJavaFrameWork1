package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo {
	
	@Test
	public void test1()
	{
		System.out.println("I am inside Test1");
	}
	@Test
	public void test2()
	{
		System.out.println("I am inside Test2");
		System.setProperty("webdriver.chrome.driver", "C:/AutomationWoking/MavenProject/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.id("XYX"));
		driver.close();
		
	}
	@Test
	public void test3()
	{
		System.out.println("I am inside Test3");
		throw new SkipException("This Test is Skipped");
	}
	
	
}
