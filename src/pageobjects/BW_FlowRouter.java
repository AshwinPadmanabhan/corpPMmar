package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="BW_ Flow Router"                                
               , summary=""
               , connection="stechdev_ashwin"
               , auraComponent="BW_FlowRouter"
               , namespacePrefix=""
     )             
public class BW_FlowRouter {

	@TextType()
	@FindBy(xpath = "//input[@placeholder='Select Workflow']")
	public WebElement selectWorkflow;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//div[3]//button[normalize-space(.)='Next']")
	public WebElement next;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Select Workflow']")
	public WebElement selectWorkflow1;
	
}
