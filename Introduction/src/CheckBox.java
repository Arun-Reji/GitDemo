import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[value = 'Departure City']")).click();
		//driver.findElement(By.xpath("//a[@value ='BLR']")).click();
		driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value ='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value ='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value ='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		System.out.println(driver.findElement(By.cssSelector("[name='ctl00$mainContent$view_date2']")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("[name='ctl00$mainContent$view_date2']")).isEnabled());
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class = 'picker-second']")).getDomAttribute("style"));
//		WebElement check =  driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
//		check.click();
//		Assert.assertTrue(check.isSelected());
		
		
		
//		List <WebElement> cck = driver.findElements(By.xpath("//div /input[@type='checkbox'] /following-sibling::label"));
//		System.out.println("Number of checkboxes: " + cck.size());
////		for (int i=0; i<cck.size(); i++) {
////			System.out.println(cck.get(i).getText());
////		}
//		
//		for(WebElement ckk:cck) {
//			System.out.println(ckk.getText());
//		}
		
		driver.quit();

	}

}
