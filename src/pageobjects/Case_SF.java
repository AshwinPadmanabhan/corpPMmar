package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Case_SF"                                
, connection="MTSLTUAT", relativeUrl = "https://goto--ltuat.sandbox.my.site.com/mts/s/?language=en_US"
		)        


public class Case_SF {
	public WebDriver driver ;

	public Case_SF (WebDriver driver){

		this.driver=driver;

	}
	public String GetURL(){ 
		return driver.getCurrentUrl();
	}
	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='Admin Account Search']")
	public WebElement adminAccountSearch;
	@LinkType()
	@FindBy(xpath = "//a[@id='ul-btn']")
	public WebElement logIn;
	@TextType()
	@FindBy(xpath = "//label[text()='Email']/preceding-sibling::input")
	public WebElement MTSEmail;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Email']/parent::div/parent::div/following-sibling::div[1]//input")
	public WebElement MTSPassword;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Log In']")
	public WebElement MTSLogin;
	@LinkType()
	@FindBy(xpath = "//a[@id='ul-btn']")
	public WebElement MTSMainLogin;
	@FindBy(linkText = "Contact us")
	@LinkType()
	public WebElement ContactUs;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('lightning-radio-group').shadowRoot.querySelectorAll('span')[1]")
	public WebElement CaseCreationPaypalRadioButton;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Please provide a subject']")
	public WebElement pleaseProvideASubject;
	@TextType()
	@FindBy(xpath = "//textarea[@placeholder='Please provide as many details as possible about your issue or question including the impact to your business. Troubleshooting examples: the webpage URL, any error message, steps on how to reproduce, and/or the timestamp for an occurrence. Impact example: 50% of payments are failing.']")
	public WebElement description;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Yes']/span[1]")
	public WebElement yes;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Sandbox / Pilot / Test']/span[1]")
	public WebElement sandboxPilotTest;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='No']/span[1]")
	public WebElement no;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Submit']")
	public WebElement SubmitCase;
	@FindBy(xpath = "//div[contains(text(),'Contact us')]/parent::div/descendant::a")
	@LinkType()
	public WebElement Contact_US;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Please provide the PayPal email address for the impacted account']")
	public WebElement pleaseProvideThePayPalEmailAddressForTheImpactedAccount;
	@TextType()
	@FindBy(css = "div.bold.slds-m-top--x-small.slds-m-bottom--x-small a")
	public WebElement CaseNumber;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Search apps and items...']")
	public WebElement searchAppsAndItems;
	@LinkType()
	@FindBy(xpath = "//a[@id='Case']")
	public WebElement AppLauncherCases;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Cases']")
	public WebElement cases;
	@PageFrame()
	public static class Frame {

		@ChoiceListType()
		@FindBy(xpath = "//select[@name='Selected_Product_Category']")
		public WebElement Product_Category;
		@ChoiceListType(values = { @ChoiceListValue(value = "Select_Choice", title = "Select Option"), @ChoiceListValue(value = "MTS"), @ChoiceListValue(value = "E_Plugins", title = "E-Plugins"), @ChoiceListValue(value = "NA_Partner_TAM", title = "NA Partner TAM"), @ChoiceListValue(value = "NA_TAM_Global_Partners", title = "NA TAM-Global-Partners"), @ChoiceListValue(value = "NA_TAM_NA_Core_Partners", title = "NA TAM-NA-Core-Partners"), @ChoiceListValue(value = "NA_TAM_SP", title = "NA TAM-SP"), @ChoiceListValue(value = "Paydiant"), @ChoiceListValue(value = "Paydiant_WLW", title = "Paydiant WLW"), @ChoiceListValue(value = "TAM_APAC", title = "TAM APAC"), @ChoiceListValue(value = "TAM_AU", title = "TAM AU"), @ChoiceListValue(value = "TAM_Core_EMEA_AU_LE", title = "TAM Core EMEA AU LE"), @ChoiceListValue(value = "TAM_Core_EMEA_AU_MM", title = "TAM Core EMEA AU MM"), @ChoiceListValue(value = "TAM_EMEA", title = "TAM EMEA"), @ChoiceListValue(value = "TAM_LATAM", title = "TAM LATAM"), @ChoiceListValue(value = "TAM_EMEA_Core_Partners", title = "TAM-EMEA-Core-Partners"), @ChoiceListValue(value = "Zettle"), @ChoiceListValue(value = "BT-Merchant Support") })
		@FindBy(xpath = "//select[@name='mtsOptions']")
		public WebElement Business_Group;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='*Case Contact']")
		public WebElement Case_Contact_field;
		@TextType()
		@FindByLabel(label = "Case Contact")
		public WebElement Case_Contact_field1;
		@TextType()
		@FindByLabel(label = "Case Contact")
		public WebElement Case_Contact_field2;
		@TextType()
		@FindByLabel(label = "Case Contact")
		public WebElement Case_Contact_field3;
		@TextType()
		@FindBy(xpath = "//input[@name='SubjectInput']")
		public WebElement Case_Subject;
		@TextType()
		@FindBy(xpath = "//span[contains(text(),'Case Description')]/following::textarea")
		public WebElement Case_Description;
		@ChoiceListType()
		@FindBy(xpath = "//select[@name='Environment']")
		public WebElement Environment;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='*Email Address of the Impacted PayPal Account']/following-sibling::div//input")
		public WebElement Email_Address_of_the_Impacted_PayPal_Account;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Next']")
		public WebElement Next_button;
		@TextType()
		@FindBy(xpath = "//input[@placeholder=\"Search reason codes\"]")
		public WebElement searchReasonCodes;
		@TextType()
		@FindBy(xpath = "//span[normalize-space(.)='Campaign GTM']")
		public WebElement Reason_code1;
		@TextType()
		@FindBy(xpath = "//li[@data-rs3=\"Campaign GTM\"]")
		public WebElement Campaign_GTM_result;
		@TextType()
		@FindBy(xpath = "//span[normalize-space(.)='Green Dot']")
		public WebElement Case_Contact_field4;
		@TextType()
		@FindBy(xpath = "//p[normalize-space(.)='Case Number:- 12507297']")
		public WebElement CaseSuccess_Display_Text;
		@TextType()
		@FindBy(xpath = "//p[contains(text(),'Case Number:-')]")
		public WebElement CaseSuccess_Display_Text1;
		@TextType()
		@FindBy(xpath = "//span/span/span[normalize-space(.)='Show more results for \"NavinT Chaudhury\"']")
		public WebElement Case_Contact_field5;
		@ChoiceListType()
		@FindBy(xpath = "//select[@name='HyperwalletOptions']")
		public WebElement HWBusinessGroup;
		@TextType()
		@FindBy(xpath = "//input[@name='Case_Collaborators']")
		public WebElement Collaborators;
	}
	@FindBy(xpath = "//div[contains(@class, \"iframe-parent\")]//iframe")
	public Frame frame;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//flexipage-aura-wrapper//div/div/lightning-formatted-text")
	public WebElement MTS_PP_Account_ID;
	@PageFrame()
	public static class Frame2 {

		@ChoiceListType(values = { @ChoiceListValue(value = "BT-Merchant Support") })
		@FindBy(xpath = "//select[@name='BraintreeOptions']")
		public WebElement Business_Group;
		@TextType()
		@FindBy(xpath = "//span[text()=' Address Update  ']")
		public WebElement Reason_Code_Address_Update;
		@ButtonType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelectorAll('sb-i18n')[5]")
		public WebElement cancel;
	}
	@FindBy(xpath = "//div[contains(@class, \"iframe-parent\")]//iframe")
	public Frame2 frame2;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[@id='flexipage_tab2__item']")
	public WebElement caseDetails;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[@id='flexipage_tab__item']")
	public WebElement feed;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Write an email...']")
	public WebElement writeAnEmail;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[normalize-space(.)='To,afowler@greendotcorp.com']/button/lightning-icon/span//g")
	public WebElement RemoveToAddress;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Send']")
	public WebElement publishersharebutton;
	@TextType()
	@FindBy(xpath = ".//c-gps-reason-code-component//input")
	public WebElement searchReasonCodes;
	@ButtonType()
	@FindBy(xpath = ".//c-gps-reason-code-component//button[normalize-space(.)='Save']")
	public WebElement Save_button;
	@TextType() @FindBy(xpath="//div[normalize-space(.)='Success']") 
	public WebElement successmessage;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//slot[@name='outputField']/force-owner-lookup/div/span[normalize-space(.)='GPS Global Professional Services']")
	public WebElement CaseOwner;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Send']")
	public WebElement SendMailButton;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//div[@id='sectionContent-391']//span[normalize-space(.)='Waiting for Feedback from Case Reporter']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement Status;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-p-p-t-s_-new_-layout___-case___-v-i-e-w___-l-m-t___1711579183000').shadowRoot.querySelector('forcegenerated-flexipage_ppts_new_layout_case__view_js___lmt___1711579183000').shadowRoot.querySelector('flexipage-aura-template-wrapper').shadowRoot.querySelector('forcegenerated-flexipageregion_ppts_new_layout_leftsidebar_case__view_js').shadowRoot.querySelector('support-lwc-related-record').shadowRoot.querySelector('runtime_platform_actions-lwc-quick-action-layout').shadowRoot.querySelector('records-base-record-form').shadowRoot.querySelector('records-lwc-record-layout').shadowRoot.querySelector('forcegenerated-quickaction_case___case__ppts_case_info___01280000000gk2laaa___view___recordlayout2').shadowRoot.querySelectorAll('lightning-formatted-text')[3]")
	public WebElement StatusValue;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Account Name')]/following::div/descendant::input[@name='Name']")
	public WebElement Name;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[@name='SaveEdit']")
	public WebElement saveAccount;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//tr[2]//span[normalize-space(.)='Arthur']")
	public WebElement Firstname_SR;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[@id='customTab__item']")
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
	@FindBy(xpath = "//table//th[@aria-label='Phone Number']/ancestor::thead/following-sibling::tbody/tr[1]//th//lightning-base-formatted-text")
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
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//span[normalize-space(.)='Advanced Search']")
	public WebElement SpanAdvanceedSearch;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[@data-hstype='0' and @data-htype='1' and @data-txntype='Instant Transfer Sent (Compliance Impacted)']")
	public WebElement Transaction;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='customTab6__item']")
	public WebElement addEditProducts;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='PayPal Standard Card']")
	public WebElement payPalStandardCard;

	@PageFrame()

	public static class iFrame {



		@BooleanType()

		@FindBy(xpath = "//sb-table-row[@name='Fastlane with Integration Methods']//sb-group[@id='selection']//sb-table-cell-select//paper-checkbox[@id='checkbox']//div[@id='checkboxContainer']")

		public WebElement checkbox_FastLane2;

		@ButtonType()

		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelectorAll('sb-i18n')[5]")

		public WebElement cancelinProduct;

	}

	@FindBy(xpath = "//div[contains(@class, \"content\")]//iframe")

	public Frame iframe;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Deals']")
	public WebElement deals;
	@TextType()
	@FindBy(xpath = "//button[@title='Remove']/descendant::span")
	public WebElement pressDeleteOrBackspaceToRemove0;
	@TextType()
	@FindBy(xpath = "//button[@id='combobox-button-315']")
	public WebElement requestedByBusinessGroup;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Requested by Business Group')]/following-sibling::div/following::button")
	public WebElement requestedByBusinessGroup1;
	//@TextType()
	//@FindBy(xpath = "//div[@aria-label='Suggestions']/descendant::img")
	//public WebElement CaseSearchSuggestion;
	//@TextType() @FindBy(xpath="//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//div[normalize-space(.)=concat('Don',\"'\",'t give up yet!')]") public WebElement _;
	@LinkType()
	@FindBy(xpath = "//img[@title='Log_In_with_PayPal']")
	public WebElement Login_with_Paypal;
	@ButtonType()
	@FindBy(xpath = "//button[@id='btnNext']")
	public WebElement next;
	@TextType()
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	@BooleanType()
	@FindBy(xpath = "//lightning-radio-group[@id='shoppingCart']//span[3]/label[normalize-space(.)='I do not know']/span[1]")
	public WebElement ShoppingCart_Option3;
	@TextType()
	@FindBy(xpath = "//div[contains(text(),'Case Number:')]")
	public WebElement Key_CaseNumber;
	@TextType()
	@FindBy(xpath = "//div[text()='Subject:']")
	public WebElement Key_Subject;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Braintree']/span[1]")
	public WebElement braintree;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Please provide the Braintree merchant ID for the impacted Production account.']")
	public WebElement pleaseTellUsIfYourQuestionIsAboutPayPalPayFlowOrIfYouAreUnsurePleaseSelectIDoNotKnow;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='HyperWallet']/span[1]")
	public WebElement hyperWallet;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='reasonCodePicklist']")
	public WebElement selectYourIssueYourSelectionHelpsRouteYourRequestToTheRightTeam;
	@TextType()
	@FindBy(xpath = "//input[@id='input-20']")
	public WebElement pleaseProvideTheHyperWalletAccountIDForTheImpactedProductionAccount;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='UAT']/span[1]")
	public WebElement UAT_option;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//div/div/div/div[normalize-space(.)='You completed all the milestones.']")
	public WebElement MilestoneCompleteTexr;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//li[6]/descendant::a[1]")
	public WebElement ClickMore;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='New GTS Case']")
	public WebElement New_MTS_Case;

			
}
