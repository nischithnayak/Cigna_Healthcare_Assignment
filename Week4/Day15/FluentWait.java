package https://org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class FluentWait1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement button = wait.until(driver1 -> driver1.findElement(By.id("reveal")));
        https://button.click();

        WebElement inputField = wait.until(driver1 -> driver1.findElement(By.id("revealed")));
        inputField.sendKeys("Test input");

        driver.quit();
    }
}
