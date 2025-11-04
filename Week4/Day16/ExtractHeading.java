package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class ContactUs {


    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://en.wikipedia.org/?gad_source=1&gad_campaignid=12880201430&gbraid=0AAAAABaLK9a1d8MT-JRTEKJMmdG1a3JGd&gclid=EAIaIQobChMIv9WiypvYkAMVgKJmAh2EiSIBEAAYASAAEgJLIfD_BwE");
        String heading = driver.findElement(By.id("Welcome_to_Wikipedia")).getText();
        System.out.println("Heading: " + heading);

    }
}
