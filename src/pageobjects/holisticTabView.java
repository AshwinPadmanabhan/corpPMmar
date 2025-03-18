package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="holisticTabView"                                
               , summary=""
               , connection="SystemAdmin"
               , lightningWebComponent="holisticTabView"
               , namespacePrefix=""
     )             
public class holisticTabView {

	@LinkType()
	@FindBy(xpath = ".//c-holistic-tab-view//span/a")
	public WebElement CreateAgreement;
	
}
