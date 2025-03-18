package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DnBRollout"                                
     , summary=""
     , relativeUrl=""
     , connection="SystemAdmin"
     )             
public class DnBRollout {

	@TextType()
	@FindBy(xpath = "//table[@class='custom-table']/descendant::tr[2]/td[1]")
	public WebElement FirstBusinessName;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Update Account']")
	public WebElement Update_Account_button;
	@TextType()
	@FindBy(xpath = "//span[@class='slds-badge__icon slds-badge__icon_left']/..")
	public WebElement CompanyValidation;
	@ButtonType()
	@FindBy(xpath = ".//div[contains(@class,'slds-align_absolute-center slds-m-vertical_small')]/button[2]")
	public WebElement ResetFilters;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Business Name']")
	public WebElement BusinessName;
	@TextType()
	@FindBy(xpath = "//button[@name='country']")
	public WebElement Country;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Search']")
	public WebElement Find_Match_button1;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='D-U-N-S number']")
	public WebElement DUNS_Number;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Business Registration Number']")
	public WebElement Business_Registration_Number;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='No Match']")
	public WebElement No_Match_button;
	@TextType()
	@FindBy(xpath = "//textarea[@name='BillingStreet']")
	public WebElement Billing_Street;
	@TextType()
	@FindBy(xpath = "//input[@name='Company_Number__c']")
	public WebElement Registration_Number;
	@TextType()
	@FindBy(xpath = "//input[@name='BillingState']")
	public WebElement Billing_State_Province;
	@TextType()
	@FindBy(xpath = "//input[@name='BillingPostalCode']")
	public WebElement Billing_Zip_Postal_Code;
	@ButtonType()
	@FindBy(xpath = "(//button[normalize-space(.)='Save' and @part='button' and @type='submit'])[1]")
	public WebElement Save_button;
	@ButtonType()
	@FindBy(xpath = ".//c-company-validation//button[normalize-space(.)='Find Match']")
	public WebElement Find_Match_button;
	@TextType()
	@FindBy(xpath = "//input[@name='BillingCity']")
	public WebElement Billing_City;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Front Book Onboarding']")
	public WebElement Front_Book_Onboarding_button;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Back Book Onboarding']")
	public WebElement Back_Book_Onboarding_button;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close']")
	public WebElement Close_OnboardingInvitation;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//records-highlights2//button[normalize-space(.)='Show more actions']")
	public WebElement showMoreActions;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Unified Onboarding Invitation']")
	public WebElement Opportunity_Unified_Onboarding_Invitation;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Reset Filters']")
	public WebElement ResetFilters_HOU;
	@PageFrame()
	public static class Frame {

		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Reset Filters']")
		public WebElement Reset_Filters_button;
		@TextType()
		@FindBy(xpath = "//input[@placeholder='Business Name']")
		public WebElement Search_button_Deal;
		@TextType()
		@FindBy(xpath = "//button[@name='country']")
		public WebElement Country_Deal;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Search']")
		public WebElement Search_Deal;
		@TextType()
		@FindBy(xpath = "//table[@class='custom-table']/descendant::tr[2]/td[1]")
		public WebElement BusinessName_deal;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Update Account']")
		public WebElement Update_Account_button_Deal;
		@TextType()
		@FindBy(xpath = "//button[@name='country']")
		public WebElement Company_Agreement;
		@TextType()
		@FindBy(xpath = "//div[@class='search-container' and normalize-space(.)='Search Criteria']/div[1]/div[1]/lightning-icon[1]")
		public WebElement SearchCriteriaSectionExpand_Frame;
		
	}
	@FindBy(xpath = "(//iframe)[1]")
	public Frame frame;
	@ButtonType()
	@FindBy(xpath = "//footer//button[normalize-space(.)='Close']")
	public WebElement Close2;
	@TextType()
	@FindBy(xpath = "//div[@class='search-container']/div[2]")
	public WebElement TagPresent;
	@TextType()
	@FindBy(xpath = "//div[@class='search-container' and normalize-space(.)='Search Criteria']/div[1]/div[1]/lightning-icon[1]")
	public WebElement SearchCriteriaSectionExpand;
				
}
