package batch8_9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bootstrap_ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		
		Thread.sleep(3000);
	

	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	
	//wait.until(ExpectedConditions.elementToBeSelected(By.xpath("(//a[text()='Another action'])[1]")));
	
	driver.findElement(By.xpath("(//a[text()='Another action'])[1]")).click();
	
	Thread.sleep(3000);
		

	}

}
