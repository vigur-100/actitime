package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demolocators {

		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
		}
		public static void main(String[] args) {
			WebDriver driver= new ChromeDriver();
			driver.get("file://C:/Users/dell/Desktop/sample.html");
			driver.findElement(By.tagName("a")).click();
			driver.close();
			
			
		}
	}


