package pageobjects;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.JavascriptBy;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="DMS_Flow"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesUser"
     )             
public class DMS_Flow {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement Next_button;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Search document type']")
	public WebElement searchDocumentType;
	@TextType()
	@FindBy(xpath = "//li[@data-id='A birth certificate']")
	public WebElement birth_certificate;
	@LinkType()
	@JavascriptBy(jspath = "return document.querySelector('c-dms_-generate-url-for-file-upload').shadowRoot.querySelector('lightning-formatted-url').shadowRoot.querySelector('a')")
	public WebElement URL_for_fileUpload;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Document type (Click to choose Document Type)']/parent::div/parent::div/parent::div/parent::div/following-sibling::div[1]//span")
	
	
	//public WebElement FileUploadOption;
	
	WebDriver driver;
	public DMS_Flow(WebDriver driver){
	this.driver = driver;
	}
	ITestExecutionContext testExecutionContext;
	public void uploadFile(String projectPath,String fileName){
	//return testExecutionContext.getProjectPath();
	WebElement inputFile = driver.findElement(By.xpath("//label[normalize-space(.)='Document type (Click to choose Document Type)']/parent::div/parent::div/parent::div/parent::div/following-sibling::div[1]//input"));
//	JavascriptExecutor jse = (JavascriptExecutor) driver;
//	jse.executeScript("arguments[0].value='C:\\Users\\nirmalkumar-a\\git\\templates\\sampleFileUpload.docx'", inputFile);
	String filePath = getFileFromTemplates("sampleFileUpload.docx");
	inputFile.sendKeys(""+projectPath+File.separator+"templates"+File.separator+""+fileName+"");
	
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	WebElement uploadButton = driver.findElement(By.xpath("//button[contains(text(),'Submit to PayPal')]"));
//	uploadButton.click();
	
	}
	
	  private static String getFileFromTemplates(String fileName) {
        // Get the project's root directory
        Path projectRoot = Paths.get(System.getProperty("user.dir"));
        
        // Construct the file path relative to the project root
        return projectRoot.resolve("templates").resolve(fileName).toAbsolutePath().toString();
    }

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Document type (Click to choose Document Type)']/parent::div/parent::div/parent::div/parent::div/following-sibling::div[1]//span")
	public WebElement uploadFileOperation;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement Next_button1;
	
	
	public void selectDropdownOptionByText(){
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//WebElement dropdownElement = driver.findElement(By.xpath("//li[@data-id='A birth certificate']"));
	
	//Select dropdown = new Select(dropdownElement);
	//dropdown.selectByVisibleText("A birth certificate");
	Actions actions = new Actions(driver);
	List<WebElement>options = driver.findElements(By.xpath("//label[contains(text(),'Search Document Type')]/parent::div/descendant::ul"));
	for (WebElement option : options ){
	if(option.getText().equals("A birth certificate")){
	actions.moveToElement(option).click().perform();
	break;
	}
	}
	
	}
	@ButtonType(file = true )
	@FindBy(xpath="//input[@type='file']")
	public WebElement fileu;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-3080']")
	public WebElement searchDocumentType1;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('c-dms_-generate-url-for-file-upload').shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement searchDocumentType2;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'representment')][1]")
	public WebElement searchDocumentType3;
			
}
