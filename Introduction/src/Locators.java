

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
		driver.findElement(By.id("inputUsername")).sendKeys("Arun Reji");
		driver.findElement(By.name("inputPassword")).sendKeys("arun");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Arun Reji");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Asdfsnd");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("arunrejipallath@gamil.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("5768675657543");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector("div[class*='forgot'] button[class*='go']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id*='inputU']")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[name*='inputP']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
