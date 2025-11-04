package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Input {


    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        List<WebElement> inputs=driver.findElements(By.tagName("input"));
        System.out.println("Total input fields: "+inputs.size());
    }
}
