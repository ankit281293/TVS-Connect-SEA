package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class RoOverview extends AndroidActions {

	AndroidDriver driver;
	public RoOverview ( AndroidDriver driver) {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='TVS RONIN']/..[@resource-id='com.tvsm.connect.southeastasia:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.southeastasia:id/up_down_arrows']")
	private WebElement  selectrovehicle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='RONIN']/..[@resource-id='com.tvsm.connect.southeastasia:id/img_main_header']/following-sibling::android.widget.ImageView")
	private WebElement roexpandbtn;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")
	private WebElement rooverviewmenu;	
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/image_total_distance")
	private WebElement rototaldst;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/image_ride_distance")
	private WebElement roridedst;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/image_tour_distance")
	private WebElement rotourdst;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Riding Patterns']")
	private WebElement roridepatterns;
		
	public void selectRoVehicleBtn() {           
	selectrovehicle.click();	
	}
	
	public void roVehicleOverviewclick() {
	roexpandbtn.click();
	rooverviewmenu.click();
	rototaldst.click();
	roridedst.click();
	rotourdst.click();
	roridepatterns.click();	
	}
	
	



}
