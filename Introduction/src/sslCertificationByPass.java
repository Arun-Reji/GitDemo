import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class sslCertificationByPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		//EdgeOptions opt = new EdgeOptions();
		options.setAcceptInsecureCerts(true);
		String path = "C:\\Users\\2117006\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
