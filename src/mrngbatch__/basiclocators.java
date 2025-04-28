package mrngbatch__;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basiclocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		
		
		//By using id
		WebElement g = driver.findElement(By.id("email"));
		
		g.sendKeys("naga34@test.com");
		
		String f = g.getAttribute("value");
		
		System.out.println(f);	
		
		//By using name
		
			 driver.findElement(By.name("passwd")).sendKeys("Saisowmya@96");
			 
			WebElement j =  driver.findElement(By.name("passwd"));
			
			j.sendKeys("Saisowma@96");
			
			
		//By using tagName
			
			List<WebElement> allinput = driver.findElements(By.tagName("input"));
			
				//By using for-each loop
			
				for(WebElement i : allinput) {
					
					System.out.println(i.getAttribute("type"));
					
				}
				
			//By using className
		
			//	driver.findElement(By.className("account_input")).sendKeys("sririam97@gmail.com");
			
			//By using linktext
				
				//driver.findElement(By.linkText("Blog")).click();
				driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("tshirts");
				
				Thread.sleep(3000);
				
			//	driver.quit();
				
		
	}

}
