package UtilityPackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePackage.BaseClass;


public class UtilClass extends BaseClass{
	
	static WebDriver driver;
	public static void googleAutPopUp(WebDriver driver)
	{
		Set<String> address = driver.getWindowHandles();
		List<String> addresses = new ArrayList<String>(address);
		driver.switchTo().window(addresses.get(1));
		//return driver;
	}
	
	
	public static void child(WebDriver driver)
	{
		Set<String> address = driver.getWindowHandles();
		Iterator <String> it = address.iterator();
		String p = it.next();
		String c = it.next();
		driver.switchTo().window(c);
		
//		List<String> addresses = new ArrayList<String>(address);
//		driver.switchTo().window(addresses.get(0));
	}
	
	
	public static void parent(WebDriver driver)
	{
		Set<String> address = driver.getWindowHandles();
		Iterator <String> it = address.iterator();
		String p = it.next();
		String c = it.next();
		driver.switchTo().window(p);
		
//		List<String> addresses = new ArrayList<String>(address);
//		driver.switchTo().window(addresses.get(0));
	}
	
	public  static void implecitWait(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));	
	}
	
	public static WebElement explicteWait(WebDriver driver,WebElement element, int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		WebElement elemrnt1 = wait.until(ExpectedConditions.visibilityOf(element));
		return elemrnt1;
	}
	
	public static void explicteWaitelementToBeClickable(WebDriver driver,WebElement element, int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		//return elemrnt1;
	}
	
	public static void clickByJSExecuter(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click", element);
	}
	
	public static void moveToElement(WebDriver Driver, WebElement element)
	{
		Actions acts = new Actions(driver);
		acts.moveToElement(element).perform();
	}
 
	public static void alertPopUp()
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	

	
	
	
	
	
	
	
	
	
	
	
}
