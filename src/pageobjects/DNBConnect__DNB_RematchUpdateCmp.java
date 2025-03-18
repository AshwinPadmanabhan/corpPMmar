package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="DNBConnect__DNB_RematchUpdateCmp"                                
               , summary=""
               , connection="SalesUser"
               , auraComponent="DNB_RematchUpdateCmp"
               , namespacePrefix="DNBConnect"
     )             
public class DNBConnect__DNB_RematchUpdateCmp {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Rematch Record']")
	public WebElement rematchRecord;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value= '{!v.criteria.BizName}']")
	public WebElement BusinessName;
	@PageRow()
	public static class DtData {

		@ButtonType()
		@FindBy(xpath = "(//table)[3]/tr[2]/td[1]/button[1]")
		public WebElement SelectFirstBusinessName;
	}
	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.dtData']")
	@PageTable(firstRowContainsHeaders = false, row = DtData.class)
	public List<DtData> dtData;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Ok']")
	public WebElement ok;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div/div/div/p[1]")
	public WebElement MatchStatus;
	@BooleanType()
	@FindBy(xpath = "//span[text()='Fuzzy search']/../../input[1]")
	public WebElement fuzzySearch;
	@BooleanType()
	@AuraBy(componentXPath = "//lightning:radioGroup[@value= '{!v.searchType}']")
	public WebElement fuzzySearch1;
	@BooleanType()
	@AuraBy(componentXPath = "//lightning:radioGroup[@value= '{!v.searchType}']")
	public WebElement fuzzySearch2;
	
}
