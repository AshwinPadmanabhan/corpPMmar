package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="support__milestones"                                
               , summary=""
               , connection="PresalesIntegration"
               , object=""
     )             
public class support__milestones {

	@TextType()
	@FindBy(xpath = "//span[text()='Milestones']")
	public WebElement MilestoneHeader;
	@LinkType()
	@FindBy(xpath = "//span[text()='Milestones']/ancestor::article/descendant::a[contains(@title,'PPTS Support')][2]")
	public WebElement Milestone_Value;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//div/div/div/div[normalize-space(.)='You completed all the milestones.']")
	public WebElement MilestoneCompleteText;
	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='Similar Records Exist']")
	public WebElement DuplicateContact;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Presales and Integration Request']")
	public WebElement Opportunity_Presales_and_Integration_Request;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Next']")
	public WebElement next;
	@PageFrame()
	public static class Frame {

		@TextType()
		@FindBy(xpath = "//input[@id='input-26']")
		public WebElement name;
		}
	@LinkType()
	@FindBy(xpath = "//p[text()='Opportunity']/following::a[1]")
	public WebElement opportunityref;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Opportunities']")
	public WebElement opportunities;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Add Email']")
	public WebElement Add_Email_button;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Email']/following-sibling::div//input")
	public WebElement Email;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Save']")
	public WebElement Save_button;
	@BooleanType()
	@FindByLabel(label = "Select Item 2", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement Checkbox;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Remove']")
	public WebElement Remove_button;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//h1[normalize-space(.)=concat('Credit Cards (0)To remove this email address from the user',\"'\",'s account, leave a memo and click OKMemoOKCancelEnable/Disable CC')]//textarea[@name='input1']")
	public WebElement Memo;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//h1[normalize-space(.)=concat('Credit Cards (0)To remove this email address from the user',\"'\",'s account, leave a memo and click OKMemoOKCancelEnable/Disable CC')]//button[normalize-space(.)='OK']")
	public WebElement OK_button;

	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[1].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-p-p-t-s_-new_-layout___-case___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_ppts_new_layout_case__view_js').shadowRoot.querySelector('flexipage-aura-template-wrapper').shadowRoot.querySelector('forcegenerated-flexipageregion_ppts_new_layout_leftsidebar_case__view_js').shadowRoot.querySelector('c-gps-reason-code-component').shadowRoot.querySelector('lightning-button').shadowRoot.querySelector('button')")
	public WebElement Save_button1;

	@LinkType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-agreement_-record_-page___-apttus__-a-p-t-s_-agreement__c___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_agreement_record_page_apttus__apts_agreement__c__view_js').shadowRoot.querySelector('records-lwc-detail-panel').shadowRoot.querySelector('records-base-record-form').shadowRoot.querySelector('records-lwc-record-layout').shadowRoot.querySelector('forcegenerated-detailpanel_apttus__apts_agreement__c___012800000003xmjaaa___full___view___recordlayout2').shadowRoot.querySelectorAll('formula-output-formula-html')[13].shadowRoot.querySelector('lightning-formatted-rich-text').shadowRoot.querySelector('a')")
	public WebElement Submit_Agreeement_Request__c;

	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='BT Application']/following::input[1]")
	public WebElement bTApplicationNovationAPP_3666029;

	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Make primary']")
	public WebElement Make_primary_button;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('c-seg-sales-comp').shadowRoot.querySelector('c-seg-rulemanager').shadowRoot.querySelector('lightning-dual-listbox').shadowRoot.querySelectorAll('lightning-button-icon')[1].shadowRoot.querySelector('button')")
	public WebElement moveToMoveSelectionTo;
	@PageFrame()
	public static class Frame1 {

		@TextType()
		@FindBy(xpath = "//p[normalize-space(.)='Case has been created with following details -']")
		public WebElement CaseSummary_Display_Text;
	}
	@FindBy(xpath = "//div[contains(@class, \"iframe-parent\")]//iframe")
	public Frame1 frame;

		
	
}
