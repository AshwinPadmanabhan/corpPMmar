package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;
import com.provar.core.testapi.annotations.SteelBrickBy.Facet;

@SalesforcePage( title="Sbqq__ Contra Investment Merchant Contra__ CPQ Product"                                
               , summary=""
               , page="sb"
               , namespacePrefix="SBQQ"
               , object=""
               , connection="SalesUser"
     )             
public class sbqq__ContraInvestmentMerchantContra__CPQProduct {

	@TextType()
	@FindBy(xpath = "//textarea[@id='textarea']")
	public WebElement fundingComments;

	@PageBlock()
	public static class CoMarketing {

		@SteelBrickBy(locatorType = "XPath", pageFeatureName = "Strategic Co-Marketing Contra", pageTableRow = "//sb-product-option-table[@id=\"ot\"]")
		@PageTable(firstRowContainsHeaders = false, row = StrategicCoMarketingContraLines.class)
		public List<StrategicCoMarketingContraLines> strategicCoMarketingContraLines;
		@SteelBrickBy(locatorType = "XPath", pageFeatureName = "Co-marketing (MS budget)", pageTableRow = "//sb-product-option-table[@id=\"ot\"]")
		@PageTable(firstRowContainsHeaders = false, row = CoMarketingMSBudgetLines.class)
		public List<CoMarketingMSBudgetLines> coMarketingMSBudgetLines;
		@SteelBrickBy(locatorType = "XPath", pageFeatureName = "Co-marketing (MS budget)", pageTableRow = "//sb-product-option-table[@id=\"ot\"]")
		@PageTable(firstRowContainsHeaders = false, row = CoMarketingMSBudgetLines1.class)
		public List<CoMarketingMSBudgetLines1> coMarketingMSBudgetLines1;
		@SteelBrickBy(locatorType = "XPath", pageFeatureName = "Co-marketing (MS budget)", pageTableRow = "//sb-product-option-table[@id=\"ot\"]")
		@PageTable(firstRowContainsHeaders = false, row = CoMarketingMSBudgetLines2.class)
		public List<CoMarketingMSBudgetLines2> coMarketingMSBudgetLines2;
		@SteelBrickBy(locatorType = "XPath", pageFeatureName = "Co-marketing (MS budget)", pageTableRow = "//sb-product-feature-list[@name=\"t0\"]")
		@PageTable(firstRowContainsHeaders = false, row = CoMarketingLines.class)
		public List<CoMarketingLines> coMarketingLines;
		@SteelBrickBy(locatorType = "XPath", pageFeatureName = "Co-marketing (MS budget)", pageTableRow = "//sb-product-option-table[@id=\"ot\"]")
		@PageTable(firstRowContainsHeaders = false, row = CoMarketingMSBudgetLines3.class)
		public List<CoMarketingMSBudgetLines3> coMarketingMSBudgetLines3;
		@SteelBrickBy(locatorType = "XPath", pageFeatureName = "Co-marketing (MS budget)", pageTableRow = "//sb-product-option-table[@id=\"ot\"]")
		@PageTable(firstRowContainsHeaders = false, row = CoMarketingMSBudgetLines41.class)
		public List<CoMarketingMSBudgetLines41> coMarketingMSBudgetLines4;
	}

	@SteelBrickBy(tabName = "Co-marketing")
	public CoMarketing coMarketing;

	@PageRow()
	public static class StrategicCoMarketingContraLines {

		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#selection').shadowRoot.querySelector('#g > div > sb-table-cell-select').shadowRoot.querySelector('#checkbox').shadowRoot.querySelector('#checkboxContainer')")
		public WebElement checkbox;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell.innerTd.secondary.numericCell.secondInnerTd.initial').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement Click_contraAmountLocal;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell.innerTd.secondary.numericCell.secondInnerTd.initial').shadowRoot.querySelector('#field').shadowRoot.querySelector('#f > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement contraAmountLocal;
		
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(3)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#f > sb-datepicker').shadowRoot.querySelector('#dateInput')")
		public WebElement ClickstartBy;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(3)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement ClickstartBy1;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(3)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#f > sb-datepicker').shadowRoot.querySelector('#dateInput')")
		public WebElement startBy;
		
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(4)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement Click_CompletedBy;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(4)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#f > sb-datepicker').shadowRoot.querySelector('#dateInput')")
		public WebElement CompletedBy;
		
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(5)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement Click_ExpectedPaymentDate;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(5)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#f > sb-datepicker').shadowRoot.querySelector('#dateInput')")
		public WebElement ExpectedPaymentDate;
		
		
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(6)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement Click_volumeCommitmentAmount;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(6)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#f > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement volumeCommitmentAmount;
		
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(7)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement Click_VolumeCommitmentDate;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(7)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#f > sb-datepicker').shadowRoot.querySelector('#dateInput')")
		public WebElement VolumeCommitmentDate;
		
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-config').shadowRoot.querySelector('sb-product-bundles-layout').shadowRoot.querySelector('sb-product-feature-layout').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('sb-product-feature-list').shadowRoot.querySelector('sb-product-feature').shadowRoot.querySelector('sb-product-option-table').shadowRoot.querySelector('sb-table-row').shadowRoot.querySelectorAll('sb-group')[1].shadowRoot.querySelectorAll('sb-option-cell')[8].shadowRoot.querySelector('sb-field').shadowRoot.querySelector('img')")
		public WebElement contraNotAttributedToAProduct;
		@TextType()
		@FindBy(xpath = "//sb-lookup[@id='lookup']//sb-typeahead[@id='typeahead']//input[@id='itemLabel']")
		public WebElement attributedTo;
	}

	@ButtonType()
	@FindBy(xpath = "//paper-button[@id='pcSave']")
	public WebElement Contra_save;

	@PageBlock()
	public static class CoMarketing1 {
	}

	@SteelBrickBy(tabName = "Co-marketing")
	public CoMarketing1 coMarketing1;

	@PageRow()
	public static class CoMarketingMSBudgetLines {

		@BooleanType()
		@SteelBrickBy(pageFeatureName = "Co-marketing (MS budget)", fieldSetTableItem = "checkbox")
		public WebElement checkbox;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#selection').shadowRoot.querySelector('#g > div > sb-table-cell-select').shadowRoot.querySelector('#checkbox').shadowRoot.querySelector('#checkboxContainer')")
		public WebElement checkbox_Co_marketing;
		@TextType()
		@SteelBrickBy(pageFeatureName = "Co-marketing (MS budget)", fieldSetTableItem = "record.Contra_Amount__c")
		public WebElement contraAmountLocal;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-config').shadowRoot.querySelector('sb-product-bundles-layout').shadowRoot.querySelector('sb-product-feature-layout').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('sb-product-feature-list').shadowRoot.querySelectorAll('sb-product-feature')[2].shadowRoot.querySelector('sb-product-option-table').shadowRoot.querySelector('sb-table-row').shadowRoot.querySelector('sb-group').shadowRoot.querySelector('sb-table-cell-select').shadowRoot.querySelector('paper-checkbox').shadowRoot.querySelector('div')")
		public WebElement checkbox1;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell.innerTd.secondary.numericCell.secondInnerTd.initial').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement checkbox2;
		@BooleanType()
		@SteelBrickBy(pageFeatureName = "Co-marketing (MS budget)", fieldSetTableItem = "checkbox")
		public WebElement checkbox3;
	}

	@PageBlock()
	public static class CoMarketing2 {
	}

	@SteelBrickBy(tabName = "Co-marketing")
	public CoMarketing2 coMarketing2;

	@PageRow()
	public static class CoMarketingMSBudgetLines1 {
	}

	@PageBlock()
	public static class CoMarketing3 {
	}

	@SteelBrickBy(tabName = "Co-marketing")
	public CoMarketing3 coMarketing3;

	@PageRow()
	public static class CoMarketingMSBudgetLines2 {
	}

	@PageRow()
	public static class CoMarketingLines {

		@BooleanType()
		@SteelBrickBy(pageFeatureName = "Co-marketing (MS budget)", fieldSetTableItem = "checkbox")
		public WebElement checkbox;
	}

	@PageBlock()
	public static class CoMarketing4 {

		@SteelBrickBy(locatorType = "XPath", pageFeatureName = "Co-marketing (MS budget)", pageTableRow = "//sb-product-option-table[@id=\"ot\"]")
		@PageTable(firstRowContainsHeaders = false, row = CoMarketingMSBudgetLines4.class)
		public List<CoMarketingMSBudgetLines4> coMarketingMSBudgetLines;
	}

	@SteelBrickBy(tabName = "Co-marketing")
	public CoMarketing4 coMarketing4;

	@PageRow()
	public static class CoMarketingMSBudgetLines3 {
	}

	@PageRow()
	public static class CoMarketingMSBudgetLines4 {

		@TextType()
		@FindBy(xpath = "//sb-product-option-table[@id='ot']/div[@id='optiontable']/div[@id='tbody']/sb-table-row[@name='Co marketing contra'][1]//sb-group[@id='row']//sb-option-cell[2]//sb-field[@id='field']//div[@id='formatted']")
		public WebElement contraAmountLocal;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell.innerTd.secondary.numericCell.secondInnerTd.initial').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement contraAmountClick;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell.innerTd.secondary.numericCell.secondInnerTd.initial').shadowRoot.querySelector('#field').shadowRoot.querySelector('#f > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement contraAmountEnter;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(3)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement startByClick;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(3)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#f > sb-datepicker').shadowRoot.querySelector('#dateInput')")
		public WebElement startByEnter;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(4)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement completeByClick;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(4)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#f > sb-datepicker').shadowRoot.querySelector('#dateInput')")
		public WebElement completeByEnter;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(5)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement expectedPaymentDateClick;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(5)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#f > sb-datepicker').shadowRoot.querySelector('#dateInput')")
		public WebElement expecterPaymentDateEnter;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(6)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement volumeCommitmentAmtClick;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(6)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#f > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement volumeCommitmentAmtEnter;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(7)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement volumeCommitmentDateClick;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(7)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#f > sb-datepicker').shadowRoot.querySelector('#dateInput')")
		public WebElement volumeCommitmentDateEnter;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(8)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement attributedToClick;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(8)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#lookup').shadowRoot.querySelector('#typeahead').shadowRoot.querySelector('#selector > div')")
		public WebElement attributedToProductPopupClick;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell:nth-child(8)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#lookup').shadowRoot.querySelector('#typeahead').shadowRoot.querySelector('#itemLabel')")
		public WebElement attributedToEnter;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(5)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-option-cell.innerTd.secondary.checkboxCell.lastInnerTd.initial').shadowRoot.querySelector('#field').shadowRoot.querySelector('#formatted')")
		public WebElement notAttributedToProduct;
	}

	@TextType()
	@FindBy(xpath = "//sb-lookup-dialog[@id='lookup']//sb-lookup[@id='lookup']//sb-typeahead[@id='typeahead']//input[@id='itemLabel']")
	public WebElement searchProductsFeatures;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('sb-page-header').shadowRoot.querySelector('#lookup').shadowRoot.querySelector('#tableRow').shadowRoot.querySelector('#row').shadowRoot.querySelector('#g > div > sb-table-cell:nth-child(1)').shadowRoot.querySelector('#field').shadowRoot.querySelector('#me')")
	public WebElement firstProductName;
	@ButtonType()
	@FindBy(xpath = "//sb-lookup-dialog[@id='lookup']//slot/sb-i18n")
	public WebElement save;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-config').shadowRoot.querySelectorAll('sb-i18n')[2]")
	public WebElement save1;

	@PageBlock()
	public static class CoMarketing5 {

		@SteelBrickBy(locatorType = "XPath", pageFeatureName = "Strategic Co-Marketing Contra", pageTableRow = "//sb-product-option-table[@id=\"ot\"]")
		@PageTable(firstRowContainsHeaders = false, row = StrategicCoMarketingContraLines1.class)
		public List<StrategicCoMarketingContraLines1> strategicCoMarketingContraLines;
		@SteelBrickBy(locatorType = "XPath", pageFeatureName = "Co-marketing (MS budget)", pageTableRow = "//sb-product-option-table[@id=\"ot\"]")
		@PageTable(firstRowContainsHeaders = false, row = CoMarketingMSBudgetLines5.class)
		public List<CoMarketingMSBudgetLines5> coMarketingMSBudgetLines;
	}

	@SteelBrickBy(tabName = "Co-marketing")
	public CoMarketing5 coMarketing5;

	@PageRow()
	public static class CoMarketingMSBudgetLines41 {
	}

	@TextType()
	@SteelBrickBy(configurationAttribute = "aBd2E000000PLWHSA4")
	public WebElement fundingComments1;

	@PageRow()
	public static class StrategicCoMarketingContraLines1 {

		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-config').shadowRoot.querySelector('#bundles').shadowRoot.querySelector('#features').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('#pages > div.iron-selected > sb-product-feature-list').shadowRoot.querySelector('#featureList > sb-product-feature:nth-child(1)').shadowRoot.querySelector('#ot').shadowRoot.querySelector('#row').shadowRoot.querySelector('#selection').shadowRoot.querySelector('#g > div > sb-table-cell-select').shadowRoot.querySelector('#checkbox').shadowRoot.querySelector('#checkboxContainer')")
		public WebElement checkbox;
	}

	@PageRow()
	public static class CoMarketingMSBudgetLines5 {

		@TextType()
		@FindBy(xpath = "//sb-product-option-table[@id='ot']/div[@id='optiontable']/div[@id='tbody']/sb-table-row[@name='Co marketing contra'][1]//sb-group[@id='row']//sb-option-cell[2]//sb-field[@id='field']//div[@id='formatted']")
		public WebElement contraAmountLocal;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-config').shadowRoot.querySelector('sb-product-bundles-layout').shadowRoot.querySelector('sb-product-feature-layout').shadowRoot.querySelector('sb-tabs').shadowRoot.querySelector('sb-product-feature-list').shadowRoot.querySelectorAll('sb-product-feature')[2].shadowRoot.querySelector('sb-product-option-table').shadowRoot.querySelector('sb-table-row').shadowRoot.querySelectorAll('sb-group')[1].shadowRoot.querySelectorAll('sb-option-cell')[1].shadowRoot.querySelector('sb-field').shadowRoot.querySelector('img')")
		public WebElement contraAmountLocal1;
	}
	
}
