package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SalesSegmentation"                                
     , summary=""
     , relativeUrl=""
     , connection="CSM_SalesUser"
     )             
public class SalesSegmentation {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Sales Segmentation']")
	public WebElement salesSegmentation;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='No Records Found']")
	public WebElement NoRecordsFound;
			
}
