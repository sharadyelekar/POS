package POMPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;
import UtilityPackage.UtilClass;


public class LoginPage extends BaseClass{
	
	
	@FindBy(xpath="//input[@id='mat-input-0']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement googleEmail;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nxtBtn1;
	
	@FindBy(xpath="//input[@name='Passwd']")
	private WebElement googlePwd;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver=driver;	
	}
	
	
	public void userNameAct()
	{
		userName.click();
		userName.sendKeys("testassistant");
	}
	
	public void pwdAct()
	{
		password.click();
		password.sendKeys("assistant@123");
	}
	
	public void loginBtnAct()
	{
		loginButton.click();
	}
	
	public void googleEmailAct()
	{
		UtilClass.implecitWait(driver, 3);
		googleEmail.click();
		UtilClass.implecitWait(driver, 3);
		googleEmail.sendKeys("sharad.yelekar@meddo.in");
	}
	
	public void nxtBtnAct1()
	{
		UtilClass.implecitWait(driver, 5);
		nxtBtn1.click();
	}
	
	public void googlePwdAct()
	{
		UtilClass.implecitWait(driver, 5);
		googlePwd.click();
		UtilClass.implecitWait(driver, 5);
		googlePwd.sendKeys("Sharad@2124");
	}
	
	public void nxtBtnAct2() throws InterruptedException
	{
		UtilClass.implecitWait(driver, 3);
		nxtBtn1.click();
		//Thread.sleep(3000);
	}
	
}
