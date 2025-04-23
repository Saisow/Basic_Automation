package myshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmsamewebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		
		driver.findElement(By.id("email")).sendKeys("naga34@test.com");
		
		driver.findElement(By.id("passwd")).sendKeys("Saisomwya@96");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		
		String s = driver.getCurrentUrl();
		
		if(s.equals("http://www.automationpractice.pl/index.php?controller=my-account")) {
			
			System.out.println("Loginto myshop website by using valid credentials");
		}
		
		else {
			
			System.out.println("Failed to logged in");
		}
		

	}

}