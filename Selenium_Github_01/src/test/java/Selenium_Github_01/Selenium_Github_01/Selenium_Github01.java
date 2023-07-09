package Selenium_Github_01.Selenium_Github_01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selenium_Github01 {

ChromeDriver driver = new ChromeDriver();
	
    
	@Before
	public void getFB() throws InterruptedException 
		{

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
		}
	@Test
	public void createAccount() throws InterruptedException 
	{
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("Doe");
		driver.findElement(By.name("reg_email__")).sendKeys("john.test.doe@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("john.test.doe@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("T1E2S3T4S5");
		
		WebElement dayElement = driver.findElement(By.cssSelector("select#day"));
		WebElement monthElement = driver.findElement(By.cssSelector("select#month"));
		WebElement yearElement = driver.findElement(By.cssSelector("select#year"));
		
		Select dayDropdown = new Select(dayElement);
		Select monthDropdown = new Select(monthElement);
		Select yearDropdown = new Select(yearElement);
		
		dayDropdown.selectByIndex(3);
		monthDropdown.selectByValue("4");
		yearDropdown.selectByVisibleText("1985");
	}
		
		@After
		public void clickAccount() throws InterruptedException
		{
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
	}
	}
	
	




