package MoblieTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

	public static AppiumDriver driver = null; 
	
//	public AppiumDriver getDriver() throws Exception {
//		if(driver == null) driver = CreateAppiumDriver();
//		driver.activateApp("com.llamalab.automate_1.31.1-191");
//		return driver;
//	}
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:platformVersion", "8.1");
		cap.setCapability("appium:deviceName", "Nexus One API 27");
		//cap.setCapability(MobileCapabilityType.UDID, "RZ8N91SNGTA");
		cap.setCapability("appium:automationName", "UIAutomation");
		cap.setCapability("appium:app", "com.llamalab.automate");
		 URL url = new URL("http://0.0.0.0:4723/wd/hub");
		    System.out.println("Hardcoded URL: " + url);
		    
		    driver = new AndroidDriver<AndroidElement>(url, cap);
		    driver.activateApp("com.llamalab.automate");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//	driver.findElement(By.id("android:id/button1")).click();
		
		System.out.println("application opened");
		
		driver.terminateApp("com.llamalab.automate");
		
		
		
	
	}
}
