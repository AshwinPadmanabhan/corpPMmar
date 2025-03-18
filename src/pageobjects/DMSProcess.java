package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DMSProcess"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesUser"
     )             
public class DMSProcess {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='DMS Process Flow']")
	public WebElement DMS_Process_Flow_button;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Next']")
	public WebElement Next_button;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@title='Generated URL']")
	public WebElement link;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Document type (Click to choose Document Type)']/parent::div/parent::div/parent::div/parent::div/following-sibling::div[1]//span")
	public WebElement dragfile;
	@TextType()
	@FindByLabel(label = "Merchant Contact", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement TestFN_TestContact;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next']")
	public WebElement Next_UWCR;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Search document type']")
	public WebElement searchDocumentType;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='A birth certificate']")
	public WebElement valueforDocType;
	@LinkType()
	@FindBy(xpath = "//a[@title='Generated URL']")
	public WebElement Link_UWCR;
			
}
