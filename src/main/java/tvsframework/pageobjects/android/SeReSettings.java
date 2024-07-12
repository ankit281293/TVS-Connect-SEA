package tvsframework.pageobjects.android;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class SeReSettings extends AndroidActions {
	
	String[] myString1 = new String[2];

	AndroidDriver driver;
	public SeReSettings ( AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pengaturan']")
	private WebElement settingsmenu;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/iv_do_not_disturb")
	private WebElement dndbtn;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/iv_auto_reply_sms")
	private WebElement autoreplybtn;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/iv_over_speed")
	private WebElement overspeedbtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	private WebElement speedalertbtn;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/switch_manual_connect")
	private WebElement manualconnectbtn;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/et_bikeName")
	private WebElement vehiclename;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Tambahkan nomor polisi']")
	private WebElement registrationnumber;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='MENYIMPAN']")
	private WebElement savebtn;
	

	public String setSettings() {
	settingsmenu.click();
	dndbtn.click();
	autoreplybtn.click();
	overspeedbtn.click();
	speedalertbtn.click();
	manualconnectbtn.click();
	vehiclename.sendKeys("nickname");
	return getPageTitle();
	}

   public void saveBtnClick() {
   savebtn.click();
	}	
    }


		
	
	
	
