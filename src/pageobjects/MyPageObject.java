package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="CSM_User"
     )             
public class MyPageObject {

	@TextType()
	@FindBy(xpath = ".//c-merchant-search//div[normalize-space(.)='4774612359491947344' and @title='Account Number']")
	public WebElement AdminAccountNumber;
	@TextType()
	@FindBy(xpath = "//c-merchant-search//div[normalize-space(.)='4774612359491947344' and @title='Account Number']")
	public WebElement AdminAccountNumber1;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Add']")
	public WebElement Add_button;
	@TextType()
	@FindBy(xpath = "//button[@name='optionSelect']")
	public WebElement BusinessType;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('c-merchant-admin').shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')")
	public WebElement BusinessType1;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Save']")
	public WebElement Save_button;
			
}
