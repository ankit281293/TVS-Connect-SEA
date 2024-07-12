package tvsconnectframework;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import tvsframework.pageobjects.android.ClHowToVideos;
import tvsframework.pageobjects.android.ClMyRides;
import tvsframework.pageobjects.android.ClSettings;
import tvsframework.pageobjects.android.ClUserManual;
import tvsframework.pageobjects.android.ClVehicleOverview;
import tvsframework.pageobjects.android.EditProfile;
import tvsframework.pageobjects.android.Faq;
import tvsframework.pageobjects.android.FeedBack;
import tvsframework.pageobjects.android.HamburgerOptions;
import tvsframework.pageobjects.android.LoginPage;
import tvsframework.pageobjects.android.NotifcationsIndo;
import tvsframework.pageobjects.android.ReAddVehicles;
import tvsframework.pageobjects.android.RoHowToVideos;
import tvsframework.pageobjects.android.RoLastRideInfo;
import tvsframework.pageobjects.android.RoMyRides;
import tvsframework.pageobjects.android.RoOverview;
import tvsframework.pageobjects.android.RoUserManual;
import tvsframework.pageobjects.android.SeAddVehicles;
import tvsframework.pageobjects.android.SeReHowToVideos;
import tvsframework.pageobjects.android.SeReMyRides;
import tvsframework.pageobjects.android.SeReRideDetails;
import tvsframework.pageobjects.android.SeReSettings;
import tvsframework.pageobjects.android.SeReUserManual;
import tvsframework.pageobjects.android.XPAddVehicle;
import tvsframework.utils.BaseTest;

public class Indonesia extends BaseTest {

	private SeReMyRides rideobj;
	private SeReSettings setobj;
	private SeReUserManual userobj;
	private SeReRideDetails ridedetailsobj;
	private SeReHowToVideos videosobj;
	// private HamburgerOptions hamburgerobj;
	// private HamburgerOptions hamobj;
	// private LoginPage logobj;
	// private int isCaseExecutedCount = 0;

	@Test(priority = 1, dataProvider = "getData")
	public void standardLogin(String name, String number, String city) throws InterruptedException {
		LoginPage logobj = new LoginPage(driver);
		logobj.setEmailField("tvsconnectdevautomation@gmail.com");
		logobj.loginBtnClick(name, number, city);
		logobj.continueBtnClick1();
	}

	@DataProvider
	public Object[][] getData() {
		return new Object[][] { { "Ankit", "6589098000", "Dehradun" } };
	}

	@Test(priority = 2)
	public void standardAddVehicles() throws InterruptedException {
		SeAddVehicles addobj = new SeAddVehicles(driver);
		String addvehicletitle = addobj.selectSeVehicleBtn();
		assertEquals(addvehicletitle, "Tambahkan kendaraan");
		System.out.println("Add Vehicle page Title  :" + addvehicletitle);
		addobj.addVehicle();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void allowAppPermission() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.id("com.android.permissioncontroller:id/permission_allow_button")));

		try {
			for (int i = 0; i < 6; i++) {
				driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			}

		}

		catch (Exception e) {
			standardMyRides();
		}

	}

	@Test(priority = 4)
	public void standardMyRides() throws InterruptedException {
		rideobj = new SeReMyRides(driver);
		String myridestitle = rideobj.myRidesCheck();
		assertEquals(myridestitle, "Perjalanan Saya");
		System.out.println("My Rides Page Title: " + myridestitle);
		String norridestext = driver
				.findElement(By.xpath("//android.widget.TextView[@text='Tidak ada perjalanan yang tersedia']"))
				.getText();
		assertEquals(norridestext, "Tidak ada perjalanan yang tersedia");
		System.out.println("Text when there is no rides:  " + norridestext);
		rideobj.bckHomePage();
	}

//		}

//	   
	@Test(priority = 5)
	public void standardSettings() throws InterruptedException {
		setobj = new SeReSettings(driver);
		String settingstitle = setobj.setSettings();
		assertEquals(settingstitle, "Pengaturan");
		System.out.println("Settings page Title: " + settingstitle);
		setobj.scrollDown("Hapus Motor");
		setobj.saveBtnClick();
////spy toast message and get the text
		String toastmesaage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		assertEquals(toastmesaage, "Pengaturan diperbarui");
		System.out.println("Settings updated successfully: " + toastmesaage);
	}

	@Test(priority = 6)
	public void standardUserManual() throws InterruptedException {
		userobj = new SeReUserManual(driver);
		String usermanualtitle = userobj.userManualCheck();
		assertEquals(usermanualtitle, "Ketahui Sepeda Motor Anda");
		System.out.println("UserManaul Page Title: " + usermanualtitle);

		String[] arr1 = { "Intro Video", "User Manual For BS VI NTorq" };

		userobj.userManualBtnClick();

		for (int i = 0; i < arr1.length; i++)

		{
//			

			List<WebElement> textelements = driver.findElements(By.id("com.tvsm.connect.southeastasia:id/tv_title"));
			assertEquals(textelements.get(i).getText(), arr1[i]);
		}
		userobj.ridingTips();
		String tipstext = driver
				.findElement(By.xpath(
						"//android.widget.TextView[@text='Hindari berkendara dengan satu tangan karena berbahaya']"))
				.getText();
		assertEquals(tipstext, "Hindari berkendara dengan satu tangan karena berbahaya");
		System.out.println("First Riding tip: " + tipstext);
		userobj.bckHomePage();

	}

//	   @Test(priority=7)
//	   public void standardLastParkLocation(){
//	   SeLastParkLocation lastparkobj= new SeLastParkLocation(driver);	
//	   String lastparktitle =lastparkobj.lastParkLocationCheck();
//	   assertEquals(lastparktitle, "lokasi parkir terakhir");
//	   System.out.println(lastparktitle);
//	   lastparkobj.bckHomePage();;

//	   		
	@Test(priority = 7)
	public void standardRideDetails() {
		ridedetailsobj = new SeReRideDetails(driver);
		ridedetailsobj.ridedetailscheck();

	}

	@Test(priority = 8)
	public void displayAllFaq() {
		Faq faqobj = new Faq(driver);
		faqobj.mainMenuClick();
		String firstfaq = faqobj.displayFaq();
		assertEquals(firstfaq, "Bagaimana cara \"pairing\" ponsel saya?");
		System.out.println("This is first question in faq section:  " + firstfaq);
		faqobj.bckHomePage();
		faqobj.bckHomePage();

	}

//	  @Test(priority =10)
//	  public void logoutIndoUser() {
//	  hamobj = new HamburgerOptions(driver);
//	  hamobj.mainMenuClick();
//	  hamobj.LogoutUser();
//	  
//	  }
//	  
//	  @Test(priority = 11, dataProvider="getDataCambodia")
//	  public void loginCambodiaUser(String name, String number, String city) throws InterruptedException {
//	  driver.findElement(By.id("com.tvsm.connect.southeastasia:id/sp_country")).click();  
//	  driver.findElement(By.xpath("//android.widget.TextView[@text='Cambodia']")).click();
//	  logobj.setEmailField("cambodiaautomation@yopmail.com");
//	  logobj.loginBtnClick(name, number, city);
//	  }
//	  
//	  @DataProvider
//	  public Object[][] getDataCambodia(){
//	  return new Object[][] {{"Ankit" ,"6589098007", "Dehradun"}};
//	  }
//	  
//	  }	

	@Test(priority = 9)
	public void standardHowToVideos() throws InterruptedException {
		videosobj = new SeReHowToVideos(driver);
		String videostitle = videosobj.howToVideosCheck();
		assertEquals(videostitle, "Cara Merekam Video");
		System.out.println("How to Videos page Title: " + videostitle);
		videosobj.bckHomePage();
	}

//		
	@Test(priority = 10)
	public void tvsConnectHamburgerOptions() {
		HamburgerOptions hamburgerobj = new HamburgerOptions(driver);
		hamburgerobj.mainMenuClick();
		hamburgerobj.infoMenuClick();
		hamburgerobj.infoMenuField();
		hamburgerobj.mainMenuClick();
		hamburgerobj.infoMenuClick();
		hamburgerobj.skipBtnClick();
		hamburgerobj.mainMenuClick();

		
	}

	@Test(priority = 11)
	public void feedBackSubmission() {
		FeedBack feedbackobj = new FeedBack(driver);
		feedbackobj.mainMenuClick();
		feedbackobj.feedBackOptionClick();

	}

//		
	@Test(priority = 11)
	public void racingAddVehicles() {
		ReAddVehicles addreobj = new ReAddVehicles(driver);
		addreobj.scrollDown("TAMBAHKAN KENDARAAN");
		addreobj.addVehicleDashboardBtnClick();
		addreobj.selectReVehicleBtn();
		addreobj.addVehicle();
		addreobj.scrollDown("TAMBAHKAN KENDARAAN");
		addreobj.ReExpandBtnClick();
	}

//	}
//
	@Test(priority = 12)
	public void racingMyRides() {
		String myridestitle = rideobj.myRidesCheck();
		assertEquals(myridestitle, "Perjalanan Saya");
		System.out.println("Racing Edition My Rides Title: " + myridestitle);
		rideobj.bckHomePage();
	}

//	}
//
////		
	@Test(priority = 13)
	public void racingSettings() {
		String settingstitle = setobj.setSettings();
		assertEquals(settingstitle, "Pengaturan");
		System.out.println("Racing Edition settings page Title: " + settingstitle);
		setobj.scrollDown("Hapus Motor");
		setobj.saveBtnClick();
	}

//	}
//
////
	@Test(priority = 14)
	public void racingUserManual() {
		String usermanualtitle = userobj.userManualCheck();
		assertEquals(usermanualtitle, "Ketahui Sepeda Motor Anda");
		System.out.println("Racing Edition usermanual page Title: " + usermanualtitle);
		userobj.bckHomePage();
	}

//	}
//
////		
	@Test(priority = 15)
	public void racingRideDetails() {
		ridedetailsobj.ridedetailscheck();
	}

//
//////		
	@Test(priority = 16)
	public void racingHowToVideos() {
		String videostitle = videosobj.howToVideosCheck();
		assertEquals(videostitle, "Cara Merekam Video");
		System.out.println("Racing Edition How To Videos apage Title: " + videostitle);
		videosobj.bckHomePage();
		videosobj.scrollDown("Profil saya");

	}

//	}
//

	@Test(priority = 17)
	public void indoEditProfile() {
		EditProfile editprofileobj = new EditProfile(driver);
		editprofileobj.editProfileClick();
		List<WebElement> deleteelement = driver
				.findElements(By.id("com.tvsm.connect.southeastasia:id/radioDeleteReason"));
		for (int i = 0; i < 5; i++) {

			deleteelement.get(i).click();
		}
		editprofileobj.deleteReasonClick();
		editprofileobj.bckHomePage();
		editprofileobj.bckHomePage();
		editprofileobj.editdetails();
		editprofileobj.bckHomePage();

	}

//	

	@Test(priority = 18)
	public void callistoassests() throws InterruptedException {
		ClVehicleOverview cloverviewobj = new ClVehicleOverview(driver);
		cloverviewobj.scrollDown("TAMBAHKAN KENDARAAN");
		cloverviewobj.addVehicleDashboardBtnClick();
		cloverviewobj.selectClvehicleBtn();
		cloverviewobj.addVehicle();
		Thread.sleep(7000);
		cloverviewobj.scrollDown("TAMBAHKAN KENDARAAN");
		cloverviewobj.clExpandBtnClick();
	}
	

//
////
////	}
////
	@Test(priority = 19)
	public void callistoMyRides() {
		ClMyRides clmyridesobj = new ClMyRides(driver);
		clmyridesobj.clMyRidesMenuClick();
		clmyridesobj.clbackbtnClick();
	}
	

//
////	}
////
	@Test(priority = 20)
	public void callistoUserManual() {
		ClUserManual clusermanualobj = new ClUserManual(driver);
		clusermanualobj.clUserManualMenuClick();
	}
	

//
////	}
////
	@Test(priority = 21)
	public void callistoHowToVideos() {
		ClHowToVideos clhowtovideosobj = new ClHowToVideos(driver);
		clhowtovideosobj.clHowToVideosMenuClick();
	}
	

//
////
	@Test(priority = 22)
	public void callistoSettings() {
		ClSettings clsettingsobj = new ClSettings(driver);
		clsettingsobj.clSettingsMenuClick();
		//clsettingsobj.scrollMore();
		//clsettingsobj.clhighSpeedAlertBtnClick();
		//clsettingsobj.clVehicleNameSet();
	//clsettingsobj.scrollMore();
	}



//}
////		
//
////	}
	   @Test(priority=24)
	   public void roninOverView() {
	   RoOverview rooverviewobj = new   RoOverview(driver);
	   rooverviewobj.scrollDown("TAMBAHKAN KENDARAAN");
	   rooverviewobj.addVehicleDashboardBtnClick();
	   rooverviewobj.selectRoVehicleBtn();
	   rooverviewobj.addVehicle();
	   rooverviewobj.scrollDown("TAMBAHKAN KENDARAAN");
	   rooverviewobj.roVehicleOverviewclick();
	   rooverviewobj.roBackBtnClick();
	   }
	   

//////	   
	   @Test(priority=25)
	   public void roninlastrideinfo() {
	   RoLastRideInfo rolastrideobj  = new RoLastRideInfo(driver);
	   rolastrideobj.roLastRideInfoClick();
	   rolastrideobj.scrollDown("Disclaimer: Please refer terms and conditions in About us section.");
	   rolastrideobj.roRpmBtnClick();
	   rolastrideobj.roBackBtnClick();
	   }
	   
//////	  
	   @Test(priority=26)
	   public void roninMyRides() {
	   RoMyRides romyridesobj = new RoMyRides(driver);
	   romyridesobj.roMyRidesClick();
	   romyridesobj.roBackBtnClick();
	   }
	   
   
//////	   
	   @Test(priority=27)
	   public void roninUserManual() {
	   RoUserManual rouserobj = new RoUserManual(driver);
	   rouserobj.roUserManualClick();
	   rouserobj.bckHomePage(); 
	   }
//////	   
	   @Test(priority=28)
	   public void roninHowToVideos() {
	   RoHowToVideos rovideosobj = new  RoHowToVideos(driver);
	   rovideosobj.roHowToVideosClick();
	   rovideosobj.bckHomePage();
	   }
	   
	   @Test(priority=29)
	   public void indonesiaNotifications() {
	   NotifcationsIndo notiobj = new 	NotifcationsIndo(driver);
	   notiobj.notificationBtnClick(); 
	   }
   
	 @Test(priority=30)  
	 public void XPVehicleOverview() {
		 XPAddVehicle XPoverviewobj = new  XPAddVehicle(driver);
		 XPoverviewobj.scrollDown("TAMBAHKAN KENDARAAN"); 
		 XPoverviewobj.addVehicleDashboardBtnClick();
	 }
	   
}   
//	   }}
