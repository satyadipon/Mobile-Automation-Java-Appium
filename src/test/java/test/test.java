package test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import setup.setup;

public class test extends setup {



	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = setup.capabilities();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='Material Tabs']").isDisplayed());
		
		driver.findElementByXPath("//android.widget.Button[@text='SIMPLE TABS']").click();
		Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='Simple Tabs']").isDisplayed());
		driver.findElementByXPath("//android.widget.TextView[@text='THREE']").click();
		Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='THREE']").isDisplayed());
		System.out.println("Tab THREE selected. Test Complete!!!");
		
		driver.quit();

	}

}
