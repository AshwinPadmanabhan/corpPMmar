package pageobjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.JavascriptBy;
import com.provar.core.testapi.annotations.PageRow;
import com.provar.core.testapi.annotations.PageTable;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.SteelBrickBy;
import com.provar.core.testapi.annotations.TextType;
import com.provar.core.testapi.annotations.SteelBrickBy.Facet;

@SalesforcePage( title="Agreement VF__sb"                                
, summary=""
, page="sb"
, namespacePrefix="SBQQ"
, object=""
, connection="SalesUser"
		)             
public class agreementVF__sb {
	public WebDriver driver;
	public agreementVF__sb(WebDriver driver){
		this.driver=driver;
	}



	@PageRow()
	public static class ProductSelectionLines {

		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelectorAll('sb-table-row')[2].shadowRoot.querySelector('sb-group').shadowRoot.querySelector('sb-table-cell-select').shadowRoot.querySelector('paper-checkbox').shadowRoot.querySelector('div')")
		public WebElement checkbox;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelectorAll('sb-table-row')[1].shadowRoot.querySelector('sb-group').shadowRoot.querySelector('sb-table-cell-select').shadowRoot.querySelector('paper-checkbox').shadowRoot.querySelector('div')")
		public WebElement checkbox2;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-product-lookup').shadowRoot.querySelector('#lookupLayout').shadowRoot.querySelectorAll('#tableRow')[1].shadowRoot.querySelector('#selection').shadowRoot.querySelector('#g > div > sb-table-cell-select').shadowRoot.querySelector('#checkbox').shadowRoot.querySelector('#checkboxContainer')")
		public WebElement checkbox1;

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelector('sb-table-row').shadowRoot.querySelectorAll('sb-group')[1]")
		public WebElement expandArrowbtn;
		@BooleanType()
		@SteelBrickBy(fieldSetTableItem = "checkbox")
		public WebElement checkbox4;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelector('sb-table-row').shadowRoot.querySelectorAll('sb-group')[1]")
		public WebElement Row1Expand;
//		@BooleanType()
//		@FindBy(xpath = "//sb-table-row[@name='Basic Card Payments – Standard Card Fields']//sb-group[@id='selection']//sb-table-cell-select//paper-checkbox[@id='checkbox']//div[@id='checkboxContainer']")
//		public WebElement checkbox2;
		@BooleanType()
		@FindBy(xpath = "//sb-table-row[@name='Basic Card Payments – Standard Card Fields']//sb-group[@id='selection']//sb-table-cell-select//paper-checkbox[@id='checkbox']//div[@id='checkboxContainer']")
		public WebElement checkbox3;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelectorAll('sb-table-row')[9].shadowRoot.querySelector('sb-group').shadowRoot.querySelector('sb-table-cell-select').shadowRoot.querySelector('paper-checkbox').shadowRoot.querySelector('div')")
		public WebElement checkbox8;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelectorAll('sb-table-row')[11].shadowRoot.querySelectorAll('sb-group')[1]")
		public WebElement Expand_Row1;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelectorAll('sb-table-row')[2].shadowRoot.querySelector('sb-group').shadowRoot.querySelector('sb-table-cell-select').shadowRoot.querySelector('paper-checkbox').shadowRoot.querySelector('div')")
		public WebElement checkbox_3;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelectorAll('sb-table-row')[3].shadowRoot.querySelector('sb-group').shadowRoot.querySelector('sb-table-cell-select').shadowRoot.querySelector('paper-checkbox').shadowRoot.querySelector('div')")
		public WebElement checkbox_31;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelectorAll('sb-table-row')[10].shadowRoot.querySelectorAll('sb-group')[1]")
		public WebElement ElobrateRow1;
		@BooleanType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelectorAll('sb-table-row')[4].shadowRoot.querySelector('sb-group').shadowRoot.querySelector('sb-table-cell-select').shadowRoot.querySelector('paper-checkbox').shadowRoot.querySelector('div')")
		public WebElement checkbox_4;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelector('sb-table-row').shadowRoot.querySelectorAll('sb-group')[1].shadowRoot.querySelector('sb-table-cell').shadowRoot.querySelector('sb-field').shadowRoot.querySelectorAll('span')[1]")
		public WebElement AcceptPayment;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelector('sb-table-row').shadowRoot.querySelectorAll('sb-group')[1].shadowRoot.querySelector('sb-table-cell').shadowRoot.querySelector('sb-field').shadowRoot.querySelectorAll('span')[1]")
		public WebElement Stremaline_Operations;	
	}
	@SteelBrickBy(locatorType = "XPath", pageTableRow = "//sb-lookup-layout[@id=\"lookupLayout\"]")
	@PageTable(firstRowContainsHeaders = false, row = ProductSelectionLines.class)
	public List<ProductSelectionLines> productSelectionLines;



	@PageRow()
	public static class Group1Lines {

//		@TextType()
//		@SteelBrickBy(pageGroupName = "Group1", fieldSetTableItem = "X1st_Txn_Act_Date__c")
//		public WebElement x1StTxnActDateC;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div:nth-child(5) > div')")
		public WebElement _StTxnActDateC;
//		@TextType()
//		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelectorAll('span')[4]")
//		public WebElement oFShareOfVolumeC;
//		@TextType()
//		@FindBy(xpath = "//sf-le-table-row[1]//div[6]/div")
//		public WebElement oFShareOfVolumeC1;
//		@TextType()
//		@FindBy(xpath = "//sf-le-table-row[1]//div[6]")
//		public WebElement oFShareOfVolumeC2;
//		@TextType()
//		@FindBy(xpath = "//sf-le-table-row[1]//div[6]/div")
//		public WebElement oFShareOfVolumeC3;
//		@TextType()
//		@FindBy(xpath = "//sf-le-table-row[1]//sb-input//input[@id='myinput']")
//		public WebElement oFShareOfVolumeC4;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row[1]//div[6]")
		public WebElement oFShareOfVolumeC5;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row[1]//div[6]/div")
		public WebElement oFShareOfVolumeC6;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row[1]//div[6]")
		public WebElement oFShareOfVolumeC7;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelectorAll('div')[13]")
		public WebElement oFShareOfVolumeC8;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row[1]//sb-input//input[@id='myinput']")
		public WebElement oFShareOfVolumeC9;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement oFShareOfVolumeC10;
//		@TextType()
//		@FindBy(xpath = "//sf-le-table-row[1]//sb-input//input[@id='myinput']")
//		public WebElement oFShareOfVolumeC11;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[1].shadowRoot.querySelectorAll('div')[13]")
		public WebElement oFShareOfVolumeC12;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row[2]//sb-input//input[@id='myinput']")
		public WebElement oFShareOfVolumeC13;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[1].shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement oFShareOfVolumeC14;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[2].shadowRoot.querySelectorAll('div')[13]")
		public WebElement oFShareOfVolumeC15;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row[3]//div[6]/div")
		public WebElement oFShareOfVolumeC16;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[2].shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement oFShareOfVolumeC17;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row[3]//sb-input//input[@id='myinput']")
		public WebElement oFShareOfVolumeC18;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row[3]//sb-input//input[@id='myinput']")
		public WebElement oFShareOfVolumeC19;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[2].shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement oFShareOfVolumeC20;
//		@TextType()
//		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[2].shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
//		public WebElement oFShareOfVolumeC21;
//		@TextType()
//		@FindBy(xpath = "//sf-le-table-row[3]//sb-input//input[@id='myinput']")
//		public WebElement oFShareOfVolumeC22;
//		@TextType()
//		@FindBy(xpath = "//sf-le-table-row[3]//div[8]")
//		public WebElement takeRateC;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row[1]//sb-input//input[@id='myinput']")
		public WebElement oFShareOfVolumeC23;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelectorAll('div')[12]")
		public WebElement oFShareOfVolumeC24;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row[1]//div[6]/div")
		public WebElement oFShareOfVolumeC25;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row[1]//sb-input//input[@id='myinput']")
		public WebElement oFShareOfVolumeC26;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement oFShareOfVolumeC27;
		@TextType()
		@SteelBrickBy(pageGroupName = "Group1", fieldSetTableItem = "OF_Share_of_Volume__c")
		public WebElement oFShareOfVolumeC28;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[2].shadowRoot.querySelectorAll('div')[13]")
		public WebElement oFShareOfVolumeC29;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[1].shadowRoot.querySelectorAll('div')[12]")
		public WebElement oFShareOfVolumeC30;
		@TextType()
		@SteelBrickBy(pageGroupName = "Group1", fieldSetTableItem = "OF_Share_of_Volume__c")
		public WebElement oFShareOfVolumeC31;
		@TextType()
		@SteelBrickBy(pageGroupName = "Group1", fieldSetTableItem = "OF_Share_of_Volume__c")
		public WebElement oFShareOfVolumeC32;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement SOW1SetValue;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.editMode.sf-has-focus > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement SOW2SetValue;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(11)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.editMode.sf-has-focus > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement SOW3SetValue;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.editMode.sf-has-focus > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
        public WebElement SOW3SetValue_APMs;

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[2].shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement takeRate3;

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(15)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.editMode.sf-has-focus > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement SOW4SetValue;
		
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(19)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.editMode.sf-has-focus > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement SOW5SetValue;
		
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(23)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.editMode.sf-has-focus > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement SOW6SetValue;
		
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(27)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.editMode.sf-has-focus > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement SOW7SetValue;

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[3].shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement takeRateVT;

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div:nth-child(8)')")
		public WebElement takeRateCTry;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.sf-has-focus.editMode > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement takeRateCTryInput;

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.editMode.sf-has-focus > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement TakeRateTable1Row2Input;
		
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(3)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.editMode.sf-has-focus > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement TakeRateTable1Row1Input;
		
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(15)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.editMode.sf-has-focus > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement TakeRateTable1Row4Input;
		
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(27)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.editMode.sf-has-focus > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement TakeRateTable1Row7Input;
		
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelectorAll('sb-le-group')[1].shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement SOWTable2Row1Input;
		
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelectorAll('sb-le-group')[1].shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement TakeRateTable2Row1Input;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row//div[6]")
		public WebElement oFShareOfVolumeC;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row//div[6]//span")
		public WebElement oFShareOfVolumeC1;
		@TextType()
		@FindBy(xpath = "//input[@id='myinput']")
		public WebElement oFShareOfVolumeC2;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelectorAll('span')[4]")
		public WebElement oFShareOfVolumeC11;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelectorAll('span')[4]")
		public WebElement oFShareOfVolumeC111;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement oFShareOfVolumeC21;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.sf-has-focus.editMode > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement oFShareOfVolumeC22;
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(11)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.editMode.sf-has-focus > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement oFShareOfVolumeC23_Basic;
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(15)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.sf-has-focus.editMode > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement oFShareOfVolumeC_SetVT;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelectorAll('div')[13]")
		public WebElement oFShareOfVolumeC3;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div:nth-child(6)')")
		public WebElement oFShareOfVolumeC4;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(11)').shadowRoot.querySelector('#content > div > div:nth-child(6)')")
		public WebElement oFShareOfVolumeC_Basic;
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(15)').shadowRoot.querySelector('#content > div > div:nth-child(6)')")
		public WebElement oFShareOfVolumeC_VT;                    
		@TextType()
		@FindBy(xpath = "//sf-le-table-row//sb-input//input[@id='myinput']")
		public WebElement takeRateC;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelectorAll('span')[4]")
		public WebElement oFShareOfVolumeCRow1;
		@TextType()
		@FindBy(xpath = "//sf-le-table-row[1]//div[5]/div")
		public WebElement x1StTxnActDateC;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelectorAll('div')[11]")
		public WebElement x1StTxnActDateC1;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelector('sb-datepicker').shadowRoot.querySelector('input')")
		public WebElement x1StTxnActDateC11;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement oFShareOfVolumeR1;
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelector('sb-lookup-layout').shadowRoot.querySelector('sb-table-row').shadowRoot.querySelectorAll('sb-group')[1]")
		public WebElement ExpandRow1;
		@ButtonType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelector('sf-line-actions').shadowRoot.querySelectorAll('button')[2]")
		public WebElement deleteLine2;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[2].shadowRoot.querySelector('sb-datepicker').shadowRoot.querySelector('input')")
		public WebElement x1StTxnActDateC2;
	}
	@SteelBrickBy(locatorType = "XPath", pageGroupName = "Group1", pageTableRow = "//sf-standard-table[@id=\"standardLines\"]")
	@PageTable(firstRowContainsHeaders = false, row = Group1Lines.class)
	public List<Group1Lines> group1Lines;

	@PageRow()
	public static class Group1Lines1 {

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[1].shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement takeRate2;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelectorAll('sf-le-table-row')[2].shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement takeRate3;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div:nth-child(8)')")
		public WebElement takeRateCTry;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#groupLayout').shadowRoot.querySelector('#Group_2').shadowRoot.querySelector('#standardLines').shadowRoot.querySelector('#droppableStandardRows > sf-le-table-row:nth-child(7)').shadowRoot.querySelector('#content > div > div.container.td.sf-le-table-cell.sf-le-table-row.focusable.right.editable.sf-has-focus.editMode > div.w > div > sb-input').shadowRoot.querySelector('#myinput')")
		public WebElement takeRateCTryInput;
		@TextType()
		@FindBy(xpath = "//input[@id='myinput']")
		public WebElement takeRateC;
		@TextType()
		@FindBy(xpath = "//input[@id='myinput']")
		public WebElement takeRateC1;
		@ButtonType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelector('sf-line-actions').shadowRoot.querySelectorAll('button')[2]")
		public WebElement deleteLine;
		@ChoiceListType()
		@FindBy(xpath = "//select[@id='myselect']")
		public WebElement pipelineMotionC;
	}
	@SteelBrickBy(locatorType = "XPath", pageGroupName = "Group1", pageTableRow = "//sf-standard-table[@id=\"standardLines\"]")
	@PageTable(firstRowContainsHeaders = false, row = Group1Lines1.class)
	public List<Group1Lines1> group1Lines1;
//	@ButtonType()
//	@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelectorAll('sb-i18n')[3]")
//	public WebElement select1;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelectorAll('sb-i18n')[3]")
	public WebElement select;
	@ButtonType()
	@FindBy(xpath = "//paper-button[@id='plSelect']")
	public WebElement select1;
//	@TextType()
//	@FindBy(xpath = "//sb-field-set-table-item[2]//sb-field[@id='field']//sb-input//input[@id='myinput']")
//	public WebElement addressableVolume;
//	@ButtonType()
//	@SteelBrickBy(customAction = "Quick Save")
//	public WebElement quickSave1;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelectorAll('sb-custom-action')[8].shadowRoot.querySelector('paper-button').shadowRoot.querySelector('slot')")
	public WebElement quickSave1;
//	@TextType()
//	@FindBy(xpath = "//sb-field-set-table-item[2]//sb-field[@id='field']//sb-input//input[@id='myinput']")
//	public WebElement addressableVolume1;
	@TextType()
	@FindBy(xpath = "//sb-field-set-table-item[3]//sb-field[@id='field']//sb-input//input[@id='myinput']")
	public WebElement accountETOV1;
//	@ButtonType()
//	@FindBy(xpath = "//sb-custom-action[@name='Save']//paper-button[@id='mainButton']")
//	public WebElement save1;
//	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelectorAll('sb-custom-action')[10].shadowRoot.querySelector('paper-button').shadowRoot.querySelector('slot')")
	public WebElement save1;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#actions > sb-custom-action:nth-child(11)').shadowRoot.querySelector('#mainButton')")
	public WebElement save;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#actions > sb-custom-action:nth-child(12)').shadowRoot.querySelector('#mainButton')")
	public WebElement save_and_return_to_opportunity;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelectorAll('sb-custom-action')[8].shadowRoot.querySelector('paper-button').shadowRoot.querySelector('slot')")
	public WebElement quickSave;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sb-field-set-table').shadowRoot.querySelector('sb-group').shadowRoot.querySelectorAll('sb-field-set-table-item')[1].shadowRoot.querySelector('sb-field').shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
	public WebElement addressableVolume;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelector('sb-le-group').shadowRoot.querySelector('sb-field-set-table').shadowRoot.querySelector('sb-group').shadowRoot.querySelectorAll('sb-field-set-table-item')[2].shadowRoot.querySelector('sb-field').shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
	public WebElement accountETOV;
//	@TextType()
//	@FindBy(xpath = "//sb-field-set-table-item[3]//sb-field[@id='field']//sb-input//input[@id='myinput']")
//	public WebElement accountETOV;
	@TextType()
	@FindBy(xpath = "//sb-le-group[@id='Group_3']//sb-field-set-table//sb-group[@id='firstColumn']//sb-field-set-table-item[2]//sb-field[@id='field']//sb-input//input[@id='myinput']")
	public WebElement addressableVolume2;
	@TextType()
	@FindBy(xpath = "//sb-le-group[@id='Group_3']//sb-field-set-table//sb-group[@id='firstColumn']//sb-field-set-table-item[3]//sb-field[@id='field']//sb-input//input[@id='myinput']")
	public WebElement accountETOV11;
	@TextType()
	@FindBy(xpath = "//sb-le-group[@id='Group_4']//sb-field-set-table//sb-group[@id='firstColumn']//sb-field-set-table-item[2]//sb-field[@id='field']//sb-input//input[@id='myinput']")
	public WebElement addressableVolume3;
	@TextType()
	@FindBy(xpath = "//sb-le-group[@id='Group_4']//sb-field-set-table//sb-group[@id='firstColumn']//sb-field-set-table-item[3]//sb-field[@id='field']//sb-input//input[@id='myinput']")
	public WebElement accountETOV3;
	@TextType()
	@FindBy(xpath = "//sb-search-bar[@id='headersearch']//sb-typeahead[@id='typeahead']//input[@id='itemLabel']")
	public WebElement searchProducts;
//	@TextType()
//	@SteelBrickBy(fieldSetTableItem = "itemLabel")
//	public WebElement searchProducts;
	@TextType()
	@FindBy(xpath = "//sb-search-bar[@id='headersearch']//sb-typeahead[@id='typeahead']//input[@id='itemLabel']")
	public WebElement searchProducts1;
	@ButtonType()
	@FindBy(xpath = "//sb-le-group[@id='Group_2']//sb-custom-action[@name='Add Products']//paper-button[@id='mainButton']//slot")
	public WebElement addProducts;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelectorAll('sb-i18n')[4]")
	public WebElement selectAndAddMore;
	@ButtonType()
	@FindBy(xpath = "//sb-search-bar[@id='headersearch']//paper-button[@id='search']")
	public WebElement search;
	@ButtonType()
	@FindBy(xpath = "//sb-page-container[@id='sbPageContainer']//sb-product-lookup/slot/sb-i18n")
	public WebElement selectAndAddMore1;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-product-lookup').shadowRoot.querySelectorAll('sb-i18n')[4]")
	public WebElement selectAndAddMore2;
	@BooleanType()
	@FindBy(xpath = "//sb-table-row[@name='Fastlane with Integration Methods']//sb-group[@id='selection']//sb-table-cell-select//paper-checkbox[@id='checkbox']//div[@id='checkboxContainer']")
	public WebElement checkbox_FastLane;
	public void ShadowDOMElementClick(String JSPath) throws InterruptedException{ 

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Execute JavaScript code to simulate copy and paste
		js.executeScript("var copyText = 'Text to copy';" +
				"var tempInput = document.createElement('textarea');" +
				"tempInput.value = copyText;" +
				"document.body.appendChild(tempInput);" +
				"tempInput.select();" +
				"document.execCommand('copy');" +
				"document.body.removeChild(tempInput);" +
				"console.log('Text copied: ' + copyText);");


		Thread.sleep(2000);

		JavascriptExecutor je =(JavascriptExecutor)driver;
		WebElement Ele = (WebElement) je.executeScript(JSPath);

		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Ele);
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Ele);

		Thread.sleep(2000); 
	}


	@BooleanType()
	@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-field-set-table').shadowRoot.querySelectorAll('sb-group')[1].shadowRoot.querySelectorAll('sb-field-set-table-item')[2].shadowRoot.querySelector('sb-field').shadowRoot.querySelector('sb-checkbox').shadowRoot.querySelector('paper-checkbox').shadowRoot.querySelector('div')")
	public WebElement bypassCountryValidation;

	@PageRow()
	public static class Group2Lines {

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('sb-page-container').shadowRoot.querySelector('sb-line-editor').shadowRoot.querySelector('sb-le-group-layout').shadowRoot.querySelectorAll('sb-le-group')[1].shadowRoot.querySelector('sf-standard-table').shadowRoot.querySelector('sf-le-table-row').shadowRoot.querySelector('sb-input').shadowRoot.querySelector('input')")
		public WebElement SOWTable2Row1Input;
	}

	@SteelBrickBy(locatorType = "XPath", pageGroupName = "Group2", pageTableRow = "//sf-standard-table[@id=\"standardLines\"]")
	@PageTable(firstRowContainsHeaders = false, row = Group2Lines.class)
	public List<Group2Lines> group2Lines;
	@ButtonType()
	@FindBy(xpath = "//sb-custom-action[@name='Save & Return']//paper-button[@id='mainButton']//slot")
	public WebElement saveAndReturn;
	@ButtonType()
	@SteelBrickBy(customAction = "Save")
	public WebElement Save_ReturnToDeal;
	@TextType()
	@SteelBrickBy(fieldSetTableItem = "Estimate_of_Total_Online_Volume__c")
	public WebElement addressableOpportunityVolumeLocal;
	@ButtonType()
	@SteelBrickBy(customAction = "Save & Return")
	public WebElement saveAndReturntoOpportunity;
	
	@FindBy(xpath = "//div[@field='Estimate_TM__c']")
	public WebElement Cloumn_TM;

	public String assertTM() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		String text = (String) je.executeScript("return arguments[0].innerText;", Cloumn_TM);
		return text;

	}

	@FindBy(xpath = "//div[@id='content']/div[@class='row']//div[@field='Estimate_TM__c']/div[@class='r']")
	public WebElement Column_TM_Value;

	public boolean assert_tm_value() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		String text = (String) je.executeScript("return arguments[0].innerText;", Column_TM_Value);
		if (text.equalsIgnoreCase("")) {
			return false;
		}

		String t = text.split("%")[0];
		float f = Float.valueOf(t);
		int val = Math.round(f);

		if (val > 0) {
			return true;
		}
		return false;

	}


	@TextType()
	@FindBy(xpath = "//div[@id='messages']/sb-toast//h2")
	public WebElement pageErrors;
	@ButtonType()
	@FindBy(xpath = "//sb-custom-action[@name='Add Products']//paper-button[@id='mainButton']")
	public WebElement addProducts1;


}
