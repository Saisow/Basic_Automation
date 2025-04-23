package batch8_9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestions_ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.apsrtconline.in/");
		
		WebElement bangplace = driver.findElement(By.id("fromPlaceName"));
		
		bangplace.sendKeys("Ban");
		
		  // Wait until suggestions are loaded
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[contains(@class,'ui-menu')]//li")));
       
        Thread.sleep(3000);
      List<WebElement> bngplce =   driver.findElements(By.xpath("//ul[contains(@class,'ui-menu')]//li"));
   
   
    	 System.out.println("Number of suggestions: " + bngplce.size());
    	
    	 Thread.sleep(3000);
    	 for (WebElement alplce : bngplce) {
    		 
    	     System.out.println("Suggestion: " + alplce.getText());
    	     
    	     Thread.sleep(3000);
    	     if(alplce.getText().equals("BANGALORE")) {
    	    	 
    	   
    	    	 alplce.click();
    	    	 
    	    	 break;
    	    	 
    	     }
    
    	    
    	 }
    	  	
    	 Thread.sleep(1000);
       
    	// System.out.println("Selected value in input: " + bangplace.getAttribute("value"));
         driver.quit();
    	 
      }
		
		
	}


