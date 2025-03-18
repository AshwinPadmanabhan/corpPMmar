package pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.*;

@Page( title="ContraApproval"                                
     , summary=""
     , relativeUrl=""
     , connection="ApproverFrancisBarel"
     )             
public class ContraApproval {
public WebDriver driver;
public ContraApproval(WebDriver driver){
this.driver= driver;
}
public void frameClick() throws InterruptedException {


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		String iframeLocator = "//iframe[@title='accessibility title']"; // Replace with your iframe selector
		String elementLocator = "//input[@type='submit' and @name='j_id0:AgreementForm:j_id5:j_id24']"; // Replace with your element selector

		try {
			// Check if the iframe is present
			WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(iframeLocator)));
			driver.switchTo().frame(iframe);
			WebElement x=	driver.findElement(By.xpath("//select[@name='j_id0:AgreementForm:j_id5:chooseColor']"));
			Select s= new Select(x);
			s.selectByIndex(3);
			Thread.sleep(3000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;


			jse.executeScript("arguments[0].dispatchEvent(new Event('change'));", x);
			Thread.sleep(3000);

			// Wait for the element inside the iframe to be clickable and then click it
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementLocator)));
			element.click();

			// Switch back to the default content
			driver.switchTo().defaultContent();
		}catch (Exception e ) {

		}

	}



	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//c-approval-tracker-details[2]//div[3]//lightning-icon[2]/span[normalize-space(.)='close']/lightning-primitive-icon")
	public WebElement closeclose;
	@LinkType()
	@FindBy(xpath = ".//c-holistic-tab-view//a[normalize-space(.)='Contra Approval']")
	public WebElement contraApproval;
	@LinkType()
	@FindBy(xpath = "//span[text()='Create Agreement']/following::a[1]")
	public WebElement Create_Agreement;
	@PageFrame()
	public static class Frame {

		@BooleanType()
		@FindBy(xpath = "//span[text()='Aline Gress (Legal)']/../../descendant::td[1]/input[1]")
		public WebElement select1;
		@ButtonType()
		@FindBy(xpath = "(//div[@class='pbBody'])[1]/span/input[1]")
		public WebElement C1;
		@ChoiceListType(values = { @ChoiceListValue(value = "Merchant Agreement", title = "012800000003xmjAAA"),
				@ChoiceListValue(value = "NDA", title = "012800000003xmkAAA"),
				@ChoiceListValue(value = "Novation", title = "012800000003xmlAAA"),
				@ChoiceListValue(value = "Merchant Incentives", title = "012800000003ycyAAA"),
				@ChoiceListValue(value = "Marketplaces", title = "012800000007pFPAAY"),
				@ChoiceListValue(value = "Partner Agreements", title = "01280000000ULcTAAW"),
				@ChoiceListValue(value = "Quick Start", title = "01280000000UOgXAAW") })
		@JavascriptBy(jspath = "return document.querySelector('td:nth-child(3) > select')")
		public WebElement MerchantIncentives1;
		@ButtonType()
		@FindBy(xpath = "//input[@value='Continue']")
		public WebElement C2;
		@ButtonType()
		@JavascriptBy(jspath = "return document.querySelector('div.pbBody > span > input:nth-child(3)')")
		public WebElement C22;
	}
	@FindBy(xpath = "//div[contains(@class, \"iframe-parent\")]//iframe")
	public Frame frame;
	@ButtonType()
	@FindBy(xpath = "(//div[@class='pbBody'])[1]/span/input[1]")
	public WebElement continue4;
	@PageFrame()
	public static class FrameNew {

		@ButtonType()
		@FindBy(xpath = "//div/span/input[1]")
		public WebElement contiFirst;
	}
	@FindBy(xpath = "//div[contains(@class, \"iframe-parent\")]//iframe")
	public FrameNew frameNew;
	@LinkType()
	@FindBy(xpath = "//span[text()='Create Agreement']/following::a[1]")
	public WebElement createAgreement_1st;
			
}
