package https://org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Spinner {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
        driver.findElement(By.id("start")).click();


        driver.quit();
    }
}
