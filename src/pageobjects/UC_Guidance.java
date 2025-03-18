package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="UC_Guidance"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesUser"
     )             
public class UC_Guidance {

	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[@id='toggle-description-802']/span[1]")
	public WebElement Compliance_Toggle;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[@id='toggle-description-806']/span[1]")
	public WebElement Network_Registration;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Create Underwriting & Compliance Record']")
	public WebElement Create_Underwriting___Compliance_Record_button;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[@id='toggle-description-906']/span[1]")
	public WebElement ComplianceToggle;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[@id='toggle-description-910']/span[1]")
	public WebElement NetworkRegistration;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-deal_-record_-page___-s-b-q-q__-quote__c___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_deal_record_page_sbqq__quote__c__view_js').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelector('c-hou-required-reviews-toggle').shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement ComplianceToggle1;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-deal_-record_-page___-s-b-q-q__-quote__c___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_deal_record_page_sbqq__quote__c__view_js').shadowRoot.querySelectorAll('flexipage-aura-wrapper')[1].shadowRoot.querySelector('c-hou-required-reviews-toggle').shadowRoot.querySelectorAll('lightning-input')[2].shadowRoot.querySelector('lightning-primitive-input-toggle').shadowRoot.querySelectorAll('span')[2]")
	public WebElement NetworkRegistrationToggle;
			
}
