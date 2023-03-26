package MoblieTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
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
//		    apps.activateApp("com.llamalab.automate");
//		    ((InteractsWithApps) driver).resetApp();
		    ((InteractsWithApps) driver).activateApp("com.llamalab.automate");
//		    apps.resetApp();
//		    apps.launchApp();
		    
		   
		   
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//	driver.findElement(By.id("android:id/button1")).click();
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open drawer']")).click();
		
		
		List<AndroidElement> txtnames = driver.findElements(By.xpath("//android.widget.CheckedTextView[@resource-id='com.llamalab.automate:id/design_menu_item_text']"));
	
		for (AndroidElement androidElement : txtnames) {
			String text = androidElement.getText();
			System.out.println(text);
		}
		
		
		System.out.println("application opened");
		
		driver.terminateApp("com.llamalab.automate");
		
		
		
	
	}
}
