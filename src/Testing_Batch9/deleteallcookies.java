package Testing_Batch9;

import org.openqa.selenium.*;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteallcookies {
	
	/*Write a script for following
	 * Open a browser
	 * Delete all cookies
	 * Set Size of Window
	 * Set Position of the window
	 * Maximize the window
	 * */

	public static void main(String[] args) throws Exception {
		
		//To Open the browser
		WebDriver driver = new ChromeDriver();
		
		//To delete All cookies
		driver.manage().deleteAllCookies();
		
		//To set the size of window
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		
		//To Set the position of window
		Point p = new Point(250,250);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		
		//To maximize
		
		driver.manage().window().maximize();
	}
}
