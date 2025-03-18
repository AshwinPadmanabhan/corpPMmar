package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Apttus__ Opportunity Agreement New"                                
               , summary=""
               , page="OpportunityAgreementNew"
               , namespacePrefix="Apttus"
               , object="Opportunity"
               , connection="SalesUser"
     )             
public class apttus__OpportunityAgreementNew {

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//apex:commandButton[@action='{!onLoad}']")
	public WebElement continue_;
	@ButtonType()
	@FindBy(name = "j_id0:frmId:j_id65")
	public WebElement continue2;
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][1]/apex:outputField[@value = \"{!AgreementSO.Name}\"]")
	@SalesforceField(name = "Name", object = "Opportunity")
	public WebElement agreementName;
	
}
