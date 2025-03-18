package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="BundleConfiguration"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesUser"
     )             
public class BundleConfiguration {

	@TextType()
	@FindBy(xpath = "//input[@placeholder='Bundle Name']")
	public WebElement Bundle_Name;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Frontbook and Expansion']")
	public WebElement Deal_Type;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement Next_button;
	@BooleanType()
	@FindBy(xpath = "//a[text()='Alibaba.com Singapore E-Commerce Pte Ltd']/../../../../../../descendant::input[1]")
	public WebElement AccountName1;
	@TextType()
	@FindBy(xpath = "//button[@name='Deal_Type__c']/span")
	public WebElement ClickDeal_Type1;
	@TextType()
	@FindBy(xpath = "//span[text()='Frontbook and Expansion']")
	public WebElement SelectDeal_Type2;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Name']")
	public WebElement OpportunityName;
	@TextType()
	@FindBy(xpath = "//button[@name='recordType']/span")
	public WebElement ClickrecordType;
	@TextType()
	@FindBy(xpath = "//button[@name='Type']/span")
	public WebElement ClickType1;
	@TextType()
	@FindBy(xpath = "//button[@name='Revenue_Opportunity__c']/span")
	public WebElement Click_Revenue_Opty;
	@TextType()
	@FindBy(xpath = "//span/span[text()='Enterprise Sales']")
	public WebElement SelectRecordType;
	@TextType()
	@FindBy(xpath = "//span/span[text()='Inside Sales']")
	public WebElement SelectRecordType_IS;
	@TextType()
	@FindBy(xpath = "//span/span[text()='Customer Success']")
	public WebElement SelectRecordType_CSM;
	@TextType()
	@FindBy(xpath = "//span/span[text()='Account Expansion']")
	public WebElement SelectType1;
	@FindBy(xpath = "//span/span[text()='Rev Opp']")
	public WebElement SelectRev_Opp;
	
	
	@TextType()
	@FindBy(xpath = "//input[@name='CloseDate']")
	public WebElement _StTxnActDate;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@id='combobox-button-1528']/span")
	public WebElement type;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Submit']")
	public WebElement submit;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Start']")
	public WebElement Start_button;
	@BooleanType()
	@FindBy(xpath = "//a[text()='DoorDash Technologies Australia Pty Ltd']/../../../../../../descendant::input[1]")
	public WebElement AccountName_IS;
	@BooleanType()
	@FindBy(xpath = "//a[text()='Costco Wholesale Canada Ltd.']/../../../../../../descendant::input[1]")
	public WebElement AccountName_CSM;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='save']")
	public WebElement createOpportunity;
			
}
