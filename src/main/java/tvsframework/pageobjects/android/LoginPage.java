package tvsframework.pageobjects.android;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class LoginPage extends AndroidActions {

	AndroidDriver driver;
	public LoginPage ( AndroidDriver driver) {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/button_continue")
	private WebElement loginBtn;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement yesregistrationbtn;
	
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/edt_fullname")
	private WebElement signupname;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/edtmobilenmber")
	private WebElement signupmobile;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/edtcity")
	private WebElement signupcity;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/cb_pickndrop")
	private WebElement signupTc;
    
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/cb_country")
	private WebElement signupauthirization;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/btn_submit")
	private WebElement signupsubmit;
  
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/button_otp_continue")
	private WebElement continueBtn;
	
	
	public void loginBtnClick( String name, String number, String city) throws InterruptedException {
	
		loginBtn.click();
		try {
			if(driver.findElement(By.id("com.tvsm.connect.southeastasia:id/action_bar_root")).isDisplayed()) {
				yesregistrationbtn.click();
				signupname.sendKeys(name);
				signupmobile.sendKeys(number);
				signupcity.sendKeys(city);
				signupTc.click();
				signupauthirization.click();
				signupsubmit.click();
				OtpLogin();
			}
		
		}
		
		catch (Exception e) {
		OtpLogin();	 
		}
		
	}	
		public void continueBtnClick1() {
		continueBtn.click();
			
		}
	
		public void OtpLogin() {
		driver.findElement(By.id("com.tvsm.connect.southeastasia:id/otp_one_email")).sendKeys("8");
		driver.findElement(By.id("com.tvsm.connect.southeastasia:id/otp_two_email")).sendKeys("4");
		driver.findElement(By.id("com.tvsm.connect.southeastasia:id/otp_three_email")).sendKeys("2");
		driver.findElement(By.id("com.tvsm.connect.southeastasia:id/otp_four_email")).sendKeys("6");
		driver.findElement(By.id("com.tvsm.connect.southeastasia:id/otp_five_email")).sendKeys("9");
		driver.findElement(By.id("com.tvsm.connect.southeastasia:id/otp_six_email")).sendKeys("1");	
		}
	  }

	
	
