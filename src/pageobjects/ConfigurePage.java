package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.provar.core.testapi.annotations.Page;

@Page( title="ConfigurePage"                                
, summary=""
, relativeUrl=""
, connection="InsideSalesUser"
		)             
public class ConfigurePage {

	public WebDriver driver;
	public ConfigurePage(WebDriver driver){
		this.driver=driver;
	}
	public void CofigClic() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement frame= (WebElement)jse.executeAsyncScript("return document.querySelector('#tab-5 > slot > flexipage-component2:nth-child(2) > slot > flexipage-aura-wrapper > div > article > div > iframe");
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement element= (WebElement)jse.executeAsyncScript("return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#selection').shadowRoot.querySelector('#g > div > sb-table-cell-select').shadowRoot.querySelector('#checkbox').shadowRoot.querySelector('#checkboxContainer')");

		jse.executeScript("arguments[0].click();", element);

	}



}
