package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class SeReRideDetails extends AndroidActions {

	AndroidDriver driver;

	public SeReRideDetails(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Rincian Berkendara']")
	private WebElement ridedetailsmenu;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tinjauan']")
	private WebElement btnsurvey;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Informasi Berkendara Terakhir']")
	private WebElement btnlastrideinfo;

	public void ridedetailscheck() {
		ridedetailsmenu.click();
		btnsurvey.click();
		btnlastrideinfo.click();
		bckHomePage();
	}

//	public void rideDetailsBackBtn() {
//	bckHomePage();	
//	}
//	
}