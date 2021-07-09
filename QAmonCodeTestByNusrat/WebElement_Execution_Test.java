package QAmonCodeTestByNusrat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Execution_Test {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nexchar.com/signup");
		//user1
		//name of user1
		//driver.findElement(By.id("Name")).sendKeys("Nusfah");
		//Business type
		//Select drop= new Select(driver.findElement(By.id("CategoryId")));
		//drop.selectByVisibleText("Other Retail");
		//email of user1
		//driver.findElement(By.id("Email")).sendKeys("njahan11335577@gmail.com");
		//password of user1
		//driver.findElement(By.id("Password")).sendKeys("123456");
		//receive all notification
		//driver.findElement(By.id("NotReceiveNewsLetter")).click();
		//sign up
		//driver.findElement(By.cssSelector("button[type= 'submit'")).click();
		
		
		//user2
		//name of user2
		driver.findElement(By.id("Name")).sendKeys("Fahrin");		
		//Business type
		Select drop1= new Select(driver.findElement(By.id("CategoryId")));
		drop1.selectByVisibleText("Other Retail");
		//email of user2
		driver.findElement(By.id("Email")).sendKeys("rashidnusrat246@gmail.com");
		//password of user2
		driver.findElement(By.id("Password")).sendKeys("112233");
		//notification receiving 
		driver.findElement(By.id("NotReceiveNewsLetter")).click();
		//sign up
		driver.findElement(By.cssSelector("button[type= 'submit'")).click();
		
		
		//navigate this URL
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nexchar.com/signin");
		
		
		//User1
		//email of user1
		//driver.findElement(By.id("Email")).sendKeys("njahan11335577@gmail.com");
		
		//password of user1
		//driver.findElement(By.id("Password")).sendKeys("123456");
		
		//remember password
		//driver.findElement(By.id("RememberMe")).click();
		//account signin
		//driver.findElement(By.cssSelector("button[type= 'submit'")).click();
		
		
		//user2
		//email of user2
		driver.findElement(By.id("Email")).sendKeys("rashidnusrat246@gmail.com");
		
		//password of user2
		driver.findElement(By.id("Password")).sendKeys("112233");
		
		//remember password
		driver.findElement(By.id("RememberMe")).click();
		//account signin
		driver.findElement(By.cssSelector("button[type= 'submit'")).click();
	}

}
