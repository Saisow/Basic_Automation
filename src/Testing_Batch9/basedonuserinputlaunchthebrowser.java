package Testing_Batch9;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basedonuserinputlaunchthebrowser {
	
	public static void main(String[] args) {
	
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Browser Name:");
				String browser = sc.nextLine();
				
				WebDriver driver = null;
				
				if(browser.equals("Chrome")) {
					
					 driver = new ChromeDriver();
					
				}
				
				else if(browser.equals("FireFox")){
					
					 driver = new FirefoxDriver();
					
				}
				
				else {
					
					System.out.println("Invalid Browser");
				}
	}

}
