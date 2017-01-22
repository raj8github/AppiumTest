package Apptest;

import java.net.MalformedURLException;

import org.openqa.selenium.android.AndroidDriver;

public class myTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver driver = setDriver.init();
		login.details(driver);

	}

}
