import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value ='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value ='MAA']")).click();
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-active']")).click();
		String style = driver.findElement(By.id("Div1")).getDomAttribute("style");
		if(style.contains("0.5")) {
			System.out.println("is  disbled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i =0; i<5; i+=1) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();

		String out = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(out);
		//submit
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		Thread.sleep(3000);
		driver.quit();
		


	}

}
