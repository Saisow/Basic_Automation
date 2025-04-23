package myshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	
	//1.Go to adactin.com Website and give username &password and login

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().deleteAllCookies();
		/*driver.findElement(By.id("usensername"));
		driver.findElement(By.id("password"));
		driver.findElement(By.id("login")).click();
		
		//By using linktext
		driver.findElement(By.linkText("Forgot Password?")).click();

		//By using partial link text
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		*/
		//getAttribute and getText()

		driver.findElement(By.id("username")).sendKeys("vengat16");
		driver.findElement(By.id("password")).sendKeys("Karthick");
		Thread.sleep(2000);
		String s = driver.findElement(By.id("username")).getAttribute("value");
		String f = driver.findElement(By.id("password")).getAttribute("value");
		System.out.println(s);
		System.out.println(f);
		driver.quit();
	}

}
