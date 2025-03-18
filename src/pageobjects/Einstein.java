package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.JavascriptBy;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Einstein"                                
, summary=""
, relativeUrl=""
, connection="SalesUser"
		)             
public class Einstein {
	WebDriver driver;
	public Einstein(WebDriver driver){
		this.driver=driver;
	}

	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('runtime_thp_learning-side-panel').shadowRoot.querySelector('runtime_thp_learning-side-panel-content-wrapper').shadowRoot.querySelector('runtime_thp_learning-side-panel-einstein-assistant').shadowRoot.querySelector('runtime_copilot-route-container').shadowRoot.querySelector('runtime_copilot-assistant-panel-home-view').shadowRoot.querySelector('runtime_copilot_base-message-history').shadowRoot.querySelectorAll('runtime_copilot_base-message-stateful')[2].shadowRoot.querySelector('runtime_copilot_base-dynamic-message').shadowRoot.querySelector('runtime_copilot_base-message-resolver').shadowRoot.querySelector('runtime_copilot_base-view-component').shadowRoot.querySelector('runtime_copilot_base-message-actionable').shadowRoot.querySelectorAll('runtime_copilot_base-view-component')[1].shadowRoot.querySelector('runtime_copilot_base-view-vertical-layout').shadowRoot.querySelector('runtime_copilot_base-view-component').shadowRoot.querySelector('runtime_copilot_base-view-vertical-layout').shadowRoot.querySelectorAll('runtime_copilot_base-view-component')[1].shadowRoot.querySelector('runtime_copilot_base-property-layout').shadowRoot.querySelector('runtime_copilot_base-view-component').shadowRoot.querySelector('runtime_copilot_base-output-rich-text').shadowRoot.querySelector('lightning-formatted-rich-text').shadowRoot.querySelector('span')")
	public WebElement PromptAns2;

	@JavascriptBy(jspath = "return document.querySelector('lightning-button-icon-stateful').shadowRoot.querySelector('button')")
	public WebElement CopilotIcon;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Got It']")
	public WebElement gotIt;
	@TextType()
	@FindBy(xpath = "//textarea")
	public WebElement describeYourTaskOrAskAQuestion;
	@ButtonType()
	@FindBy(xpath = "//runtime_copilot_base-message-input/div/div/div/button")
	public WebElement sendCopilot;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='I counted the opportunities where the first transaction date is in the past and you are the owner.']")
	public WebElement PromptAnswer;

	@TextType()
	@FindBy(xpath = "//div[@class='message-actionable_body']/descendant::span")
	public WebElement assertValue;

	@TextType()
	@FindBy(xpath = "//runtime_copilot_base-view-component/descendant::span[1]")
	public WebElement RequestResponse;

	@TextType()
	@FindBy(xpath = "//runtime_copilot_base-view-component/descendant::p[1]")
	public WebElement RequestResponse1;
	
	@ButtonType()
	@FindBy(xpath = "//button[@title='Clear history']")
	public WebElement clearHistoryClearHistory;

	public String compareString(String str,String str1){

		if (!str.equals(str1)){

			return "true";
		}
		return "false";

	}

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Clear History']")
	public WebElement clearHistory;
}
