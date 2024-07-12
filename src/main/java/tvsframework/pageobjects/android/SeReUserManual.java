package tvsframework.pageobjects.android;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class SeReUserManual extends AndroidActions {

	AndroidDriver driver;

	public SeReUserManual(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TableRow[1]/android.widget.TextView[3]")
	private WebElement usermanualmenu;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Spesifikasi']")
	private WebElement specificationsbtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Panduan pengguna']")
	private WebElement usermanualbtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Petunjuk']")
	private WebElement tipsbtn;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/imgBack")
	private WebElement backbtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Intro Video']")
	private WebElement stdintrovdo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='User Manual For BS VI NTorq']")
	private WebElement stdusermanual;

//	public CustomClass getUserManualTitle() {
//	CustomClass customobj = new CustomClass();
//	customobj.setFirstValue(driver.findElement(By.id("com.tvsm.connect.southeastasia:id/tvLeftHeader")).getText());		
//	customobj.setSecondvalue(driver.findElement(By.xpath("//android.widget.TextView[@text='Intro Video']")).getText());
//	customobj.setThirdvalue(driver.findElement(By.xpath("//android.widget.TextView[@text='User Manual For BS VI NTorq']")).getText());
//	return customobj;
//	
//	}

	public String userManualCheck() {
		usermanualmenu.click();
		specificationsbtn.click();
		return getPageTitle();
	}

	public void userManualBtnClick() {
		usermanualbtn.click();
	}

	public void ridingTips() {
		tipsbtn.click();

	}
}
