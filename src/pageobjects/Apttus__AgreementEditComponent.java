package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Apttus__ Agreement Edit Component"                                
               , summary=""
               , connection="SalesUser"
               , auraComponent="AgreementEditComponent"
               , namespacePrefix="Apttus"
     )             
public class Apttus__AgreementEditComponent {

	@TextType()
	@AuraBy(componentXPath = "//ui:inputTextArea[@value= '{!v.record.Apttus__Description__c}']")
	public WebElement description;
	@TextType()
	@AuraBy(componentXPath = "//ui:autocomplete[@aura:id= 'autocomplete']")
	public WebElement bTApplication;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='\"c&l services\" in BT Applications']")
	public WebElement bTApplication1;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='BT Application*']/following::input[1]")
	public WebElement bTApplicationNovationAPP_3666029;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Incoming Party BT ApplicationUsed for Braintree Novation agreements*']/following-sibling::div//input")
	public WebElement IncomingpartybTApplication;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='\"APP-9738416\" in BT Applications']")
	public WebElement incomingPartyBTApplication;
	
}
