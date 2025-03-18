package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Buyside_portal"                                
     , summary=""
     , relativeUrl=""
     , connection="Buyside_Portal_Divya"
     )             
public class Buyside_portal {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Search apps and items...']")
	public WebElement searchAppsAndItems;
	@LinkType()
	@FindBy(xpath = "//one-app-launcher-menu-item/a")
	public WebElement agreementPortal;
			
}
