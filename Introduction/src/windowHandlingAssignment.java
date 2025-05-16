import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowHandlingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("li a[href='/windows']")).click();
		driver.findElement(By.cssSelector("div[class='example'] a")).click();
		Set<String> wind =  driver.getWindowHandles();
		Iterator<String> it =  wind.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		

	}

}
