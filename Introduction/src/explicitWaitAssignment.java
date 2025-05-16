import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitAssignment {

	public static void main(String[] args) {
		String unsername = "rahulshettyacademy";
		String password = "learning";
		WebDriver driver = new EdgeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys(unsername);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("[value = 'user']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement ele  = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropDown = new Select(ele);
		dropDown.selectByVisibleText("Consultant");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.id("signInBtn")).click();
		//List <WebElement> products = driver.findElements(By.cssSelector("div app-card-list[class='row'] button"));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div app-card-list[class='row'] button")));
		
		List <WebElement> products = driver.findElements(By.cssSelector("div app-card-list[class='row'] button"));
		for(int i=0;i<products.size(); i++) {
			products.get(i).click();
	
		}
		
		driver.findElement(By.partialLinkText("Checkout")).click();
		

	}

}
