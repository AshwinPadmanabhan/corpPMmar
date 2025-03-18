package pageobjects;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.JavascriptBy;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageFrame;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.TextType;

@Page( title="AgreementFlow"                                
, summary=""
, relativeUrl=""
, connection="SalesUser"
		)             
public class AgreementFlow {
	WebDriver driver;
	public AgreementFlow(WebDriver driver){
		this.driver=driver;
	}
	private static final Logger logger = Logger.getLogger(AgreementFlow.class.getName());
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='PayPal Standard Card']")
	public WebElement payPalStandardCard;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Deal Snapshot']/../following-sibling::li/descendant::a[normalize-space(.)='Add/Edit Products']")
	public WebElement addEditProducts;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Deal Guidance']")
	public WebElement dealGuidance;
	@LinkType()
	@FindBy(xpath = "//a[contains(text(), 'Merchant Agreement')]")
	public WebElement agreementLink;
	@PageFrame()
	public static class Frame {

		@TextType()
		@FindBy(css = "SPAN.pencil")
		public WebElement oFShareOfVolumeC1;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[1].shadowRoot.querySelectorAll('div')[11]")
		public WebElement x1StTxnActDateC;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelectorAll('div')[12]")
		public WebElement oFShareOfVolumeC;
		@ChoiceListType()
		@FindBy(xpath = "//select[@id='select-01-1']")
		public WebElement Reason1;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(text()) = 'Braintree NA PestRoutes with AU']/../../td[1]/a[1]")
		public WebElement action;
		@LinkType()
		@FindBy(xpath = "//span[normalize-space(text()) = 'Automation Contact']/../../td[1]/a[1]")
		public WebElement action1;
		@LinkType()
		@FindBy(linkText = "Select")
		public WebElement action2;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(text()) = 'BR TS/MM Taxa 2.35% + $0.00BRL D+15 301WF Use ONLY for $500K USD TPV or Above']//../../td[1]/a[1]")
		public WebElement Action_BR_TSMM;
		@LinkType()
		@FindBy(xpath = "(//a[contains(text(),'Select')])[3]")
		public WebElement Action_BR_Ratecard;
		@LinkType()
		@FindBy(xpath = "(//a[contains(text(),'Select')])[2]")
		public WebElement Action_GB_Ratecard;
		@LinkType()
		@FindBy(xpath = "((//a[contains(text(),'Select')])[3]")
		public WebElement Action_SG_Ratecard;
		@LinkType()
		@FindBy(xpath = "((//a[contains(text(),'Select')])[3]")
		public WebElement Action_AU_Ratecard;
		
		@LinkType()
		@FindBy(xpath = "(//a[contains(text(),'Select')])[3]")
		public WebElement Action_GB_Facilitator;
	}
	@FindBy(xpath = "//div[contains(@class, \"content\")]//iframe")
	public Frame frame;
	@ButtonType()
	@FindBy(xpath = "//*[text()='Create Fee based on Deal Products']")
	public WebElement Create_Fee_based_on_Deal_Products_button;
	@PageFrame()
	public static class Frame1 {
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div:nth-child(5) > div')")
		public WebElement x1StTxnActDateC;	
		@TextType()
		@JavascriptBy(jspath ="return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.editable.sf-has-focus.editMode > div.w > div > sb-datepicker').shadowRoot.querySelector('#dateInput')")
		public WebElement dateInput;
		@TextType()
		@FindBy(xpath = "//sb-search-bar[@id='headersearch']//sb-typeahead[@id='typeahead']//input[@id='itemLabel']")
		public WebElement searchProducts;
		@ButtonType()
		@FindBy(xpath = "//sb-search-bar[@id='headersearch']//paper-button[@id='search']")
		public WebElement search;
		@BooleanType()
		@FindBy(xpath = "//sb-table-row[@name='Express Checkout']//sb-group[@id='selection']//sb-table-cell-select//paper-checkbox[@id='checkbox']//div[@id='checkboxContainer']")
		public WebElement checkbox;
		@ButtonType()
		@FindBy(xpath = "//paper-button[@id='plSelectMore']")
		public WebElement selectAndAddMore;
		@BooleanType()
		@FindBy(xpath = "//sb-table-row[@name='Advanced Card Payments – UCC']//sb-group[@id='selection']//sb-table-cell-select//paper-checkbox[@id='checkbox']//div[@id='checkboxContainer']")
		public WebElement checkbox1;
		@BooleanType()
		@FindBy(xpath = "//sb-table-row[@name='Basic Card Payments – Standard Card Fields']//sb-group[@id='selection']//sb-table-cell-select//paper-checkbox[@id='checkbox']//div[@id='checkboxContainer']")
		public WebElement checkbox2;
		@BooleanType()
		@FindBy(xpath = "//sb-page-container[@id='sbPageContainer']//sb-product-lookup//sb-lookup-layout[@id='lookupLayout']/div[@id='items']/slot/sb-table-row[@id='tableRow']//sb-group[@id='selection']//sb-table-cell-select//paper-checkbox[@id='checkbox']//div[@id='checkboxContainer']")
		public WebElement checkbox3;
		@BooleanType()
		@FindBy(xpath = "//sb-page-container[@id='sbPageContainer']//sb-product-lookup//sb-lookup-layout[@id='lookupLayout']/div[@id='items']/slot/sb-table-row[@id='tableRow']//sb-group[@id='selection']//sb-table-cell-select//paper-checkbox[@id='checkbox']//div[@id='checkboxContainer']")
		public WebElement checkbox4;
		@ChoiceListType()
		@FindBy(xpath = "//select[@id='select-01-1']")
		public WebElement reason;
	}
	@FindBy(xpath = "(//iframe)[2]")
	public Frame1 frame11;
	public String getUrl(){
		return driver.getCurrentUrl();
	}
	public String getParentWindow(){
	String ParentWindow=driver.getWindowHandle();
	return ParentWindow;
	}
	public void closeParentWindow(String ParentWindow) throws InterruptedException{
	
	Set<String> allWindowHandles = driver.getWindowHandles();
	
		Thread.sleep(2000);
			
      // Check if there are child windows
            if (allWindowHandles.size() > 1) {
                System.out.println("Child window(s) detected. Closing parent window.");
                driver.switchTo().window(ParentWindow).close();
                }           
	}
	public void closeParentwindowAndSwitch(String parentWindowHandle) throws InterruptedException{
	
		Thread.sleep(2000);

        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        
        // Iterator to loop through the window handles
        Iterator<String> iterator = allWindowHandles.iterator();

        // Get the handle for the child window (which is not the parent)
        String childWindowHandle = null;
        while (iterator.hasNext()) {
            String windowHandle = iterator.next();
            if (!windowHandle.equals(parentWindowHandle)) {
                // This is the child window
                childWindowHandle = windowHandle;
                break;
            }
        }

        // Check if a child window exists and then proceed to close the parent window
        if (childWindowHandle != null) {
        	logger.info(childWindowHandle);
            // Switch to the parent window
            driver.switchTo().window(parentWindowHandle);
            
            Thread.sleep(1000);

            // Close the parent window
            driver.close();
            
            Thread.sleep(2000);

            // Now switch back to the child window
            driver.switchTo().window(childWindowHandle);

            // At this point, you are in the child window and can perform further actions
            System.out.println("Successfully switched to the child window.");
        } else {
            System.out.println("No child window found.");
        }
	}

	public void setDate(String value) throws InterruptedException{
		//	WebElement frame= driver.findElement(By.xpath("(//iframe)[2]"));
		//	driver.switchTo().frame(frame);

		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement e=(WebElement) js.executeScript("return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div:nth-child(5) > div')");
		js.executeScript("arguments[0].click();", e);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", e);
		Thread.sleep(2000);
		WebElement dateInput=(WebElement) js.executeScript("return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.editable.sf-has-focus.editMode > div.w > div > sb-datepicker').shadowRoot.querySelector('#dateInput');");
		js.executeScript("arguments[0].value='"+value+"';",dateInput);
		// Actions a=new Actions(driver);
		// a.sendKeys(Keys.ENTER);
		dateInput.sendKeys(Keys.ENTER);
		//	js.executeScript("document.dispatchEvent(new KeyboardEvent('keypress', { 'key': 'Enter' }))");
		//	driver.switchTo().defaultContent();
	}	

	@ButtonType()
	@FindBy(xpath = "//button[@name='PricingNextGen__c.Calculate']")
	public WebElement calculate;
	@TextType()
	@FindBy(xpath = "//textarea[@id='input-1576']")
	public WebElement backgroundAndContextOfPriceChange;
	@ButtonType()
	@FindBy(xpath = "//button[@name='PricingNextGen__c.Submit_for_Approval' and normalize-space(.)='Submit for Approval']")
	public WebElement Submit_for_Approval;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[1]//a[normalize-space(.)='Approve']")
	public WebElement sbaa__Actions__c;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[2]//a[normalize-space(.)='Approve']")
	public WebElement sbaa__Actions__c1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[2]//lst-formatted-text/span[normalize-space(.)='Approved']")
	public WebElement sbaa__Status__c;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[1]//lst-formatted-text/span[normalize-space(.)='Approved']")
	public WebElement sbaa__Status__c1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[@id='sectionContent-161']//span[normalize-space(.)='Approved']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement ApprovalStatus__c;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Approvals Request(2)']")
	public WebElement Approvals__r;
	@PageFrame()
	public static class Frame2 {

		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Continue']")
		public WebElement Continue_button;
	}
	@FindBy(xpath = "//div[contains(@class, \"iframe-parent\")]//iframe")
	public Frame1 frame1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit % of Transaction Amount']")
	public WebElement editOfTransactionAmount;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='customTab6__item' and normalize-space(.)='Add/Edit Products']")
	public WebElement addEditProductstab;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//records-record-layout-row[5]//records-record-layout-item[1]//dd/div")
	public WebElement OfTransactionAmount;
	@PageFrame()
	public static class Frame11 {

		@ChoiceListType()
		@JavascriptBy(jspath = "return document.querySelector('c-merchant-agreement-lwc').shadowRoot.querySelector('select')")
		public WebElement reason;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Continue']")
		public WebElement Continue_button;
		@ChoiceListType()
		@FindBy(xpath = "//select[@id='select-01-10']")
		public WebElement Reason;
	}
	@FindBy(xpath = "//div[contains(@class, \"iframe-parent\")]//iframe")
	public Frame11 frame12;
	@PageFrame()
	public static class Frame12 {

		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Continue']")
		public WebElement Continue_button;
		@LinkType()
		@FindBy(xpath = "//div[3]//a[normalize-space(.)='New Agreement']")
		public WebElement newAgreement;
		@LinkType()
		@FindBy(xpath = "//div[1]/table//a[normalize-space(.)='New Agreement']")
		public WebElement newAgreement1;
		@TextType()
		@FindBy(xpath = "//title[text()='Salesforce - Unlimited Edition']/following::p[1]")
		public WebElement AgreementName;
		@ChoiceListType()
		@JavascriptBy(jspath = "return document.querySelector('td:nth-child(3) > select')")
		public WebElement MerchantIncentives;
		@ChoiceListType()
		@FindBy(xpath = "//label[normalize-space(.)='Please select Agreement SubType']/following-sibling::select")
		public WebElement merchantSubtype;
		@ButtonType()
		@FindBy(xpath = "//div/span/input[1]")
		public WebElement continue_11;
		@ButtonType()
		@FindBy(xpath = "//button[@id='actionButton2']")
		public WebElement deleteLine;
	}
	@FindBy(xpath = "//div[contains(@class, \"iframe-parent\")]//iframe")
	public Frame12 frame121;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Pricing_Analysis_Fee__c.Next_Fee']")
	public WebElement GoToNextFee;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Create Pricing Analysis']")
	public WebElement Create_Pricing_Analysis_button;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[2]/lightning-button[1]/button[normalize-space(.)='Add To Envelope']")
	public WebElement Add_To_Envelope_button;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//div[1]/lightning-button[1]/button[normalize-space(.)='Add To Envelope' and @type='button']")
	public WebElement Add_To_Envelope_button1;
	@PageWait.Field(field = "close", timeoutSeconds = 20)
	@ButtonType()
	@FindBy(xpath = "(//span[normalize-space(.)='Close'])/*/*/*")
	public WebElement close;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "(//button[normalize-space(.)='Add To Envelope'])[1]")
	public WebElement Add_To_Envelope_button2;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Add/Edit Products']")
	public WebElement addEditProducts1;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close']")
	public WebElement close1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Next']")
	public WebElement Next_button;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Pricing Options']")
	public WebElement pricingOptions;
	@TextType()
	@FindBy(xpath = "//input[@name='Branded_Existing_Annual_nTPV_USD__c']")
	public WebElement brandedExistingAnnualNTPVUSD;
	@TextType()
	@FindBy(xpath = "//input[@name='Unbranded_Existing_Annual_nTPV_USD__c']")
	public WebElement unbrandedExistingAnnualNTPVUSD;
	@TextType()
	@FindBy(xpath = "//input[@name='Payouts_Existing_Annual_nTPV_USD__c']")
	public WebElement payoutsExistingAnnualNTPVUSD;
	@TextType()
	@FindBy(xpath = "//input[@name='Other_Existing_Annual_nTPV_USD__c']")
	public WebElement otherExistingAnnualNTPVUSD;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Approve / Reject']")
	public WebElement Approvals_Table_Approve;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//p/span")
	public WebElement RichTextControl;
	@ChoiceListType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//select[contains(@class,'slds-select') and @name='Marketplace_Platform_Operator_Aggregator']")
	public WebElement Business_Operating_Structure;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[contains(normalize-space(.),'Test Opportun')]")
	public WebElement opportunity;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[contains(normalize-space(.),'TestOppor')]")
	public WebElement opportunity1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Edit']")
	public WebElement edit;
	@TextType()
	@FindBy(xpath = "//label[text()='Deal Type']/following::button[2]/span[1]")
	public WebElement Deal_Type;
	@TextType()
	@FindBy(xpath = "//span/span[text()='New Account']")
	public WebElement DealTypeNewAccount;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Type of Pricing']/following::button[1]")
	public WebElement Type_of_Pricing;
	@TextType()
	@FindBy(xpath = "//span/span[text()='New Merchant Pricing']")
	public WebElement TypeOfPricingNewMerchant;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*ASP']/following::input[1]")
	public WebElement ASP;
	@TextType()
	@FindBy(xpath = "//div/lightning-button/button[text()='Save']")
	public WebElement Savebutton;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Minimize' and @type='button']")
	public WebElement minimize;
	@ButtonType()
	@FindByLabel(label = "Close")
	public WebElement close2;
	@LinkType()
	@FindBy(xpath = "//img[@alt='Add Recipient']/..")
	public WebElement Add_Edit_Recipient__c;
	@LinkType()
	@FindBy(xpath = "//img[@alt='Submit Request']")
	public WebElement Submit_Agreeement_Request__c;
	@LinkType()
	@FindBy(xpath = "//img[@alt='Submit Request']")
	public WebElement Submit_Agreeement_Request__c1;
	@LinkType()
	@FindBy(xpath = "//span[text()='Generate Agreement']/following::a[1]")
	public WebElement Generate_Agreement__c;
	@LinkType()
	@FindBy(xpath = "//span[text()='Send For eSignature']/following::a[1]")
	public WebElement Send_For_Merchant_eSignature_Echosign__c;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//records-record-layout-item[1]//span/a")
	public WebElement Add_Edit_Recipient__c1;
	
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('c-add-docusign-recipient').shadowRoot.querySelector('c-add-recipient-on-agreement').shadowRoot.querySelectorAll('lightning-button')[2].shadowRoot.querySelector('button')")
	public WebElement Add_To_Envelope_button4;

	@ButtonType()
	@FindBy(xpath = "(//button[normalize-space(.)='Add To Envelope'])[1]")
	public WebElement Add_To_Envelope_button3;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='BT Application']/following::input[1]")
	public WebElement bTApplicationNovationAPP_3666029;

	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[2]//input[@name='radioOnAddReciepient']")
	public WebElement EnvelopRow1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Sales Segmentation']")
	public WebElement salesSegmentation;

	
}
