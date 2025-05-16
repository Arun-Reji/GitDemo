
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class excelRama {
    public static void main(String[] args) throws IOException {
        // Load the Excel file
        FileInputStream fis = new FileInputStream("selenium work.xlsx");
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        // Iterate through each row in the Excel sheet
        for (Row row : sheet) {
            Cell nameCell = row.getCell(0);
            Cell urlCell = row.getCell(1);
            Cell messageCell = row.getCell(3);
            Cell statusCell = row.createCell(4);

            nameCell.getStringCellValue();
            String url = urlCell.getStringCellValue();
            String message = messageCell.getStringCellValue().replace("{{Name}}", name);

            // Send connection request and retrieve status
            String status = sendConnectionRequest(url, message);
            statusCell.setCellValue(status);
        }

        // Save the updated Excel file
        FileOutputStream fos = new FileOutputStream("selenium work.xlsx");
        workbook.write(fos);
        fos.close();
        workbook.close();
    }

    public static String sendConnectionRequest(String url, String message) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\2117006\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        Web

        try {
            driver.get(url);

            // Login to LinkedIn (if not already logged in)
            WebElement loginButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
            loginButton.click();
            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            username.sendKeys("your-email@example.com");
            password.sendKeys("your-password");
            WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
            signInButton.click();

            // Send connection request
            WebElement connectButton = driver.findElement(By.xpath("//button[text()='Connect']"));
            connectButton.click();
            WebElement addNoteButton = driver.findElement(By.xpath("//button[text()='Add a note']"));
            addNoteButton.click();
            WebElement noteTextArea = driver.findElement(By.id("custom-message"));
            noteTextArea.sendKeys(message);
            WebElement sendButton = driver.findElement(By.xpath("//button[text()='Send']"));
            sendButton.click();

            // Retrieve status
            return "Request Sent";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed";
        } finally {
            driver.quit();
        }
    }
}
