package pageobjects;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.JavascriptBy;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Seg Sales Comp"                                
, summary=""
, connection="CSM_SalesUser"
, auraComponent="segSalesComp"
, namespacePrefix=""
		)             
public class segSalesComp {

	WebDriver driver;
	public segSalesComp(WebDriver driver){
		this.driver=driver;
	}

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//li[1]/div")
	public WebElement SelectAllSaledOwner;
	@TextType()
	@FindBy(xpath = "//span/span[normalize-space(.)='AUNZ']")
	public WebElement SalesOwnerMarket_AUNZ;


	public void selectAll() throws InterruptedException, AWTException{
		
		List<WebElement>  multiSelect = driver.findElements(By.xpath("//span[text()='AUNZ']/../../../../descendant::span/span[1]"));
		for (WebElement option : multiSelect) {
		option.click();
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("(//span[text()='Move to '])[1]/.."));
		ele.click();
		}
	}
	public void deSelectAll() throws InterruptedException, AWTException{
		JavascriptExecutor executor = (JavascriptExecutor)driver;

		List<WebElement>  multiSelect = driver.findElements(By.xpath("//span[text()='AUNZ']/../../../../descendant::span/span[1]"));
		for (WebElement option : multiSelect) {
			//option.click();
			executor.executeScript("arguments[0].click();", option);
			Thread.sleep(1000);
			WebElement ele = driver.findElement(By.xpath("(//span[text()='Move to '])[2]/.."));
			//ele.click();
			executor.executeScript("arguments[0].click();", ele);
		}
	}
	public int waitCalculationForRecordLoading(int totalRecords){

		int result = Math.round((float) totalRecords / 3000 * 4);

		return result;
	}

	public String readText(){

		// Locate the element
		WebElement element = driver.findElement(By.xpath("(//div[@c-pagination_pagination])[4]"));

		// Execute JavaScript to get inner text
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String innerText = (String) js.executeScript("return arguments[0].innerText;", element);

		return innerText;

	}

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Apply']")
	public WebElement apply;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='View']/following::button[1]/span[1]")
	public WebElement view;
	@TextType()
	@FindBy(xpath = "//span[text()='Sales View']")
	public WebElement Salesview;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Filters']")
	public WebElement filters;
	@TextType()
	@FindBy(xpath = "//label[text()='Phase']/following::button[1]/span[1]")
	public WebElement Phase;
	@TextType()
	@FindBy(xpath = "//span[text()='Account Allocation']")
	public WebElement AccountAllocationPhase;
	@TextType()
	@FindBy(xpath = "//*[@id='brandBand_2']/div/div/div[2]/c-seg-sales-comp/div[1]/c-pagination/div/div[1]/div[2]")
	public WebElement ReadTotalNoOdRecords;
	@TextType()
	@FindBy(xpath = "(//legend[text()='Pagination']/following::div[1]/div/span)[last()]/descendant::span[1]")
	public WebElement goToLastPage;
	@TextType()
	@FindBy(xpath = "//p[normalize-space(.)='Please enter Owner market / Entity ID to fetch data']")
	public WebElement SelectAtleastOneSalesOwnerError;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('c-seg-sales-comp').shadowRoot.querySelector('c-seg-rulemanager').shadowRoot.querySelector('lightning-dual-listbox').shadowRoot.querySelector('lightning-button-icon').shadowRoot.querySelector('button')")
	public WebElement moveToMoveSelectionTo;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('#brandBand_2 > div > div > div.windowViewMode-normal.oneContent.active.lafPageHost > c-seg-sales-comp > div:nth-child(1) > c-pagination > div > div:nth-child(1) > div:nth-child(3)')")
	public WebElement readNoOfRecord;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('c-seg-sales-comp').shadowRoot.querySelector('c-pagination').shadowRoot.querySelectorAll('div')[4]")
	public WebElement TotalRecordCount;
	@TextType()
	@FindBy(css = "#brandBand_2 div.slds-card.slds-p-vertical_xx-small div div")
	public WebElement Total;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Add Rule']")
	public WebElement addRule;
	@TextType()
	@FindBy(xpath = "//label[text()='Field']/following::button[1]/span[1]")
	public WebElement FieldSelection;
	@TextType()
	@FindBy(xpath = "//lightning-base-combobox-item/descendant::span[text()='Annual eTOV']")
	public WebElement AnnualETOV;
	@TextType()
	@FindBy(xpath = "(//label[text()='Field'])[2]/following::button[1]/span[1]")
	public WebElement FieldSelection1;
	@TextType()
	@FindBy(xpath = "//lightning-base-combobox-item/descendant::span[text()='Account Record Type']")
	public WebElement AccRecType;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='=' and @aria-label='Operator']")
	public WebElement operator;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@placeholder='Enter Value']")
	public WebElement value;
	@TextType()
	@FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@placeholder='Enter Value'])[2]")
	public WebElement value1;
	@TextType()
	@FindBy(xpath = "//tr[1]/td[3]/descendant::span[1]")
	public WebElement ReadUltimateParentIDRow1;
	@TextType()
	@FindBy(xpath = "//label[text()='Ultimate Parent Ids']/following::textarea[1]")
	public WebElement ultimateParentIds;
	@ButtonType()
	@FindBy(xpath = "(//button[normalize-space(.)='Reset'])[last()]	")
	public WebElement resetBtn;
}

