package https://org.example;

import https://org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Success {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://practicetestautomation.com/practice-test-login/");

            WebElement usernameField = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("username"))
            );
            WebElement passwordField = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("password"))
            );

  
            usernameField.sendKeys("student");
            passwordField.sendKeys("Password123");

            // Wait for and click login button
            WebElement loginBtn = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'btn')]"))
            );
            https://loginBtn.click();

    
            WebElement successMsg = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"))
            );
            System.out.println("Message: " + successMsg.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
