package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestLogin {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys("Nischith");
        driver.quit();
    }
}
