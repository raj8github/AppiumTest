package Apptest;

import org.openqa.selenium.By;
import org.openqa.selenium.android.AndroidDriver;

public class login {

	public static void details(AndroidDriver driver) {

		//Close the pop-up ad.
		driver.navigate().back();
		
		//Click on Login button
		driver.findElement(By.id("com.bt.bms:id/btnLogin")).click();

		//Enter email ID
		driver.findElement(By.id("com.bt.bms:id/edtemail")).clear();
		driver.findElement(By.id("com.bt.bms:id/edtemail")).sendKeys("raj88syd@gmail.com");

		//Enter Password
		driver.findElement(By.id("com.bt.bms:id/edtpass")).clear();
		driver.findElement(By.id("com.bt.bms:id/edtpass")).sendKeys("Garfieldb1");

		//Click on Submit button
		driver.findElement(By.id("com.bt.bms:id/signin")).click();

		//Close any pop ups
		driver.navigate().back();
		
		//Close the app
		driver.quit();
	}
}
