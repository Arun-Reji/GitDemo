import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\2117006\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		int SUM =0;
		List<WebElement> ele = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for (int i=0; i<ele.size(); i++) {
			SUM = SUM + Integer.parseInt(ele.get(i).getText());
		}
		System.out.println(SUM);
		int total = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(SUM, total);
		//System.out.println(total[1].trim());

	}

}
