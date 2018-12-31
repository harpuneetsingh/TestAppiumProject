package com.khehra.appium.ios.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstAppiumPage {
	
	
	
	public WebElement userName( WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\\\"UserName\\\"]")) ;
		return element;
	}
	
	public WebElement passWord(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\\\"Password\\\"]")) ;
		return element;
	}

	
		
	}

