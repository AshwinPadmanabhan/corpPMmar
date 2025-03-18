package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="DefaultRiskApprovalsFlowComponent"                                
               , summary=""
               , connection="InsideSalesUser"
               , auraComponent="DefaultRiskApprovalsFlowComponent"
               , namespacePrefix=""
     )             
public class DefaultRiskApprovalsFlowComponent {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Create Underwriting & Compliance Record']")
	public WebElement createUnderwritingAndComplianceRecord;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lightning-formatted-url/a[contains(normalize-space(.),'UW-CR')]")
	public WebElement UACRecord;
	
}
