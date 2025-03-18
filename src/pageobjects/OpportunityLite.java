package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="OpportunityLite"                                
     , summary=""
     , relativeUrl=""
     , connection="stechdev_ashwin"
     )             
public class OpportunityLite {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Next']")
	public WebElement next;

	@PageFrame()
	public static class Frame {

		@TextType()
		@FindBy(xpath = "//input[@id='input-26']")
		public WebElement Opportunityname;
		@TextType()
		@FindBy(xpath = "//span/span[normalize-space(.)='Express Checkout']")
		public WebElement TargetProduct;
		@TextType()
		@FindBy(xpath = "//button[normalize-space(.)='Move to Chosen']/lightning-primitive-icon")
		public WebElement moveToChosen;
		@TextType()
		@FindBy(xpath = "//textarea[@id='input-22']")
		public WebElement opportunityNotes;
		@TextType()
		@FindBy(xpath = "//button[@name='save']/lightning-primitive-icon")
		public WebElement save;
	}

	@FindBy(xpath = "//iframe[contains(@src,'apex/CreateOpportunityLiteInSales?accountId=001dq000000j8UTAAY&accInfo=%7B%22accName%22%3A%22Deeks%20Custom%20Homes%22%2C%22email%22%3A%22_sys_aquarium-903277720984168%40paypal.com%22%2C%22country%22%3A%22US%22%2C%22mccCode%22%3A%225661%22%2C%22primaryEmail%22%3A%22_sys_aquarium-903277720984168%40paypal.com%22%7D')]")
	public Frame frame;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//div[normalize-space(.)='Completed']")
	public WebElement Status;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Merchant Sales Opportunity')]")
	public WebElement merchantSales;
			
}
