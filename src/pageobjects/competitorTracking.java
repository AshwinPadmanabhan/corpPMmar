package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="competitorTracking"                                
               , summary=""
               , connection="LTUATAutomation"
               , auraComponent="competitorTracking"
               , namespacePrefix=""
     )             
public class competitorTracking {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='New Competitor']")
	public WebElement newCompetitor;

	@PageRow()
	public static class Junction {
		public Lookup lookup;
	}

	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.junction']")
	@PageTable(firstRowContainsHeaders = false, row = Junction.class)
	public List<Junction> junction;
	
}
