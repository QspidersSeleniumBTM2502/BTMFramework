package dummy;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfExex {
	
	@BeforeSuite
	public void bS() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void bT() {
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void bC() {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void bM() {
		System.out.println("BeforeMethod");
	}

	@Test(priority=1)
	public void testA() {
		System.out.println("TestMethodA");
		Assert.fail();
		System.out.println("TestMethodA");
	}
	
	@Test(priority=2, invocationCount=2, dependsOnMethods= {"testA"})
	public void testB() {
		System.out.println("TestMethodB");
	}
	
	@AfterSuite
	public void aS() {
		System.out.println("AfterSuite");
	}
	
	@AfterTest
	public void aT() {
		System.out.println("AfterTest");
	}
	
	@AfterClass
	public void aC() {
		System.out.println("AfterClass");
	}
	
	@AfterMethod
	public void aM() {
		System.out.println("AfterMethod");
	}
}
