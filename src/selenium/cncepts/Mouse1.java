package selenium.cncepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {

	public static void main(String[] args) throws InterruptedException{
	
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(women).perform();
		
		Thread.sleep(2000);
		WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-shirts'][1]"));
		ac.click(tshirt).perform();
		
	}
	}
