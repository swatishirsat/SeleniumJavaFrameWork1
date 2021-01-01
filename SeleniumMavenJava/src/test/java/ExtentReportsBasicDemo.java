//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//
//public class ExtentReportsBasicDemo {
//	private static WebDriver driver= null;
//
//	public static void main(String[] args) {
//		
//		
//		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
//		 
//		  // create ExtentReports and attach reporter(s)
//	        ExtentReports extent = new ExtentReports();
//	        extent.attachReporter(htmlReporter);
//	        
//	      ExtentTest test1 = extent.createTest("Google Search Test case", "This is test case to search in google"); 
//			System.setProperty("webdriver.chrome.driver", "C:/AutomationWoking/MavenProject/Drivers/chromedriver.exe");
//			driver = new ChromeDriver();
//			
//			test1.log(Status.INFO, "Starting Test Case");
//			driver.get("https://www.google.com/");
//			test1.pass("Navigated to google search page ");
//
//			driver.findElement(By.name("q")).sendKeys("Automation");
//			test1.pass("Entered Test in Search Text box");
//			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
//			test1.pass("Pressed Keyboards Enter Key");
//			driver.close();
//			driver.quit();
//			test1.pass("Closed the Browser");
//			test1.info("Test Completed");
//			
//			 // calling flush writes everything to the log file
//	        extent.flush();
//	}
//
//}
