package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="accountValidationForm"                                
               , summary=""
               , connection="SalesUser"
               , lightningWebComponent="accountValidationForm"
               , namespacePrefix=""
     )             
public class accountValidationForm {

	@TextType()
	@FindBy(xpath = ".//c-account-validation-form//input[@name='Doing_Business_As__c']")
	public WebElement doingBusinessAs;
	@TextType()
	@FindBy(xpath = ".//c-account-validation-form//textarea[@name='BillingStreet']")
	public WebElement billingStreet;
	@TextType()
	@FindBy(xpath = ".//c-account-validation-form//input[@name='BillingState']")
	public WebElement billingStateProvince;
	@TextType()
	@FindBy(xpath = ".//c-account-validation-form//input[@name='BillingPostalCode']")
	public WebElement billingZipPostalCode;
	@TextType()
	@FindBy(xpath = ".//c-account-validation-form//input[@name='BillingCity']")
	public WebElement billingCity;
	@ButtonType()
	@FindBy(xpath = ".//c-account-validation-form//button[normalize-space(.)='Save']")
	public WebElement save;
	
}
