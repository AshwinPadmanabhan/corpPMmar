package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DMS_Flow_supplement_page"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesUser"
     )             
public class DMS_Flow_supplement_page {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Submit to PayPal']")
	public WebElement submitToPayPal;
			
}
