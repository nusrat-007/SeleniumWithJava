package frameworkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPageObject {
	
private static WebElement locator= null;
	
	//user name function
	public static WebElement search(WebDriver driver)
	{
		locator= driver.findElement(By.xpath("//button[normalize-space()='Search']"));
		return locator;
	}
	
	public static WebElement view_product(WebDriver driver)
	{
		locator= driver.findElement(By.linkText("Click Here To Go To Product Page"));
		return locator;
	}
	
	
//	public static WebElement next_page(WebDriver driver)
//	{
//		locator= driver.findElement(By.id("//a[@aria-label='Next page']"));
//		return locator;
//	}
//		
//	
//	public static WebElement prev_page(WebDriver driver)
//	{
//		locator= driver.findElement(By.xpath("//a[@aria-label='Prev page']"));
//		return locator;
//	}

}
