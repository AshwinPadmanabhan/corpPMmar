package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LeadPages"                                
     , summary=""
     , relativeUrl=""
     , connection="BaseSales_CSM"
     )             
public class LeadPages {

	@TextType()
	@FindBy(xpath = "(//label[text()='Country'])[2]")
	public WebElement Country;

	@PageFrame()
	public static class Frame {

		@ChoiceListType()
		@JavascriptBy(jspath = "return document.querySelector('td:nth-child(3) > select')")
		public WebElement MerchantIncentives;
	}
			
}
