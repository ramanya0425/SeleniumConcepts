package selenium.cncepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RoboDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("Webdrive.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement best = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		boolean displayed = best.isDisplayed();
		System.out.println(displayed);
		Actions ac = new Actions (driver);
		ac.contextClick(best).perform();
		
		Thread.sleep(2000);
		Robot x = new Robot ();
		x.keyPress(KeyEvent.VK_DOWN);
		x.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		x.keyPress(KeyEvent.VK_ENTER);
		x.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement deal = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		boolean display = deal.isDisplayed();
		System.out.println(display);
		Actions at = new Actions (driver);
		at.contextClick(deal).perform();
		
		Thread.sleep(2000);
		Robot t = new Robot ();
		t.keyPress(KeyEvent.VK_DOWN);
		t.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mob = driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));
		boolean displ = mob.isDisplayed();
		System.out.println(displ);
		Actions am = new Actions (driver);
		am.contextClick(mob).perform();
		
		Thread.sleep(2000);
		Robot m = new Robot ();
		m.keyPress(KeyEvent.VK_DOWN);
		m.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		m.keyPress(KeyEvent.VK_ENTER);
		m.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement hello = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		boolean disp = hello.isDisplayed();
		System.out.println(disp);
		Actions ah = new Actions (driver);
		ah.contextClick(hello).perform();
		
		Thread.sleep(2000);
		Robot h = new Robot ();
		h.keyPress(KeyEvent.VK_DOWN);
		h.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		h.keyPress(KeyEvent.VK_ENTER);
		h.keyRelease(KeyEvent.VK_ENTER);
	
	}
}
