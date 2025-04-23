package myshop;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshot_ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("nagasai");
		
			TakesScreenshot tk = (TakesScreenshot)driver;
			
			File source = tk.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./myshop/myshopscreenshot.png");
			
			dest.getParentFile().mkdirs();
			
			FileHandler.copy(source, dest);

	}

}
