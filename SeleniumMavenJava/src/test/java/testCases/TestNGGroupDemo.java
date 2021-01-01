package testCases;

import org.testng.annotations.Test;

public class TestNGGroupDemo {
	
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("This is inside Test1 Method");
	}
	
	@Test(groups= {"sanity", "smoke"})
	public void test2()
	{
		System.out.println("This is inside Test2 Method");
	}
	
	
	@Test(groups= {"sanity","regression"})
	public void test3()
	{
		System.out.println("This is inside Test3 Method");
	}
	
	@Test
	public void test4()
	{
		System.out.println("This is inside Test4 Method");
	}
	

}
