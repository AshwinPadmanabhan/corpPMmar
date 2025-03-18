package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Pricing Submit Approval"                                
               , summary=""
               , connection="SalesUser"
               , auraComponent="PricingSubmitApproval"
               , namespacePrefix=""
     )             
public class PricingSubmitApproval {

	@ButtonType()
	@FindBy(xpath = "//button[@name='Yes' and normalize-space(.)='Run Custom Approval']")
	public WebElement runCustomApproval;
	
	
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Cancel']")
	public WebElement cancel;
	
}
