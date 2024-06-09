package SeleniumSessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToPOS {
	
	
	static WebDriver driver;
	static WebElement contiButton;
	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pos.staging.uncover.co.in/dashboard");
//		String title = driver.getTitle();
//		System.out.println(title);
		Thread.sleep(7000);
		
		WebElement logineName = driver.findElement(By.id("mat-input-0"));
		WebElement pwd = driver.findElement(By.id("mat-input-1"));
		WebElement logineBtn = driver.findElement(By.xpath("//span[text()='Login']"));
		try {
		contiButton = driver.findElement(By.xpath("//span[text()='Continue']"));
		}
		catch(Exception nse)
		{
			nse.printStackTrace();
		}
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		long timeout = driver.manage().timeouts().getPageLoadTimeout().getSeconds();
		System.out.println(timeout);
		
		waitForElementToBeClickable(logineName, 15);
		
		logineName.sendKeys("testassistant");
		pwd.sendKeys("assistant@123");
		logineBtn.click();
		
		
		Thread.sleep(1000);
//		//Login in Google auth Popup in child window
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		String parentWID = it.next();
		System.out.println(parentWID);
		
		String childWID = it.next();
		System.out.println(childWID);
		
		driver.switchTo().window(childWID);
		
		WebElement emailFeild = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement nextButton1 = driver.findElement(By.xpath("//span[text()='Next']"));
		emailFeild.sendKeys("sharad.yelekar@meddo.in");
		nextButton1.click();
		
		Thread.sleep(3000);
		WebElement pwdFeild = driver.findElement(By.name("Passwd"));
		WebElement nextButton2 = driver.findElement(By.xpath("//span[text()='Next']"));
		pwdFeild.sendKeys("Sharad@2124");
		nextButton2.click();
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		waitForElementToBeClickable(contiButton,15);
		
	}
	
	public static WebElement waitForElementVisibility(WebElement locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.visibilityOf(locator));
		return locator;
	}
	
	public static WebElement waitForElementToBeClickable(WebElement locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return locator;
	}
	
}
