package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="GoLiveProcess"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesUser"
     )             
public class GoLiveProcess {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Start Go Live Process']")
	public WebElement Start_Go_Live_Process_button;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='Template']/parent::div/parent::lightning-primitive-input-simple/parent::lightning-input/following-sibling::lightning-button-icon//lightning-primitive-icon")
	public WebElement utility_search_button;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Custom Go-Live Request Template']")
	public WebElement Custom_Go_Live_Request_Template;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[.='Next']")
	public WebElement Next_button;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Submit']")
	public WebElement Submit_button;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//slot//div/div[2]")
	public WebElement CaseOwner;
	@TextType()
	@FindBy(xpath = "//input[@id='input-1822']")
	public WebElement PayPal_Account_Id;			
}
