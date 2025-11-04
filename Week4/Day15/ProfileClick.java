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
        driver.get("https://practice.expandtesting.com/");
        System.out.println("Site Loaded..");
        try{
            WebElement profileLink = driver.findElement(By.xpath("//a[starts-with(@href,'/users/1')]"));
            System.out.println("Clicking Profile Page..");
            https://profileLink.click();
            System.out.println("Opened Profile Page for User!");
        }
        catch (Exception e) {
            System.out.println("Couldnt find profile page.");
            throw new RuntimeException(e);
        }



    }
}
