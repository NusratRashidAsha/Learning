package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOpening {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup(); // setup web driver manager
        WebDriver Driver=new FirefoxDriver();     // Create browser object

        Driver.get("https://www.google.com/");
        Driver.manage().window().maximize();

        System.out.println(Driver.getTitle());
        System.out.println(Driver.getCurrentUrl());


        Driver.quit();

        WebDriverManager.chromedriver().setup();
        WebDriver driverChrome=new ChromeDriver();
        driverChrome.get("https://www.youtube.com/");
        driverChrome.manage().window().maximize();

        System.out.println(driverChrome.getTitle());
        System.out.println(driverChrome.getCurrentUrl());

        driverChrome.quit();

    }
}
