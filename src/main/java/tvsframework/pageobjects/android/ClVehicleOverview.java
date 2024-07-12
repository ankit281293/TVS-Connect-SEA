package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class ClVehicleOverview extends AndroidActions {
	AndroidDriver driver;

	public ClVehicleOverview(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Callisto ZX']/..[@resource-id='com.tvsm.connect.southeastasia:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.southeastasia:id/up_down_arrows']")
	private WebElement selectClvehicle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Vehicle Overview']")
	private WebElement vehicleoverviewmenu;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Callisto ZX']/..[@resource-id='com.tvsm.connect.southeastasia:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.southeastasia:id/up_down_arrows']")
	private WebElement clexpandbtn;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/ivDialogBack_u532overview")
	private WebElement cloverviewbackbtn;

	public void selectClvehicleBtn() {
		selectClvehicle.click();
	}

	public void clExpandBtnClick() {
		clexpandbtn.click();
		vehicleoverviewmenu.click();
		cloverviewbackbtn.click();
	}

//    public void cloverviewmenuclk() {
//    vehicleoverviewmenu.click();	
//    }

}
