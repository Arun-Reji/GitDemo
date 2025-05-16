import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assessment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Arun Reji");
		driver.findElement(By.name("email")).sendKeys("arunre@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Arun**123");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']/option[1]")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("11/22/1997");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		
		String message = driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText();
		System.out.println(message);
		Thread.sleep(2000);
		driver.quit();
		

	}

}
