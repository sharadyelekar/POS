package POMPackage;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;
import UtilityPackage.UtilClass;

public class CreateConsultation extends BaseClass{
	
	@FindBy(xpath="//span[text()='Add Appointment']")
	private WebElement addAppoienment;
	
	@FindBy(xpath="//div[text()='08:50 PM']")
	private WebElement singleTimeSlot;
	
	@FindBy(xpath="(//*[contains(@id,'mat-input-')])[2]")
	private WebElement mobilNo;
	
	@FindBy(xpath="//span[@class='icon-search ng-star-inserted']")
	private WebElement searchIcon;

	@FindBy(xpath="//*[contains(@id,'mat-dialog-')]/app-book-appointment-dialog/div[2]/app-general-information/div[2]/div/table/tbody/tr")
	private List<WebElement> patients;
	
	@FindBy(xpath="(//button[text()='Check-In'])[1]")
	private WebElement checkInButton;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement checkInNEXTButton;
	
	@FindBy(xpath="(//button[contains(@class,'-raised-button')])[2]")
	private WebElement confirmAppoienmentButton;
	
	@FindBy(xpath="(//div[@class='mat-radio-inner-circle'])[2]")
	private WebElement radioButton;
	
	@FindBy(xpath="//input[@id='mat-input-8']")
	private WebElement paymentID;
	
	@FindBy(xpath="//span[text()='Confirm Appointment']")
	private WebElement confirmAppoienmentFinal;
	
	public CreateConsultation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	//	CreateConsultation.driver=driver;
	}

	
	public void clickAddAppoienment() throws InterruptedException
	{
		UtilClass.explicteWait(driver, addAppoienment, 10);
		addAppoienment.click();
		String s = driver.getTitle();
		System.out.println(s);
		//return addAppoienment;
	}

	public void clickingOnTimeSlote()
	{
		UtilClass.explicteWait(driver, singleTimeSlot, 10);
		singleTimeSlot.click();
	}
	
	public void clickingOnMoblileNo()
	{
		UtilClass.explicteWait(driver, mobilNo, 10);
		mobilNo.click();
		mobilNo.sendKeys("8830957196");
	}
	
	public void clickingOnSearch()
	{
		UtilClass.explicteWait(driver, searchIcon, 10);
		searchIcon.click();
	}
	
	public void clickingOnPatients()
	{
		UtilClass.explicteWait(driver, checkInButton, 10);
		checkInButton.click();
	}
	
	public void clickingOncheckInNEXTButton()
	{
		UtilClass.explicteWait(driver, checkInNEXTButton, 10);
		checkInNEXTButton.click();
	}
	
	public void clickingOnconfirmAppoienmentButton()
	{
		UtilClass.explicteWait(driver, confirmAppoienmentButton, 10);
		confirmAppoienmentButton.click();	
	}
	
	public void clickingOnRadioButton()
	{
		if(radioButton.isDisplayed())
		{
			UtilClass.explicteWaitelementToBeClickable(driver, radioButton, 10);
	        UtilClass.implecitWait(driver, 5);
			radioButton.click();
		}else {
			UtilClass.explicteWait(driver, confirmAppoienmentFinal, 10);
			confirmAppoienmentFinal.click();
		}	
	}
//	
//	public void clickingsendingPayment()
//	{
//		UtilClass.explicteWait(driver, paymentID, 10);
//		paymentID.click();
//		paymentID.sendKeys("sdhskffr");
//	}
	
	public void clickingOnconfirmAppoienmentFinaltButton()
	{
		UtilClass.explicteWait(driver, confirmAppoienmentFinal, 10);
		confirmAppoienmentFinal.click();	
	}
	
}
