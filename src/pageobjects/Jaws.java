package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Jaws"                                
     , summary=""
     , relativeUrl=""
     , connection="Jaws"
     )             
public class Jaws {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Create User Account']")
	public WebElement createUserAccount;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Create User Account']")
	public WebElement Header_CreatnewAccount;
	@ButtonType()
	@FindBy(xpath = "//button[@id='create_account']")
	public WebElement createAccount;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='User Account']")
	public WebElement Header_UserAccount;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Success']")
	public WebElement ResponseStatus;
	@TextType()
	@FindBy(xpath = "//span[contains(.,'User Account #')]/parent::div/following-sibling::div//../span[contains(@class,'text')]")
	public WebElement UserAccount;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='OK']")
	public WebElement oK;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Create Bank']")
	public WebElement createBank;
	@TextType()
	@FindBy(xpath = "//div/span[normalize-space(.)='Create Bank']")
	public WebElement Header_CreateBank;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Do you want to associate this bank to an existing user?']")
	public WebElement doYouWantToAssociateThisBankToAnExistingUser;
	@TextType()
	@FindBy(xpath = "//input[@id='TextField280']")
	public WebElement userAccount;
	@ButtonType()
	@FindBy(xpath = "//button[@id='create_bank']")
	public WebElement createBank1;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Bank Account']")
	public WebElement Header_BankAccount;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Bank Account #')]/following::span/span[1]")
	public WebElement BankAccount;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='User Account #']/following-sibling::div//input")
	public WebElement userAccount1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Create Card']")
	public WebElement createCard;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Do you want to associate this card to an existing user?']")
	public WebElement doYouWantToAssociateThisCardToAnExistingUser;
	@ButtonType()
	@FindBy(xpath = "//button[@id='create_card']")
	public WebElement createCard1;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Card Details']")
	public WebElement HeaderCArd;
	@TextType()
	@FindBy(xpath = "//span[contains(.,'Email')]/parent::div/following-sibling::div//../span[contains(@class,'text')]")
	public WebElement EmailAddress;
	@TextType()
	@FindBy(xpath = "//span[contains(.,'Bank Account #')]/parent::div/following-sibling::div//../span[contains(@class,'text')]")
	public WebElement BankAccountNumber;
	@TextType()
	@FindBy(xpath = "//span[contains(.,'First Name')]/parent::div/following-sibling::div//../span[contains(@class,'text')]")
	public WebElement FirstName;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Advanced Options']")
	public WebElement advancedOptions;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Add Custom Mobile Phone']//i[normalize-space(.)='']")
	public WebElement AddCustomPhone;
	@TextType()
	@FindBy(xpath = "//input[@id='TextField212']")
	public WebElement phoneTextbox;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Add Custom Email']//i[normalize-space(.)='']")
	public WebElement AddCustomEmail;
	@TextType()
	@FindBy(xpath = "//input[@id='EmailAddress']")
	public WebElement typeCustomEmail;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Add Custom Mobile Phone']/parent::div/following-sibling::div//input")
	public WebElement CustomPhoneNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Account Type']/following-sibling::div//input")
	public WebElement selectAccountType;
			
}
