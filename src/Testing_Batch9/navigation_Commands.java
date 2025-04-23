package Testing_Batch9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_Commands {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		
		//To enter url
		
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		//To navigate to previous page
		
		driver.navigate().back();
		
		//To navigate to forward
		
		driver.navigate().forward();
		
		//To refresh the webpage
		
		driver.navigate().refresh();
		
		driver.quit();
		

	}

}
