import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.cssSelector("#draggable")).click();
		WebElement sourse = driver.findElement(By.cssSelector("#draggable"));
		WebElement target = driver.findElement(By.cssSelector("#droppable"));
		Actions a =new Actions(driver);
		a.dragAndDrop(sourse, target).build().perform();
		
		driver.switchTo().defaultContent();
		

	}

}
