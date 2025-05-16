import java.time.Duration;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		String[] names = { "Cucumber", "Beetroot", "Tomato", "Potato" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		addItems(driver, names);
		//
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		//explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		//
		driver.quit();

	}

	public static void addItems(WebDriver driver,String[] names) {
		List<WebElement> ele = driver.findElements(By.className("product-name"));

		for (int i = 0; i < ele.size(); i++) {
			String[] vegg = ele.get(i).getText().split("-");
			String formattedVeg = vegg[0].trim();
			System.out.println(formattedVeg + i);
			List itemsNeeded = Arrays.asList(names);
			if (itemsNeeded.contains(formattedVeg)) {
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

			}

		}

	}

}
