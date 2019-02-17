package TestNGEx.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;

	@BeforeClass
	public void launch() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:3001/");

	}

	@Test(timeOut = 50000)
	public void ValidatePortal() {
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		driver.findElement(By.name("login")).sendKeys("Your Email Id");
		driver.findElement(By.name("password")).sendKeys("Your Password");
		driver.findElement(By.name("click")).click();		
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
	
}
