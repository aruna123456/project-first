package com.base;

import java.awt.Image;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.ui.Select;

public class Demo_Baseclass {
	
public static WebDriver driver;//null driver
	
	//webdriver
	
	public static WebDriver BrowserLaunch(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Project_First\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			
			}
		
		
			else if (browser.equalsIgnoreCase("internet explorer")) {
				
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Project_First\\Driver\\chromedriver.exe");
				driver=new InternetExplorerDriver();
				
				
			}
			
			else {
			System.out.println("invalid");
		}
		
		
		driver.manage().window().maximize();
		
		
		
		//title
		
		driver.getTitle();
		
		
		
		
		
		
		return driver;
		
	}
	

	
	//1.get
	
	public static void Launchurl(String url) {
	driver.get(url);
	

	}
	
	
	//2.get currenturl
	
	public static void currenturl(WebElement element,String url) {
	driver.getCurrentUrl();
		
	}
	
		private static int seconds;
		private static int index;

		//3.is displayed
	public static void IsDisplay(WebElement element) {
		element.isDisplayed();
		
	}
	
	//4.is enables
	
	public static void enable(WebElement element) {
	element.isEnabled();
		
	}
	
	//4.isselected
	
	public static void Isselect(WebElement element) {
	element.isSelected();
	}
	
	//5.clear
	
	public void clear1(WebElement element,String text) {
	element.clear();
		
	}
	//6.gettext
	
	public static void gettext(WebElement element,String str) {
	element.getText();
		}
	
	//7.get attributes
	public static void getattr(WebElement element,String str) {
		element.getAttribute(str);

	}
	
	//8.wait
	public static void wait1(WebElement element) throws InterruptedException {
		element.wait();
		
		}
	
	public static void wait2(WebElement element) throws InterruptedException {
	element.wait(30);

	}
	
	public static void wait3(WebElement element) throws InterruptedException {
	element.wait(20, seconds);

	}
		
	//9.dropdown
	
	//value
	
	public static void doselect(By Locator,String value) {
		
		Select s=new Select(getElement(Locator));
		s.selectByValue(value);
		
		Select s1=new Select(getElement(Locator));
		s1.selectByIndex(index);
		
		Select s2=new Select(getElement(Locator));
		s2.selectByVisibleText(value);
		
		
		
		}
	
	private static WebElement getElement(By locator) {
		
		return null;
	}

	//10.click
		
		public static void ClickOnElement(WebElement element) {
		element.click();
			
			}
		
		
		//11.sendkeys
		
		public static void InputValues(WebElement element,String str) {
		element.sendKeys(str);
		
		
		driver.close();
		driver.quit();

		
		}
	
		
}
		

