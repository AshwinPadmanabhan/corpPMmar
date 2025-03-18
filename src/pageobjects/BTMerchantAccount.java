package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="BTMerchantAccount"                                
     , summary=""
     , relativeUrl=""
     , connection="SystemAdmin"
     )             
public class BTMerchantAccount {

	@ButtonType()
	@FindBy(xpath = "//button[@name='New']")
	public WebElement new_;
			
}
