package week2.day1.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	WebElement id = driver.findElementById("dropdown1");
	Select dropdown1 =new Select(id);
	dropdown1.selectByIndex(2);
	
	WebElement text = driver.findElementByName("dropdown2");
	Select dropdown2=new Select(text);
	dropdown2.selectByVisibleText("Loadrunner");

	WebElement value = driver.findElementById("dropdown3");
	Select dropdown3 =new Select(value);
	dropdown3.selectByValue("1");
	
	WebElement name = driver.findElementByClassName("dropdown");
	Select list=new Select(name);
	List<WebElement> options = list.getOptions();
	int size = options.size();
	System.out.println(size);
	
driver.findElementByXPath("//option[text()='You can also use sendKeys to select']/..")
.sendKeys("Loadrunner");
	WebElement linkText = driver.findElementByXPath("//option[text()='Select your programs']/..");
	Select link =new Select(linkText);
	Thread.sleep(2000);
	link.selectByIndex(0);
	Thread.sleep(2000);
	link.selectByValue("4");
	Thread.sleep(2000);
	link.selectByVisibleText("UFT/QTP");
}
}
