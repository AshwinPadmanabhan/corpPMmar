package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CorrodorSelection"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesUser"
     )             
public class CorrodorSelection {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Add Standard']")
	public WebElement Add_Standard_button;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[normalize-space(.)='Standard selection is configured.']")
	public WebElement StandardSelectionMSG_Configured;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//records-highlights2//button[normalize-space(.)='Show more actions']")
	public WebElement showMoreActions;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Delete Standard']")
	public WebElement Delete_Standard_button;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Delete']")
	public WebElement Delete_button;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[normalize-space(.)='Standard selection is not configured.']")
	public WebElement Standard_Selection_MSG_NotConfigured;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Manage Custom']")
	public WebElement Manage_Custom_button;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@id='combobox-button-1479']/span")
	public WebElement fullValueWire;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tbody/tr[1]//lightning-primitive-input-checkbox//label/span[1]")
	public WebElement checkbox;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='On']/span[1]")
	public WebElement onRedioButton;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Update Selected Services']")
	public WebElement Update_Selected_Services_button;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Close']//span/lightning-primitive-icon")
	public WebElement closeCustomEditor;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Auto-fill Partners']")
	public WebElement Auto_fill_Partners_button;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Compliance Approval']")
	public WebElement ComplianceApproval;
	@BooleanType()
	@FindBy(xpath = "//div//label[@id='check-button-label-1-1660']/span[1]")
	public WebElement CheckboxComplianceApproval;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Approve']")
	public WebElement Approve_button;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Close']/lightning-icon/span//g")
	public WebElement closecomplianceApproval;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Financial Net Approval']")
	public WebElement FinancialNetApproval;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@id='combobox-button-2092']/span")
	public WebElement Select_Service_;
	@BooleanType()
	@FindBy(xpath = "//div//label[@id='check-button-label-1-3273']/span[1]")
	public WebElement CheckboxFNApproval;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='GPS Confirmations']")
	public WebElement GPSConfirmation;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@id='combobox-button-2512']/span")
	public WebElement Select_Service_GSP;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[@id='check-button-label-1-3724']/span[1]")
	public WebElement CheckboxGPS;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Configuration Done']")
	public WebElement Configuration_Done_button;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='service']")
	public WebElement payPal;
	@TextType()
	@FindBy(xpath = "//button[@aria-label='Select Service:']/span")
	public WebElement Select_Service_1;
			
}
