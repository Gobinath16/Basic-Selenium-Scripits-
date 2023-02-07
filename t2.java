package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class t2 {
	



	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32");
		ChromeOptions options =new ChromeOptions();
		//*options.setHeadless(true);
		options.addArguments("--headless");	// to enable headless browsing
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		System.out.println("The Title is:"+driver.getTitle());
		System.out.println("URL is "+ driver.getCurrentUrl()); 

		
	}

}
