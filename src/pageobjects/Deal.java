package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Deal"                                
, summary=""
, relativeUrl=""
, connection="SalesUser"
		)             
public class Deal {
	WebDriver driver;
	public Deal (WebDriver driver){
		this.driver=driver;
	}

	public String getUrl(){
		return driver.getCurrentUrl();
	}
	@LinkType()
	@FindBy(xpath = "//p[text()='Opportunity']/following::a[1]")
	public WebElement opportunityLink;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//flexipage-aura-wrapper/div/div/section//button[normalize-space(.)='Next']")
	public WebElement Next_button;

	@TextType()
	@FindBy(xpath = "//label[text()='Type of Pricing']/following::button[1]/span[1]")
	public WebElement Type_of_Pricing;

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close']")
	public WebElement Popup_close;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='PayPal Receiver Fee']")
	public WebElement payPalReceiverFee;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[normalize-space(.)='Add/Edit Products']")
	public WebElement addEditProducts;

	@LinkType()
	@FindBy(xpath = "//*[@id=\"customTab7__item\"]")
	public WebElement dealGuidance;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Next']")
	public WebElement Next_button1;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Next']")
	public WebElement Next_button2;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Complete Deal Guidance']")
	public WebElement Complete_Deal_Guidance_button;

	@ChoiceListType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//select[@name='Marketplace_Platform_Operator_Aggregator']")
	public WebElement Business_Operating_Structure;

	@TextType()
	@FindBy(xpath = "//label[text()='Business Operating Structure']/following::button[2]/span[1]")
	public WebElement Business_Operating_Structure2;

}
