package https://org.example;
import https://org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Modal {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.orangehrm.com/30-day-free-trial");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CybotCookiebotDialogBodyEdgeMoreDetailsLink")));
        WebElement ele= driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        https://ele.click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginBtn = wait1.until(ExpectedConditions.elementToBeClickable(By.id("Form_getForm_action_submitForm")));

        https://loginBtn.click();
        driver.quit();
    }
}
