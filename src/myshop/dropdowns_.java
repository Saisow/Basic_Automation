package myshop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns_ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//1.To print all options
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication");
		
		driver.findElement(By.id("email_create")).sendKeys("canagasai95@gmail.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(3000);
		
		WebElement dd = driver.findElement(By.id("days"));
		
		Select select = new Select(dd);
		
		//select.selectByValue("2");
		
			List<WebElement> options = select.getOptions();
			
			/*for(WebElement opt : options) {
				
				System.out.println(opt.getAttribute("value"));
				
			}*/
			
			for(WebElement opt : options) {
				
				System.out.println(opt.getText());
				
			}
			
			
			
			
		
		
		
		

	}

}
