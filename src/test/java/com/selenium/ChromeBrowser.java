package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();   // setup web driver manager
        WebDriver driverChrome=new ChromeDriver();   // Create browser object
        driverChrome.get("https://www.youtube.com/");
        driverChrome.manage().window().maximize();

        System.out.println(driverChrome.getTitle());
        System.out.println(driverChrome.getCurrentUrl());

        driverChrome.quit();

    }
}
