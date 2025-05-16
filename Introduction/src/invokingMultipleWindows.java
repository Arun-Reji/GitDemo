import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokingMultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\2117006\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> window = driver.getWindowHandles();
		Iterator<String> wid= window.iterator();
		String parent= wid.next();
		String newwindow= wid.next();
		driver.switchTo().window(newwindow);
		driver.get("https://rahulshettyacademy.com/");
		String str = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parent)	;
		WebElement ele2 =  driver.findElement(By.cssSelector("input[name='name']"));
		ele2.sendKeys(str);
		File file = ele2.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
	}

}
