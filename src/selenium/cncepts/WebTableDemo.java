package selenium.cncepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
			
		driver.manage().window().maximize();
		
		System.out.println("===All Data===");
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for(WebElement data1 : allData) {
			System.out.println(data1.getText());
		}
		
		System.out.println("===Column Data===");
		List<WebElement> colData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		for(WebElement data2 : colData) {
			System.out.println(data2.getText());
		}
		

		System.out.println("===Size===");
		System.out.println(colData.size());

	}

	
}
