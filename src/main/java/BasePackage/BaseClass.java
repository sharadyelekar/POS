package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	public WebDriver openBrowser()
	 {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://pos.staging.uncover.co.in/dashboard");
		driver.manage().window().maximize();
		return driver;
	 }

}
