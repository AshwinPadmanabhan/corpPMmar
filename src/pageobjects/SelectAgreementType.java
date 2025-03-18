package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Select Agreement Type"                                
               , summary=""
               , page="SelectAgreementType"
               , namespacePrefix=""
               , object="Opportunity"
               , connection="SalesUser"
     )             
public class SelectAgreementType {

	@ChoiceListType()
	@VisualforceBy(componentXPath = "apex:selectList[@id='chooseColor']")
	public WebElement functionDpfFVarAdpFAdpIfAdpNullForVarI0IAdpLengthIAdpIParentNodeRemoveChildAdpIFunctionApfFPvpVarAdpNewArrayFAdpAdpVarPsPvpSplitForVarI0Ii0IPsLengthI;
	@ChoiceListType()
	@VisualforceBy(componentXPath = "apex:selectList[@id='merchantSubtype']")
	public WebElement merchantSubtype;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!CreateNewRecord}']")
	public WebElement continue_;
	@ChoiceListType()
	@VisualforceBy(componentXPath = "apex:selectList[@id='chooseColor']")
	public WebElement MerchantIncentives;
	@ButtonType()
	@FindBy(name = "j_id0:AgreementForm:j_id5:j_id24")
	public WebElement continue_1;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('div.pbBody > span > input:nth-child(3)')")
	public WebElement continue_2;
	
	@PageFrame()
	public static class Frame {

		@TextType()
		@VisualforceBy(componentXPath = "apex:commandButton[@action='{!CreateNewRecord}']")
		public WebElement Continue3;
		@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!CreateNewRecord}']")
	public WebElement continue_;
	}
	@FindBy(xpath = "//div[@class='oneAlohaPage']/descendant::iframe[1]")
	public Frame frame;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!CreateNewRecord}']")
	public WebElement Continue3;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('input:nth-child(5)')")
	public WebElement continue_11;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('div.pbBody > span > input:nth-child(3)')")
	public WebElement Continue3a;
	@LinkType()
	@FindBy(xpath = "//div[3]//a[normalize-space(.)='New Agreement']")
	public WebElement newAgreement;
	@PageTable(row = ExistingAgreement.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!ExistingAgreement}\"]")
	public List<ExistingAgreement> existingAgreement;

	@PageRow(byColumn = true)
	public static class ExistingAgreement {

		@LinkType()
		@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!ExistingAgreement}\"]/apex:column[not(@value)]")
		public WebElement amend;
	}
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:form[@id='AgreementForm']//li[1]/lightning-input/lightning-primitive-input-checkbox/div[1]/span/label//span[1]")
	public WebElement AgreementForm;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:form[@id='AgreementForm']//button[@title=\"FirstNext\"]")
	public WebElement next;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:form[@id='AgreementForm']//span[contains(@class, \"slds-radio_faux\")]")
	public WebElement AgreementForm1;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:form[@id='AgreementForm']//button[@title=\"FirstNext\"]")
	public WebElement next1;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:form[@id='AgreementForm']//button[@title=\"FirstNext\"]")
	public WebElement next2;
	@TextType()
	@VisualforceBy(componentXPath = "apex:form[@id='AgreementForm']//textarea[contains(@class, \"slds-textarea\")]")
	public WebElement notesComments;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:form[@id='AgreementForm']//button[@title=\"save\"]")
	public WebElement save;
	@PageTable(row = ExistingAgreement1.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!ExistingAgreement}\"]")
	public List<ExistingAgreement1> existingAgreement1;

	@PageRow(byColumn = true)
	public static class ExistingAgreement1 {

		@LinkType()
		@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!ExistingAgreement}\"]/apex:column[not(@value)]")
		public WebElement amend;
	}
}
