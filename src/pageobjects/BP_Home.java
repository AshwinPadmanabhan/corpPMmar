package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="BP_Home"                                
     , summary=""
     , relativeUrl=""
     , connection="Buyside_Portal_Divya"
     )             
public class BP_Home {

	@LinkType()
	@FindBy(xpath = "//th[@title='Agreement Name']/following::td[@tabindex='-1'][1]/following-sibling::th[@scope='row']")
	public WebElement Row1_Agreement;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Agreement Number')]/following-sibling::div[2]/following::div[1]")
	public WebElement _107_a_content;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Agreement Number')]/following-sibling::div[2]/descendant::span")
	public WebElement agree_Number;
			
}
