import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\2117006\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		//table
		WebElement ele =  driver.findElement(By.cssSelector(".table-display"));
		System.out.println(ele.findElements(By.tagName("tr")).size());
		System.out.println(ele.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement>secondRow = ele.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		//System.out.println(secondRow.get(0).getText());
		for (WebElement i:secondRow){
			System.out.println(i.getText());
		}

	}

}
