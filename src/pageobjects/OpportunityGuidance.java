package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="OpportunityGuidance"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesUser"
     )             
public class OpportunityGuidance {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Opportunity Guidance']")
	public WebElement opportunityGuidanceDropdown;
	@ButtonType()
	@FindBy(xpath = ".//c-opportunity-guidance//button[normalize-space(.)='Next']")
	public WebElement Next_button;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//slot[@name='main']//lightning-tabset//button[normalize-space(.)='MoreTabs']")
	public WebElement moreTabs;
	@BooleanType()
	@FindBy(xpath = "//span[text()='Compliance']/following-sibling::span/span[@part='indicator']")
	public WebElement ComplianceToggle;
	@BooleanType()
	@AuraBy(componentXPath = "//lightning:input[@disabled='{!v.boolUWLocked}']")
	public WebElement UnderwritingToggle;
	@BooleanType()
	@FindBy(xpath = "//span[text()='Network Registration']/following-sibling::span/span[@part='indicator']")
	public WebElement NetworkRegistrationToggle;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Create Underwriting & Compliance Record']")
	public WebElement createUnderwritingAndComplianceRecord;
			
}
