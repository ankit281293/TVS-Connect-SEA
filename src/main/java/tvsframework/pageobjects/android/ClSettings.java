package tvsframework.pageobjects.android;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class ClSettings extends AndroidActions {

	AndroidDriver driver;

	public ClSettings(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	private WebElement clsettingsmenu;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"   General    \"]/android.widget.TextView")
	private WebElement clgeneralsettings;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/switch_autoreply")
	private WebElement clautoreplybtn;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/switch_dnd")
	private WebElement cldndbtn;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/switch_bluetooth")
	private WebElement clbluetoothmanualbtn;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/switch_speedalert")
	private WebElement clhighspeedbtn;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/manage_address")
	private WebElement clmanageadress;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/switch_speedalert")
	private WebElement clhighspeedalertbtn;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/tv_nickname")
	private WebElement clvehiclename;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/tv_regno")
	private WebElement clresgistrationnumber;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/imageView_setting_save")
	private WebElement clsavesettingsbtn;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/distance_seekbar")
	private WebElement cldistanceseekbar;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	private WebElement clseekbarbtn;

	public void clSettingsMenuClick() {
		clsettingsmenu.click();
		clgeneralsettings.click();
		clautoreplybtn.click();
		cldndbtn.click();
		clbluetoothmanualbtn.click();
		clsavesettingsbtn.click();
		
	}

	public void clhighSpeedAlertBtnClick() {
		clhighspeedalertbtn.click();
		drag(cldistanceseekbar);
		clseekbarbtn.click();
	}

	public void clVehicleNameSet() {
		clvehiclename.sendKeys("ankitcallisto");
		clresgistrationnumber.sendKeys("UK07");
		clsavesettingsbtn.click();

	}

}
