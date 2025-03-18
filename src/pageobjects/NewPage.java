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
import com.provar.core.testapi.annotations.JavascriptBy;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageBlock;
import com.provar.core.testapi.annotations.PageFrame;
import com.provar.core.testapi.annotations.SteelBrickBy;
import com.provar.core.testapi.annotations.TextType;

@Page( title="NewPage"                                
, summary=""
, relativeUrl=""
, connection="InsideSalesUser"
		)             
public class NewPage {
	public WebDriver driver;
	public NewPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void click() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Ensure switching back to the default content if necessary
		driver.switchTo().defaultContent();
		
		// Wait for the frame to be available and switch to it
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("(//iframe)[1]")));
		//driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[1]")));
		Actions act = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement x1 = (WebElement) jse.executeScript("return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#selection').shadowRoot.querySelector('#g > div > sb-table-cell-select').shadowRoot.querySelector('#checkbox')");
		WebElement x2 = (WebElement) jse.executeScript (" return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(7)').shadowRoot.querySelector('#feature-name')");
		
		act.moveToElement(x2).build().perform();
		jse.executeScript("arguments[0].checked=true", x1);
		

	}

	@PageFrame()
	public static class Frame {

		@SteelBrickBy(tabName = "Co-marketing")
		public CoMarketing coMarketing;
	}

	@FindBy(xpath = "//iframe[contains(@src,'apex/SBQQ__sb?Id=aDaQL0000001wMv0AI')]")
	public Frame frame;

	@PageBlock()
	public static class CoMarketing {

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-config').shadowRoot.querySelector('sb-product-bundles-layout').shadowRoot.querySelector('sb-product-feature-layout').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('sb-product-feature-list').shadowRoot.querySelectorAll('sb-product-feature')[2].shadowRoot.querySelector('sb-product-option-table').shadowRoot.querySelector('sb-table-row').shadowRoot.querySelectorAll('sb-group')[1].shadowRoot.querySelectorAll('sb-option-cell')[1].shadowRoot.querySelector('sb-field').shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement contraAmountLocal;
	}
	

}

