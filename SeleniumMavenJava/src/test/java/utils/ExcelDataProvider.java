package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;

public class ExcelDataProvider {
	
	WebDriver driver=null;
	LoginPage login ;
	
	@BeforeTest
	public void setupTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:/AutomationWoking/MavenProject/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		login= new LoginPage(driver);
	}
	
	@Test(dataProvider="Testdata1")
	public void Test1(String UserName , String Password)
	{
		System.out.println(UserName +"---"+ Password);
		driver.get("http://demo.guru99.com/test/newtours/index.php");		
		login.enterUsername(UserName);
		login.enterPassword(Password);		
		login.clickSubmit();
	}
	
	
	@DataProvider(name="Testdata1")
	public Object[][] getData()
	{
		String project_Path = System.getProperty("user.dir");
		Object data [][]= testData(project_Path+"//Excel//data1.xlsx", "Sheet1");
		return data;

	}
	
	public static Object[][] testData(String excelPath , String SheetName)
	{
		ExcelUtils excel = new ExcelUtils(excelPath, SheetName);
		int rowCount= excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][]= new Object[rowCount-1][colCount];
		
		for (int i=1 ; i<rowCount ;i++)
		{
			for(int j=0; j<colCount; j++)
			{
				String cellData = excel.getCellData(i, j);
				data[i-1][j]= cellData;
			}
			
		}
		
		return data;
		
	}

}
