package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyallignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	
	}

	WebDriver driver=new ChromeDriver();
	driver.get("");
	boolean logo=driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
			if(logo==true) {
				System.out.println("logo is displayed and pass");
			}
			else 
				System.out.println("logo is not dispalyed and fail");
			
}
}

}
	public static void main(String[] args) {

	}

}
