package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class RoHowToVideos extends AndroidActions {

		AndroidDriver driver;
		public RoHowToVideos ( AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='How To Videos']")
		private WebElement rohowtvideosmenu;
		
		public void roHowToVideosClick() {
		rohowtvideosmenu.click();	
		}

}
