package mrngbatch__;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class omayo__ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		//By using linkText
		
		//driver.findElement(By.linkText("Selenium143")).click();
		
		//By using partial linktext
		
		//driver.findElement(By.partialLinkText("Sele")).click();

		//By using xpath
		
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("tshirts");
		
		driver.quit();
		
		
	}

}
