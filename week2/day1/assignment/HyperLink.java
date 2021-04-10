package week2.day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Link.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElementByXPath("(//a[text()='Go to Home Page'])[1]").click();
	Thread.sleep(2000);
	driver.navigate().to("http://www.leafground.com/pages/Link.html");
	Thread.sleep(2000);
	driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElementByLinkText("Verify am I broken?").click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElementByXPath("(//a[contains(text(),'Home Page')])[2]").click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElementByLinkText("How many links are available in this page?").click();
	System.out.println("Link button is 5");
}
}
