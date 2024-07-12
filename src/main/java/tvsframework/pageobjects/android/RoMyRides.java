package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

    public class RoMyRides extends AndroidActions {

		AndroidDriver driver;
		public RoMyRides ( AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		} 

    @AndroidFindBy(xpath="//android.widget.TextView[@text='My Rides']")
    private WebElement romyridesmenu;
    
    @AndroidFindBy(xpath="//android.widget.HorizontalScrollView[@resource-id='com.tvsm.connect.southeastasia:id/tlTabLayout']/android.widget.LinearLayout/android.widget.LinearLayout[@index='0']/android.widget.TextView")
    private WebElement roridestab;
    
    @AndroidFindBy(xpath="//android.widget.HorizontalScrollView[@resource-id='com.tvsm.connect.southeastasia:id/tlTabLayout']/android.widget.LinearLayout/android.widget.LinearLayout[@index='1']/android.widget.TextView")
    private WebElement rotourstab;
    
    @AndroidFindBy(xpath="//android.widget.HorizontalScrollView[@resource-id='com.tvsm.connect.southeastasia:id/tlTabLayout']/android.widget.LinearLayout/android.widget.LinearLayout[@index='2']/android.widget.TextView")
    private WebElement rofavtab;
    
    public void roMyRidesClick() {
    romyridesmenu.click();	
    roridestab.click();
    rotourstab.click();
    rofavtab.click();
    }


}
