import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class childwindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it =  windows.iterator();
		String parent =  it.next();
		String child = it.next();
		driver.switchTo().window(child);
		String ss = driver.findElement(By.className("red")).getText();
		String [] arr=  ss.split("@");
		System.out.println(arr[1]);
		String a = arr[1];
		String [] arr1 = a.split("\\.");
		System.out.println(arr1[0]);
		
		//in parent
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(arr1[0]);
		

	}

}
