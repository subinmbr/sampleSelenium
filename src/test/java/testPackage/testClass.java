package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {

	public static void main(String[] args) {
		
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.getCurrentUrl();
		
		driver.getTitle();
		
		
		System.out.println("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");
		
		driver.getPageSource();
		
		
		driver.close();
		
		
		
		
		
		

	}

}
