package pageobjects;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.*;

@Page( title="BP_ACM_ImportOfflineDocs"                                
     , summary=""
     , relativeUrl=""
     , connection="SystemAdmin"
     )             
public class BP_ACM_ImportOfflineDocs {

	@PageFrame()
	public static class Frame {

		@ChoiceListType()
		@FindBy(xpath = "//select[@name='picklistSelect']")
		public WebElement DocType;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Next >>']")
		public WebElement next;
		@ButtonType(file = true)
		@FindBy(xpath = "//input[@type='file']")
		public WebElement ChooseFile;
		@ButtonType()
		@FindBy(xpath = "//input[@value='Attach File']")
		public WebElement attachFile;
		@ButtonType()
		@FindBy(xpath = "//td/span/span/input")
		public WebElement continue_;
	}

	@FindBy(xpath = "(//iframe)[2]")
	public Frame frame;
	
	
	WebDriver driver;
	public BP_ACM_ImportOfflineDocs(WebDriver driver){
	this.driver = driver;
	}
	ITestExecutionContext testExecutionContext;
	public void uploadFile(String projectPath,String fileName){
	//return testExecutionContext.getProjectPath();
	driver.switchTo().frame(driver.findElement(By.xpath("//div/force-aloha-page//iframe")));
	//driver.switchTo().frame(driver.findElement(By.xpath("//div[contains(@class,'iframe slds-card')]//iframe")));
	WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
	String filePath = getFileFromTemplates("sampleFileUpload.docx");
	inputFile.sendKeys(""+projectPath+File.separator+"templates"+File.separator+""+fileName+"");
	
	driver.findElement(By.xpath("//input[@value='Attach File']")).click();
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

	@PageFrame()
	public static class Frame1 {
	}

	@FindBy(xpath = "(//iframe)[1]")
	public Frame1 frame1;

	@PageFrame()
	public static class Frame2 {
	}

	@FindBy(xpath = "//div[contains(@class, \"oneAlohaPage\")]/force-aloha-page/div//iframe")
	public Frame2 frame2;
			
}
