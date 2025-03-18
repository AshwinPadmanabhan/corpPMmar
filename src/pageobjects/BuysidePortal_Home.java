package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="BuysidePortal_Home"                                
, summary=""
, relativeUrl=""
, connection="Buyside_Portal_Divya"
		)             
public class BuysidePortal_Home {

	WebDriver driver;
	public BuysidePortal_Home(WebDriver driver) {
		this.driver = driver;
	}

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='New Agreement']")
	public WebElement newAgreement;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Agreement Type']/following-sibling::div//select")
	public WebElement renderFacet9040;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Region']/following-sibling::div//select")
	public WebElement renderFacet8580;

	public void setInputLookupText(String xpath, String setText) {

		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement supplier = driver.findElement(By.xpath(xpath));
		supplier.sendKeys(setText);
		//executor.executeScript("arguments[0].value='" + setValue + "';", supplier);
	}
	public void selectInputLookupValue(String itemName) {

		//JavascriptExecutor executor = (JavascriptExecutor) driver;

		WebElement elementToHover = driver.findElement(By.xpath("//label[contains(text(),'Supplier')]/following::input[1]"));
		//Actions actions = new Actions(driver);
		//actions.moveToElement(elementToHover).perform();
		elementToHover.click();
		
		WebElement supplier = driver.findElement(By.xpath("//span[normalize-space()='"+itemName+"']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(supplier));
		supplier.click();
		
		//executor.executeScript("arguments[0].value='" + Setvalue + "';", supplier);

		//WebElement supplier = new WebDriverWait(driver, Duration.ofSeconds(10))
		// .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search Contact']"))); 
	}

	public void selectInputLookupValue1(String itemName) throws InterruptedException {

		//JavascriptExecutor executor = (JavascriptExecutor) driver;

		WebElement elementToHover = driver.findElement(By.xpath("//label[text()='Counterparty']/following::input[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToHover).perform();
		Thread.sleep(20000);
		WebElement supplier = driver.findElement(By.xpath("//span[normalize-space()='"+itemName+"']"));
		supplier.click();
		//executor.executeScript("arguments[0].value='" + Setvalue + "';", supplier);

		//WebElement supplier = new WebDriverWait(driver, Duration.ofSeconds(10))
		// .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search Contact']"))); 
	}

	public void scrollIntoView(String Xpath){
		WebElement element = driver.findElement(By.id(Xpath));

		// Scroll into view using JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", element);
		//int y = element.getLocation().getY();
        js.executeScript("window.scrollTo(0,5000);");
	}
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Sub Type']/following-sibling::div//select")
	public WebElement subtype;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Parent Agreement']/following-sibling::div//select")
	public WebElement ParentAgreement;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next']")
	public WebElement next;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Supplier')]/following::input[1]")
	public WebElement Supplier_Field;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Preferred Language of Contract']/following::select[1]")
	public WebElement renderFacet65270;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='FirstName']/following::input[1]")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='LastName']/following::input[1]")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Email']/following::input[1]")
	public WebElement email;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Submit']")
	public WebElement submit;
	@TextType()
	@FindBy(xpath = "//b[normalize-space(.)='Thank You! The Agreement is Submitted successfully!']")
	public WebElement ConfirmationMessage;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close']")
	public WebElement close;

}
