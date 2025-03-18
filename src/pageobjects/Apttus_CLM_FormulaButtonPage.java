package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Apttus_ CLM_ Formula Button Page"                                
               , summary=""
               , connection="SystemAdmin"
               , auraComponent="Apttus_CLM_FormulaButtonPage"
               , namespacePrefix=""
     )             
public class Apttus_CLM_FormulaButtonPage {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Continue']")
	public WebElement continue_;
	@BooleanType()
	@FindBy(xpath = "//tr[1]//label/span[1]")
	public WebElement Attachment_checkBox;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Preview']")
	public WebElement preview;
	
}
