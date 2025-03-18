package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Apttus__ Offline Document Import"                                
               , summary=""
               , page="OfflineDocumentImport"
               , namespacePrefix="Apttus"
               , object="Apttus__APTS_Agreement__c"
               , connection="SystemAdmin"
     )             
public class apttus__OfflineDocumentImport {

	@ButtonType(file = true)
	@VisualforceBy(componentXPath = "apex:inputFile[@value = \"{!filebody}\"]")
	public WebElement ChooseFile;
	
}
