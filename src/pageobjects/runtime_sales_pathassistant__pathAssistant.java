package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Runtime_sales_pathassistant__path Assistant"                                
               , summary=""
               , connection="SalesUser"
               , auraComponent="pathAssistant"
               , namespacePrefix="runtime_sales_pathassistant"
     )             
public class runtime_sales_pathassistant__pathAssistant {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View Profitability']")
	public WebElement viewProfitability;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Finalize Pricing Analysis and Submit']")
	public WebElement finalizePricingAnalysisAndSubmit;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[normalize-space(.)='View Profitability']")
	public WebElement viewProfitability1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Finalize Pricing Analysis and Submit']")
	public WebElement finalizePricingAnalysisAndSubmit1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='stage completeEnter Details']")
	public WebElement stageCompleteEnterDetails;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Customize Fees']")
	public WebElement customizeFees;
	
}
