package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.JavascriptBy;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Admin Tools"                                
     , summary=""
     , relativeUrl=""
     , connection="LTUATAutomation"
     )             
public class AdminTools {
	
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//tr[2]//span[normalize-space(.)='Arthur']")
	public WebElement Firstname_SR;
	@LinkType()
	@FindBy(xpath = "//a[text()='Merchant Admin']")
	public WebElement merchantAdmin;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Add' and @title='addPhone']")
	public WebElement Add_button_Phone;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//b[normalize-space(.)='Add Phone Number']")
	public WebElement AddPhoneNumber_label;
	@TextType()
	@FindBy(xpath = "//th[@data-col-key-value=\"phone_number-text-1\"][@tabindex=0]")
	public WebElement PhoneNumber;
	@BooleanType()
	@FindBy(xpath = "//table//th[@aria-label='Phone Number']/ancestor::thead/following-sibling::tbody/tr[1]//lightning-primitive-cell-checkbox")
	public WebElement PhoneNumberRadioButton;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='+ 17979797979']//lightning-base-formatted-text[1]")
	public WebElement PhoneNumber2;
	@ButtonType()
	@FindBy(xpath = "//button[@class='slds-button slds-button_neutral'][@title='editPhone']")
	public WebElement Edit_button;
	@TextType()
	@FindBy(xpath = "//div[contains(.,'Phone Number')][@part='input-text']//../input")
	public WebElement BusinessType;
	
	@TextType()
	@FindBy(xpath = "//table[@class='slds-table slds-table_bordered slds-border_left slds-border_right'][contains(.,'Flag Name')]//../button[@name='Expiry Date']")
	public WebElement Expiry_Date;
	@TextType()
	@FindBy(xpath = "//table[@class='slds-table slds-table_bordered slds-border_left slds-border_right'][contains(.,'Flag Name')]//../div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left']//*[@data-value='2 Months']")
	public WebElement Expiry_Date_2months;
	@TextType()
	@FindBy(xpath = "//span[text()='Advanced Search']/..")
	public WebElement SpanAdvanceedSearch;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[@data-hstype='0' and @data-htype='1' and @data-txntype='Instant Transfer Sent (Compliance Impacted)']")
	public WebElement Transaction;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//div[contains(@class,'fieldComponent') and @style='word-break: break-all;' and @title='Account Number']")
	public WebElement AccountNumber;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//c-admin-search-header-field/div[contains(@class,'fieldComponent') and @title='Full Name']")
	public WebElement FullName;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//span[contains(normalize-space(.),'Search Results')]")
	public WebElement SearchResults;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//div[contains(@class,'fieldComponent') and @title='Phone (Primary)']")
	public WebElement Phone;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//c-admin-search-header-field/div[normalize-space(.)='AutoH91M@hotmail.com']")
	public WebElement EmailPrimary;
	@LinkType()
	@FindBy(xpath = ".//c-merchant-search//a[normalize-space(.)='Product Info']")
	public WebElement LightningTabset;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='MCW-SMB Headline Price']")
	public WebElement MCW_SMB_Headline_Price_accordion_section;
	@BooleanType()
	@FindBy(xpath = "//div[@class='slds-var-m-top_large slds-var-p-right_medium']//span[@part='indicator']")
	public WebElement Toggle;
	
	@TextType()
	@FindBy(xpath = "(//label[normalize-space(.)='Memo']/following::textarea[1])[last()]")
	public WebElement Memo;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//footer//button[normalize-space(.)='Save' and contains(@class,'slds-button')]")
	public WebElement Save_button;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Third Party Details']")
	public WebElement ThirdParty;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Add Third Party']")
	public WebElement Add_Third_Party_button;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//input[@name='primaryEmail']")
	public WebElement PrimaryEmail;
	@BooleanType()
	@FindBy(xpath = ".//c-merchant-search//label[normalize-space(.)='Business Unit']/span[1]")
	public WebElement BusinessUnit;
	@BooleanType()
	@FindBy(xpath = ".//c-merchant-search//label[normalize-space(.)='Express Checkout']/span[1]")
	public WebElement ExpressCheckout;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//textarea[@name='memo']")
	public WebElement Enter_Memo___;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Add Permissions']")
	public WebElement Add_Permissions_button;
	@BooleanType()
	@FindBy(xpath = ".//c-merchant-search//section//label[normalize-space(.)='Select Item 1']/span[1]")
	public WebElement ThirdPartyradioButton;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Delete Third Party']")
	public WebElement Delete_Third_Party_button;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//section//button[normalize-space(.)='Delete']")
	public WebElement Delete_button;
	@ButtonType()
	@FindBy(xpath = "//div[6]//button[normalize-space(.)='Minimize']")
	public WebElement minimize;
	@BooleanType()
	@FindBy(xpath = ".//c-merchant-search//label[normalize-space(.)='Third Party']/span[1]")
	public WebElement ThirdPartyTyoe;
	@LinkType()
	@FindBy(xpath = ".//c-merchant-search//a[normalize-space(.)='Risk Info']")
	public WebElement AuthenticationTab;
	@BooleanType()
	@FindBy(xpath = ".//c-merchant-search//span[normalize-space(.)='Active']/span")
	public WebElement AmericanExpress;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('c-merchant-admin').shadowRoot.querySelector('c-paypal-risk-info').shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement AmericanExpress1;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//textarea[@name='notesMemo']")
	public WebElement Please_provide_a_memo_for_this__action;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Submit']")
	public WebElement Submit_button;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('c-merchant-admin').shadowRoot.querySelector('c-paypal-risk-info').shadowRoot.querySelectorAll('lightning-input')[2].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement Mastercard;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('c-merchant-admin').shadowRoot.querySelector('c-paypal-risk-info').shadowRoot.querySelectorAll('lightning-input')[4].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement Cetelem;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('c-merchant-admin').shadowRoot.querySelector('c-paypal-risk-info').shadowRoot.querySelectorAll('lightning-input')[5].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement Confinga;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('c-merchant-admin').shadowRoot.querySelector('c-paypal-risk-info').shadowRoot.querySelectorAll('lightning-input')[7].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement Discover;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('c-merchant-admin').shadowRoot.querySelector('c-paypal-risk-info').shadowRoot.querySelectorAll('lightning-input')[9].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement Solo;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('c-merchant-admin').shadowRoot.querySelector('c-paypal-risk-info').shadowRoot.querySelectorAll('lightning-input')[1].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement Visa;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('c-merchant-admin').shadowRoot.querySelector('c-paypal-risk-info').shadowRoot.querySelectorAll('lightning-input')[3].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement Carte_Bancaire;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('c-merchant-admin').shadowRoot.querySelector('c-paypal-risk-info').shadowRoot.querySelectorAll('lightning-input')[6].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement Cofidis;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('c-merchant-admin').shadowRoot.querySelector('c-paypal-risk-info').shadowRoot.querySelectorAll('lightning-input')[8].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement Switch;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('c-merchant-admin').shadowRoot.querySelector('c-paypal-risk-info').shadowRoot.querySelectorAll('lightning-input')[10].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement Mastro;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='*Admin Account Search']")
	public WebElement adminAccountSearch;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Email']")
	public WebElement SearchType;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Search apps and items...']/following-sibling::div//input")
	public WebElement searchAppsAndItems;
	@LinkType()
	@FindBy(xpath = "//a[@id='Merchant_Search_AdminTools']")
	public WebElement adminAccountSearch1;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Email']")
	public WebElement SearchType1;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//article/div/slot/div//input")
	public WebElement AccountNumberValue;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//article/div/slot/div//button[normalize-space(.)='Search']")
	public WebElement Search_button;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='MoreTabs']")
	public WebElement AuthenticationTab1;
	@LinkType()
	@FindBy(xpath = ".//c-merchant-search//a[normalize-space(.)='Product Info']")
	public WebElement AuthenticationTab2;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Airline Information']")
	public WebElement AirLineOnformation;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('c-merchant-admin').shadowRoot.querySelector('c-pay-pal-product-info').shadowRoot.querySelector('c-airline-information').shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement UATP;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Account Products Flags & Attributes']")
	public WebElement AccountProductFlags;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//c-pp-product-info-toggles//thead//div/input")
	public WebElement enterCutoffTime00002359;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Save']")
	public WebElement Save_button_CutoffTime;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//footer//button[normalize-space(.)='Confirm']")
	public WebElement Confirm_button;
	@ButtonType()
	@FindBy(xpath = "//*[text()='Account Number']")
	public WebElement Search_AccountNumber;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Admin Account Search']")
	public WebElement adminAccountSearch2;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Email']")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "(//div/input[@type='search'])[last()]")
	public WebElement from;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Add']")
	public WebElement Add_PhoneNobutton;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//button[@name='optionSelect']")
	public WebElement Type;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//tr[1]//span[normalize-space(.)='VALID']//lightning-base-formatted-text[1]")
	public WebElement ValidationStatu;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Toggle Invalid Status']")
	public WebElement Toggle_Invalid_Status_button;
	@TextType()
	@FindBy(xpath = "//h1[text()='Phone Numbers (3)']/following::table[1]/descendant::tbody/tr[1]/td[2]/descendant::span[2]")
	public WebElement Primary_;
	@TextType()
	@FindBy(xpath = "//h1[text()='Phone Numbers (3)']/following::table[1]/descendant::tbody/tr[1]/td[6]/descendant::lightning-base-formatted-text[1]")
	public WebElement ValidationStatusInvalid;
	@TextType()
	@FindBy(xpath = "//h1[text()='Phone Numbers (3)']/following::table[1]/descendant::tbody/tr[1]/td[1]/descendant::span[1]/input")
	public WebElement PhoneradioBtn;
	@BooleanType()
	@FindBy(xpath = "//h1[text()='Addresses (1)']/following::table[1]/descendant::tbody/tr[1]/td[1]/descendant::span[1]/input")
	public WebElement AddressCheckbox;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Confirm']")
	public WebElement Confirm_button1;
	@TextType()
	@FindBy(xpath = "//h1[text()='Addresses (1)']/following::table[1]/descendant::tbody/tr[1]/td[4]/descendant::lightning-base-formatted-text[1]")
	public WebElement AddressConfirmed;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//h1[normalize-space(.)='Addresses (1)ConfirmDeleteReset selected row']//button[normalize-space(.)='Delete']")
	public WebElement AddressDeleteButton;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)=concat('Failed to delete Address. If it',\"'\",'s a Primary Address, user cannot Unconfirm/delete. Please contact your system administrator for all else.')]")
	public WebElement FailedToDeletePrimaryAddress;
	@BooleanType()
	@FindBy(xpath = ".//c-merchant-search//div[2]/lightning-card[1]//label[normalize-space(.)='Select Item 2']/span[1]")
	public WebElement Checkbox;
	@BooleanType()
	@FindBy(xpath = "//h1[text()='Email Addresses (2)']/following::table[1]/descendant::tbody/tr[2]/td[1]/descendant::span[1]/input")
	public WebElement Checkbox1;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Unconfirm Email']")
	public WebElement Unconfirm_Email_button;
	@TextType()
	@FindBy(xpath = "//h1[text()='Email Addresses (2)']/following::table[1]/descendant::tbody/tr[2]/td[4]/descendant::lightning-base-formatted-text[1]")
	public WebElement EmailAddressConfirmed;
	@TextType()
	@FindBy(xpath = "//h1[text()='Email Addresses (2)']/following::table[1]/descendant::tbody/tr[2]/td[4]/descendant::lightning-base-formatted-text[1]")
	public WebElement Confirmed;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Confirm Email']")
	public WebElement Confirm_Email_button;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Confirm Email']")
	public WebElement Confirm_Email_button1;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Make primary']")
	public WebElement Make_primary_button;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Remove']")
	public WebElement Remove_button;
	@ButtonType()
	@FindBy(xpath = "(//button[normalize-space(.)='OK'])[last()]")
	public WebElement OK_button;
	@TextType()
	@FindBy(xpath = "//h1[text()='Email Addresses (2)']/following::table[1]/descendant::tbody/tr[2]/td[5]/descendant::lightning-base-formatted-text[1]")
	public WebElement Status;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//span[normalize-space(.)='+ 17878787878']//lightning-base-formatted-text[1]")
	public WebElement Phone_Number;
			
}
