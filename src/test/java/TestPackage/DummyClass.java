package TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyClass {

	static WebDriver driver;
	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement userName;
	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement password;
	@FindBy(xpath="//span[text()='Login']")
	WebElement loginButton;
	@FindBy(xpath="//input[@type='email']")
	WebElement googleEmail;
	@FindBy(xpath="//span[text()='Next']")
	WebElement nxtBtn1;
	@FindBy(xpath="//input[@name='Passwd']")
	WebElement googlePwd;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://pos.staging.uncover.co.in/dashboard");
		driver.manage().window().maximize();
		
//		userName.click();
//		userName.sendKeys("testassistant");
		
		

	}

	public static void explicteWait(WebDriver driver,WebElement element, int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
