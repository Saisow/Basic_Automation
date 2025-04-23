package Testing_Batch9;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class location_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication");
		
		WebElement em = driver.findElement(By.id("email"));
		
		Dimension dd = em.getSize();
		
			int ht = dd.getHeight();
			
			int wi = dd.getWidth();
			
			System.out.println("Height of the element" +ht);
			
			System.out.println("Width of the element:" +wi);
			
		Point p = em.getLocation();
		
		int lc = p.getX();
		
		int yn = p.getY();
		
		System.out.println("Position of element:" +lc);
		
		System.out.println("yn of element:" +yn);
		
		driver.quit();

	}

}
