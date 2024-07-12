package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class ClUserManual extends AndroidActions{
	AndroidDriver driver;
	public ClUserManual ( AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='User Manual']")
	private WebElement clusermanualmenu;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Specifications']")
	private WebElement clspecificationsbtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='User Manual']")
	private WebElement clusermanualbtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Tips']")
	private WebElement cltipsbtn;
	
	public void clUserManualMenuClick() {
	clusermanualmenu.click();
	clspecificationsbtn.click();
	clusermanualbtn.click();
	cltipsbtn.click();
	bckHomePage();
	
	}
	
}
