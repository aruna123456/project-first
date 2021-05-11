package com.project1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Base_Class;
import com.pom.Pom_Login;
import com.purchase.Pom_Purchase;

public class Order_Conform extends Base_Class{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		BrowserLaunch("chrome");
		Launchurl("http://automationpractice.com/index.php?controller=my-account");
		
		//WebElement email = driver.findElement(By.id("email"));
		//InputValues(email, "aruna123@gmail.com");
		
		Thread.sleep(5000);
		
		Pom_Login l=new Pom_Login(driver);
		
		inputValues(l.getEmail(), "aruna123@gmail.com");
		
		//WebElement pwd = driver.findElement(By.id("passwd"));
		//InputValues(pwd, "shreeyuvan");
		
		inputValues(l.getPwd(), "shreeyuvan");
		
		//WebElement login = driver.findElement(By.name("SubmitLogin"));
		//ClickOnElement(login);
		ClickOnElement(l.getLog());
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(women).build().perform();
		
		Thread.sleep(3000);
		
		WebElement summer = driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[1]"));
		ac.click(summer).build().perform();
		
		Pom_Purchase p=new Pom_Purchase(driver);
		
		ClickOnElement(p.getImage());
		//WebElement image = driver.findElement(By.xpath("(//img[@title='Printed Summer Dress'])[1]"));
		//ClickOnElement(image);
		
		Thread.sleep(9000);
		
		WebElement sframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(sframe);
		
		
		ClickOnElement(p.getPlus());
		//WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		//ClickOnElement(plus);
		
		WebElement size1 = driver.findElement(By.name("group_1"));
		
		Select s=new Select(size1);
		s.selectByVisibleText("M");
		
		ClickOnElement(p.getColor());
		
		//WebElement color = driver.findElement(By.xpath("//a[@title='Blue']"));
		//ClickOnElement(color);
		
		ClickOnElement(p.getCart());
		//WebElement cart = driver.findElement(By.name("Submit"));
		//ClickOnElement(cart);
		
		Thread.sleep(3000);
		
		
		ClickOnElement(p.getCont());
		//WebElement cont = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		//ClickOnElement(cont);
		
		ClickOnElement(p.getProceed1());
		//WebElement proceed1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		//ClickOnElement(proceed1);
		
		ClickOnElement(p.getAddr());
		//WebElement addr = driver.findElement(By.name("processAddress"));
		//ClickOnElement(addr);
		
		ClickOnElement(p.getCheck1());
		//WebElement check1 = driver.findElement(By.id("cgv"));
		//ClickOnElement(check1);
		
		ClickOnElement(p.getProcess());
		//WebElement process = driver.findElement(By.name("processCarrier"));
		//ClickOnElement(process);
		
		ClickOnElement(p.getPay());
		//WebElement pay = driver.findElement(By.xpath("//a[@class='bankwire']"));
		//ClickOnElement(pay);
		
		ClickOnElement(p.getConform());
		//WebElement conform = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//ClickOnElement(conform);
		
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Ajith Kumar\\eclipse-workspace\\Selenium90_Task\\screenshot\\online.png");
	FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
	}

}
