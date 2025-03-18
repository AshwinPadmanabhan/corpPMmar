package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="platform"                                
               , summary=""
               , connection="SalesUser"
               , object=""
     )             
public class platform {

	@ButtonType()
	@AuraBy(componentXPath = "//span[contains(text(),'Contact Support')]")
	public WebElement contactSupport;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Contact Support']")
	public WebElement contactSupport1;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Business Request']/following-sibling::div//button")
	public WebElement businessRequest;
	@TextType()
	@FindBy(xpath = "//label/span[normalize-space(.)='Less than 10']")
	public WebElement option1;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Create Case']")
	public WebElement createCase;
	@TextType()
	@FindBy(xpath = "//label/span[normalize-space(.)='Greater than 10']")
	public WebElement option2;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Application Impacted')]/following-sibling::div//button")
	public WebElement applicationImpacted;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Requested by Business Group')]/following-sibling::div//button")
	public WebElement requestedByBusinessGroup;
	@TextType()
	@FindBy(xpath = "//div[contains(text(),'Impacted Business Groups')]/following-sibling::div/descendant::ul/descendant::span[contains(text(),'FP&A (Finance)')]")
	public WebElement ImpactedBusinessGroup;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Subject')]/following::input")
	public WebElement subject;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Business Justification')]/following::textarea")
	public WebElement businessJustification;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('c-contact-support').shadowRoot.querySelector('lightning-dual-listbox').shadowRoot.querySelectorAll('span')[43]")
	public WebElement multiselectIBG;
	@TextType()
	@FindBy(xpath = "//button[normalize-space(.)='Move to Selected']/lightning-primitive-icon")
	public WebElement moveToSelected;
	@TextType()
	@FindBy(xpath = "//textarea[@name='Description']")
	public WebElement explanationOfIssue;
	@LinkType()
	@FindBy(xpath = "//a[@id='Admin_Account_Flag_Manager']")
	public WebElement adminAccountFlagManager;
	@TextType()
	@FindBy(xpath = "//input[@id='input-2249']")
	public WebElement searchAppsAndItems;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Take Screenshot']")
	public WebElement takeScreenshot;
	@PageRow()
	public static class DtData {

		@TextType()
		@FindBy(xpath = "(//div[@class='resultTableDiv']/table/tr/td[2][not(descendant::a)])[1]/../td/button[1]")
		public WebElement UpdateBtnBussinessName;
	}
	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.dtData']")
	@PageTable(firstRowContainsHeaders = false, row = DtData.class)
	public List<DtData> dtData;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//article/div/slot/div//button[normalize-space(.)='Search']")
	public WebElement Search_button;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//h1[normalize-space(.)='Bank Accounts (1)']")
	public WebElement BankAccount;
	@TextType()
	@FindBy(xpath = ".//c-merchant-search//h1[normalize-space(.)='Credit Cards (1)']")
	public WebElement Creditcards;
	@ButtonType()
	@FindBy(xpath = ".//c-hou-progress-bar//lightning-layout-item[1]//button[normalize-space(.)='Recalled']")
	public WebElement Approved_button;
	@ButtonType()
	@FindBy(xpath = ".//c-hou-progress-bar//lightning-layout-item[2]//button[normalize-space(.)='Recalled']")
	public WebElement HO_Ustatus;
	@ButtonType()
	@FindBy(xpath = ".//c-hou-progress-bar//button[normalize-space(.)='In Progress']")
	public WebElement TriageStatusInProgress;
	@LinkType()
	@FindBy(xpath = "//div[@class='containerConvertedItem'][contains(.,'Opportunity Owne')]//../a[@data-refid='recordId'][contains(.,'CN')]")
	public WebElement OpptyLink;
	@LinkType()
	@JavascriptBy(jspath = "return document.querySelector('div:nth-child(3) > div > div > div > div.bodyConvertedItem > div.primaryField.truncate > a')")
	public WebElement OpptyLink1;
	@ButtonType()
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
	@FindBy(css = "div.text-container lightning-formatted-rich-text.slds-rich-text-editor__output span")
	public WebElement PromptAns2;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//h2[normalize-space(.)='New Opportunity']")
	public WebElement HeaderName;
	@TextType()
	@FindBy(xpath = "//p[normalize-space(.)='The Opportunity Next Step has been updated successfully.']")
	public WebElement SuccessMsg;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close']")
	public WebElement close;
	@LinkType()
	@FindBy(xpath = "//div/a[contains(@class,'slds-line-clamp')]")
	public WebElement AccountName;
	@TextType()
	@FindBy(xpath = "//runtime_copilot_base-base-text-heading//slot")
	public WebElement AccountsSection;
	@TextType()
	@FindBy(css = "div.text-container span p")
	public WebElement AnswerBlock;
	@TextType()
	@FindBy(xpath = "//runtime_copilot_base-message-block[5]//runtime_copilot_base-output-rich-text/div")
	public WebElement AnswerBlockOpporunity;
	
}
