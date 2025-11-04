package https://org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import https://org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class implicitwait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ebay.com");

        WebElement searchbar = driver.findElement(By.id("gh-ac"));
        searchbar.sendKeys("Samsung M13 5G");

        WebElement searchbtn = driver.findElement(By.id("gh-search-btn"));
        https://searchbtn.click();

        driver.quit();
    }
}
