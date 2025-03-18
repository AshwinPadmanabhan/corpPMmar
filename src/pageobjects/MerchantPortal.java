package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Merchant Portal"                                
     , summary=""
     , relativeUrl=""
     , connection="MerchantPortal_UI"
     )             
public class MerchantPortal {
	@ButtonType()
	@FindBy(xpath = "//button[@id='details-button']")
	public WebElement advancedOption;
	@LinkType()
	@FindBy(xpath = "//a[@id='proceed-link']")
	public WebElement proceedLink;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Next']")
	public WebElement Request_Documents_button;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Next']")
	public WebElement Send_email;
			
}
