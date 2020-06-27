package getdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class getConfigData {

	
	@Test
	
	public void printValues( ) {
		//gets date from config.properties
		Properties pro = new Properties();
		InputStream input;
		try {
			input = new FileInputStream("C:\\Users\\esunje\\Desktop\\Eclipse_workspace\\TestNGNahla\\config\\conf.properties");
			pro.load(input);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		String user=pro.getProperty("username");
		System.out.println("Print username:" + user) ;
	}
}
