package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		//web driver manager set up
		WebDriverManager.chromedriver().setup();
				
		//web driver object create
		WebDriver driver = new ChromeDriver();
				
		//visit URL
		driver.get("http://sheradambd.com/home");
		
		
		//capture title of page
		System.out.println("the title of page: " +driver.getTitle());
		//capture website's URL 
		System.out.println("Url of this website: " +driver.getCurrentUrl());
		
		
		//slider
		driver.findElement(By.className("container")).click();	
		//driver.findElement(By.className("next icons next-icon")).click();
		//driver.findElement(By.className("prev icons prev-icon")).click();		
		driver.findElement(By.xpath("//a[contains(text(),'›')]")).click();
		
		
		//wait for 2 second
		Thread.sleep(2000);
		
		//page refresh
		driver.navigate().refresh();
		
		//wait for 3 second
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@id='search']")).click();
		
		//search
		driver.findElement(By.cssSelector("button[type='button']")).click();
		
		//wait for 2 seconds
		Thread.sleep(2000);
		
		Select dropdown= new Select(driver.findElement(By.xpath("//select[@type='button']")));
		dropdown.selectByIndex(0);
		
		//wait for 2 second
		Thread.sleep(2000);
		
		//price category
		Select dropdown1= new Select(driver.findElement(By.xpath("//select[@type='button']")));
		dropdown1.selectByIndex(1);
		
		//wait for 1 second
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Click Here To Go To Product Page")).click();
		//driver.navigate().back();
		
		//next page
		driver.findElement(By.xpath("//a[@aria-label='Next page']")).click();
		
		//wait for 1 second
		Thread.sleep(3000);
		
		//any specific page
		driver.findElement(By.xpath("//span[normalize-space()='1,381']")).click();
		
		//wait for 3 second
		Thread.sleep(3000);
		
		//previous page
		driver.findElement(By.xpath("//a[@aria-label='Prev page']")).click();
		
		//wait for 3 second
		Thread.sleep(3000);
		
		//driver.findElement(By.partialLinkText("Click Here To Go To")).click();
		//driver.findElement(By.linkText("Click Here To Go To Product Page")).click();
		
		//close window
		driver.quit();

		
	}

}
