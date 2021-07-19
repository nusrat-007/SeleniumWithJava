package frameworkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductPageTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
				
		//web driver object create
		WebDriver driver= new ChromeDriver();
				
		driver.get("http://sheradambd.com/product?name=");
		
		ProductPageObject.search(driver).click();
		
		Thread.sleep(2000);
		
		ProductPageObject.view_product(driver).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		//driver.switchTo().newWindow(WindowType.TAB).get("http://sheradambd.com/product?name=");
		
		//driver.close();
		
		//ProductPageObject.next_page(driver).click();
		
		//ProductPageObject.prev_page(driver).click();
			
	

	}
}
