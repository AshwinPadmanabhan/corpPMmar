package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="PricingAnalysisSetMultiCurrency"                                
               , summary=""
               , connection="SalesUser"
               , auraComponent="PricingAnalysisSetMultiCurrency"
               , namespacePrefix=""
     )             
public class PricingAnalysisSetMultiCurrency {

	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[2].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-fee_-category_-record_-page___-pricing_-analysis_-fee__c___-v-i-e-w___-l-m-t___1713363600000').shadowRoot.querySelector('forcegenerated-flexipage_fee_category_record_page_pricing_analysis_fee__c__view_js___lmt___1713363600000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelectorAll('lightning-input')[53].shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement fieldValue;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[2].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-fee_-category_-record_-page___-pricing_-analysis_-fee__c___-v-i-e-w___-l-m-t___1713363600000').shadowRoot.querySelector('forcegenerated-flexipage_fee_category_record_page_pricing_analysis_fee__c__view_js___lmt___1713363600000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelectorAll('lightning-input')[39].shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement fieldValue1;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[1].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-fee_-category_-record_-page___-pricing_-analysis_-fee__c___-v-i-e-w___-l-m-t___1713363600000').shadowRoot.querySelector('forcegenerated-flexipage_fee_category_record_page_pricing_analysis_fee__c__view_js___lmt___1713363600000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelectorAll('lightning-input')[53].shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement fieldValue2;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[1].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-fee_-category_-record_-page___-pricing_-analysis_-fee__c___-v-i-e-w___-l-m-t___1713363600000').shadowRoot.querySelector('forcegenerated-flexipage_fee_category_record_page_pricing_analysis_fee__c__view_js___lmt___1713363600000').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelectorAll('lightning-input')[33].shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement fieldValue3;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='save']")
	public WebElement save;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[2].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-fee_-category_-record_-page___-pricing_-analysis_-fee__c___-v-i-e-w___-l-m-t___1713363600000').shadowRoot.querySelector('forcegenerated-flexipage_fee_category_record_page_pricing_analysis_fee__c__view_js___lmt___1713363600000').shadowRoot.querySelector('flexipage-aura-wrapper').shadowRoot.querySelectorAll('lightning-input')[53].shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement fieldValue4;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[2].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-fee_-category_-record_-page___-pricing_-analysis_-fee__c___-v-i-e-w___-l-m-t___1713363600000').shadowRoot.querySelector('forcegenerated-flexipage_fee_category_record_page_pricing_analysis_fee__c__view_js___lmt___1713363600000').shadowRoot.querySelector('flexipage-aura-wrapper').shadowRoot.querySelectorAll('lightning-input')[33].shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement fieldValue5;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[4].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-fee_-category_-record_-page___-pricing_-analysis_-fee__c___-v-i-e-w___-l-m-t___1713363600000').shadowRoot.querySelector('forcegenerated-flexipage_fee_category_record_page_pricing_analysis_fee__c__view_js___lmt___1713363600000').shadowRoot.querySelector('flexipage-aura-wrapper').shadowRoot.querySelectorAll('lightning-input')[9].shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement fieldValue_BRL;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[4].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-fee_-category_-record_-page___-pricing_-analysis_-fee__c___-v-i-e-w___-l-m-t___1713363600000').shadowRoot.querySelector('forcegenerated-flexipage_fee_category_record_page_pricing_analysis_fee__c__view_js___lmt___1713363600000').shadowRoot.querySelector('flexipage-aura-wrapper').shadowRoot.querySelectorAll('lightning-input')[5].shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement fieldValue_AUD;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@id='input-1676']")
	public WebElement fieldValue6;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@id='input-1656']")
	public WebElement fieldValue7;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[2].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-fee_-category_-record_-page___-pricing_-analysis_-fee__c___-v-i-e-w___-l-m-t___1718114101000').shadowRoot.querySelector('forcegenerated-flexipage_fee_category_record_page_pricing_analysis_fee__c__view_js___lmt___1718114101000').shadowRoot.querySelector('flexipage-aura-wrapper').shadowRoot.querySelectorAll('lightning-input')[53].shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement fieldValue8;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelectorAll('one-record-home-flexipage2')[2].shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-fee_-category_-record_-page___-pricing_-analysis_-fee__c___-v-i-e-w___-l-m-t___1718114101000').shadowRoot.querySelector('forcegenerated-flexipage_fee_category_record_page_pricing_analysis_fee__c__view_js___lmt___1718114101000').shadowRoot.querySelector('flexipage-aura-wrapper').shadowRoot.querySelectorAll('lightning-input')[33].shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement fieldValue9;
	
}
