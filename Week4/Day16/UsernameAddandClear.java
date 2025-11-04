package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitBtn {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("newUser");

        driver.findElement(By.className("btn")).click();
//        driver.quit();


    }
}
