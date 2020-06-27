package login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AdminLogTest {
  @Test
  public void logAdmin() {
		System.out.println("Click log admin - class Admin");
  }
  
  @Test
  public void logOutAdmin() {
		System.out.println("Click logOUT admin - class Admin");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Click before method - class Admin");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Click after method - class Admin");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Click before class - class Admin");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("Click after class - class Admin");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Click before test - class Admin");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Click after test - class Admin");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Click before suite - class Admin");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("Click after suite - class Admin");
  }

}
