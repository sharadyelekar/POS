package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import BasePackage.BaseClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POMPackage.LoginPage;
import UtilityPackage.UtilClass;

public class VerifyLoginPage extends BaseClass{
	
	LoginPage lp;
	
	@BeforeClass
	public void beforeClass()
	{
	//	BaseClass.openBrowser();
	}

	@BeforeMethod
	public void beforeMethod()
	{
		lp = new LoginPage(driver);
	}
	
	@Test(priority=1)
	public void verifyTheLoginPage()
	{
		lp.userNameAct();
		lp.pwdAct();
		lp.loginBtnAct();
		String s = driver.getTitle();
		System.out.println(s);
	}
	
	@Test(priority=2)
	public void verifyAuthPopUp() throws InterruptedException
	{
		UtilClass.googleAutPopUp(driver);
		lp.googleEmailAct();
		lp.nxtBtnAct1();
		lp.googlePwdAct();
		lp.nxtBtnAct2();
		String s = driver.getTitle();
		System.out.println(s);
	}
	
//	@Test(priority=3)
//	public CreateConsultation manualTiming() throws InterruptedException
//	{
//		CreateConsultation cc = new CreateConsultation(driver);
//		return cc;
//	}
	
	
	@AfterClass()
	public void afterClass()
	{
		driver.close();
	}

}
