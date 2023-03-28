package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup(); // setup web driver manager
        WebDriver Driver=new FirefoxDriver();     // Create browser object

        Driver.get("https://www.google.com/");
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println(Driver.getTitle());
        System.out.println(Driver.getCurrentUrl());


        Driver.quit();


    }
}
