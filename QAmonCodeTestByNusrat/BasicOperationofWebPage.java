package QAmonCodeTestByNusrat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicOperationofWebPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//visit URL
		driver.get("https://www.demoblaze.com/index.html");
		
		//capture current URL
		System.out.println("the current URL is: "+driver.getCurrentUrl());
		
		//capture web page title of URL
		System.out.println("the title of the page is: "+driver.getTitle());
		
		//navigation to another URL
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		//wait 5 sec
		Thread.sleep(5000);
		
		//page refresh
		driver.navigate().refresh();
		
		//open two new tab one by one
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.aftercareexplained.com/");
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.chhoto.link/");
		
		//close all tab
		driver.close();
		
		Thread.sleep(2000);
		
		//close window
		driver.quit();
	}

}
