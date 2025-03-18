package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Template"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesUser"
     )             
public class Template {

	@PageFrame()
	public static class Frame {

		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Select']")
		public WebElement SelectTemplate;
	}

	@FindBy(xpath = "//div[contains(@class, \"iframe-parent\")]//iframe")
	public Frame frame;
			
}
