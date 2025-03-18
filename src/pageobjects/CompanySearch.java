package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageFrame;

@Page( title="CompanySearch"                                
     , summary=""
     , relativeUrl=""
     , connection="CSM_SalesUser"
     )             
public class CompanySearch {

	@PageFrame()
	public static class Frame {

		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Sole Proprietor Account']")
		public WebElement Sole_Proprietor_Account_button;
	}

	@FindBy(xpath = "//div[contains(@class, \"iframe-parent\")]//iframe")
	public Frame frame;
			
}
