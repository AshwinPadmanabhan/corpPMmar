package pageobjects;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;

import com.provar.core.testapi.annotations.*;

@Page( title="RiskAndCompliance"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesUser"
     )             
public class RiskAndCompliance {
WebDriver driver; 
public RiskAndCompliance(WebDriver driver){
this.driver=driver;
}

	@ChoiceListType()
	@FindBy(name = "Marketplace_Platform_Operator_Aggregator")
	public WebElement Business_Operating_Structure;
	@LinkType()
	@FindBy(xpath = "//a[@data-label='Deal Guidance']")
	public WebElement dealGuidance;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='Marketplace_Platform_Operator_Aggregator' and contains(@class,'slds-select') and @part='select']")
	public WebElement Business_Operating_Structure1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Next']")
	public WebElement Next_button;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-deal_-record_-page___-s-b-q-q__-quote__c___-v-i-e-w___-l-m-t___1713525256000').shadowRoot.querySelector('forcegenerated-flexipage_deal_record_page_sbqq__quote__c__view_js___lmt___1713525256000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelector('flowruntime-flow').shadowRoot.querySelector('flowruntime-lwc-body').shadowRoot.querySelector('flowruntime-list-container').shadowRoot.querySelector('flowruntime-base-section').shadowRoot.querySelector('flowruntime-screen-field').shadowRoot.querySelector('flowruntime-lwc-field').shadowRoot.querySelector('flowruntime-display-text-lwc').shadowRoot.querySelector('lightning-formatted-rich-text').shadowRoot.querySelectorAll('span')[6]")
	public WebElement ComplianceRequiredNot_RequiredNetwork_RegistrationRequiredNot_RequiredUnderwritingRequiredNot_Required;
	@PageWait.Field(timeoutSeconds = 20)
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[contains(normalize-space(.),'Deals')]")
	public WebElement SBQQ__Quotes2__r;
	@BooleanType()
	@FindByLabel(label = "false")
	public WebElement ComplianceRequiredNot_RequiredNetwork_RegistrationRequiredNot_RequiredUnderwritingRequiredNot_Required1;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Create Underwriting & Compliance Record']")
	public WebElement createUnderwritingAndComplianceRecord;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[starts-with(normalize-space(.),'Q-')]")
	public WebElement NAME;
	@BooleanType()
	@FindBy(xpath = "//a[normalize-space(.)='Underwriting' and contains(@class,'slds-tabs_default__link')]")
	public WebElement ComplianceRequiredNot_RequiredNetwork_RegistrationRequiredNot_RequiredUnderwritingRequiredNot_Required2;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Compliance']")
	public WebElement ComplianceRequiredNot_RequiredNetwork_RegistrationRequiredNot_RequiredUnderwritingRequiredNot_Required3;
	@BooleanType()
	@FindBy(xpath = "//a[contains(@class,'slds-checkbox_faux')]")
	public WebElement ComplianceRequiredNot_RequiredNetwork_RegistrationRequiredNot_RequiredUnderwritingRequiredNot_Required4;
	@LinkType()
	@FindBy(xpath = "//a[@data-label=\"Underwriting & Compliance Guidance\"]")
	public WebElement underwritingAndComplianceGuidance1;
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[contains(normalize-space(.),'Underwriting & Compliance')]")
	public WebElement Compliance_Reviews__r;
	@PageWait.Field(timeoutSeconds = 30)
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[starts-with(normalize-space(.),'UW-CR-')]")
	public WebElement NAME1;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[1].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-deal_-record_-page___-s-b-q-q__-quote__c___-v-i-e-w___-l-m-t___1713525256000').shadowRoot.querySelector('forcegenerated-flexipage_deal_record_page_sbqq__quote__c__view_js___lmt___1713525256000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelectorAll('lightning-input')[2].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement ComplianceRequiredNot_RequiredNetwork_RegistrationRequiredNot_RequiredUnderwritingRequiredNot_Required5;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[1].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-deal_-record_-page___-s-b-q-q__-quote__c___-v-i-e-w___-l-m-t___1714740467000').shadowRoot.querySelector('forcegenerated-flexipage_deal_record_page_sbqq__quote__c__view_js___lmt___1714740467000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelectorAll('lightning-input')[2].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement ComplianceRequiredNot_RequiredNetwork_RegistrationRequiredNot_RequiredUnderwritingRequiredNot_Required51;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[1].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-deal_-record_-page___-s-b-q-q__-quote__c___-v-i-e-w___-l-m-t___1713525256000').shadowRoot.querySelector('forcegenerated-flexipage_deal_record_page_sbqq__quote__c__view_js___lmt___1713525256000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelectorAll('lightning-input')[1].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement ComplianceRequiredNot_RequiredNetwork_RegistrationRequiredNot_RequiredUnderwritingRequiredNot_Required6;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Compliance_Review__c.SubmitHOUApproval']")
	public WebElement Compliance_Review__c_SubmitHOUApproval;
	@PageWait.Field(timeoutSeconds = 20)
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='Compliance_Request_Type__c']")
	public WebElement Request_Type;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//textarea[@name='Business_Model__c']")
	public WebElement Business_Model;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Planned_PP_accounts_Website__c']")
	public WebElement Planned_Website;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//textarea[@name='Integration_Method__c']")
	public WebElement Integration_Method;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Country_of_the_PP_Accounts__c']")
	public WebElement Country_s__of_the_PP_Accounts;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Documents_attached__c']")
	public WebElement Documents_attached_;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//textarea[@name='Documents_Notes__c']")
	public WebElement Documents_Notes;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//textarea[@name='Risk_Creators_Comments__c']")
	public WebElement Request_Creator_Comments;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Company_Number_Account__c']")
	public WebElement Company_Number___Account;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Save & Submit' and @type='button']")
	public WebElement Save___Submit_button;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lst-output-lookup//a[@id='window']")
	public WebElement NAME2;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Opportunity Guidance']")
	public WebElement opportunityGuidanceDropdown;
	//@ButtonType()
	//@FindBy(xpath = ".//c-opportunity-guidance//button[normalize-space(.)='Next']")
	//public WebElement Next_button;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//slot[@name='main']//lightning-tabset//button[normalize-space(.)='MoreTabs']")
	public WebElement moreTabs;
	
	public String getId(){
	String id = driver.getCurrentUrl().split("Compliance_Review__c/")[1].split("/view")[0];
	
	return id;
	}

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Compliance']")
	public WebElement ComplianceLabel;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('search_dialog-instant-results-list').shadowRoot.querySelector('search_dialog-instant-result-item').shadowRoot.querySelectorAll('div')[3]")
	public WebElement SearchResult;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//input[@placeholder='Search User...' and @type='text']")
	public WebElement selectUser;
	@PageWait.Field(timeoutSeconds = 10)
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Underwriting']")
	public WebElement UnderwritingNameField;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Merchant_Provides_Software_Services__c']")
	public WebElement Merchant_Provides_Software__Services;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='Services_are_generally_provided_within__c']")
	public WebElement Services_are_generally_provided_within;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Merchant_Sells_Physical_Products__c']")
	public WebElement Merchant_Sells_Physical_Products;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='Orders_are_generally_delivered_within__c']")
	public WebElement Orders_are_generally_delivered_within;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='How_are_goods_shipped__c']")
	public WebElement How_are_goods_shipped_;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Merchant_Offers_Subscriptions__c']")
	public WebElement Merchant_Offers_Subscriptions;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Subscriptions_Monthly__c']")
	public WebElement Subscriptions___Monthly__;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Subscriptions_Quarterly__c']")
	public WebElement Subscriptions___Quarterly__;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Subscriptions_Semi_annual__c']")
	public WebElement Subscriptions___Semi_annual__;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Subscriptions_Annual__c']")
	public WebElement Subscriptions___Annual__;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Average_Transaction_Amount__c']")
	public WebElement Average_Transaction_Amount;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Highest_Trans_Amount__c']")
	public WebElement Highest_$_Trans_Amount;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span/span[normalize-space(.)='Absolute Tolerance']")
	public WebElement Feature_Request_Type;
	@TextType()
	@FindBy(xpath = "//button[contains(@title,'Move')]")
	public WebElement Feature_Request_Type1;
	@TextType()
	@FindBy(xpath = ".//c-accept-ownership//input")
	public WebElement Select_User;
	@ButtonType()
	@FindBy(xpath = ".//c-accept-ownership//button[normalize-space(.)='Assign']")
	public WebElement Assign_button;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Approve' and @type='button']")
	public WebElement sbaa__Approval__c_HOUApprove;
	@PageWait.Field(timeoutSeconds = 10)
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@aria-label='Review Owner' and @name='Review Owner']")
	public WebElement Review_Owner;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement Save_button_Approval;
	@PageFrame()
	public static class Frame {

		@ButtonType()
		@JavascriptBy(jspath = "return document.querySelector('input.slds-button.slds-button--brand')")
		public WebElement approve;
		@PageWait.BackgroundActivity(timeoutSeconds = 60)
		@TextType()
		@FindBy(xpath = "//textarea")
		public WebElement comments;
		@PageWait.BackgroundActivity(timeoutSeconds = 30)
		@ButtonType()
		@FindBy(xpath = "//input[@value='Reject']")
		public WebElement Reject;
		@PageWait.Field(timeoutSeconds = 20)
		@ButtonType()
		@FindBy(xpath = "//input[@value='Approve']")
		public WebElement approve1;
		@TextType()
		@FindBy(xpath = "//span[normalize-space(.)='Triage Approval']")
		public WebElement Approval_Rule;
		@TextType()
		@FindBy(xpath = "//span[normalize-space(.)='Triage Approval']")
		public WebElement Approval_Rule1;
		@TextType()
		@FindBy(xpath = "//sb-search-bar[@id='headersearch']//sb-typeahead[@id='typeahead']//input[@placeholder='Search Products']")
		public WebElement searchProducts;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-search-bar').shadowRoot.querySelector('sb-typeahead').shadowRoot.querySelector('input')")
		public WebElement searchProducts1;
		@TextType()
		@FindBy(xpath = "//sb-search-bar[@id='headersearch']//sb-typeahead[@id='typeahead']//input[@id='itemLabel']")
		public WebElement searchProducts2;
	}
	@FindBy(xpath = "//div[contains(@class, \"windowViewMode-maximized\")]/div//iframe")
	public Frame frame;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Rematch Record']")
	public WebElement rematchRecord;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-account_-record_-page___-account___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_account_record_page_account__view_js').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement bizName;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Search']")
	public WebElement search_DB;
	@PageRow()
	public static class DtData {

		@ButtonType()
		@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-account_-record_-page___-account___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_account_record_page_account__view_js').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelectorAll('button')[4]")
		public WebElement BusinessName_Update;
	}
	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.dtData']")
	@PageTable(firstRowContainsHeaders = false, row = DtData.class)
	public List<DtData> dtData;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Ok']")
	public WebElement ok;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Contact Support']")
	public WebElement contactSupport;
	@TextType()
	@FindBy(xpath = "//button[normalize-space(.)='Select an Option' and @name='Change_Request_Type__c']")
	public WebElement businessRequest;
	@TextType()
	@FindBy(xpath = "//button[@name='Change_Request_Type__c']")
	public WebElement businessRequestContactSupport;
	@TextType()
	@FindBy(xpath = "//textarea[@name='Description']")
	public WebElement description;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Create Case']")
	public WebElement createCase;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//slot[@name='primaryField']/lightning-formatted-text")
	public WebElement title;
	
	public String getUrl(){
	String url = driver.getCurrentUrl();
	
	return url;
	}
	public  void function(String value) {
        	driver.get(""+ value+"");
    }

	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Underwriting & Compliance Guidance' and @data-label='Underwriting & Compliance Guidance']")
	public WebElement Underwriting___Compliance_Tab;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[@name='sbaa__Approval__c.HoldCustom']")
	public WebElement sbaa__Approval__c_HoldCustom;
	@PageWait.Field(timeoutSeconds = 30)
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='Deal Owner']/span[1]")
	public WebElement dealOwner;
	@TextType()
	@FindBy(xpath = "//label[text()='Hold Comments']/following-sibling::div/*")
	public WebElement holdComments;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span/span[normalize-space(.)='Review Required']")
	public WebElement HoldReason;
	@ButtonType()
	@FindBy(xpath = "(//button[contains(@title,'Move')])[1]")
	public WebElement holdreasonValues;
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[@name='sbaa__Approval__c.RejectApproval']")
	public WebElement sbaa__Approval__c_RejectApproval;
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//button[contains(@aria-label,'Final Decision')]")
	public WebElement Final_Decision;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span/span[normalize-space(.)='No Response from Sales']")
	public WebElement Dismissed_Reason;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//div[3]//button[normalize-space(.)='Move selection to Chosen']/lightning-primitive-icon")
	public WebElement Feature_Request_Type11;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[@data-label='Underwriting Details']")
	public WebElement underwritingDetails;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//span[normalize-space(.)='SCM Case Id']")
	public WebElement RecordSCM_Case_Id_cField;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//span[normalize-space(.)='Cassini Case Status']")
	public WebElement RecordCassini_Case_Status_cField;
	@LinkType()
	@FindByLabel(label = "Cassini Case URL", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement RecordCassini_Case_URL_cField;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[1].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-deal_-record_-page___-s-b-q-q__-quote__c___-v-i-e-w___-l-m-t___1714740467000').shadowRoot.querySelector('forcegenerated-flexipage_deal_record_page_sbqq__quote__c__view_js___lmt___1714740467000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelectorAll('lightning-input')[1].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement ComplianceRequiredNot_RequiredNetwork_RegistrationRequiredNot_RequiredUnderwritingRequiredNot_Required7;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[2].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-deal_-record_-page___-s-b-q-q__-quote__c___-v-i-e-w___-l-m-t___1714740467000').shadowRoot.querySelector('forcegenerated-flexipage_deal_record_page_sbqq__quote__c__view_js___lmt___1714740467000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement Compliance;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[2].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-deal_-record_-page___-s-b-q-q__-quote__c___-v-i-e-w___-l-m-t___1714740467000').shadowRoot.querySelector('forcegenerated-flexipage_deal_record_page_sbqq__quote__c__view_js___lmt___1714740467000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelectorAll('lightning-input')[2].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement Underwriting;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[2].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-deal_-record_-page___-s-b-q-q__-quote__c___-v-i-e-w___-l-m-t___1714740467000').shadowRoot.querySelector('forcegenerated-flexipage_deal_record_page_sbqq__quote__c__view_js___lmt___1714740467000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelectorAll('lightning-input')[1].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement NetworkRegistaration;
	@BooleanType()
	@FindBy(xpath = "//input[@name='Compliance']/parent::label/span[2]/span")
	public WebElement Compliance01;
	@BooleanType()
	@FindBy(xpath = "//span[text()='Underwriting']/following::span[@part='indicator']")
	public WebElement Underwriting1;
	@PageWait.Field(timeoutSeconds = 10)
	@FindBy(xpath = "//span[text()='Network Registration']/following::span[@part='indicator']")
	@BooleanType()
	public WebElement NetworkRegistration_01;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Move to ChosenMove selection to Chosen']/lightning-primitive-icon")
	public WebElement Feature_Request_Type2;
	@TextType()
	@FindBy(xpath = "(//button[contains(@title,'Move')])[3]")
	public WebElement Select_Dismissed_Reason;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='UW Required']/span[1]")
	public WebElement uWRequired;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Resume']")
	public WebElement Resume_button;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='Compliance Required']/span[1]")
	public WebElement complianceRequired;
	@PageFrame()
	public static class Frame1 {

		@TextType()
		@FindBy(xpath = "//span[normalize-space(.)='Triage Approval']")
		public WebElement TriageApproval;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-search-bar').shadowRoot.querySelector('sb-typeahead').shadowRoot.querySelector('input')")
		public WebElement searchProducts1;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelectorAll('sb-table-row')[1].shadowRoot.querySelector('sb-group').shadowRoot.querySelector('sb-table-cell-select').shadowRoot.querySelector('paper-checkbox').shadowRoot.querySelector('div')")
		public WebElement checkbox1;
		@ButtonType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelectorAll('sb-i18n')[3]")
		public WebElement select;
		@ButtonType()
		@FindBy(xpath = "//sb-custom-action[@name='Save & Return']//paper-button[normalize-space(.)='Save & Return to Opportunity']//slot")
		public WebElement saveAndReturn;
	}
	@FindBy(xpath = "//iframe[@title='accessibility title']")
	public Frame1 frame1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[normalize-space(.)='Deal Guidance']")
	public WebElement dealGuidance1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Next']")
	public WebElement Next_button1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[normalize-space(.)='Underwriting & Compliance Guidance']")
	public WebElement underwritingAndComplianceGuidance;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Create Underwriting & Compliance Record']")
	public WebElement createUnderwritingAndComplianceRecord1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[normalize-space(.)='Underwriting & Compliance (1)']")
	public WebElement Compliance_Reviews__r1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//force-lookup//a[@id='window']")
	public WebElement NAME3;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[@data-label='HOU Details']")
	public WebElement hOUDetails;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Underwriting/Compliance']")
	public WebElement underwritingComplianceTab;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Add/Edit Products']")
	public WebElement addEditProducts;
	@PageFrame()
	public static class Frame2 {

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-search-bar').shadowRoot.querySelector('sb-typeahead').shadowRoot.querySelector('input')")
		public WebElement searchProducts;
		@BooleanType()
		@SteelBrickBy(fieldSetTableItem = "checkbox")
		public WebElement checkbox;
		@ButtonType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelectorAll('sb-i18n')[3]")
		public WebElement select;
		@ButtonType()
		@FindBy(xpath = "//sb-custom-action[@name='Save & Return']//paper-button[@id='mainButton']//slot")
		public WebElement saveAndReturn;
	}
	@FindBy(xpath = "//iframe[contains(@src,'apex/SBQQ__sb?Id=aDaQL0000001r8j0AA')]")
	public Frame2 frame2;
	@PageFrame()
	public static class Frame3 {

		@TextType()
		@FindBy(xpath = "//sb-search-bar[@id='headersearch']//sb-typeahead[@id='typeahead']//input[@placeholder='Search Products']")
		public WebElement searchProducts2;
	}
	@FindBy(xpath = "//iframe[contains(@src,'apex/SBQQ__sb?Id=aDaQL0000001rFB0AY')]")
	public Frame3 frame3;
	@PageFrame()
	public static class Frame4 {

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-lookup').shadowRoot.querySelector('#headersearch').shadowRoot.querySelector('#typeahead').shadowRoot.querySelector('#itemLabel')")
		public WebElement searchProducts2;
	}
	@FindBy(xpath = "//iframe[contains(@src,'apex/SBQQ__sb?Id=aDaQL0000001rK10AI')]")
	public Frame4 frame4;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Link']")
	public WebElement ObjectObject;
	@PageRow()
	public static class WrapperValues_OPLI {

		@BooleanType()
		@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//td/input")
		public WebElement SelectAll_Products_That_Apply;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-opportunity_-record_-page_-default___-opportunity___-v-i-e-w___-l-m-t___1722947320000').shadowRoot.querySelector('forcegenerated-flexipage_opportunity_record_page_default_opportunity__view_js___lmt___1722947320000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[6].shadowRoot.querySelector('input')")
		public WebElement SelectAll_Products_That_Apply1;
		@BooleanType()
		@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//td/input")
		public WebElement SelectAll_Products_That_Apply2;
	}
	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'wrapperValues.OPLI']")
	@PageTable(firstRowContainsHeaders = false, row = WrapperValues_OPLI.class)
	public List<WrapperValues_OPLI> wrapperValues_OPLI;
	@PageRow()
	public static class WrapperValues_OPLI1 {
	}
	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'wrapperValues.OPLI']")
	@PageTable(firstRowContainsHeaders = false, row = WrapperValues_OPLI1.class)
	public List<WrapperValues_OPLI1> wrapperValues_OPLI1;
	@PageRow()
	public static class WrapperValues_OPLI2 {

		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-opportunity_-record_-page_-default___-opportunity___-v-i-e-w___-l-m-t___1722947320000').shadowRoot.querySelector('forcegenerated-flexipage_opportunity_record_page_default_opportunity__view_js___lmt___1722947320000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[6].shadowRoot.querySelector('input')")
		public WebElement SelectAll_Products_That_Apply;
	}
	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'wrapperValues.OPLI']")
	@PageTable(firstRowContainsHeaders = false, row = WrapperValues_OPLI2.class)
	public List<WrapperValues_OPLI2> wrapperValues_OPLI2;
	@PageRow()
	public static class WrapperValues_OPLI21 {
	}
	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'wrapperValues.OPLI']")
	@PageTable(firstRowContainsHeaders = false, row = WrapperValues_OPLI21.class)
	public List<WrapperValues_OPLI21> wrapperValues_OPLI21;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Confirm And Save']")
	public WebElement confirmAndSave;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Chatter']")
	public WebElement chatter;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-opportunity_-record_-page_-default___-opportunity___-v-i-e-w___-l-m-t___1722947320000').shadowRoot.querySelector('forcegenerated-flexipage_opportunity_record_page_default_opportunity__view_js___lmt___1722947320000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[6].shadowRoot.querySelectorAll('span')[28]")
	public WebElement _648_a;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Duplicate Product')]")
	public WebElement ChatterMsg;
	@BooleanType()
	@FindBy(xpath = "//span[text()='Network Registration']/parent::td/following-sibling::td/descendant::span[@part='indicator']")
	public WebElement NetworkRegistration_New;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Complete Deal Guidance']")
	public WebElement Complete_Deal_Guidance_button;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name=\"OTA\"]")
	public WebElement Online_Travel_Agency;
	@ChoiceListType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//select[@id='select-978']")
	public WebElement Merchants_with_delivery_period__gt__30_days;
	@BooleanType()
	@FindBy(xpath = "//span[normalize-space(.)='Underwriting']/following-sibling::span[1]/span[3]")
	public WebElement UnderwritingToggleCheck;
	@ChoiceListType(values = { @ChoiceListValue(value = "1. Livestreaming", title = "varActivitesnotinMCC.1. Livestreaming"), @ChoiceListValue(value = "2. Multi-Level Marketing (MLM) / Affiliate Programs", title = "varActivitesnotinMCC.2. Multi-Level Marketing (MLM) / Affiliate Programs"), @ChoiceListValue(value = "3. Online Education", title = "varActivitesnotinMCC.3. Online Education"), @ChoiceListValue(value = "4. Cannabis", title = "varActivitesnotinMCC.4. Cannabis"), @ChoiceListValue(value = "5. CBD", title = "varActivitesnotinMCC.5. CBD"), @ChoiceListValue(value = "6. Start-ups", title = "varActivitesnotinMCC.6. Start-ups"), @ChoiceListValue(value = "7. Stored Value Cards (open loop only)", title = "varActivitesnotinMCC.7. Stored Value Cards (closed or open loop)"), @ChoiceListValue(value = "8. Non Fungible Tokens (NFTs)", title = "varActivitesnotinMCC.8. Non Fungible Tokens (NFTs)"), @ChoiceListValue(value = "9. Cryptocurrency", title = "varActivitesnotinMCC.9. Cryptocurrency"), @ChoiceListValue(value = "10. Pre-orders", title = "varActivitesnotinMCC.10. Pre-orders"), @ChoiceListValue(value = "11. Custom Orders", title = "varActivitesnotinMCC.11. Custom Orders") })
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//option[normalize-space(.)='10. Pre-orders']")
	public WebElement ActivitiesNotCapturedMCC;
	@TextType()
	@FindBy(xpath = "//b[contains(text(),'Underwriting has been auto approved')]")
	public WebElement AutoApprovalMessage;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[@id='toggle-description-821']/span[1]")
	public WebElement toggleCompliance;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Cancel']")
	public WebElement cancel;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Seller Risk & Compliance Query Case']")
	public WebElement sellerRiskAndComplianceQueryCase;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//textarea[contains(@class,'slds-textarea')]")
	public WebElement description1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
	public WebElement save;
	@LinkType()
	@FindBy(xpath = "//*[contains(@data-component-id,'RelatedCases')]/descendant::tbody/tr[1]/descendant::a")
	public WebElement _13863121;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//section//button[normalize-space(.)='Create Underwriting & Compliance Record']")
	public WebElement createUnderwritingAndComplianceRecord2;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Find Match']")
	public WebElement findMatch;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@placeholder='Business Name']")
	public WebElement BusinessName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//td[normalize-space(.)='Testa Corp']")
	public WebElement BusinessNameSearchResult;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Update Account']")
	public WebElement updateAccount;
	@ChoiceListType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//select[@name='Request_Type1']")
	public WebElement UnderwritingCompReqType;
	@TextType()
	@FindBy(xpath = "//button[@name='Compliance_Request_Type__c']")
	public WebElement requestType;
	@TextType()
	@FindBy(xpath = "//*[text()='Search Criteria']/*/span")
	public WebElement ExpandSearchCriteria;
	@TextType()
	@FindBy(xpath = "//button[@name='DropShipper']")
	public WebElement Drop_Shipper;
	@TextType()
	@FindBy(xpath = "//button[@name='SoleProprietor']")
	public WebElement Sole_Proprietor;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Tour Operator']/span[1]")
	public WebElement Tour_Operator;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='High Risk Services']/span[1]")
	public WebElement High_Risk_Services;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Event Organizer']/span[1]")
	public WebElement Event_Organizer;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Online Travel Agency']/span[1]")
	public WebElement Online_Travel_Agency1;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Merchant with Delivery period > 30 days']/span[1]")
	public WebElement Merchant_with_Delivery_period___30_days;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Expected Average Ticket values exceeding > $1000']/span[1]")
	public WebElement Expected_Average_Ticket_values_exceeding___$1000;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@id='combobox-button-724']/span")
	public WebElement Underwriting___Compliance_Request_Type;
	@TextType()
	@FindBy(xpath = "//button[@aria-label='Underwriting & Compliance Request Type']")
	public WebElement Underwriting___Compliance_Request_Type1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@name='DeliveryTimeframe']")
	public WebElement Delivery_Timeframe;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-deal_-record_-page___-s-b-q-q__-quote__c___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_deal_record_page_sbqq__quote__c__view_js').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelector('c-deal-guidance').shadowRoot.querySelectorAll('lightning-combobox')[4].shadowRoot.querySelector('lightning-base-combobox').shadowRoot.querySelector('button')")
	public WebElement Underwriting___Compliance_Request_Type2;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span/span[normalize-space(.)='10. Pre-orders']")
	public WebElement PreOrder;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Move to Selected']/lightning-primitive-icon")
	public WebElement moveToSelected;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@aria-label='Underwriting & Compliance Request Type']/span")
	public WebElement underwritingAndComplianceRequestType;
	@TextType()
	@FindBy(xpath = "//*[@data-value='Account Expansion: New Point of Sale/URL']")
	public WebElement Account_Expansion;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Underwriting has been auto approved']")
	public WebElement AutoApprovalMessage1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@aria-label='Deal Type']/span")
	public WebElement Deal_Type;
	@LinkType()
	@FindBy(xpath = "//*[contains(@data-component-id,'RelatedCases')]/descendant::tbody/tr[1]/descendant::a")
	public WebElement CaseNumber;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='BusinessOperatingStructure']")
	public WebElement Business_Operating_Structure2;
	@TextType()
	@FindBy(xpath = "//button[@aria-label='Deal Type']/span")
	public WebElement Deal_Type1;
	@TextType()
	@FindBy(xpath = "//*[@data-value='New Account']")
	public WebElement New_Account;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div/div/div[normalize-space(.)='Underwriting has been auto approved for this deal, and Compliance is not required. No additional action required.']")
	public WebElement AutoApprovalPopUpMSG;
	@TextType()
	@FindBy(xpath = ".//c-company-validation//td[normalize-space(.)='TEST BUZZ']")
	public WebElement BusinessName01;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@id='combobox-button-1190']/span")
	public WebElement pricing_updates;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@id='combobox-button-1212']/span")
	public WebElement Approved_Compliance_Review;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//p[4]")
	public WebElement ProhibitedMCC1_Display_Text;
	@ButtonType()
	@FindBy(xpath = "//div/button[normalize-space(.)='Create Underwriting & Compliance Record']")
	public WebElement createUnderwritingAndComplianceRecord_opty;
	@LinkType()
	@FindBy(xpath = "//span/slot[contains(text(),'Underwriting & Compliance')]")
	public WebElement Compliance_Reviews__r_opty;
	@TextType()
	@FindBy(xpath = "//input[@name='PayPal_Account_ID__c']")
	public WebElement PayPal_Account_ID__c;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//input[@name='DeliveryTimeframe']")
	public WebElement Delivery_Timeframe2;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Complete Deal Guidance']")
	public WebElement Complete_Deal_Guidance_button2;
	@TextType()
	@FindBy(xpath = "//span[text()='Review Guidance']/following::div[1]/descendant::div/div[1]/p[1]/descendant::span[1]")
	public WebElement ReviewGuidanceTest_allTrue;
	@TextType()
	@FindBy(xpath = "//span[text()='Review Guidance']/following::div[1]/descendant::div/div[1]/p[2]/descendant::span[1]")
	public WebElement ReviewGuidanceText_part2;
	@TextType()
	@FindBy(xpath = "//span[text()='Review Guidance']/following::div[1]/descendant::div/div[1]/p[3]/descendant::span[1]")
	public WebElement ReviewGuidanceText_Part3;
	@TextType()
	@FindBy(xpath = "//span[text()='Review Guidance']/following::div[1]/descendant::div/div[1]")
	public WebElement ReviewGuidanceText_Part4;
	@TextType()
	@FindBy(xpath = "//span[text()='Review Guidance']/following::div[1]/descendant::div/div[1]/b[1]")
	public WebElement ReviewGuidanceText_PleaseNote;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//c-deal-guidance-requirements/div[1]")
	public WebElement ProhibitedMCCText;
	
	public void toastMsge(String ExpectedResult){
		//driver.findElement(By.xpath("//button[normalize-space(.)='Complete Deal Guidance']")).click();


		FluentWait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))           
				.pollingEvery(Duration.ofSeconds(2))           
				.ignoring(NoSuchElementException.class);       

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//span[normalize-space(.)='Deal Guidance cannot be completed as no products are linked to the deal.']"));
			}
		});
		if(ExpectedResult.equals(element.getText())){
			System.out.println("TestPass");
		}
		else{
			driver.findElement(By.xpath(ExpectedResult)).click();
		}

	}

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Clear Selection']")
	public WebElement clearSelection;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@data-value='5733 | Arts, crafts, and collectibles | Music store - instruments and sheet musi']")
	public WebElement Merchant_Category_Code;
			
}