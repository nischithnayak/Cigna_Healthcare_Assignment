package https://org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import https://org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println("Site Loaded...");

        try {
         WebElement input = driver.findElement(By.cssSelector("input[name='user-name']"));
            input.sendKeys("dynamicUser");
            System.out.println("Username entered successfully.");
        } catch (Exception e) {
            System.out.println("Couldn't find the username input field.");
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
