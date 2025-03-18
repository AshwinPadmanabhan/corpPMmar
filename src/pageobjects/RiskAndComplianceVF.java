package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Risk And Compliance VF"                                
               , summary=""
               , page="PreviewComplianceReview"
               , namespacePrefix=""
               , object="Compliance_Review__c"
               , connection="SalesUser"
     )             
public class RiskAndComplianceVF {

	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Triage Approval']")
	public WebElement Approval_Rule;
	
}
