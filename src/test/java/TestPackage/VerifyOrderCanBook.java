package TestPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMPackage.CreateOrder;
import POMPackage.LoginPage;
import UtilityPackage.UtilClass;

public class VerifyOrderCanBook extends BaseClass{

	LoginPage lp;
	CreateOrder co;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		openBrowser();
		lp = new LoginPage(driver);
		lp.userNameAct();
		lp.pwdAct();
		lp.loginBtnAct();
		UtilClass.child(driver);
		lp.googleEmailAct();
		lp.nxtBtnAct1();
		lp.googlePwdAct();
		lp.nxtBtnAct2();
		Thread.sleep(7000);
		UtilClass.parent(driver);
		
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
	    co = new CreateOrder(driver);
	}
	
	@Test(priority=1)
	public void VerifyAddAppoienment() throws InterruptedException
	{
		Thread.sleep(7000);
		co.clickOnMenu();
		//UtilClass.alertPopUp();
		UtilClass.implecitWait(driver, 10);
		co.clickOnOrder();
		//UtilClass.alertPopUp();
		UtilClass.implecitWait(driver, 10);
		co.clickOnCreateOrder();
		//UtilClass.alertPopUp();
		UtilClass.implecitWait(driver, 10);
		co.clickOnPatientSearch();
		//UtilClass.alertPopUp();
		UtilClass.implecitWait(driver, 10);
		co.clickOnPatient();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
