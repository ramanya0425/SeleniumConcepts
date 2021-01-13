package selenium.cncepts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Multi_DropDown {
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement multi = driver.findElement(By.id("multi-select"));
		Select s = new Select (multi);
		boolean multiple = s.isMultiple();  
		System.out.println(multiple);
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("New Jersey");
		Thread.sleep(2000);
		s.selectByVisibleText("Pennsylvania");
		Thread.sleep(2000);
		s.selectByValue("Washington");
		
		Thread.sleep(2000);
		System.out.println("===All Options===");
		List<WebElement> alloptions = s.getAllSelectedOptions();
		for (WebElement option: alloptions) {
			System.out.println(option.getText());
		}
		
		Thread.sleep(2000);
		System.out.println("===First Selected Options===");
		WebElement first = s.getFirstSelectedOption();
			System.out.println(first.getText());
			
			s.deselectAll();
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File desFile = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Screenshot\\test.png");
			//FileUtils.copyFile(srcFile,desFile);
			//org.openqa.selenium.io.FileHandler.copy(srcFile, desFile);
			FileHandler.copy(srcFile, desFile);
	}
		
	
	}


