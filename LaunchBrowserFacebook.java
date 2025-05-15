package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserFacebook {
public static void main(String[] args) {
		
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver1=new EdgeDriver();
		//load the url
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//enter the uname
				driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
				//enter the password
				driver.findElement(By.name("pass")).sendKeys("Tuna@321");
				//click login
				driver.findElement(By.name("login")).click();
				
				//title of the page
				String title = driver.getTitle();
				System.out.println(title);
				
		
				
				
}
				
			}