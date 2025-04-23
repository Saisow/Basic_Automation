package Testing_Batch9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textboxenable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		boolean logo = driver.findElement(By.id("email")).isEnabled();
		
		if(logo==true) {
			
			System.out.println("TextBox is enable to print");
		}
		
		else {
			
			System.out.println("TextBox unable to print");
		}
		

	}

}
