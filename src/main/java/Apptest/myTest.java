package Apptest;

import java.net.MalformedURLException;

import org.openqa.selenium.android.AndroidDriver;

public class myTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		//Set the capabilities and setup a driver for the app
		AndroidDriver driver = setDriver.init();
		
		//Enter login details and close the app
		login.details(driver);

	}

}
