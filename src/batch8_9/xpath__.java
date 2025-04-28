package batch8_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpath__ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement g = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[1]/div/div/div[1]/div/form/div[1]/div[1]/input"));
		
				g.sendKeys("9087656780");

	}

}
