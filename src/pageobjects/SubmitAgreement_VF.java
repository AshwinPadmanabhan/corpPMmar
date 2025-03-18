package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.VisualforceBy;

@SalesforcePage( title="SubmitAgreement_VF"                                
               , summary=""
               , page="ApprovalContextSubmit"
               , namespacePrefix="Apttus_Approval"
               , object="Apttus_Approval__Approval_Request__c"
               , connection="CSM_SalesUser"
     )             
public class SubmitAgreement_VF {

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!doCancel}'][@value='{!$Label.Apttus_Approval__Return}']")
	public WebElement return_;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!doNext}'][@value='{!$Label.Apttus_Approval__Submit}']")
	public WebElement submit;
	@ButtonType()
	@FindBy(xpath = "//td/span/input")
	public WebElement return_1;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!doSubmit}'][@value='{!$Label.Apttus_Approval__Submit}']")
	public WebElement Submit_Agreement;
	
}
