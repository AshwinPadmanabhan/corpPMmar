package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="BTApplication"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesUser"
     )             
public class BTApplication {

	@TextType()
	@FindBy(xpath = "//input[@name='dba_name']")
	public WebElement businessName;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='registered_as']")
	public WebElement businessType;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='industry']")
	public WebElement industry;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='MM/DD/YYYY']")
	public WebElement startDate;
	@TextType()
	@FindBy(xpath = "//input[@name='legal_name']")
	public WebElement legalName;
	@TextType()
	@FindBy(xpath = "//input[@name='tax_id']")
	public WebElement aBNOrACN;
	@TextType()
	@FindBy(xpath = "//input[@type='tel']")
	public WebElement phoneNumber;
	@TextType()
	@FindBy(xpath = "//input[@name='website']")
	public WebElement website;
	@TextType()
	@FindBy(xpath = "//textarea[@name='description']")
	public WebElement businessDescription;
	@TextType()
	@FindBy(xpath = "//input[@name='street_address']")
	public WebElement streetAddress;
	@TextType()
	@FindBy(xpath = "//input[@name='locality']")
	public WebElement suburb;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='region']")
	public WebElement state;
	@TextType()
	@FindBy(xpath = "//input[@name='postal_code']")
	public WebElement postalCode;
	@TextType()
	@FindBy(xpath = "//input[@name='average_transaction_amount']")
	public WebElement averageTransaction;
	@TextType()
	@FindBy(xpath = "//input[@name='maximum_transaction_amount']")
	public WebElement largestTransaction;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='customer_charged_on']")
	public WebElement whenDoYouCharge;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='fulfillment_completed_in']")
	public WebElement whenAreProductsDelivered;
	@TextType()
	@FindBy(xpath = "//input[@name='routing_number']")
	public WebElement bSBNumber;
	@TextType()
	@FindBy(xpath = "//input[@name='account_number']")
	public WebElement accountNumber;
	@BooleanType()
	@FindBy(xpath = "//input[@id='attestation_given']")
	public WebElement checkbox1;
	@BooleanType()
	@FindBy(xpath = "//input[@id='disclosures_approved']")
	public WebElement checkbox2;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Submit Application']")
	public WebElement submitApplication;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Start by adding your information...']")
	public WebElement startByAddingYourInformation;
	@TextType()
	@FindBy(xpath = "//input[@name='first_name']")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//input[@name='last_name']")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = "//input[@name='job_title']")
	public WebElement position;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Personal Phone Number')]")
	public WebElement personalPhoneNumber;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Email Address']")
	public WebElement emailAddress;
	@TextType()
	@FindBy(xpath = "//input[@name='date_of_birth']")
	public WebElement DOB;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Street Address']")
	public WebElement streetAddress1;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='City']")
	public WebElement City;
	@TextType()
	@FindBy(xpath = "//input[@name='region']")
	public WebElement state1;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Postal Code']")
	public WebElement postalCode1;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Continue']")
	public WebElement continue_1;
	@TextType()
	@FindBy(xpath = "//input[@name='annual_volume_amount']")
	public WebElement projectedAnnualVolume;
	@LinkType()
	@FindBy(xpath = "//h3[contains(text(),'Generated Invitation URL')]/following::a")
	public WebElement URLLink;
			
}
