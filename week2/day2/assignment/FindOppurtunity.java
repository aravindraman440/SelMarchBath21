package week2.day2.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindOppurtunity {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys("DemoCSR");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByXPath("//a[text()='Opportunities']").click();
	driver.findElementByXPath("//a[text()='Find Opportunities']").click();
	List<WebElement> list = driver.findElementsByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-salesOpportunityId']");
	for (WebElement text : list) {
		System.out.println(text.getText());
	}
	String title = driver.getTitle();
	System.out.println(title);
	String headtitle ="Find Opportunities | opentaps CRM";
	if(title.equals(headtitle)) {
		System.out.println("title is match");
	}else {
		System.out.println("title not match");
	}
}
}
