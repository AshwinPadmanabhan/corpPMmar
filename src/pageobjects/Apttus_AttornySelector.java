package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Apttus_ Attorny Selector"                                
               , summary=""
               , page="Apttus_AttornySelector"
               , namespacePrefix=""
               , object=""
               , connection="SalesUser"
     )             
public class Apttus_AttornySelector {

	@PageTable(row = NaUsers.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!naUsers}\"]")
	public List<NaUsers> naUsers;

	@PageRow(byColumn = true)
	public static class NaUsers {

		@BooleanType()
		@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!naUsers}\"]/apex:column[not(@value)]")
		public WebElement select;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('tr:nth-child(7) > td:nth-child(1) > input')")
		public WebElement select1;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!naUsers}\"]/apex:column[not(@value)]")
		public WebElement select_AlineGress;
	}

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!updateAttorny}']")
	public WebElement assignToAttorney;
	@PageTable(row = ApacUsers.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!apacUsers}\"]")
	public List<ApacUsers> apacUsers;

	@PageRow(byColumn = true)
	public static class ApacUsers {

		@BooleanType()
		@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!apacUsers}\"]/apex:column[not(@value)]")
		public WebElement selectElizabethBriggs;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('tr.dataRow.even.first > td:nth-child(1) > input')")
		public WebElement selectElizabethBriggs1;
	}
	
}
