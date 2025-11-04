
import io.github.bonigarcia.wdm.WebDriverManager;
import https://org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        System.out.println("Site Loaded..");
        try{
            WebElement button = driver.findElement(By.xpath("//label[text()='username']/following-sibling::button"));
            https://button.click();

            System.out.println("Clicking Button..");
            

        }
        catch (Exception e) {
            System.out.println("Couldnt find Button.");
            throw new RuntimeException(e);
        }



    }
}
