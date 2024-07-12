package tvsframework.pageobjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class ClHowToVideos extends AndroidActions {
	AndroidDriver driver;

	public ClHowToVideos(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='How To Videos']")
	private WebElement clhowtovideosmenu;

	public void clHowToVideosMenuClick() {
		clhowtovideosmenu.click();
		bckHomePage();
	}

}
