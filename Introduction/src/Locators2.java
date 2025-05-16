import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name = "Arun";
		//String password;
		String mes;
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		Locators2 p = new Locators2();
		String password1 = p.getPassword(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
		driver.findElement(By.cssSelector("input[id*='inputU']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[name*='inputP']")).sendKeys(password1);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(1000);
		mes = driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(mes, "You are successfully logged in.");
		// TODO Auto-generated method stub
		//css Selector = div[class= 'login-container'] h2
		//x path  = //div[@class= 'login-container']/h2
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class= 'login-container'] h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//button[text() = 'Log Out']")).click();
		
		//driver.quit();
		

	}
	
	public String getPassword(WebDriver driver) throws InterruptedException{
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		Pattern pattern = Pattern.compile("'(.*?)'");
        Matcher matcher = pattern.matcher(passwordText);
        String pass = null;
        if (matcher.find()) {
            String password = matcher.group(1);
            System.out.println("Extracted password: " + password);
            pass= password;
        } else {
            System.out.println("Password not found in the text.");
        }
        
		return  pass;
	}
	

}


