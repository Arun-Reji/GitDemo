import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sortingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\2117006\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//table[@class='table table-bordered']//thead//tr//th[1]")).click();
		List<WebElement> elementList = driver.findElements(By.xpath("//tbody//tr//td[1]"));
		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(originalList);
		List<String> sortedlList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlList);
		Assert.assertTrue(originalList.equals(sortedlList));
		List<String> pricee;
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tbody//tr//td[1]"));
			pricee = rows.stream().filter(s -> s.getText().contains("Tomato")).map(s -> getPriceVeg(s))
					.collect(Collectors.toList());
			pricee.forEach(a -> System.out.println(a));
			if (pricee.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (pricee.size() < 1);

//		elementList.stream()
//				.filter(s->s.getText().contains("Apple"))
//				.map(s -> s.getPriceVegg())
		// .map(sortingTable::getPriceVegg)
		// .collect(Collectors.toList());

	}
//	public String getPriceVegg(WebElement s) {
//		String priceValue =  s.findElement(By.xpath("following-sibling::td[1]")).getText();
//		return priceValue;
//	}

	private static String getPriceVeg(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
