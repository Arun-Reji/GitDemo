import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class scopeAssignment {

	public static void main(String[] args) {
		String path = "C:\\Users\\2117006\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String str = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		//dropdown select
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(dropDown);
		select.selectByVisibleText(str);
		//name
		driver.findElement(By.id("name")).sendKeys(str);
		driver.findElement(By.id("alertbtn")).click();
		
		String txt = driver.switchTo().alert().getText();
		if(txt.contains(str)) {
			System.out.println(txt);
		}
		
		
		
		
		
		

	}

}
