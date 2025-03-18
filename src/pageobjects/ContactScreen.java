package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ContactScreen"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesUser"
     )             
public class ContactScreen {

	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='Similar Records Exist']")
	public WebElement RecordSimilarExist;
			
}
