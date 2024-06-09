package TestPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMPackage.CreateConsultation;
import POMPackage.LoginPage;
import UtilityPackage.UtilClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class VerifyUserCanBookConsultation extends BaseClass{
	
	LoginPage lp;
	CreateConsultation cc;
	
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
		cc = new CreateConsultation(driver);
	}
	
	
	@Test(priority=1)
	public void VerifyAddAppoienment() throws InterruptedException
	{
		Thread.sleep(7000);
		cc.clickAddAppoienment();
	}
	
	@Test(priority=2)
	public void verifyUserCanBookAppoienment() throws InterruptedException
	{
		Thread.sleep(3000);
		cc.clickingOnTimeSlote();
		Thread.sleep(5000);
		cc.clickingOnMoblileNo();
		Thread.sleep(3000);
		cc.clickingOnSearch();
		Thread.sleep(3000);
		cc.clickingOnPatients();
		Thread.sleep(3000);
		cc.clickingOncheckInNEXTButton();
		Thread.sleep(6000);
		cc.clickingOnconfirmAppoienmentButton();
		Thread.sleep(3000);
		cc.clickingOnRadioButton();
		Thread.sleep(3000);
//		cc.clickingsendingPayment();
//		Thread.sleep(3000);
		cc.clickingOnconfirmAppoienmentFinaltButton();
		Thread.sleep(6000);
		UtilClass.alertPopUp();
	}
	
//	@Test(priority=2)
//	public void verifyAddAppoienment() throws InterruptedException
//	{
//		Thread.sleep(15);
//		cc.clickAddAppoienment();
////		cc.selectDoctor();
////		UtilClass.implecitWait(driver,4);
////		cc.selectSlots();
//	}	
	
}
