package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class ReAddVehicles extends AndroidActions {

	AndroidDriver driver;
	public ReAddVehicles ( AndroidDriver driver) {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.ImageView[4]")
	private WebElement selectReVehicle;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout[@resource-id='com.tvsm.connect.southeastasia:id/rel']/following-sibling::android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[@resource-id='com.tvsm.connect.southeastasia:id/img_main_header']/android.widget.ImageView[@resource-id='com.tvsm.connect.southeastasia:id/background_image_bike']")
	private WebElement ReExpandBtn;
	
	public void selectReVehicleBtn() {
	selectReVehicle.click();	
	}
	
	public void ReExpandBtnClick() {
	ReExpandBtn.click();
	}
}