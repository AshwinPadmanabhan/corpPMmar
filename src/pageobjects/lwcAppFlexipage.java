package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Lwc App Flexipage"                                
               , summary=""
               , connection="CSM_SalesUser"
               , auraComponent="lwcAppFlexipage"
               , namespacePrefix=""
     )             
public class lwcAppFlexipage {

	@TextType()
	@FindBy(xpath = ".//c-merchant-search//div/input[1]")
	public WebElement phoneNumber;
	@BooleanType()
	@FindBy(xpath = ".//c-merchant-search//label[normalize-space(.)='Primary?']/span[1]")
	public WebElement primary;
	@BooleanType()
	@FindBy(xpath = ".//c-merchant-search//label[normalize-space(.)='SMS']/span[1]")
	public WebElement sMS;
	@BooleanType()
	@FindBy(xpath = ".//c-merchant-search//label[normalize-space(.)='Autodialler/Prerecorded Calls']/span[1]")
	public WebElement autodiallerPrerecordedCalls;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Save']")
	public WebElement save;
	
}
