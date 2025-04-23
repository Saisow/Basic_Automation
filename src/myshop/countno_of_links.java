package myshop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countno_of_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication");
		
		driver.manage().window().maximize();
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		//To find the count of links
		
		System.out.println(alllinks.size());
		
		for(WebElement links : alllinks) {
			
			System.out.println(links.getDomAttribute("href"));
			
		}

	}

}
