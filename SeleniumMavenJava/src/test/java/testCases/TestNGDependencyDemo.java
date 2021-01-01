package testCases;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {

	@Test(dependsOnMethods = {"test2"})
	public void test1()
	{
		System.out.println("This is inside Test1");
	}
	@Test
	public void test2()
	{
		System.out.println("This is inside Test2");
	}
	@Test
	public void test3()
	{
		System.out.println("This is inside Test3");
	}
}
