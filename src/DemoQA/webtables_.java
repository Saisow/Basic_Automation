package DemoQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1.To print particular value(data) from web table

public class webtables_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		
		driver.manage().window().maximize();
		
	/*	WebElement dt = driver.findElement(By.xpath("//div[text()='Cierra']/ancestor::div[2]//child::div/child::div[5]"));

		
		String s = dt.getText();
		
		System.out.println(s);
	}*/
		
				List<WebElement> tRows = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
				
				for(WebElement rows : tRows) {
					
					 List<WebElement> cells = driver.findElements(By.xpath("//div[@class='rt-td']"));
					 
					 for(WebElement data:cells) {
						 
						 System.out.print(data.getText() + "|");
					 }
					 
					 System.out.println();
					
				}
				
				driver.quit();
	}
	

}
