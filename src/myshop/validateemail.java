package myshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateemail {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		
		WebElement mailid = driver.findElement(By.id("email_create"));
		
		mailid.sendKeys("sai1196@gmail.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
	
		
		Thread.sleep(3000);
		
		String s = driver.findElement(By.id("email")).getDomAttribute("value");
		
		if(s.equals("sai1196@gmail.com")) {
			
			System.out.println("same mailid got reflected while creating an account");
		}
		
		else {
			
			System.out.println("mailid is not reflecting crctly");
		}
		
		
		
		

	}

}
