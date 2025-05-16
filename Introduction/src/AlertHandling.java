import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Arun Reji";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		String str = driver.switchTo().alert().getText();
		System.out.println(str);
		if (str.contains(name)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();

	}

}
