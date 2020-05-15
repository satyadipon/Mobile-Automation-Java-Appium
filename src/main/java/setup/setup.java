package setup;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class setup {


	public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{


		AndroidDriver<AndroidElement>  driver;

		File appDir = new File("src/test/resources");
		File app = new File(setup.class.getResource("/app/material-tabs.apk").getFile());
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5 API 28");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		return driver;
	}
	

}
