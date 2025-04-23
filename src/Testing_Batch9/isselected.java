package Testing_Batch9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class isselected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		//Adding explicit wait here
		
		WebElement crbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@role='button'])[2]")));
		
		crbtn.click();
		
		WebElement fr = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='sex'])[1]")));
		
		fr.click();
		
		if(fr.isSelected()) {
			
			System.out.println("gender female got selected");
		}
		
		else {
			
			System.out.println("not slected");
		}
		
		
	}

}
