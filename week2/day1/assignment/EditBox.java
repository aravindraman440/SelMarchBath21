package week2.day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditBox {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementById("email").sendKeys("aravindraman440@gmail.com");
	driver.findElementByXPath("//input[@value='Append ']").sendKeys("ARAVIND");
	String text = driver.findElementByXPath("(//input[@name='username'])[1]").getAttribute("value");  
	System.out.println(text);
	WebElement element = driver.findElementByXPath("(//input[@name='username'])[2]");
	element.clear();
	element.sendKeys("ARAVIND");
	WebElement path = driver.findElementByXPath("//input[@disabled='true']");
     boolean displayed = path.isDisplayed();
     System.out.println(displayed);
}
}
