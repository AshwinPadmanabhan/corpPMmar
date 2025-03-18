package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="QLELC"                                
, summary=""
, connection="InsideSalesUser"
, auraComponent="QLELC"
, namespacePrefix=""
		)             
public class QLELC {

	@PageFrame()
	public static class Frame {

		@SteelBrickBy(tabName = "Co-marketing")
		public CoMarketing coMarketing;
	}

	@FindBy(xpath = "//iframe[contains(@src,'apex/SBQQ__sb?Id=aDaQL0000001uTB0AY')]")
	public Frame frame;

	@PageBlock()
	public static class CoMarketing {

		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#selection').shadowRoot.querySelector('#g > div > sb-table-cell-select').shadowRoot.querySelector('#checkbox').shadowRoot.querySelector('#checkboxContainer')")
		public WebElement Checkbox;
	}

}
