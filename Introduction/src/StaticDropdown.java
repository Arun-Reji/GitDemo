import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//-----------------------------------------------------------------------------------------------------------------
		//static drop1
		//
//		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropDown = new Select(staticDropdown);
//		dropDown.selectByIndex(1);
//		Assert.assertEquals(dropDown.getFirstSelectedOption().getText(), "INR");
//-------------------------------------------------------------------------------------------------------------------
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
//		int i = 1;
//		while(i<5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i+=1;
//		}
		for(int i =0; i<5; i+=1) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();

		String out = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(out);
		
		
	}

}
