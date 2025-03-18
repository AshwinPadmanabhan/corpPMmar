package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Check_e Signature_ Status_ VF"                                
               , summary=""
               , page="Apttus_CLM_DocuSignEnvStatusByEnvId"
               , namespacePrefix=""
               , object="Apttus__APTS_Agreement__c"
               , connection="LegalAdmin"
     )             
public class Check_eSignature_Status_VF {

	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('tr:nth-child(2) > td:nth-child(5) > div')")
	public WebElement RecepientStatus;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Return to Agreement']")
	public WebElement returnToAgreement;
	
}
