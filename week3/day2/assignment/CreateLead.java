package week3.day2.assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

			public  void main(String[] args) throws InterruptedException {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementById("username").sendKeys("DemoCSR");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				Thread.sleep(3000);
				driver.findElementByLinkText("Leads").click();
				driver.findElementByLinkText("Create Lead").click();
				driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
				driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
				driver.findElementById("createLeadForm_lastName").sendKeys("R");
				WebElement id = driver.findElementById("createLeadForm_dataSourceId");
				Select source=new Select( id);
				source.deselectByVisibleText("Employee");
				driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Aravind");
				driver.findElementById("createLeadForm_personalTitle").sendKeys("Karur");
				driver.findElementById("createLeadForm_generalProfTitle").sendKeys("CreateLead");
				WebElement company = driver.findElementById("createLeadForm_industryEnumId");
				Select industry = new Select(company);
				industry.selectByVisibleText("Computer Software");
				WebElement patner = driver.findElementById("createLeadForm_ownershipEnumId");
				Select owner =new Select(patner);
				owner.deselectByVisibleText("Partnership");
				driver.findElementById("createLeadForm_sicCode").sendKeys("639114");
				driver.findElementById("createLeadForm_description").sendKeys("testcase descrption data enabled");
				driver.findElementById("createLeadForm_importantNote").sendKeys("the createlead create successfully");
				
				
				
				driver.findElementById("createLeadForm_annualRevenue").sendKeys("200000");
				driver.findElementByName("submitButton").click();
				driver.close();
		}
		}


