package batch8_9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions_bt {

	//Hello good evening
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com");    //open the url
		
		driver.manage().window().maximize();      //maximize the window
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {				
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.className("commonModal__close")).click();    //close the popup
		
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();     
		
		WebElement fromcity = driver.findElement(By.id("fromCity"));     //from 
	
		fromcity.sendKeys("Ban");
		
			Thread.sleep(3000);
		
			List<WebElement> allplaces = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for(WebElement places : allplaces) {      //for-each loop
			
			System.out.println("Found places:"  +places.getText());
			
		if(places.getText().trim().contains("Bengaluru")) {
				
				places.click();
				
				Thread.sleep(2000);
				
				 System.out.println("Selected: " + fromcity.getAttribute("value"));
			
				break;
			}
		
		}
	
		driver.quit();

	}

}
