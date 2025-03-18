package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Activity_Aggregator"                                
     , summary=""
     , relativeUrl=""
     , connection="SystemAdmin"
     )             
public class Activity_Aggregator {

	@LinkType()
	@FindBy(xpath = "//a[contains(text(),'Activity Aggregator')]")
	public WebElement activityAggregator;
			
}
