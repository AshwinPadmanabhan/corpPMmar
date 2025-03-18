package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Sbqq__ Fastlanewith Integration Methods__ CPQ Product"                                
               , summary=""
               , page="sb"
               , namespacePrefix="SBQQ"
               , object=""
               , connection="SalesUser"
     )             
public class sbqq__FastlanewithIntegrationMethods__CPQProduct {

	@ChoiceListType()
	@FindBy(xpath = "//select[@id='myselect']")
	public WebElement integrationMethods;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-config').shadowRoot.querySelectorAll('sb-i18n')[2]")
	public WebElement saveInConfigure;
	
}
