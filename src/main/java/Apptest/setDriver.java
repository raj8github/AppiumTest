package Apptest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class setDriver {

	public static AndroidDriver init() throws MalformedURLException, InterruptedException {

		File appDir = new File("./src/main/resources/");
		File app = new File(appDir, "com.bt.bms.apk");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("device", "Android");
		caps.setCapability("deviceName", "Android");
		caps.setCapability("platformName", "Android");
		caps.setCapability("app", app);
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		Thread.sleep(5000);
		return driver;
	}
}
