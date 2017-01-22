package Apptest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class setDriver {

	public static AndroidDriver init() throws MalformedURLException, InterruptedException {

		//Setup the app
		File appDir = new File("./src/main/resources/");
		File app = new File(appDir, "com.bt.bms.apk");
		
		//Set the desired capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("device", "Android");
		caps.setCapability("deviceName", "Android");
		caps.setCapability("platformName", "Android");
		caps.setCapability("app", app);
		
		//Start the app
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		Thread.sleep(5000);
		
		return driver;
	}
}
