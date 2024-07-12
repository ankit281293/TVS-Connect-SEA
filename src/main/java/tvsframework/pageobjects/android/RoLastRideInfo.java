package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

	 public class RoLastRideInfo extends AndroidActions {

	 AndroidDriver driver;
	 public RoLastRideInfo ( AndroidDriver driver) {
	 super(driver);
	 this.driver=driver;
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]") 
	private WebElement rolastrideinfomenu;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Riding Patterns']")
	private WebElement roridepatterns;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/racemode_distance_btn")
	private WebElement ro_racemode_distbace_btn;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/gearModeDistance_btn")
	private WebElement ro_gearmode_btn;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/rpm_btn")
	private WebElement ro_rpmbtn;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/u399_more_button")
	private WebElement ro_shareridebtn;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/rpm_btn")
	private WebElement rorpmbtn;
	
	public void roLastRideInfoClick() {
	rolastrideinfomenu.click();
	roridepatterns.click();
	ro_racemode_distbace_btn.click();
	ro_gearmode_btn.click();
	}
	
	public void roRpmBtnClick() {
	rorpmbtn.click();	
	}
}
