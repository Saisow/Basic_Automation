package myshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateerrorsmg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		
		driver.findElement(By.id("email")).sendKeys("naga34@test.com");
		
		driver.findElement(By.id("passwd")).sendKeys("Saisoa@96");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		WebElement errormsg = driver.findElement(By.className("alert"));
		
		if(errormsg.isDisplayed()) {
			
			String text = errormsg.getText();
			
			System.out.println(text);
		}
		
		
	

	}

}
