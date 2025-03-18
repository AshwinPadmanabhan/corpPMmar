package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Quick Start Agreement Wiz CPQ Page"                                
               , summary=""
               , page="QuickStartAgreementWizCPQPage"
               , namespacePrefix=""
               , object="SBQQ__Quote__c"
               , connection="SalesUser"
     )             
public class QuickStartAgreementWizCPQPage {

	@PageTable(row = RateCards.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='studentTable']")
	public List<RateCards> rateCards;

	@PageRow(byColumn = true)
	public static class RateCards {

		@LinkType()
		@FindBy(xpath = "//span[normalize-space(text()) = 'Automation Contact']/../../td[1]/a[1]")
		public WebElement action;
	}

	@PageTable(row = AccountContacts.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!AccountContacts}\"]")
	public List<AccountContacts> accountContacts;

	@PageRow(byColumn = true)
	public static class AccountContacts {

		@LinkType()
		@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!AccountContacts}\"]//apex:commandLink[@value='Select']")
		public WebElement action;
	}

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!onSaveAgreement}']")
	public WebElement saveAndPreview;
	@LinkType()
	@JavascriptBy(jspath = "return document.querySelector('a:nth-child(4)')")
	public WebElement View_Agreement;
	
}
