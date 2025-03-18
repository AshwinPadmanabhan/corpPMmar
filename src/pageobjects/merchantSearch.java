package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="merchantSearch"                                
               , summary=""
               , connection="CSM_User"
               , lightningWebComponent="merchantSearch"
               , namespacePrefix=""
     )             
public class merchantSearch {

	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('lightning-datatable').shadowRoot.querySelector('lightning-primitive-cell-factory').shadowRoot.querySelector('lightning-primitive-cell-button').shadowRoot.querySelector('lightning-button').shadowRoot.querySelector('button')")
	public WebElement arthur;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-merchant_-search').shadowRoot.querySelector('forcegenerated-flexipage_merchant_search__js').shadowRoot.querySelector('c-merchant-search').shadowRoot.querySelector('lightning-datatable').shadowRoot.querySelector('lightning-primitive-cell-factory').shadowRoot.querySelector('lightning-primitive-cell-button').shadowRoot.querySelector('lightning-button').shadowRoot.querySelector('button')")
	public WebElement FirstName;
	@BooleanType()
	@FindBy(xpath = ".//c-merchant-search//div[3]//label[normalize-space(.)='Select Item 1']/span[1]")
	public WebElement selectItem1;
	@ButtonType()
	@FindBy(xpath = ".//c-merchant-search//button[normalize-space(.)='Toggle Valid Status']")
	public WebElement toggleValidStatus;
	
}
