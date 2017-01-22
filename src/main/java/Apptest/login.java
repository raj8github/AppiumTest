package Apptest;

import org.openqa.selenium.By;
import org.openqa.selenium.android.AndroidDriver;

public class login {

	public static void details(AndroidDriver driver) {

		driver.navigate().back();

		driver.findElement(By.id("com.bt.bms:id/btnLogin")).click();

		driver.findElement(By.id("com.bt.bms:id/edtemail")).clear();
		driver.findElement(By.id("com.bt.bms:id/edtemail")).sendKeys("raj88syd@gmail.com");

		driver.findElement(By.id("com.bt.bms:id/edtpass")).clear();
		driver.findElement(By.id("com.bt.bms:id/edtpass")).sendKeys("Garfieldb1");

		driver.findElement(By.id("com.bt.bms:id/signin")).click();

		driver.quit();
	}
}
