package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class SeReHowToVideos extends AndroidActions {

	AndroidDriver driver;
	public SeReHowToVideos ( AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Cara Merekam Video']")
	private WebElement videosmenu;
	
	
	public String howToVideosCheck() {
	videosmenu.click();	
	return getPageTitle();
	}
	
}
