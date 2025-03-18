package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Apttus_approval__ Agreement Approval Summary"                                
               , summary=""
               , page="AgreementApprovalSummary"
               , namespacePrefix="Apttus_Approval"
               , object="Apttus_Approval__Approval_Request__c"
               , connection="ApproverMattDorf"
     )             
public class apttus_approval__AgreementApprovalSummary {

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!doApprove}']")
	public WebElement approve;
	
}
