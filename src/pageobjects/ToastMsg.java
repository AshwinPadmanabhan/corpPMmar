package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Toast Msg"                                
     , summary=""
     , relativeUrl=""
     , connection="CSM_SalesUser"
     )             
public class ToastMsg {
@FindBy(xpath = "//button[@title='Close']")

public WebElement closee;
			

@PageFrame()

public static class Frame{

@TextType()

@FindBy(xpath = "//button[@title='Close']")

public WebElement close;

}

@FindBy(xpath = "//iframe[@title='accessibility title']")

public Frame frame;
@ButtonType()
@JavascriptBy(jspath = "return document.querySelector('span:nth-child(3) > button')")
public WebElement closeeNeww;

}