package tvsframework.utils;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AndroidActions {
	
		AndroidDriver driver;
		public AndroidActions (AndroidDriver driver) {
			this.driver=driver;	
		}
		
		public void scrollDown(String Text) {
	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+Text+"\"));"));
		}
		
		public void roBackBtnClick() {
		driver.findElement(By.id("com.tvsm.connect.southeastasia:id/u399_back_button")).click();
		}
		
		public void bckHomePage() {
		driver.findElement(By.id("com.tvsm.connect.southeastasia:id/imgBack")).click();	
		}
		
		public String getPageTitle() {
		return driver.findElement(By.id("com.tvsm.connect.southeastasia:id/tvLeftHeader")).getText();		
		}
		
		
		public void mainMenuClick() {
		driver.findElement(By.id("com.tvsm.connect.southeastasia:id/imgBack")).click();	
		}
		
		public void faqMenuClick() {
		driver.findElement(By.xpath("//android.widget.LinearLayout[3]/android.widget.RelativeLayout")).click();	
		}
		

		public void addVehicleDashboardBtnClick() {
		driver.findElement(By.id("com.tvsm.connect.southeastasia:id/menu_add_new_bike")).click();
		}
		
		public void addVehicle() {
		driver.findElement(By.xpath("//android.widget.TextView[@text='TAMBAHKAN KENDARAAN']")).click();	
		}
		
		public void drag(WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
	     "elementId", ((RemoteWebElement) element).getId(),
	     "endX", 100,
	     "endY", 100
	     ));
		
		}
		
		public void scrollMore() {
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		"left", 300, "top", 400, "width", 400, "height", 800,
		"direction", "down",
		"percent", 10.0));				
		}
		
		
		@AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id='com.tvsm.connect.southeastasia:id/layHeader_u445b']/android.widget.ImageView[2]")
		private WebElement clbackbtn;
		
		public void clbackbtnClick() {
		clbackbtn.click();	
		}
		
		
		@AndroidFindBy (id="com.tvsm.connect.southeastasia:id/edtmobilenmber")
		private WebElement setEmail;
		
		public void setEmailField(String email) {
		setEmail.sendKeys(email);	
		}
		
		@AndroidFindBy(id="com.tvsm.connect.southeastasia:id/button_continue")
		private WebElement loginBtn;
		
		//public void loginBtnClick() {
		//loginBtn.click();	
		//}
		
		
}

		
        

	

