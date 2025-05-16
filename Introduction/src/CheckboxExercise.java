import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement check =  driver.findElement(By.cssSelector("input[id='checkBoxOption1']"));
		check.click();
		Assert.assertTrue(check.isSelected());
		check.click();
		Assert.assertFalse(check.isSelected());
		
		List <WebElement> ele = driver.findElements(By.cssSelector("input[type='checkbox']"));
		int count= ele.size();
		System.out.println(count);

	}

}
