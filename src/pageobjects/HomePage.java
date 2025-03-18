package pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="HomePage"                                
, summary=""
, relativeUrl=""
, connection="SalesUser"
		)             
public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	public void PressEnter() throws InterruptedException{
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;
	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='Admin Account Search']")
	public WebElement adminAccountSearch;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Search apps and items...']/following-sibling::div//input")
	public WebElement searchAppsAndItems;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='View All']")
	public WebElement viewAll;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Search apps or items...']/following-sibling::div//input[1]")
	public WebElement searchAppsOrItems;
	@LinkType()
	@FindBy(xpath = "//one-app-launcher-tab-item/a[1]")
	public WebElement payPalAccounts;
	@LinkType()
	@FindBy(xpath = "//a[@id='Admin_Account_Flag_Manager']")
	public WebElement adminAccountFlagManager;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Contacts']")
	public WebElement contacts;

}
