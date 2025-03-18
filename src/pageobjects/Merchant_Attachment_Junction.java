package pageobjects;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "Merchant_Attachment_Junction", summary = "", relativeUrl = "", connection = "SystemAdmin")
public class Merchant_Attachment_Junction {
	
	private static final Logger logger = Logger.getLogger(Merchant_Attachment_Junction.class.getName());

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Close this window']")
	public WebElement closeThisWindow;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Domain__c.View_Opportunities']")
	public WebElement linkedOpportunities;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//records-entity-label")
	public WebElement pageSubTitle;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Domain__c.View_BN_Codes']")
	public WebElement viewBNCodes;

	@ButtonType()
	@FindBy(xpath = ".//c-opportunity-partner-accounts//button[normalize-space(.)='Sync Cart']")
	public WebElement Sync_Cart_button;

	@TextType()
	@FindBy(xpath = ".//c-opportunity-partner-accounts//slot/div")
	public WebElement domain_id;

	@ButtonType()
	@FindBy(xpath = "//lightning-button/button[normalize-space(.)='Dismiss']")
	public WebElement dismiss;

	//// table[contains(@class,'-buffer slds-table_bordered
	//// custom')]/tbody/tr/td[2]/a

	@FindBy(xpath = "//table[contains(@class,'-buffer slds-table_bordered custom')]/tbody/tr/td[2]/a")
	public List<WebElement> partners;

	public boolean assertUniqueValues() {
		Set<String> s = new HashSet<>();
		for (WebElement e : partners) {
			String text = e.getText();
			logger.info(text);
			s.add(text);
		}
		if (partners.size() == s.size()) {
			return true;
		}
		return false;
	}

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='flexipage_tab2__item']")
	public WebElement linkedPartners;

	@TextType()
	@FindBy(xpath = ".//c-merchant-account-with-partners//div[normalize-space(.)='Opportunity Name']")
	public WebElement LP_Oppty_Name;

	@TextType()
	@FindBy(xpath = ".//c-merchant-account-with-partners//div[normalize-space(.)='Domain Id']")
	public WebElement Domain_id;

	@TextType()
	@FindBy(xpath = ".//c-merchant-account-with-partners//div[normalize-space(.)='Partner Account(s)']")
	public WebElement PartnerAccounts;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='flexipage_tab2__item']")
	public WebElement linkedmerchants;

	@TextType()
	@FindBy(xpath = ".//c-partner-with-merchant-accounts//div[normalize-space(.)='Opportunity Name']")
	public WebElement PA_OpptyName;

	@TextType()
	@FindBy(xpath = ".//c-partner-with-merchant-accounts//div[normalize-space(.)='Domain Id']")
	public WebElement PA_Domain_id;

	@TextType()
	@FindBy(xpath = ".//c-partner-with-merchant-accounts//div[normalize-space(.)='Merchant Account(s)']")
	public WebElement PA_MerchantAccount;

	@ButtonType()
	@FindBy(xpath = ".//c-partner-with-merchant-accounts//button[normalize-space(.)='Create MAJ Alerts']")
	public WebElement Create_MAJ_Alerts_button;

	@ButtonType()
	@FindBy(xpath = ".//c-partner-with-merchant-accounts//button[normalize-space(.)='MAJ Alerts History']")
	public WebElement MAJ_Alerts_History_button;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@aria-label='Type of Pricing']")
	public WebElement Type_of_Pricing;

	@PageFrame()
	public static class Frame {

		@LinkType()
		@FindBy(xpath = "//tr[1]/td[1]/a[normalize-space(.)='Add To Agreement']")
		public WebElement Apttus__Status__c;
	}

	@FindBy(xpath = "//div[contains(@class, \"content\")]//iframe")
	public Frame frame;

}
