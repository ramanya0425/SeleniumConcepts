package selenium.cncepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OderDetail {
		public static void main(String[] args) throws InterruptedException{
		
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			
			driver.manage().window().maximize();
			
			WebElement signin = driver.findElement(By.xpath("//a[@title=\"Log in to your customer account\"]"));		
			Actions ac = new Actions (driver);
			ac.moveToElement(signin).perform();
			
			ac.click(signin).perform();
		
		
			WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
			email.sendKeys("ramanya123@gmail.com");
			Actions acc = new Actions (driver);
			acc.moveToElement(email).perform();
			
			Thread.sleep(2000);
			WebElement pswd = driver.findElement(By.xpath("//input[@name=\"passwd\"]"));
			pswd.sendKeys("123456");
			Actions psn = new Actions (driver);
			psn.moveToElement(pswd).perform();
			
			Thread.sleep(2000);
			WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
			Actions aw = new Actions(driver);
			aw.moveToElement(women).perform();
			
			Thread.sleep(2000);
			WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-shirts'][1]"));
			aw.click(tshirt).perform();
			
			Thread.sleep(2000);
			WebElement addto = driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default'][1]"));
			Actions ato = new Actions(driver);
			ato.moveToElement(addto).perform();
			
			Thread.sleep(2000);
			WebElement add = driver.findElement(By.xpath("(//a[@title=\"Add to cart\"])[1]"));
			Actions dd = new Actions(driver);
			dd.click(add).perform();
			
			
			
		}			

}
