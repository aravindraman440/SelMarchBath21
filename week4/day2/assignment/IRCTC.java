package week4.day2.assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement path = driver.findElementByXPath("//button[@class='btn btn-primary']");
		path.click();
		String text = path.getText();
		System.out.println(text);
		
		String oldwindow = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElementByXPath("(//label[text()='FLIGHTS'])[2]").click();
		
		Set<String> newwindow = driver.getWindowHandles();
		for (String currentWindow : newwindow) {
			driver.switchTo().window(currentWindow);
			}
		driver.findElementByXPath("//button[text()='Ok']").click();
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
