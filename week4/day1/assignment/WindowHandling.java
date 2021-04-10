package week4.day1.assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Window.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	String oldWindow = driver.getWindowHandle();
	driver.findElementById("home").click();
	
	Set<String> newWindow = driver.getWindowHandles();
	for (String newOpenedWindow : newWindow) {
		driver.switchTo().window(newOpenedWindow);
	}
	driver.findElementByLinkText("Edit").click();
	driver.close();
	driver.switchTo().window(oldWindow);
	driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
	int size = driver.getWindowHandles().size();
	System.out.println("no of opened window:"+size);
	
	driver.findElementById("color").click();
	Set<String> window = driver.getWindowHandles();
	for (String currentWindow : window) {
   if(!currentWindow.equals(oldWindow)) {
	   driver.switchTo().window(currentWindow);
	   
	   
   }
		
	}
	driver.close();
}
}

