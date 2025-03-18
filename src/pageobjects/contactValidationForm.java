package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="contactValidationForm"                                
               , summary=""
               , connection="SalesUser"
               , lightningWebComponent="contactValidationForm"
               , namespacePrefix=""
     )             
public class contactValidationForm {

	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//input[@name='MailingPostalCode']")
	public WebElement WorldReadyMailingZipPostalCodeInput;
	@TextType()
	@FindBy(xpath = ".//c-contact-validation-form//label[normalize-space(.)='Mailing Zip/Postal Code']/following::p[1]")
	public WebElement WorldReadyMailingZipError;
	
}
