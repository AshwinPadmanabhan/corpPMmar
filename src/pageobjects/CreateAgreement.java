package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Create Agreement"                                
               , summary=""
               , page="PGAQuickStartAgreement"
               , namespacePrefix=""
               , object="Apttus__APTS_Agreement__c"
               , connection="SalesUser"
     )             
public class CreateAgreement {

	@PageTable(row = TemplatesSelection.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!Templates}\"]")
	public List<TemplatesSelection> templatesSelection;

	@PageRow(byColumn = true)
	public static class TemplatesSelection {

		@LinkType()
		@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!Templates}\"]/apex:column[1]/apex:commandLink[@value='Select'][1]")
		public WebElement SelectTemplate;
		@LinkType()
		@JavascriptBy(jspath = "return document.querySelector('tr:nth-child(5) > td:nth-child(1) > a')")
		public WebElement SelectRow5;
	}

	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('div > input')")
	public WebElement next;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('td > div:nth-child(1) > input')")
	public WebElement addContact;
	@TextType()
	@VisualforceBy(componentXPath = "apex:inputText[@id='searchText']")
	public WebElement searchTemplate;
	@PageTable(row = AccountContacts.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!AccountContacts}\"]")
	public List<AccountContacts> accountContacts;

	@PageRow(byColumn = true)
	public static class AccountContacts {

		@LinkType()
		@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!AccountContacts}\"]//apex:commandLink[@value='Select']")
		public WebElement SelectContact;
	}

	@PageTable(row = PaypalAccounts2.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!PaypalAccounts2}\"]")
	public List<PaypalAccounts2> paypalAccounts2;

	@PageRow(byColumn = true)
	public static class PaypalAccounts2 {

		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputCheckbox[@value = \"{!pa.selected}\"]")
		public WebElement selectPaypalAccount;
	}

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!sendAgreementForeSignature}']")
	public WebElement sendAgreement;
	@TextType()
	@VisualforceBy(componentXPath = "apex:inputText[@id='searchText']")
	public WebElement searchText;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:pageBlock[not(@id)]/apex:pageBlockSection[1]//apex:commandButton[@action='{!backtoFacilitatorSelector}']")
	public WebElement next1;
	@PageTable(row = AccountContacts1.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!AccountContacts}\"]")
	public List<AccountContacts1> accountContacts1;

	@PageRow(byColumn = true)
	public static class AccountContacts1 {

		@LinkType()
		@FindBy(xpath = "(//a[normalize-space(.)='Select'])[1]")
		public WebElement action;
	}

	@PageTable(row = AccountContacts2.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!AccountContacts}\"]")
	public List<AccountContacts2> accountContacts2;

	@PageRow(byColumn = true)
	public static class AccountContacts2 {

		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Select']")
		public WebElement action;
	}

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!onSaveAgreement}']")
	public WebElement saveAndPreview;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!sendAgreementForeSignature}']")
	public WebElement send;
	
}
