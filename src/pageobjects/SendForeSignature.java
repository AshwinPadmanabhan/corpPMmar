package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Send Fore Signature"                                
               , summary=""
               , page="Apttus_Sales_DocuSignManageEnvelope"
               , namespacePrefix=""
               , object="Apttus__APTS_Agreement__c"
               , connection="CSM_SalesUser"
     )             
public class SendForeSignature {

	@BooleanType()
	@FindBy(xpath = "//span/label/span[1]")
	public WebElement Select_Attachment_For_E_sign;
	@BooleanType()
	@FindBy(xpath = "//tr[2]//input[@name='templateRadio']")
	public WebElement selectTemplateForESign;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Send']")
	public WebElement send;
	
}
