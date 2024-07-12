package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;


	public class RoSettings extends AndroidActions {
		
		AndroidDriver driver;
		public RoSettings ( AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		} 

	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")
	 private WebElement rosettingsmenu;
	
	 @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/nav_img")
	 private WebElement rovehicleinfo;
	
	 @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/edRegistrationNo")
	 private WebElement roregistration;
	
	 @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/edBikeNickName")
	 private WebElement ronickname;
	
	 @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/tv_save")
	 private WebElement rosaveinfobtn;
	 
	 @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/nav_img_voice_assist")
	 private WebElement rovoiceassist;
	 
	 @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/btnSave")
	 private WebElement rosavevoiceassistbtn;
	
	 @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/iv_over_speed")
	 private WebElement rooverspeedbtn;
	 
	 @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/iv_do_not_disturb")
	 private WebElement rodndbtn;
	 
	 @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/iv_auto_reply_sms")
	 private WebElement roautoreplybtn;
	
	 @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/btnSave")
	 private WebElement rosavesettingsbtn;
	 
	 public void roSettingsMenuClick() {
	 rosettingsmenu.click();
	 rovehicleinfo.click();
	 roregistration.sendKeys("UKO788");
	 ronickname.sendKeys("AnkitRonin");
	 rosaveinfobtn.click();
	 rovoiceassist.click();
	 rosavevoiceassistbtn.click();
	 rooverspeedbtn.click();
	 rodndbtn.click();
	 roautoreplybtn.click();
	 rosavesettingsbtn.click();	 		 
	 }
	
	 }
