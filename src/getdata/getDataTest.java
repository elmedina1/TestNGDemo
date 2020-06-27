package getdata;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class getDataTest {
	
	
	@Parameters({ "url" })
	@Test 
	public void printValue(String urlNew ) {
		
		System.out.println("Ispisi varijablu: " +urlNew);
	}

}
