package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintTitle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Page Title: "+driver.getTitle());
        driver.quit();
    }


}
