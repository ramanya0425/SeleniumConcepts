package selenium.cncepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUPDownDemo {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		WebElement downlogo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", downlogo);
		WebElement tabsearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		js.executeScript("arguments[0].scrollIntoView()", tabsearch);
		js.executeScript("window.scrollBy(0,500");
	}
}
