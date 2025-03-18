package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.JavascriptBy;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;
import com.provar.core.testapi.annotations.VisualforceBy;

@SalesforcePage( title="GenerateAgreement_VF"                                
               , summary=""
               , page="LightningSelectTemplate"
               , namespacePrefix="Apttus"
               , object="Apttus__APTS_Agreement__c"
               , connection="CSM_SalesUser"
     )             
public class GenerateAgreement_VF {

	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[@id='generateoptionpanel']//span[contains(@class, \"slds-checkbox--faux\")]")
	public WebElement generateoptionpanel;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@id='generateBtnsyncTop']")
	public WebElement generate;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:outputPanel[@id='downloadFile']/apex:commandButton[@action='{!doReturn}']")
	public WebElement oK;
	@ButtonType()
	@FindBy(xpath = "//span[1]//div[@id='text']//div[2]/input")
	public WebElement oK1;
	@TextType()
	@VisualforceBy(componentXPath = "apex:outputPanel[@id='generateoptionpanel']//tr[2]//td[1]")
	public WebElement name;
	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('td:nth-child(4) > input')")
	public WebElement pDF;
	@TextType()
	@VisualforceBy(componentXPath = "apex:form[@id='generateDocument']/apex:outputPanel[not(@id)]//p[contains(@class, \"slds-page-header__title\")]")
	public WebElement AgreementName;
	@TextType()
	@VisualforceBy(componentXPath = "apex:outputPanel[@id='generateoptionpanel']//tbody[contains(@class, \"test\")]/tr[1]//td[1]")
	public WebElement TemplateName;
	@TextType()
	@FindBy(xpath = "//td[normalize-space(.)='PP NA - PayPal Ads Insertion Order']")
	public WebElement PaypalAds;
	@TextType()
	@FindBy(xpath = "//td[normalize-space(.)='PP NA - PayPal Ads Insertion Order']")
	public WebElement AgreementTemplateSelection;
	
}
