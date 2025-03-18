package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Lookup"                                
               , summary=""
               , connection="LTUATAutomation"
               , auraComponent="Lookup"
               , namespacePrefix=""
     )             
public class Lookup {

	@TextType()
	@AuraBy(componentXPath = "//aura:expression[@value= '{!v.label}']")
	public WebElement COMPETITOR;
	
}
