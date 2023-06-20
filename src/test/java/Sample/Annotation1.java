package Sample;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation1 {

		@Test
		public void test1()
		{
		System.out.println("This is test 1...");
	}
		@BeforeClass
		public void test2()
		{
		System.out.println("This is test 2..");
	}

		@BeforeMethod
		public void test3()
		{
		System.out.println("This is test 3..");
	}
		
		@AfterClass
		public void test4()
		{
		System.out.println("This is test 4..");
	}
		
		@AfterMethod
		public void test5()
		{
		System.out.println("This is test 5..");
	}
		
}




