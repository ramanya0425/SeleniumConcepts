package selenium.cncepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoLogin {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
	
		WebElement signin = driver.findElement(By.xpath("//a[@title=\"Log in to your customer account\"]"));		
		Actions ac = new Actions (driver);
		ac.moveToElement(signin).perform();
		
		ac.click(signin).perform();
		
		WebElement email = driver.findElement(By.xpath("(//input[@name=\"email\"])[1]"));
		email.sendKeys("ramanya123@gmail.com");
		Actions acc = new Actions (driver);
		acc.moveToElement(email).perform();
		
		Thread.sleep(2000);
		WebElement pswd = driver.findElement(By.xpath("//input[@name=\"passwd\"]"));
		pswd.sendKeys("123456");
		Actions psn = new Actions (driver);
		psn.moveToElement(pswd).perform();
		
		Thread.sleep(2000);
		WebElement sign = driver.findElement(By.xpath("//button[@name=\"SubmitLogin\"]"));
		Actions rs = new Actions (driver);
		rs.click(sign).perform();
}
}
