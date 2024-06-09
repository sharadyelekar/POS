package POMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;
import UtilityPackage.UtilClass;

public class CreateOrder extends BaseClass{

	@FindBy(xpath="//mat-icon[text()='menu']")
	private WebElement menuBtn;
	
	@FindBy(xpath="//div[text()=' Orders ']")
	private WebElement orderBtn;
	
	@FindBy(xpath="//span[text()=' Create new order ']")
	private WebElement createOrderBtn;
	
	@FindBy(xpath="//input[@id='mat-input-5']")
	private WebElement patientSearch;
	
	@FindBy(xpath="//div[@id='mat-autocomplete-2']/mat-option")
	private List<WebElement> listPatients;
	
	@FindBy(xpath="//span[text()=' Create New order ']")
	private WebElement createOrderBtn2;
	
	@FindBy(xpath="//div[@class='mat-radio-outer-circle']")
	private List<WebElement> selectDoctor;
	
	@FindBy(xpath="//span[text()='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//div[@class=\'orderitem-text\']")
	private List<WebElement> selectService;
	
	@FindBy(xpath="//div[@class='mat-radio-outer-circle']")
	private List<WebElement> selectHomeOrClinic;
	
	
	
	
	public CreateOrder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void clickOnMenu()
	{
		UtilClass.explicteWait(driver, menuBtn, 10);
		menuBtn.click();
	}
	
	public void clickOnOrder()
	{
		UtilClass.implecitWait(driver, 10);
		orderBtn.click();
	}
	
	public void clickOnCreateOrder()
	{
		UtilClass.implecitWait(driver, 10);
		createOrderBtn.click();
	}
	
	public void clickOnPatientSearch() throws InterruptedException
	{
		UtilClass.implecitWait(driver, 10);
		patientSearch.click();
		patientSearch.sendKeys("9175285554");
		Thread.sleep(5000);
	}
	
	public void clickOnPatient()
	{
		UtilClass.implecitWait(driver, 10);
		
		for(WebElement ele : listPatients)
		{
			
			if(ele.getText().contains("rockjoson"))
			{
				//System.out.println(patientName);
				ele.click();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
