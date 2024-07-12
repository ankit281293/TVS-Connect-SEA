package tvsframework.pageobjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class RoUserManual extends AndroidActions {

	AndroidDriver driver;

	public RoUserManual(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='User Manual']")
	private WebElement rousermanualmenu;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Specifications']")
	private WebElement rospctab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tips']")
	private WebElement rotipstab;

	public void roUserManualClick() {
		rousermanualmenu.click();
		rospctab.click();
		rotipstab.click();
	}

}