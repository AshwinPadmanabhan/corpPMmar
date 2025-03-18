package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Pricing Preview Approval"                                
               , summary=""
               , page="PricingPreviewApproval"
               , namespacePrefix=""
               , object="PricingNextGen__c"
               , connection="SalesUser"
     )             
public class PricingPreviewApproval {

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!cancelBtn}']")
	public WebElement returnToPricingAnalysisV20;
	
}
