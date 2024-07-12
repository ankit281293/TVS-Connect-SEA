package tvsframework.pageobjects.android;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class XPAddVehicle extends AndroidActions {

	AndroidDriver driver;
	public XPAddVehicle ( AndroidDriver driver) {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
	
@AndroidFindBy()	
	
}
