package week2.day2.assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
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
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Create Lead").click();
			
			driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
			driver.findElementById("createLeadForm_firstName").sendKeys("Aravind");
			driver.findElementById("createLeadForm_lastName").sendKeys("R");
			
			driver.findElementByName("submitButton").click();
		}

	}
	