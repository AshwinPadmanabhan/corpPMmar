package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Sbaa__ Approve"                                
               , summary=""
               , page="Approve"
               , namespacePrefix="sbaa"
               , object="sbaa__Approval__c"
               , connection="ApproverPAMike"
     )             
public class sbaa__Approve {

	@TextType()
	@VisualforceBy(componentXPath = "apex:inputTextarea[@id='textarea-input-01']")
	public WebElement comments;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!onApprove}']")
	public WebElement approve;
	@TextType()
	@VisualforceBy(componentXPath = "apex:inputTextarea[@id='textarea-input-01']")
	public WebElement comments1;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!onApprove}']")
	public WebElement approve1;
	@TextType()
	@VisualforceBy(componentXPath = "apex:inputTextarea[@id='textarea-input-01']")
	public WebElement comments2;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!onApprove}']")
	public WebElement approve2;
	@TextType()
	@VisualforceBy(componentXPath = "apex:inputTextarea[@id='textarea-input-01']")
	public WebElement comments3;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!onApprove}']")
	public WebElement approve3;
	
}
