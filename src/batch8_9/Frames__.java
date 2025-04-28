package batch8_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames__ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_comment_out");
		
		driver.manage().window().maximize();
		
		/*1.Using id locator
		 * 2.Using name locator
		 * 3.Using WebElement of a frame
		 * 4.Using index of a frame
		 */
		
		//Switch to the required frame
		
		driver.switchTo().frame("iframeResult");    //By using id
		
		String g = driver.findElement(By.xpath("//p[text()='This is a paragraph.']")).getText();
		
		System.out.println(g);
		
		

	}

}
