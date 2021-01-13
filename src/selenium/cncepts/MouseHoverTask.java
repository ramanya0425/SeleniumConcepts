package selenium.cncepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.support.ui.Select;

public class MouseHoverTask {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
	
		WebElement signin = driver.findElement(By.xpath("//a[@title=\"Log in to your customer account\"]"));		
		Actions ac = new Actions (driver);
		ac.moveToElement(signin).perform();
		
		ac.click(signin).perform();
	
	
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email_create\"]"));
		email.sendKeys("ramanya123@gmail.com");
		Actions acc = new Actions (driver);
		acc.moveToElement(email).perform();
		
		Thread.sleep(2000);
		
		WebElement can = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		Actions create = new Actions(driver);
		create.moveToElement(can).perform();
		
		create.click(can).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name=\"id_gender\"])[2]")).click();
		boolean gen = driver.findElement(By.xpath("(//input[@name=\"id_gender\"])[2]")).isSelected();
		if (gen==true) {
			System.out.println("Mrs. is Selected");
		} else {
			System.out.println("Mr. is Selected");
		}
		
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.xpath("//input[@name=\"customer_firstname\"]"));
		fname.sendKeys("Ramanya");
		Actions afn = new Actions (driver);
		afn.moveToElement(fname).perform();
		
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.xpath("//input[@name=\"customer_lastname\"]"));
		lname.sendKeys("Srinivasan");
		Actions lfn = new Actions (driver);
		lfn.moveToElement(lname).perform();
		
		Thread.sleep(2000);
		WebElement pswd = driver.findElement(By.xpath("//input[@name=\"passwd\"]"));
		pswd.sendKeys("123456");
		Actions psn = new Actions (driver);
		psn.moveToElement(pswd).perform();
		
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@name=\"days\"]"));
		Select da = new Select(day);
		da.selectByIndex(11  );
		
		Thread.sleep(3000);
		WebElement mon = driver.findElement(By.xpath("//select[@name=\"months\"]"));
		Select mo = new Select(mon);
		mo.selectByVisibleText("March ");
		
		Thread.sleep(2000);
		WebElement yer = driver.findElement(By.xpath("//select[@name=\"years\"]"));
		Select yr = new Select(yer);
		yr.selectByVisibleText("1990  ");
			
		Thread.sleep(2000);
		WebElement add1 = driver.findElement(By.xpath("//input[@name=\"address1\"]"));
		add1.sendKeys("Sai Flats, Ramasamy Garden St.,");
		Actions ad = new Actions (driver);
		ad.moveToElement(add1).perform();
		
		Thread.sleep(2000);
		WebElement add2 = driver.findElement(By.xpath("//input[@name=\"address2\"]"));
		add2.sendKeys("Adyar");
		Actions ad2 = new Actions (driver);
		ad2.moveToElement(add2).perform();
		
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath("//input[@name=\"city\"]"));
		city.sendKeys("Chennai");
		Actions cy = new Actions (driver);
		cy.moveToElement(city).perform();
		
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.xpath("//select[@name=\"id_state\"]"));
		Select st = new Select(state);
		st.selectByVisibleText("Washington");
		
		Thread.sleep(2000);
		WebElement code = driver.findElement(By.xpath("//input[@name=\"postcode\"]"));
		code.sendKeys("00000");
		Actions pt = new Actions (driver);
		pt.moveToElement(code).perform();
		
		Thread.sleep(2000);
		WebElement coun = driver.findElement(By.xpath("//select[@name=\"id_country\"]"));
		Select cn = new Select(coun);
		cn.selectByVisibleText("United States");
		
		Thread.sleep(2000);
		WebElement phnum = driver.findElement(By.xpath("//input[@name=\"phone_mobile\"]"));
		phnum.sendKeys("9840980553");
		Actions nu = new Actions (driver);
		nu.moveToElement(phnum).perform();
		
		Thread.sleep(2000);
		WebElement alias = driver.findElement(By.xpath("//input[@name=\"alias\"]"));
		alias.sendKeys("Same as Above");
		Actions mn = new Actions (driver);
		mn.moveToElement(alias).perform();
		
		Thread.sleep(2000);
		WebElement regis = driver.findElement(By.xpath("//button[@name=\"submitAccount\"]"));
		Actions rs = new Actions (driver);
		rs.click(regis).perform();
	}

}