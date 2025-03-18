package pageobjects;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.JavascriptBy;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageBlock;
import com.provar.core.testapi.annotations.PageFrame;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.SteelBrickBy;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Opportunity"                                
, summary=""
, relativeUrl=""
, connection="SalesUser"
		)             
public class Opportunity {
	WebDriver driver;

	public Opportunity(WebDriver driver) {
		this.driver=driver;
	}

	@LinkType()
	@FindBy(xpath = "//*[text()='BT Accounts']")
	public WebElement bTAccountsTab;
	@TextType()
	@FindBy(xpath = ".//c-agreement-b-t-accounts-with-status/descendant::input[1]")
	public WebElement BTMerchantAccount;
	@LinkType()
	@FindBy(xpath = "//p[text()='Primary Deal']/following::a[1]")
	public WebElement ReturntoDealFromOpp;
	@ButtonType()
	@FindBy(xpath = ".//c-agreement-b-t-accounts-with-status//tr[1]//button[normalize-space(.)='Add to Opp']")
	public WebElement Add_to_Opp_button;
	@TextType()
	@FindBy(xpath = ".//c-agreement-b-t-accounts-with-status//button[normalize-space(.)='Save']")
	public WebElement Savebutton;
	@LinkType()
	@FindBy(xpath = "//p[text()='Primary Deal']/following::a[1]")
	public WebElement PrimaryDeal;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Add/Edit Products']")
	public WebElement addEditProducts;
	@LinkType()
	@FindBy(xpath = "//p[text()='Opportunity']/following-sibling::p//a[1]")
	public WebElement Opportunity;
	public void enterValueInField(String value) throws InterruptedException, AWTException {
		// Locate the input field
		JavascriptExecutor js = (JavascriptExecutor)driver;
	//	WebElement inputField = new WebDriverWait(driver, Duration.ofSeconds(10)) //
			//	.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td/descendant::input)[1]"))); //

		// Enter value using WebElement
		//inputField.clear();
		//inputField.sendKeys(Keys.ENTER);
		
		
		

		//js.executeScript("arguments[0].value = 'Pay360';", inputField); 
		//inputField.sendKeys(value);
		Thread.sleep(4000);
		
		
		
		//WebElement inputField1 = new WebDriverWait(driver, Duration.ofSeconds(10))
				//.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Pay360']/../../../div[1]"))); 
		
//js.executeScript("arguments[0].click();", inputField1);

		// Optional: Pause briefly
		try {
			Thread.sleep(1000); // 1 second delay
		} catch (InterruptedException e) {
			e.printStackTrace();
		}     }
		
			

	public  void function() throws InterruptedException {

				WebElement checkbox = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='Pay360'; arguments[0].dispatchEvent(new Event('keyup'))", checkbox);
             Thread.sleep(3000);
            WebElement pay360 =driver.findElement(By.xpath("(//span[text()='Pay360'])[1]//ancestor::div[@role='option']"));
            js.executeScript("arguments[0].click();", pay360);
           
}
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Confirm And Save']")
	public WebElement confirmAndSave;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@data-label='Chatter']")
	public WebElement chatter;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='StageQualification to ActivationEst Annual Revenue$0.00 to $3.75Show All Updates']")
	public WebElement stageQualificationToActivationEstAnnualRevenue000To375ShowAllUpdates;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Show more actions']")
	public WebElement showMoreActions;
	@PageFrame()
	public static class Frame {

		@SteelBrickBy(tabName = "Co-marketing")
		public CoMarketing coMarketing;
		@SteelBrickBy(tabName = "Co-marketing")
		public CoMarketing1 coMarketing1;
	}
	@FindBy(xpath = "//iframe[contains(@src,'apex/SBQQ__sb?Id=aDaQL0000001uTB0AY')]")
	public Frame frame;
	@PageBlock()
	public static class CoMarketing {

		@BooleanType()
		@FindBy(xpath = "//sb-product-option-table[@id='ot']/div[@id='optiontable']/div[@id='tbody']/sb-table-row[@name='Co marketing contra'][1]//sb-group[@id='selection']//sb-table-cell-select//paper-checkbox[@id='checkbox']//div[@id='checkboxContainer']")
		public WebElement checkboxA1;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#selection').shadowRoot.querySelector('#g > div > sb-table-cell-select').shadowRoot.querySelector('#checkbox').shadowRoot.querySelector('#checkbox')")
		public WebElement checkbox;
	}
	@LinkType()
	@FindBy(xpath = "//a[@id='customTab__item']")
	public WebElement addEditProducts1;
	@PageFrame()
	public static class Frame1 {
	
		@PageWait.BackgroundActivity(timeoutSeconds = 30)
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#selection').shadowRoot.querySelector('#g > div > sb-table-cell-select').shadowRoot.querySelector('#checkbox').shadowRoot.querySelector('#checkbox')")
		public WebElement checkbox1;
		
	}
	@FindBy(xpath = "//iframe[contains(@src,'apex/SBQQ__sb?Id=aDaQL0000001wMv0AI')]")
	public Frame1 frame1;
	@PageBlock()
	public static class CoMarketing1 {

	}
	public void enterValueInField1() {
        // Locate the input field
        WebElement Frame=driver.findElement(By.xpath("//div[@class='slds-card__body slds-card__body--inner']/iframe[1]"));
        driver.switchTo().frame(Frame);
        
         JavascriptExecutor js = (JavascriptExecutor) driver;
        
        // Define the JavaScript code to access the nested shadow DOM elements
        String script = "return document.querySelector('#sbPageContainer')"
                + ".shadowRoot.querySelector('#content > sb-product-config')"
                + ".shadowRoot.querySelector('#bundles').shadowRoot"
                + ".querySelector('#features').shadowRoot.querySelector('sb-tabs')"
                + ".shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list')"
                + ".shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)')"
                + ".shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row')"
                + ".shadowRoot.querySelector('#selection').shadowRoot.querySelector('#g > div > sb-table-cell-select')"
                + ".shadowRoot.querySelector('#checkbox').shadowRoot.querySelector('#checkbox');";
        
        // Execute the JavaScript and retrieve the WebElement
        WebElement element = (WebElement) js.executeScript(script);
       
        WebElement inputField = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element)); 

        // Enter value using WebElement
      element.click();

        // Optional: Pause briefly
        try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
   }     }

	@ButtonType()
	@FindBy(xpath = "(//button[normalize-space(.)='MoreTabs'])[1]")
	public WebElement moretabs;
	@ButtonType()
	@FindBy(xpath = "//button/following-sibling::div[1]/div[1]/slot[1]/descendant::a[2]/span[normalize-space(.)='BT Accounts']")
	public WebElement moretabs1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='BT Accounts']")
	public WebElement bTAccounts;
	@ButtonType()
	@FindBy(xpath = ".//c-agreement-b-t-accounts-with-status//button[normalize-space(.)='Save']")
	public WebElement SaveBT;
	@BooleanType()
	@FindBy(xpath = ".//c-agreement-b-t-accounts-with-status//td//label/span[1]")
	public WebElement ChedkBTAccount;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Presales and Integration Request']")
	public WebElement Opportunity_Presales_and_Integration_Request;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close']")
	public WebElement close1;
	@ButtonType()
	@FindBy(xpath = "//lightning-button[@data-id='sf-flat10']/descendant::button[@title='View Details']")
	public WebElement sf_flat10_ViewDetails;
	@TextType()
	@FindBy(xpath = ".//c-sob-display-merchant-visibility-banner//div[normalize-space(.)='This opportunity may be eligible to be presented to the Merchant using the new portal experience. Please use Enable In Portal button to enable visibility.']")
	public WebElement MP_1st_Banner;
	@TextType()
	@FindBy(xpath = ".//c-sob-display-merchant-visibility-banner//div[normalize-space(.)='Opportunity is now available for the Merchant to view in the Portal Experience.']")
	public WebElement MP_2nd_Banner;
	@BooleanType()
	@FindBy(xpath = ".//c-agreement-b-t-accounts-with-status//tr[3]/td[1]//label/span[1]")
	public WebElement CheckBTAccount7;
	@ButtonType()
	@FindBy(xpath = ".//c-agreement-b-t-accounts-with-status//tr[1]//button[normalize-space(.)='View Details']")
	public WebElement View_Details_button1;
	@BooleanType()
	@FindBy(xpath = ".//c-agreement-b-t-accounts-with-status//c-display-existing-fee-generic-table//tr[1]/td[1]//label/span[1]")
	public WebElement ChedkBTAccount1;
	@BooleanType()
	@FindBy(xpath = ".//c-agreement-b-t-accounts-with-status//c-display-existing-fee-generic-table//tr[2]/td[1]//label/span[1]")
	public WebElement BT_Basefee2;
	@LinkType()
	@FindBy(xpath = "(//div[@class='containerBodyCard vertical-align'])[last()]/descendant::a[1]")
	public WebElement OpptyLink;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next']")
	public WebElement UOB_Next_button;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='The product you have selected is not yet supported through the Unified Onboarding platform. Please check the list in subset of products']")
	public WebElement Read_error;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='The account country associated with this record is not approved for Onboarding flow']")
	public WebElement read_errorCountry;
	@TextType()
	@FindBy(xpath = "//button[@name='ContactsList']")
	public WebElement Contacts;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@id='combobox-button-1542']/span")
	public WebElement Contacts1;
	@TextType()
	@FindBy(xpath = "//input[@name='recepientPhone']")
	public WebElement Phone_Number;
	@TextType()
	@FindBy(xpath = "//input[@name='recepientEmail']")
	public WebElement Email;
	@TextType()
	@FindBy(xpath = "//label[text()='Contacts']/following::lightning-base-combobox-item[1]")
	public WebElement ContactsName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//p[normalize-space(.)='Thank you! Your email has been sent to the merchant. Their onboarding progress will be displayed on your opportunity.']")
	public WebElement invitationSent;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='Generate URL']")
	public WebElement GenerateURL;
	
}
