package com.khehra.appium.ios.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.khehra.appium.ios.pages.FirstAppiumPage;

import io.appium.java_client.ios.IOSDriver;

public class sampleTest {
	
	 public static WebDriver driver;
	 public FirstAppiumPage firstAppiumPage;
	
	
	@BeforeClass
	public void setUp() throws MalformedURLException  {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 8");
        capabilities.setCapability("platformVersion", "12.1");
        capabilities.setCapability("app", "/Users/khehra/Library/Developer/Xcode/DerivedData/BSCLandscapePOC-gfntyfzlrgngqvfnmvplmxgrxnik/Build/Products/Debug-iphonesimulator/BSCLandscapePOC.app");
        capabilities.setCapability(" automationName", "XCUITest");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("appiumVersion", "1.7.1");
        driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	} 
	
	@Test
	public void passTest() {
		System.out.println("Test cases -1 started");
		String actualText = firstAppiumPage.userName(driver).getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText, "UserName");
	}
	
	@Test
	public void failTest() {
		System.out.println("Test case - 22-------------------------------------------");
		String actualText = firstAppiumPage.passWord(driver).getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText, "UserName");
	}
	
	@Test
	public void performAction() {
		driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"BSCLandscapePOC\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]")).sendKeys("Harpuneet");
		driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"BSCLandscapePOC\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]")).sendKeys("Singh");
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Next\"]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"bsc_logo\"]")).isDisplayed());
	}

}
