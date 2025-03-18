package pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.*;

@Page( title="BP_step3"                                
     , summary=""
     , relativeUrl=""
     , connection="Buyside_Portal_Divya"
     )             
public class BP_step3 {

	WebDriver driver;
	public BP_step3(WebDriver driver) {
	this.driver = driver;
	}
	
	public void setInputLookupText(String xpath, String setText) {
   
    //JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement supplier = driver.findElement(By.xpath(xpath));
        supplier.sendKeys(setText + Keys.SPACE);
        //executor.executeScript("arguments[0].value='" + setValue + "';", supplier);
	}
	public void selectInputLookupValue(String itemName) {
   
    //JavascriptExecutor executor = (JavascriptExecutor) driver;
    
		WebElement elementToHover = driver.findElement(By.xpath("//label[contains(text(),'Financial Approver')]/following::input[1]"));
        //Actions actions = new Actions(driver);
        //actions.moveToElement(elementToHover).perform();
        elementToHover.click();
        WebElement supplier = driver.findElement(By.xpath("//span[normalize-space()='"+itemName+"']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(supplier));
        
        supplier.click();
        //executor.executeScript("arguments[0].value='" + Setvalue + "';", supplier);
	}
	

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Financial ApproverHelpPlease specify the financial analyst that will provide the financial approval for this agreement. This is required for any vendor agreement in the APAC region, regardless of contract value. For EMEA and NA it is required when equal to or greater than 50,000 USD.']/parent::div/following-sibling::div//input")
	public WebElement FinancialApprover;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Counterparty')]/following::label[contains(text(),'FirstName')][1]/following::input[1]")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Counterparty')]/following::label[contains(text(),'LastName')][1]/following::input[1]")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Counterparty')]/following::label[contains(text(),'Email')][1]/following::input[1]")
	public WebElement email;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next']")
	public WebElement next;
			
}
