package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class t1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","E:\\Selenium\\geckodriver-v0.32.0-win-aarch64/geckodriver");
		WebDriver driver=new FirefoxDriver();			// create a class for firefox browser
		
		driver.get("https://demo.opencart.com");	// to open the browser 
		driver.manage().window().maximize();		// to maximize the browser	
		driver.findElement(By.name("userName")).sendKeys("GOBI");		//to get the user name
		driver.findElement(By.name("Password")).sendKeys("GOBI");
		driver.findElement(By.name("Login")).click();
		
		
		String exptitle="Loged";					//Title Checking	
		String acttitle=driver.getTitle();
		if (exptitle.equals(acttitle)==true) {
			System.out.println("test is Passed");
			
		}
		else {
			System.out.println("Test is Failed");
		}
		driver.close();				//  close the browser
		
	

	}

}
 