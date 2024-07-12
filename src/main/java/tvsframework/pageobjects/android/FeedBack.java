package tvsframework.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

public class FeedBack extends AndroidActions {
	AndroidDriver driver;

	public FeedBack(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tanggapan']")
	private WebElement feedBackOption;

	@AndroidFindBy(id = "com.tvsm.connect.southeastasia:id/edtmsg")
	private WebElement feedBackMsgBox;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.TextView")
	private WebElement submitFeedbackBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='OKE']")
	private WebElement FeedbackSubmitOkBtn;

	public void feedBackOptionClick() {
		feedBackOption.click();
		scrollDown("KIRIM");
		feedBackMsgBox.sendKeys("TVS connect app is very good");
		submitFeedbackBtn.click();
		FeedbackSubmitOkBtn.click();
	}

	

}
