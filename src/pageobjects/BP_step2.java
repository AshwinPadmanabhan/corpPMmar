package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="BP_step2"                                
     , summary=""
     , relativeUrl=""
     , connection="Buyside_Portal_Divya"
     )             
public class BP_step2 {

	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Contract Description / Notes to')]/following::textarea[1]")
	public WebElement ContractDescription;
	@ChoiceListType()
	@FindBy(xpath = "//div[9]//select[@name='picklistSelect']")
	public WebElement PreLanguage;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Contract Start Date']/following-sibling::div//input")
	public WebElement StartDate;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Contract End Date']/following-sibling::div//input")
	public WebElement ContractEndDate;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Credit Business Related Services?']/following-sibling::div//select")
	public WebElement CreditBusinessRS;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='PayPal Data Access']/following-sibling::div//select")
	public WebElement PPDataAccess;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Background Summary HelpPlease provide summary of project and work to be provided by vendor. This will be used in contract document.']/following-sibling::div//textarea")
	public WebElement BG_Summary;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next']")
	public WebElement next;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Contract Value (per Financial Authority Policy)')]/following::input[1]")
	public WebElement Contract_Value;
			
}
