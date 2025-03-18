package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.JavascriptBy;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="DMS_TemplateSelection"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesUser"
     )             
public class DMS_TemplateSelection {

WebDriver driver;

	public DMS_TemplateSelection(WebDriver driver) {
	this.driver=driver;
}
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@id='combobox-button-2593']")
	public WebElement custom;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-2598']")
	public WebElement merchantContact;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Search Contact']")
	public WebElement merchantContact1;
	@FindBy(xpath = "//input[@placeholder='Search Contact']")
	@TextType()
	public WebElement MerchantContact_Value;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement Next_button;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Submit']")
	public WebElement Submit_button;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Cancel']")
	public WebElement Cancel_button;
	@TextType()
	@FindBy(xpath = "//button[@name='typeOfTemplate']")
	public WebElement Type_of_Template;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('c-dms_-generate-url-for-file-upload').shadowRoot.querySelector('c-dms_-search-contacts').shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement MerchantContact_Value1;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('c-dms_-generate-url-for-file-upload').shadowRoot.querySelector('c-dms_-search-contacts').shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement MerchantContact_Value2;
	public void enterValueInField(String value) {
        // Locate the input field
        WebElement inputField = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search Contact']"))); 

        // Enter value using WebElement
        inputField.clear();
        inputField.sendKeys(value);

        // Optional: Pause briefly
        try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
   }     }
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='Test Last Name(pptest297@gmail.com)']")
	public WebElement searchValue;
	@TextType()
	@FindBy(xpath = "//label[text()='Type of Pricing']/following::button[1]/span")
	public WebElement Type_of_Pricing;
	@TextType()
	@FindBy(xpath = "//li[@data-name='test cintact0103']")
	public WebElement searchValue1;	
	
	public void enterValueInField1(String value) {
        // Locate the input field
        WebElement inputField = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search Contact']"))); 

        // Enter value using WebElement
        driver.findElement(By.xpath("//input[@placeholder='Search Contact']/parent::div")).click();
        inputField.clear();
        inputField.sendKeys(value);

        // Optional: Pause briefly
        try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
   }     }
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@id='combobox-button-1132']/span")
	public WebElement dealGuidanceTemplate;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@id='combobox-button-1023']/span")
	public WebElement dealGuidanceTemplate1;
	@TextType()
	@FindBy(xpath = "(//li/span/span[contains(text(),'TestFN TestContact')])[1]")
	public WebElement MerchantContact_Value21;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Next']")
	public WebElement Next_button1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Submit']")
	public WebElement Submit_button1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Cancel']")
	public WebElement Cancel_button1;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='TestFN TestLN(ppprovarautomationsales@gmail.com)']")
	public WebElement Contact_UWCR;	
}

