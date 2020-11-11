package base;

import org.testng.annotations.Test;

public class Class1 extends BaseClass{
	
	
	@Test
	public void test1() {
		logger = extent.createTest("Class 1 Test 1");
		System.out.println("Class 1 Test 1");
		throw new RuntimeException();
	}
	
	@Test
	public void test2() {
		logger = extent.createTest("Class 1 Test 2");
		System.out.println("Class 1 Test 2");
	}
	
	@Test
	public void test3() {
		logger = extent.createTest("Class 1 Test 3");
		System.out.println("Class 1 Test 3");
	}
	

}
