package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Sbaa__ Reject"                                
               , summary=""
               , page="Reject"
               , namespacePrefix="sbaa"
               , object="sbaa__Approval__c"
               , connection="RiskAndCompliance"
     )             
public class sbaa__Reject {

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!onReject}']")
	public WebElement reject;
	
}
