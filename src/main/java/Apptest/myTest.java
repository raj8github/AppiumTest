package Apptest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.android.AndroidDriver;

public class myTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileReader fr = new FileReader(new File("./src/main/resources/data.txt"));
		BufferedReader br = new BufferedReader(fr);
		
		String IDPSWD = br.readLine().trim();

		String emailID = IDPSWD.substring(0, IDPSWD.indexOf('|'));
		
		String passWD = IDPSWD.substring(IDPSWD.indexOf('|')+1,IDPSWD.length());
		
		//Set the capabilities and setup a driver for the app
		AndroidDriver driver = setDriver.init();
		
		//Enter login details and close the app
		login.details(driver,emailID,passWD);

	}

}
