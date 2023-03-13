package practice1testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practicetest {
	
	@Test
	public void run()
	{
		System.out.println("run");
	}
	
	@BeforeSuite
	public static void swim()
	{
		System.out.println("swim");
	}
	@BeforeSuite
	public static void drink()
	{
		System.out.println("drink");
	}
	
}	
	@Test

class c{
	@BeforeClass
	public static void m1()
	{
		System.out.println("Method m1");
	}
	
	public static void m2()
	{
		System.out.println("Method m2");
	}
	@Test
	public static void m3()
	{
		System.out.println("Method m3");
	}
	@AfterClass
	public static void m4()
	{
		System.out.println("Method m4");
	}
	
	
	
	@BeforeMethod
	public static void m5()
	{
		System.out.println("Method m5");
	}
	
	
	
	@AfterMethod
	public static void m6()
	{
		System.out.println("Method m6");
	}
	
	
	
	
	@AfterTest
	public static void m7()
	{
		System.out.println("Method m7");
	}
	
	
	
	
	@AfterSuite
	public static void m8()
	{
		System.out.println("Method m8");
	}
	
	
	@BeforeTest
	public static void m9()
	{
		System.out.println("Method m9");
	}
	
	
	
	
	
	
}