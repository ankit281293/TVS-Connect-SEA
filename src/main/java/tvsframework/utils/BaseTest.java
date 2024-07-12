package tvsframework.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.Activity;

//import org.openqa.selenium.By;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;

//import ORG.tvs.tvsframework.pageobjects.android.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BaseTest {
	public AndroidDriver driver;

	@BeforeTest
	public void configureAppium() throws MalformedURLException, InterruptedException {

		UiAutomator2Options options = new UiAutomator2Options();
		//options.setDeviceName("Moto G9 Play");
		//options.setDeviceName("Moto G13");
	
		options.setNoReset(true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"))
				.click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		driver.findElement(By.id("com.tvsm.connect.southeastasia:id/btn_next")).click();
		driver.findElement(By.id("com.tvsm.connect.southeastasia:id/btn_explore")).click();
		driver.findElement(By.id("com.tvsm.connect.southeastasia:id/sp_country")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Indonesia']")).click();

		// ankit bhandari

//		
	}

}
