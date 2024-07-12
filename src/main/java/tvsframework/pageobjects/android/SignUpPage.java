//package tvsframework.pageobjects.android;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import tvsframework.utils.AndroidActions;
//
////
//public class SignUpPage extends AndroidActions {
////
//	AndroidDriver driver;
//	public SignUpPage ( AndroidDriver driver) {
//		super(driver);
//		this.driver=driver;
//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//	}
////	
//	@AndroidFindBy(id="android:id/button1")
//	private WebElement yesregistrationbtn;
//	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/edt_fullname")
//	private WebElement signupname;
//	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/edtmobilenmber")
//	private WebElement signupmobile;
//	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/edtcity")
//	private WebElement signupcity;
//	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/cb_pickndrop")
//	private WebElement signupTc;
//	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/cb_country")
//	private WebElement signupauthirization;
//	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/btn_submit")
//	private WebElement signupsubmit;
//    public void yesRegistrationBtnClick() {
//    yesregistrationbtn.click();	
//    }
//	
//	public void indoSignUpOptions(String name, String phonenumber, String city) {
//	signupname.sendKeys(name);	
//	signupmobile.sendKeys(phonenumber);	
//	signupcity.sendKeys(city);
//	signupTc.click();
//	driver.hideKeyboard();
//	signupauthirization.click();
//	}
////	
//	public void indoSignupSubmitClick() {
//	signupsubmit.click();	
//	}
//	
//	
//	public void signUpNameBtnValue(String name) {
//	signUpName.sendKeys(name);	
//	}
//	
//	public void signUpMobilevalue(String phonenumber) {
//	signUpMobile.sendKeys(phonenumber);	
//	}
//	
	
//	public void signUpCityValue(String city) {
//	signUpCity.sendKeys(city);
//	}
	
//	public void tcclick() {
//	signupTc.click();
//	driver.hideKeyboard();
//	}
	
//	public void signUpAuthirizationClick() {
//	signUpAuthirization.click();	
//	} 
	
	
//	public String getvalidationerror() {
//	return driver.findElement(By.id("com.tvsm.connect.southeastasia:id/tv_error_fullname")).getText();
//	}
//	
//	
//	public String signUpSubmitValidationClick() {
//	signupsubmit.click();
//	return getvalidationerror();
//	}
//	
//    }

