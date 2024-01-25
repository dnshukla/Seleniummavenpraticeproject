import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	
	public static void main(String[] args) throws Exception {
		
		// To open URL in CHROME browser, open URL with login & logout flow
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		String title = driver.getTitle();
		System.out.println("Title:"+title);
		
		driver.close();
		
		// To open URL in FIREFOX browser		
//		WebDriverManager.firefoxdriver().setup();
//	    WebDriver driver = new FirefoxDriver();
//				
//	    driver.get("https://www.google.com");
//	    driver.close();
		
//		 To open URL in EDGE browser		
//		WebDriverManager.edgedriver().setup();
//	    WebDriver driver = new EdgeDriver();
//				
//	    driver.get("https://www.google.com");
//	    driver.close();
		
	}

}
