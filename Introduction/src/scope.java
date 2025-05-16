import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\2117006\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement ele = driver.findElement(By.cssSelector("div[id='gf-BIG']"));
		System.out.println(ele.findElements(By.tagName("a")).size());
		WebElement eleff= ele.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(eleff.findElements(By.tagName("a")).size());
		//div[@id='gf-BIG']//table/tbody/tr/td[1]/ul
		
		for(int i=1; i<eleff.findElements(By.tagName("a")).size();i++) {
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			String key = Keys.chord(Keys.CONTROL, Keys.ENTER);
			eleff.findElements(By.tagName("a")).get(i).sendKeys(click);
			Thread.sleep(3000);
		}
			 Set<String> window =  driver.getWindowHandles();
			 Iterator<String> it =  window.iterator();
			 while (it.hasNext()) 
			 {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			
		
		
		
		driver.quit();
		
		

	}

}
