package pageobjects;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Toast Message"                                
, summary=""
, relativeUrl=""
, connection="MTSLTUAT"
		)             


public class ToastMessage {

	public WebDriver driver;
	public ToastMessage(WebDriver driver){
		this.driver=driver;
	}

	/* public String toastMsg(){
     WebElement element = driver.findElement(By.xpath("//span[@class='toastMessage forceActionsText']"));

     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='toastMessage forceActionsText']")));

        return element.getText();
     }

	@TextType()
	@FindBy(xpath = "//span[@class='toastMessage forceActionsText']")
	public WebElement Toastmsg;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//c-gps-manual-case-routing-component//button[normalize-space(.)='Save']")
	public WebElement Save_button;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//slot[@name='main']//button[normalize-space(.)='MoreTabs']")
	public WebElement moreTabs;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[normalize-space(.)='Cases (0)']")
	public WebElement Cases;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//a[normalize-space(.)='New Dashboard']")
	public WebElement newDashboard;
*/
	 
	public void toastMsge(String ExpectedResult){
		driver.findElement(By.xpath("//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//c-gps-manual-case-routing-component//button[normalize-space(.)='Save']")).click();


		FluentWait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))           
				.pollingEvery(Duration.ofSeconds(2))           
				.ignoring(NoSuchElementException.class);       

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//span[@class='toastMessage forceActionsText']"));
			}
		});
		if(ExpectedResult.equals(element.getText())){
			System.out.println("TestPass");
		}
		else{
			driver.findElement(By.xpath(ExpectedResult)).click();
		}

	}



}
