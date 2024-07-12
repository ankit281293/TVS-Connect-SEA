package tvsframework.pageobjects.android;



	import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

//package ORG.tvs.tvsframework.pageobjects.android;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.pagefactory.AndroidFindBy;
	import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

	public class SeAddVehicles extends AndroidActions {

		
		AndroidDriver driver;
		public SeAddVehicles ( AndroidDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[4]")
		private WebElement selectVehicle;
		
		@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/tvLeftHeader")
		private WebElement getAddVehicleTitle;
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='ALLOW']")
		private WebElement appPermission;

		
		public String selectSeVehicleBtn() {
		selectVehicle.click();	
		return getAddVehicleTitle.getText();
		
		}
		
		public void apppermissionone() {
		appPermission.click();	
		}
		
		
		public void appPermissionBtn() {
		for(int i=0;i<7;i++) {
		appPermission.click();
		}
			
		}
		
		
	}

