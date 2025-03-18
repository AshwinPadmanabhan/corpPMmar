package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="DealGuidanceSection"                                
               , summary=""
               , connection="SalesUser"
               , auraComponent="DealGuidanceSection"
               , namespacePrefix=""
     )             
public class DealGuidanceSection {

	@LinkType()
	@AuraBy(componentXPath = "//lightning:tabset[@aura:id= 'tabs']")
	public WebElement pricingOptions;
	@LinkType()
	@AuraBy(componentXPath = "//lightning:tabset[@aura:id= 'tabs']")
	public WebElement pricingOptions1;
	
}
