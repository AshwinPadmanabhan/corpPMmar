package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Docusign"                                
     , summary=""
     , relativeUrl=""
     , connection="LegalAdmin"
     )             
public class Docusign {

	@ButtonType()
	@FindBy(xpath = "//label[normalize-space(.)='Set signing order']/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/following-sibling::div[1]//button")
	public WebElement NEXT;
	@ButtonType()
	@FindBy(css = "button.olv-button.olv-ignore-transform.css-1n4kelk")
	public WebElement CORRECT;
    @TextType()
	@FindBy(xpath = "//label[normalize-space(.)='NameName Recipient 3*']/parent::div/following-sibling::div//input")
	public WebElement nameNameRecipient3;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='EmailEmail Recipient 3*']/parent::div/following-sibling::div//input")
	public WebElement emailEmailRecipient3;
	@BooleanType()
	@FindBy(xpath = "//lightning-primitive-input-checkbox/label/span[text()='Entity Signed']/following::input[@id='checkbox-2063' and @name='Entity_Signed__c']")
	public WebElement Entity_Signed__c;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-agreement_-record_-page___-apttus__-a-p-t-s_-agreement__c___-v-i-e-w___-l-m-t___1717601086000').shadowRoot.querySelector('forcegenerated-flexipage_agreement_record_page_apttus__apts_agreement__c__view_js___lmt___1668551312000').shadowRoot.querySelector('records-lwc-detail-panel').shadowRoot.querySelector('records-base-record-form').shadowRoot.querySelector('records-lwc-record-layout').shadowRoot.querySelector('forcegenerated-detailpanel_apttus__apts_agreement__c___012800000003xmjaaa___full___view___recordlayout2').shadowRoot.querySelectorAll('records-record-layout-checkbox')[8].shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('lightning-primitive-input-checkbox').shadowRoot.querySelector('input')")
	public WebElement Merchant_Signed__c;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-agreement_-record_-page___-apttus__-a-p-t-s_-agreement__c___-v-i-e-w___-l-m-t___1717601086000').shadowRoot.querySelector('forcegenerated-flexipage_agreement_record_page_apttus__apts_agreement__c__view_js___lmt___1668551312000').shadowRoot.querySelector('records-lwc-detail-panel').shadowRoot.querySelector('records-base-record-form').shadowRoot.querySelector('records-lwc-record-layout').shadowRoot.querySelector('forcegenerated-detailpanel_apttus__apts_agreement__c___012800000003xmjaaa___full___view___recordlayout2').shadowRoot.querySelectorAll('records-record-picklist')[4].shadowRoot.querySelector('records-form-picklist').shadowRoot.querySelector('lightning-picklist').shadowRoot.querySelector('lightning-combobox').shadowRoot.querySelector('lightning-base-combobox').shadowRoot.querySelector('button')")
	public WebElement Apttus__Status_Category__c;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-agreement_-record_-page___-apttus__-a-p-t-s_-agreement__c___-v-i-e-w___-l-m-t___1717601086000').shadowRoot.querySelector('forcegenerated-flexipage_agreement_record_page_apttus__apts_agreement__c__view_js___lmt___1668551312000').shadowRoot.querySelector('records-lwc-detail-panel').shadowRoot.querySelector('records-base-record-form').shadowRoot.querySelector('records-lwc-record-layout').shadowRoot.querySelector('forcegenerated-detailpanel_apttus__apts_agreement__c___012800000003xmjaaa___full___view___recordlayout2').shadowRoot.querySelectorAll('records-record-picklist')[5].shadowRoot.querySelector('records-form-picklist').shadowRoot.querySelector('lightning-picklist').shadowRoot.querySelector('lightning-combobox').shadowRoot.querySelector('lightning-base-combobox').shadowRoot.querySelector('button')")
	public WebElement Apttus__Status__c;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//slot[@name='outputField']//lightning-primitive-input-checkbox/div/span[normalize-space(.)='Entity Signed']")
	public WebElement Entity_Signed__c1;
	@BooleanType()
	@FindBy(xpath = "//lightning-primitive-input-checkbox/label/span[text()='Counterparty Signed']/following::input[@name='Merchant_Signed__c']")
	public WebElement Merchant_Signed__c1;
	@TextType()
	@FindBy(xpath = "(//button[@title='Edit Status Category']/span)[1]")
	public WebElement Apttus__Status_Category__c1;
}
