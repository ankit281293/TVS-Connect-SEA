package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class EditProfile extends AndroidActions {
	AndroidDriver driver;

	public EditProfile(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Profil saya']")
	private WebElement editprofilebtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sunting profil']")
	private WebElement editdetailsbtn;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.tvsm.connect.southeastasia:id/frame']/android.widget.ImageView[2]")
	private WebElement profilepic;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/imgview_gallery")
	private WebElement selectgallery;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Photo taken on 19 Feb 2024, 4:10:39 pm\"]")
	private WebElement selectimage;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/crop_image_menu_crop")
	private WebElement cropimage;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/edt_fullname")
	private WebElement editnamebtn;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/edtcity")
	private WebElement editcitybtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='MENYIMPAN']")
	private WebElement saveprofilebtn;

	@AndroidFindBy(id = "android:id/button1")
	private WebElement updateprofilebtn;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[3]")
	private WebElement deleteAccount;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/etOtherReason")
	private WebElement deletereason;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/deleteAccount")
	private WebElement deleteaccountbtn;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement doneeditbtn;
	

	public void editProfileClick() {
		editprofilebtn.click();
		deleteAccount.click();

	}
	
	public void deleteReasonClick() {
		deletereason.sendKeys("I am deleting my account");
		deleteaccountbtn.click();
		
	}
	// 
	
	public void editdetails() {
		editdetailsbtn.click();
		editnamebtn.sendKeys("newuser");
		editcitybtn.sendKeys("Newcity");
		saveprofilebtn.click();
		doneeditbtn.click();
		
		
    

}
}
