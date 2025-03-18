package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="AccountPages"                                
, summary=""
, relativeUrl=""
, connection="SalesUser"
		)             
public class AccountPages {

	WebDriver driver;
	public AccountPages(WebDriver driver){
		this.driver=driver;
	}

	public String getUrl(){
		return driver.getCurrentUrl();
	}
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Accounts']")
	public WebElement accounts;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='New']")
	public WebElement AccountNew;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next']")
	public WebElement Next;
	@TextType()
	@FindBy(xpath = "//label[text()='Account Name']/following::input[1]")
	public WebElement AccountName;
	@TextType()
	@FindBy(xpath = "//label[text()='Merchant Category / Sub Category']/following::input[1]")
	public WebElement Merchant_Category_Sub_Category__c;
	@TextType()
	@FindBy(xpath = "//label[text()='Billing Street']/following::textarea[1]")
	public WebElement BillingStreet;
	@TextType()
	@FindBy(xpath = "//label[text()='Billing City']/following::input[1]")
	public WebElement BillingCity;
	@TextType()
	@FindBy(xpath = "//label[text()='Billing State/Province']/following::input[1]")
	public WebElement BillingState;
	@TextType()
	@FindBy(xpath = "//label[text()='Billing Zip/Postal Code']/following::input[1]")
	public WebElement BillingPostalCode;
	@TextType()
	@FindBy(xpath = "//label[text()='Billing Country']/following::input[1]")
	public WebElement BillingCountry;
	@ButtonType()
	@FindBy(xpath = "//button[@name='SaveEdit']")
	public WebElement saveBtn;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div/div/div/p[1]")
	public WebElement MatchStatus;
	@TextType()
	@FindBy(xpath = "(//button[text()='Update'])[1]")
	public WebElement UpdateBtnBussinessName;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Fuzzy search']/span[1]/../../input[1]")
	public WebElement Fuzzybox;
	@TextType()
	@FindBy(xpath = "//label[text()='First Name']/following::p[1]")
	public WebElement WorldReadyFirstNameValidation;
	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//input[@name='MailingCity']")
	public WebElement WorldReadyMailingCityInput;
	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//input[@name='MailingPostalCode']")
	public WebElement WorldReadyMailingZipPostalCodeInput;
	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//input[@name='MailingState']")
	public WebElement WorldReadyMailingStateProvinceInput;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Mailing Street']/following-sibling::div//textarea[1]")
	public WebElement WorldReadyMailingStreetInput;
	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//input[@name='MailingCountry']")
	public WebElement WorldReadMailingCountryInput;
	@ButtonType()
	@FindBy(xpath = ".//c-contact-validation-form//button[normalize-space(.)='Save']")
	public WebElement WorldReadySave;
	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//label[normalize-space(.)='Mailing City']/following::p[1]")
	public WebElement WorldReadyMailingCityErrorMessage;
	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//label[normalize-space(.)='Mailing Zip/Postal Code']/following::p[1]")
	public WebElement WorldReadyMailingZipError;
	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//label[normalize-space(.)='Mailing State/Province']/following::p[1]")
	public WebElement WorldReadyMailingStateError;
	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//label[normalize-space(.)='Mailing Street']/following::p[1]")
	public WebElement WorldReadyMailingStreetError;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Last Name']/following::p[1]")
	public WebElement WorldReadyLastNameHonorifics;
	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//input[@name='OtherCity']")
	public WebElement WorldReadyOtherCityInput;
	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//input[@name='OtherCountry']")
	public WebElement WorldReadyOtherCountryInput;
	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//input[@name='OtherPostalCode']")
	public WebElement WorldReadyOtherZipPostalCodeInput;
	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//input[@name='OtherState']")
	public WebElement WorldReadyOtherStateProvinceInput;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Other Street']/following::textarea[1]")
	public WebElement WorldReadyOtherStreetInput;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Other City']/following::p[1]")
	public WebElement OtherCityError;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Other Zip/Postal Code']/following::p[1]")
	public WebElement WorldReadyOtherZipErrro;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Other State/Province']/following::p[1]")
	public WebElement WorldReadyOtherStateError;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Other Street']/following::p[1]")
	public WebElement WorldReadyOtherStreetError;
	@TextType()
	@FindBy(xpath = "//label[text()='Account Name']/following::p[1]")
	public WebElement WorldReadyAccountNameError;
	@TextType()
	@FindBy(xpath = "//label[text()='Billing State/Province']/following::p[1]")
	public WebElement WorldReadyBillingStateError;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Doing Business As']/following::p[1]")
	public WebElement WorldReadyDoingBusinessAsError;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Billing Street']/following::p[1]")
	public WebElement WorldReadyBillingStreetError;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Billing Zip/Postal Code']/following::p[1]")
	public WebElement WorldReadyBillingZipError;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Billing City']/following::p[1]")
	public WebElement WorldReadyBiilingCityError;
	@TextType()
	@FindBy(xpath = "//label[text()='Doing Business As']/following::input[1]")
	public WebElement Doing_Business_As__c;

}
