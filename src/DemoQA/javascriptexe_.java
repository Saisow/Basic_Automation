package DemoQA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexe_ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 
		 //To Scroll Down
		 
		 js.executeScript("window.scrollBy(0,500)");
		 
		 Thread.sleep(3000);
		 
		 //To scroll Up
		 
		 js.executeScript("window.scrollBy(0,-500)");
		 

	}

}
