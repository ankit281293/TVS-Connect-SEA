package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class HamburgerOptions extends AndroidActions{
	AndroidDriver driver;
	public HamburgerOptions ( AndroidDriver driver) {
		super (driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Informasi Darurat']")
	private WebElement infoMenu;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/spn_blood_grp")
	private WebElement bloodGrpList;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='O+']")
	private WebElement bloodGrp;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/input_alergic")
	private WebElement alergyData;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/edt_alergic")
	private WebElement alergyDataValue;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/tvSubmit")
	private WebElement submitBtn;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/tvSkip")
	private WebElement skipBtn;

//    
//    @AndroidFindBy(xpath="//android.widget.TextView[@text='Tanggapan']")
//    private WebElement feedBackOption;
//    
//    @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/edtmsg")
//    private WebElement feedBackMsgBox;
//	
//    @AndroidFindBy(xpath="//android.widget.LinearLayout[2]/android.widget.TextView")
//    private WebElement submitFeedbackBtn;
//    
//    @AndroidFindBy(xpath="//android.widget.TextView[@text='OK']")
//    private WebElement FeedbackSubmitOkBtn; 
    
    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Keluar']")
    private WebElement logoutBtn;
    
    @AndroidFindBy(id= "android:id/button1")
    private WebElement logoutYes;
    
    
	public void infoMenuClick() {
	infoMenu.click();
	}
	
	
	public void infoMenuField() {
	bloodGrpList.click();
	bloodGrp.click();
	alergyData.click();
	alergyDataValue.sendKeys("Medicine");	
	driver.hideKeyboard();
	submitBtn.click();
	}
	
	
	public void skipBtnClick() {
	skipBtn.click();	
	}
	
	
    
	public void LogoutUser() {
	logoutBtn.click();
	logoutYes.click();	
	}
    
	}
    
