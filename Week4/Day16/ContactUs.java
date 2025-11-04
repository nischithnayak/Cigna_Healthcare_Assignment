package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class ContactUs {


    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.grammarly.com/");
        driver.findElement(By.linkText("Contact Us")).click();
    }
}
