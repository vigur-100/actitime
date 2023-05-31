package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
		
		}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https;//www.facebook.com/");
		boolean logo=driver.findElement(By.name("login")).isEnabled();
				if(logo==true) {
					System.out.println("logo is displayed and pass");
				}
				else 
					System.out.println("logo is not dispalyed and fail");
				
	}
	
	}


