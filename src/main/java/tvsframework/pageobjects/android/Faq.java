package tvsframework.pageobjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tvsframework.utils.AndroidActions;

 public class Faq extends AndroidActions {
	AndroidDriver driver;
	
    public Faq (AndroidDriver driver){
	super(driver);
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
   
    @AndroidFindBy(xpath="//android.widget.TextView[@text='FAQ']")
    private WebElement faqbtn;
    
    @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/edtSearch")
    private WebElement faqsearchbar;
    
    @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/tvSubCatName")
    private WebElement openfaq;
    
    @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/imgBack")
    private WebElement faqbckbtn;
    
    @AndroidFindBy(id="com.tvsm.connect.southeastasia:id/ivCancel")
    private WebElement cancelsearchbar;
    
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Bagaimana cara \"pairing\" ponsel saya?']")
    private WebElement drivefaq;
    
    
    public String displayFaq() {
      faqbtn.click();
      faqsearchbar.sendKeys("Berkendara");
      cancelsearchbar.click();
      openfaq.click(); 
      return drivefaq.getText();
    }
   
    
    
    
 }
      
      
     
//      if(driver.findElement(By.xpath("//android.widget.TextView[@text='Cari menggunakan kata kunci']")).isEnabled()){
//      driver.findElement(By.xpath("//android.widget.TextView[@text='Cari menggunakan kata kunci']")).click();
//      driver.findElement(By.id("com.tvsm.connect.southeastasia:id/edtSearch")).sendKeys("ankcd");
    	  //System.out.println("element is enabled");  
       
//      faqSearchBar.click();
//      faqSearchBar.sendKeys("Berkandara");
//
//      for (int i=0;i<11;i++) {
//      openfaq.click();
//      faqSearchBar.sendKeys("pairing");
//      faqbckBtn.click();
      
        
   
    
    
    


    
    


