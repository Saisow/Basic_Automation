package batch8_9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Auto_suggestion1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 
		WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.apsrtconline.in/");

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	        // Find and interact with the "From" input field
	        WebElement fromInput = driver.findElement(By.id("fromPlaceName"));
	        fromInput.sendKeys("Ban");

	        // Wait until the autosuggestions are visible
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[contains(@class,'ui-menu')]//li")));
	        
	        // Get all suggestions
	        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[contains(@class,'ui-menu')]//li"));
	        
	        for (WebElement suggestion : suggestions) {
	            String text = suggestion.getText();
	            System.out.println("Suggestion: " + text);  // Debug print

	            // Check if the suggestion matches "Bangalore"
	            if (text.equalsIgnoreCase("BANGALORE")) {
	                suggestion.click();  // Click on the correct suggestion
	                break;  // Exit the loop once it's clicked
	            }
	        }

	        // Optional: Validate that the correct place was selected
	        Thread.sleep(1000);
	        System.out.println("From place selected: " + driver.findElement(By.id("fromPlaceName")).getAttribute("value"));

	        driver.quit();
	    

	}

}
