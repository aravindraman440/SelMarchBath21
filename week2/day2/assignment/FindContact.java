package week2.day2.assignment;

import java.nio.channels.Selector;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElementByXPath("//input[@class='inputLogin']").sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");		
	driver.findElementByClassName("decorativeSubmit").click();	
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Contacts").click();
    driver.findElementByLinkText("Find Contacts").click();
    driver.findElementByXPath("(//em[@class='x-tab-left'])[3]//span[text()='Email']").click();
    driver.findElementByName("emailAddress").sendKeys("aaravindraman440@gmail.com");
   driver.findElementByXPath("//button[text()='Find Contacts']").click();
   Thread.sleep(2000);
   driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
  String text = driver.findElementById("viewContact_firstName_sp").getText();
  System.out.println(text);
  driver.findElementByLinkText("Edit").click();
  WebElement drop = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
  Select selects = new Select(drop);
  selects.selectByVisibleText("eCommerce Site Internal Campaign");

  driver.findElementByXPath("//input[@value='Add']").click();
  Thread.sleep(2000);
  driver.findElementById("updateContactForm_departmentName").sendKeys("Selenium Automation Testing");
  driver.findElementByXPath("//input[@value='Update']").click();
  String text2 = driver.findElementById("viewContact_marketingCampaigns_sp").getText();
  System.out.println(text2);
  String value="eCommerce Site Internal Campaign";
  if(text2.equals(value)) {
	  System.out.println("text is matching");
	    } else {
	    	System.out.println("not matching");
	    }
 String title = driver.getTitle(); 
 System.out.println(title);
}
}
