package login;

import org.testng.annotations.Test;

public class LoginNormalTest {
	
	
	@Test(groups={"smoke"})

	public void logIn() {
		
		System.out.println("Log In metoda - class Normal");
	}

	
	@Test
	public void getUrl() {
		
		System.out.println("Get Url metoda - class Normal");
	}
	
	@Test(groups={"smoke"})
	public void clickButton() {
		
		System.out.println("Click button metoda - class Normal");
	}
	
	
}
