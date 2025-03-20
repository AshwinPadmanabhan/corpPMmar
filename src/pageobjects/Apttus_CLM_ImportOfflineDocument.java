package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Apttus_ CLM_ Import Offline Document"                                
               , summary=""
               , page="Apttus_CLM_ImportOfflineDocument"
               , namespacePrefix=""
               , object="Apttus__APTS_Agreement__c"
               , connection="SystemAdmin"
     )             
public class Apttus_CLM_ImportOfflineDocument {

	@ChoiceListType() @FindBy(xpath="//select[@name='picklistSelect']") public WebElement picklistSelect_;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next >>']")
	public WebElement next;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='picklistSelect']")
	public WebElement DocType;
	
}
