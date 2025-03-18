package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="BP_step4"                                
     , summary=""
     , relativeUrl=""
     , connection="Buyside_Portal_Divya"
     )             
public class BP_step4 {

	@ButtonType()
	@FindBy(xpath = "//div/div/div/button[normalize-space(.)='Submit']")
	public WebElement submit;
	@TextType()
	@FindBy(xpath = "//b[normalize-space(.)='Thank You! The Agreement is Submitted successfully!']")
	public WebElement Confirmation_MSG;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close']")
	public WebElement close;
			
}
