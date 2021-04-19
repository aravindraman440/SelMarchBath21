package week4.day2.assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLeadWindow {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElementById("username").sendKeys("Demosalesmanager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Merge Leads").click();
	String oldWindow = driver.getWindowHandle();
	driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
	Set<String> openWindow = driver.getWindowHandles();
	for (String currentWindow : openWindow) {
		driver.switchTo().window(currentWindow);
	}
	driver.findElementByLinkText("Phone").click();
	driver.findElementByName("phoneNumber").sendKeys("9");
	
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	String text = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
	System.out.println(text);
	Thread.sleep(3000);
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();

	driver.switchTo().window(oldWindow);
	Thread.sleep(5000);
	driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		  Set<String> SecondWindow = driver.getWindowHandles(); for (String thirdWindow
		  : SecondWindow) { driver.switchTo().window(thirdWindow); }
		  driver.findElementByLinkText("Phone").click();
		  driver.findElementByName("phoneNumber").sendKeys("9");
		  
		  driver.findElementByXPath("//button[text()='Find Leads']").click();
		  Thread.sleep(3000); driver.
		  findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
			driver.switchTo().window(oldWindow);
		  driver.findElementByLinkText("Merge").click();
		  driver.switchTo().alert().accept();
		  
		  driver.findElementByPartialLinkText("Find Leads").click();
		  driver.findElementByName("id").sendKeys(text);
		  driver.findElementByXPath("//button[text()='Find Leads']").click();
		  String text2 = driver.findElementByClassName("x-paging-info").getText();
		  System.out.println(text2);
		  if(text2.equals("no records to display")) {
			  System.out.println("the texxt is match");
		  }else
		  {
			  System.out.println("text not match");
		  }
		  driver.close();
		 }
}
