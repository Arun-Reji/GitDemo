import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//import java.net.URLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class brokeLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		String path = "C:\\Users\\2117006\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='gf-BIG']//li/a"));
		System.out.println("edad");
		for(int i=1; i<links.size(); i++) {
			String url = links.get(i).getDomAttribute("href");
			//System.out.println("reached=1");
			//System.out.println(url);
			//System.out.println("reached=2");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			//System.out.println("reached=3");
			conn.setRequestMethod("HEAD");
			//System.out.println("reached=4");
			conn.connect();
			//System.out.println("reached=5");
			int responseCode = conn.getResponseCode();
			//System.out.println("reached=6");
			System.out.println(responseCode);
			//System.out.println("reached=7");
			Assert.assertTrue(responseCode<400, "dert");
			if (responseCode < 400) {
				System.out.println(links.get(i).getText());
				System.out.println("kjnf");
				Assert.assertTrue(false);
			}

		}

//		String url = driver.findElement(By.cssSelector("a[href*='brokenlink	']")).getDomAttribute("href");
//		HttpURLConnection conn =  (HttpURLConnection) new URL(url).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int responseCose = conn.getResponseCode();
//		System.out.println(responseCose);

	}

}
