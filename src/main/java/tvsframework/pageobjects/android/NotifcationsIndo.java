package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class NotifcationsIndo extends AndroidActions {

	AndroidDriver driver;
	public NotifcationsIndo  ( AndroidDriver driver) {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
	
	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/imgFAQ")
	private WebElement notificationbtn;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/viewFaqs")
	private WebElement viewfaqbtn;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/feedback")
	private WebElement feedbackbtn;
	
	@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/close")
	private WebElement closenotibtn;
	
	public void notificationBtnClick() {
	notificationbtn.click();
	viewfaqbtn.click();
	bckHomePage();
	notificationbtn.click();
	feedbackbtn.click();
	closenotibtn.click();
	
	
	}
}
