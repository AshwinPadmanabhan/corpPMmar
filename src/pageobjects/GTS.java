package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( connection="PresalesIntegration"
     )             
public class GTS {

	@PageFrame()
	public static class Frame {

		@ChoiceListType()
		@FindBy(xpath = "//select[@name='Selected_Product_Category']")
		public WebElement Product_Category;
		@ChoiceListType()
		@FindBy(xpath = "//select[@name='BraintreeOptions']")
		public WebElement Business_Group;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('flowruntime-flow').shadowRoot.querySelector('flowruntime-lwc-body').shadowRoot.querySelector('flowruntime-list-container').shadowRoot.querySelector('flowruntime-base-section').shadowRoot.querySelectorAll('flowruntime-screen-field')[9].shadowRoot.querySelector('flowruntime-lwc-field').shadowRoot.querySelector('flowruntime-lookup').shadowRoot.querySelector('lightning-lookup').shadowRoot.querySelector('lightning-lookup-desktop').shadowRoot.querySelector('lightning-grouped-combobox').shadowRoot.querySelector('lightning-base-combobox').shadowRoot.querySelector('input')")
		public WebElement Case_Contact_field;
		@TextType()
		@FindBy(xpath = "//input[@name='SubjectInput']")
		public WebElement Case_Subject;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='*']/following-sibling::div//textarea")
		public WebElement Case_Description;
		@ChoiceListType()
		@FindBy(xpath = "//select[@name='Environment']")
		public WebElement Environment;
		@ButtonType()
		@FindBy(xpath = "//label[normalize-space(.)='*']/parent::lightning-select/parent::div/parent::flowruntime-picklist-input-lwc/parent::div/parent::flowruntime-lwc-field/parent::flowruntime-screen-field/parent::div/parent::flowruntime-base-section/parent::div/parent::flowruntime-list-container/parent::div/parent::flowruntime-lwc-body/following-sibling::flowruntime-navigation-bar//button")
		public WebElement Next_button;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Next']")
		public WebElement Next_button_ReasonCode;
		@TextType()
		@FindByLabel(label = "Account Name")
		public WebElement Account_Name_field;
		@ChoiceListType()
		@FindBy(xpath = "//select[@name='mtsOptions']")
		public WebElement Business_Group1;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='*Email Address of the Impacted PayPal Account']/following-sibling::div//input")
		public WebElement Email_Address_of_the_Impacted_PayPal_Account;
		@TextType()
		@FindBy(xpath = "//input[@placeholder='Search reason codes']")
		public WebElement searchReasonCodes;
		@TextType()
		@FindBy(xpath = "//span[normalize-space(.)='Integration Request']")
		public WebElement ReasonCode_IntegrationRequest;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='New Integration']/following-sibling::div//button")
		public WebElement New_Integration;
	}

	@FindBy(xpath = "//div[contains(@class, \"iframe-parent\")]//iframe")
	public Frame frame;
			
}
