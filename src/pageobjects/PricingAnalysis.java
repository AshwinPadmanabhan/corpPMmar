package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.JavascriptBy;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageFrame;
import com.provar.core.testapi.annotations.TextType;

@Page( title="PricingAnalysis"                                
, summary=""
, relativeUrl=""
, connection="SalesUser"
		)             
public class PricingAnalysis {
	WebDriver driver;
	public PricingAnalysis (WebDriver driver){
		this.driver=driver;
	}

	@LinkType()
	@FindBy(xpath = "//a/span[normalize-space(.)='Approvals Request']/..")
	public WebElement ApprovalsRequest;
	@LinkType()
	@FindBy(xpath = "(//table[@aria-label='Approvals Request'])[2]/tbody/tr[1]/td[3]/descendant::a[1]")
	public WebElement Approval1;
	@FindBy(xpath = "(//table[@aria-label='Approvals Request'])[2]/tbody/tr[2]/td[3]/descendant::a[1]")
	public WebElement Approval2;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lightning-accordion-section[1]//button[normalize-space(.)='Apply This Policy Set']")
	public WebElement Apply_This_Policy_Set_button;
	public String getUrl(){
		return driver.getCurrentUrl();
	}
	@ButtonType()
	@FindBy(xpath = "//button[@name='PricingNextGen__c.Submit_for_Approval']")
	public WebElement submitForApproval;
	@LinkType()
	@FindBy(xpath = "//lightning-formatted-rich-text/span/a")
	public WebElement createAgreement;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='PayPal Standard Dispute Fee']")
	public WebElement payPalStandardDisputeFee;
	@PageFrame()
	public static class Frame {

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('td.dataCol.first.last > input')")
		public WebElement companyNumber;
		@ButtonType()
		@JavascriptBy(jspath = "return document.querySelector('td.pbButtonb.slds-align_absolute-center > input:nth-child(2)')")
		public WebElement saveAndContinue;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Select']")
		public WebElement action;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Sole Proprietor Account']")
		public WebElement Sole_Proprietor_Account_button;
	}
	@FindBy(xpath = "//div[contains(@class, \"iframe-parent\")]//iframe")
	public Frame frame;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='PayPal Virtual Terminal (VT)']")
	public WebElement payPalVirtualTerminalVT;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='PayPal High Volume Dispute Fee']")
	public WebElement payPalHighVolumeDisputeFee;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='PayPal Chargeback']")
	public WebElement payPalChargeback;
	@TextType()
	@FindBy(xpath = "(//div[text()='ILS']/following-sibling::div/descendant::input)[2]")
	public WebElement fieldValue_ILS;
	@TextType()
	@FindBy(xpath = "(//div[text()='INR']/following-sibling::div/descendant::input)[2]")
	public WebElement fieldValue_INR;
	@TextType()
	@FindBy(xpath = "(//span[text()='Approval Status'])[1]/following::lightning-formatted-text[1]")
	public WebElement ApprovalStatus__c;
	@TextType()
	@FindBy(xpath = ".//c-pricing-analysis-output//span[normalize-space(.)='Summary']")
	public WebElement SummaryTitle;
	@TextType()
	@FindBy(xpath = ".//c-pricing-analysis-output//span[normalize-space(.)='Summary Details']")
	public WebElement SummaryDetails;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//span[normalize-space(.)='CREATED']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement Price_Category_Status__c;
	@TextType()
	@FindBy(xpath = "//label[text()='Background and Context of Price Change']/following::textarea[1]")
	public WebElement backgroundAndContextOfPriceChange;
	
	@TextType()
	@FindByLabel(label = "Context of Competitor Pricing")
	public WebElement contextOfCompetitorPricing1;
	
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='PricingNextGen__c.Calculate' and normalize-space(.)='Calculate']")
	public WebElement calculate;
	

	public void scrollToElement(String Xpath){
		try {
			WebElement element = driver.findElement(By.xpath(Xpath));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@TextType()
	@FindBy(xpath = ".//c-pricing-analysis-output//span[normalize-space(.)='Total nTPV']//lightning-base-formatted-text")
	public WebElement Total_nTPV;
	@TextType()
	@FindBy(xpath = "//label[text()='Type of Pricing']/following::button[1]")
	public WebElement Type_of_Pricing;
	@TextType()
	@FindBy(xpath = "//lightning-base-combobox-item/span/span[text()='New Merchant Pricing']")
	public WebElement NewMerchantPricing;
	@TextType()
	@FindBy(xpath = "//span/b[contains(text(),'Inline Guest / UCC')]/../..")
	public WebElement CutomizedFee_Expand;
	@TextType()
	@FindBy(xpath = "//span/b[contains(text(),'Foreign Exchange (FX)')]/../..")
	public WebElement ExpandFXScetion;
	@TextType()
	@FindBy(xpath = "//span/b[contains(text(),'Additional Fees')]/../..")
	public WebElement ExpandAdditionalFees;
	@TextType()
	@FindBy(xpath = "//span/b[contains(text(),'Micropricing Receiver Fees')]/../..")
	public WebElement ExpandMicropricingReceiverFees;
	@TextType()
	@FindBy(xpath = "//span/b[contains(text(),'Unbranded / Card Processing')]/../..")
	public WebElement ExpandUnbrandedCard_Processing_VT;
	@TextType()
	@FindBy(xpath = "//span/b[contains(text(),'Micropricing Receiver Fees')]/../..")
	public WebElement ExpandMicropricingReceiverFees1;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Edit Branded Existing Annual nTPV (USD)')]")
	public WebElement edit_BrandedExisting_nTPV;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Edit % of Transaction Amount']")
	public WebElement Percentage_Rate__c;
	@TextType()
	@FindBy(xpath = "//input[@name='Percentage_Rate__c']")
	public WebElement Percentage_Rate__c1;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Save' and @type='button']")
	public WebElement SaveEdit;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='View Profitability']")
	public WebElement viewProfitability;
	@TextType()
	@FindBy(xpath = "//span/b[contains(text(),'Inline Guest / UCC')]/../..")
	public WebElement ExpandInlineGuest;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='PayPal Standard Card']")
	public WebElement PayPal_Standard_Card;
	@ButtonType()
	@FindBy(xpath = "//button[@name='Edit']")
	public WebElement PAedit;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//b[contains(normalize-space(.),'Unbranded / Card Processing')]")
	public WebElement Unbranded_CardProcessing;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[5]/td/span[1]//span/lightning-primitive-icon")
	public WebElement ExpandInlineGuest1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='PayPal Custom Card']")
	public WebElement payPalCustomCard;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@aria-label='Business Operating Structure']")
	public WebElement Business_Operating_Structure;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@name='DeliveryTimeframe']")
	public WebElement Delivery_Timeframe;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@aria-label='Deal Type']/span")
	public WebElement Deal_Type;
	@TextType()
	@FindBy(xpath = "//*[@data-value='New Account']")
	public WebElement NewAccountDropDown;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Complete Deal Guidance']")
	public WebElement Complete_Deal_Guidance_button;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@data-label='Pricing Options']")
	public WebElement pricingOptions;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Create Pricing Analysis']")
	public WebElement Create_Pricing_Analysis_button;
	
	@TextType()
	@FindBy(xpath = "//b[contains(text(),'Inline Guest / UCC')]")
	public WebElement Expand_Inline_Guest_UCC;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[1].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-fee_-category_-record_-page___-pricing_-analysis_-fee__c___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_fee_category_record_page_pricing_analysis_fee__c__view_js').shadowRoot.querySelector('c-pricing-volumn-tier-related-list').shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement MaxVolume;
	@ButtonType()
	@FindBy(xpath = ".//c-pricing-volumn-tier-related-list//button[normalize-space(.)='Save Volume Tier']")
	public WebElement Save_Volume_Tier_button;


}
