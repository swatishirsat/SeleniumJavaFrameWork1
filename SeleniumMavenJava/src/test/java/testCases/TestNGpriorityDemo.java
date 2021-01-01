package testCases;

import org.testng.annotations.Test;

public class TestNGpriorityDemo {
	
	@Test(priority=3)
	public void test1()
	{
		System.out.println("I am inside Test1");
	}

	@Test(priority=1)
	public void test2()
	{
		System.out.println("I am inside Test2");
	}
	@Test(priority=2)
	public void test3()
	{
		System.out.println("I am inside Test3");
	}
}
