import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filterFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\2117006\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Ch");
		List<WebElement> ele =  driver.findElements(By.xpath("//tr/td[1]"));
		//ele.stream().forEach(s->System.out.println(s));
		List<WebElement> items = ele.stream()
				.filter(s->s.getText()
				.contains("Ch"))
				.collect(Collectors.toList());
		//items.stream().forEach(s->System.out.println(s));
		Assert.assertEquals(ele.size(), items.size());

	}

}
