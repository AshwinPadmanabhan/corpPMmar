package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="AccountNumberInAgreement_VF"                                
               , page="ValidateAccountAndCallQuickStartPGA"
               , object="Opportunity"
               , connection="CSM_SalesUser"
     )             
public class AccountNumberInAgreement_VF {

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!saveValidationFixes}']")
	public WebElement saveAndContinue;
	@TextType()
	@VisualforceBy(componentXPath = "apex:inputText[@value = \"{!theCompanyNumber}\"]")
	public WebElement companyNumber;
	
}
