package Testing_Batch9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class printallradiobuttons_cb {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		WebElement crbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@role='button'])[2]")));
		
		crbtn.click();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("sex")));
		
		//Get gender radio labels
		
		List<WebElement> radiolabels = driver.findElements(By.xpath("//span[@data-name='gender_wrapper']"));
		
		for(WebElement rl : radiolabels) {
			
			System.out.println("Gender options:" +rl.getText());
		}
		
		driver.quit();
		

	}

}
