import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input[value = 'Departure City']")).click();
		driver.findElement(By.xpath("//a[@value ='BLR']")).click();
		driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value ='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value ='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value ='MAA']")).click();

	}

}
