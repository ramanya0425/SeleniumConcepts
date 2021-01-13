package selenium.cncepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHdfc {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
	}
}
