package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Apttus_ Agreement User Fields"                                
               , summary=""
               , page="Apttus_AgreementUserFields"
               , namespacePrefix=""
               , object="Apttus__APTS_Agreement__c"
               , connection="SystemAdmin"
     )             
public class Apttus_AgreementUserFields {

	@TextType()
	@FindBy(xpath = "//tr[2]//div/div/div[1]/input")
	public WebElement help;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Save']")
	public WebElement save;
	
}
