package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="PPTS_SF"                                
     , summary=""
     , relativeUrl=""
     , connection="SystemAdmin"
     )             
public class PPTS_SF {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//a[normalize-space(.)='New']")
	public WebElement NewCase;
	@BooleanType()
	@FindBy(xpath = "//input[@type='radio']/following-sibling::span[contains(text(),'Global Specialist Desk')]")
	public WebElement RecordTypeGSD;
	@BooleanType()
	@FindBy(xpath = "//span[contains(text(),'Global Specialist Desk')]/preceding-sibling::input")
	public WebElement RecordType;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Next']")
	public WebElement NextButton;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Edit Case Owner']")
	public WebElement OwnerId;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Edit Case Owner']")
	public WebElement EditCaseOwnerButton;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Edit Case Origin']")
	public WebElement CaseOriginEditButton;
	@TextType()
	@FindBy(xpath = "\n//span[contains(text(),'PPTS Support')]/preceding-sibling::input")
	public WebElement recordTypeName;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Search reason codes']")
	public WebElement ReasonCodeField;
	@TextType()
	@FindBy(xpath = ".//c-gps-reason-code-component//span[normalize-space(.)='Address']")
	public WebElement ReasonCodeValueCDPage;
	@ButtonType()
	@FindBy(xpath = ".//c-gps-reason-code-component//button[normalize-space(.)='Save']")
	public WebElement Save_button;
	@TextType()
	@FindBy(xpath = ".//c-gps-reason-code-component//button[@name='New Integration']")
	public WebElement New_Integration;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Write an email...']")
	public WebElement writeAnEmail;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[normalize-space(.)='To,afowler@greendotcorp.com']/button/lightning-icon/span//g")
	public WebElement ClearToField;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//label[normalize-space(.)='To']/following-sibling::div[1]//input")
	public WebElement ToAddress;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Case Routing Details']")
	public WebElement caseRoutingDetails;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Case Routing Details')]/following::label[contains(text(),'Team')]/following-sibling::div/input")
	public WebElement TeamInput;
	@FindBy(xpath = "//span[contains(text(),'Case Routing Details')]/following::label[contains(text(),'Status')]/following::div/button")
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[1].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-p-p-t-s_-new_-layout___-case___-v-i-e-w___-l-m-t___1711579183000').shadowRoot.querySelector('forcegenerated-flexipage_ppts_new_layout_case__view_js___lmt___1711579183000').shadowRoot.querySelector('flexipage-aura-template-wrapper').shadowRoot.querySelector('forcegenerated-flexipageregion_ppts_new_layout_rightsidebar_case__view_js').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[3].shadowRoot.querySelector('c-gps-manual-case-routing-component').shadowRoot.querySelector('lightning-combobox').shadowRoot.querySelector('lightning-base-combobox').shadowRoot.querySelector('button')")
	public WebElement Status;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Case Routing Details')]/following::label[contains(text(),'Comment ')]/following::div/textarea")
	public WebElement Comment;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//c-gps-manual-case-routing-component//button[normalize-space(.)='Save']")
	public WebElement CaseRoutingSave_button;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Case updated at 1SFDC as the selected team was Internal']")
	public WebElement RoutingDetailsToastMessage;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Email triggerd to OTRS team HW-Credit Successfully!']")
	public WebElement HWCreditRD_ToastMessage;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//slot[@name='main']//button[normalize-space(.)='MoreTabs']")
	public WebElement moreTabs;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[normalize-space(.)='Cases']")
	public WebElement Cases;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//lst-related-list-single-app-builder-mapper//button[@name='NewCase']")
	public WebElement NewCase1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//span[normalize-space(.)='PPTS Support']")
	public WebElement recordTypeName1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[@id='combobox-button-1516']")
	public WebElement Category__c;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[@id='combobox-button-1528']")
	public WebElement Sub_Category__c;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[@name='SaveEdit']")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Contact Support']")
	public WebElement contactSupport;
	@TextType()
	@FindBy(xpath = "//button[@id='combobox-button-130']")
	public WebElement businessRequest;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Echo Segment']")
	public WebElement Echo_Segment;
	@TextType()
	@FindBy(xpath = "//textarea[@name='Description']")
	public WebElement description;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Create Case']")
	public WebElement createCase;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Business Request']/following-sibling::div//button")
	public WebElement businessRequest1;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Requested by Business Group')]/following-sibling::div/descendant::button[@id='combobox-button-373']")
	public WebElement requestedByBusinessGroup;
	@TextType()
	@FindBy(css = "#combobox-button-373 span.slds-truncate")
	public WebElement requestedByBusinessGroup1;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Requested by Business Group')]/following-sibling::div/descendant::button")
	public WebElement requestedByBusinessGroup2;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Requested by Business Group']/following-sibling::div//span[1]")
	public WebElement requestedByBusinessGroup3;
	@TextType()
	@FindBy(xpath = "//lightning-base-combobox-item/span/span[text()='DBM/LDR']")
	public WebElement requestedByBusinessdbm;
	//lightning-base-combobox-item/span/span[text()='DBM/LDR']
	@TextType()
	@FindBy(xpath = "//div[@role='listbox']/following::ul/descendant::span[contains(text(),'HW-Credit (OTRS)')]")
	public WebElement HW_Credit_Option;
	@TextType()
	@FindBy(xpath = "//p[contains(text(),'Case Owner')]/parent::div/descendant::span[2]/descendant::slot")
	public WebElement Title_CaseOwner;
	@TextType()
	@FindBy(xpath = "//p[contains(text(),'Case Number')]")
	public WebElement CaseNumberTitleText;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[@id='flexipage_tab2__item']")
	public WebElement caseDetails;
	@TextType()
	@FindBy(xpath = ".//c-gps-reason-code-component//span[normalize-space(.)='Account Preferences']")
	public WebElement ReasonCode_AccountPreference;
			
}
