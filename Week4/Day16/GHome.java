//Set up a basic Selenium project in Java and open the Google homepage in Chrome
package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GHomePage {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Opened Google successfully!..");
        driver.quit();
    }

}
