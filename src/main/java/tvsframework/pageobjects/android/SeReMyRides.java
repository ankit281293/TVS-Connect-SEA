
package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class SeReMyRides extends AndroidActions {

	
	AndroidDriver driver;
	public SeReMyRides ( AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Perjalanan Saya']")
	private WebElement myRidesMenu;
	
//	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/tvLeftHeader")
//	private WebElement getMyRidesTitle;
	
	public String myRidesCheck() {
	myRidesMenu.click();
	return getPageTitle();	
	}
	}