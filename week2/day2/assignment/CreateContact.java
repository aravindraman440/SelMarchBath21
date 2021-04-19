package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
public static void main(String[] args) {
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
	driver.findElementByLinkText("Create Contact").click();
	driver.findElementById("firstNameField").sendKeys("Aravind");
	driver.findElementById("lastNameField").sendKeys("R");
	driver.findElementById("createContactForm_firstNameLocal").sendKeys("Karur");
	driver.findElementById("createContactForm_personalTitle").sendKeys("chn");
	driver.findElementById("createContactForm_generalProfTitle").sendKeys("Create Contacts");
	driver.findElementById("createContactForm_lastNameLocal").sendKeys("RAMAN");
	driver.findElementById("createContactForm_primaryEmail").sendKeys("aaravindraman440@gmail.com");
	driver.findElementByName("submitButton").click();
driver.close();
}
}
