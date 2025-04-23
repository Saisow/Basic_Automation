package DemoQA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
;

public class checkbox_ {

	private static final String JavaScriptExecutor = null;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']")));
		
		Thread.sleep(2000);
		
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
			//WebElement cb1 = driver.findElement(By.id("hobbies-checkbox-1"));
			
		/*for(WebElement allcb : allcheckboxes) {
			
			js.executeScript("arguments[0].scrollIntoView(true);",allcb);
			
	
			
		}*/
			
			for(WebElement allcb : allcheckboxes) {
				
				if(allcb.getAttribute("value").equals("sports")||allcb.getAttribute("value").equals("music")) {
					
					js.executeScript("arguments[0].scrollIntoView(true);",allcb);
					
					js.executeScript("arguments[0].click();", allcb);
				}
			}
			
				
			}
	
			
			

	}


