package https://org.example;

import https://org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

            WebElement addBtn = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add Element']"))
            );
            https://addBtn.click();

            WebElement deleteBtn = wait.until(
                    ExpectedConditions.elementToBeClickable(By.cssSelector("button.added-manually"))
            );
            https://deleteBtn.click();

            System.out.println("Add and Delete button clicks executed successfully.");
        } finally {
            driver.quit();
        }
    }
}
