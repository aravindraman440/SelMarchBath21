package week4.day1.assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.manage().window().maximize();
					
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			
			driver.switchTo().frame("iframeResult");
			
			driver.findElementByXPath("//button[text()='Try it']").click();
			
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("Aravind");
			alert.accept();
			
			String text = driver.findElementById("demo").getText();
			
			if(text.contains("Aravind")) {
				System.out.println("Verification passed");
			}
			else {
				System.out.println("Verification failed");
			}
			
			
			

		}

	}

