package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {

       // WebDriverManager.chromedriver().setup();   // setup web driver manager

       // WebDriver driverChrome=new ChromeDriver();// Create browser object
       /// driverChrome.get("https://www.youtube.com/");
       // driverChrome.manage().window().maximize();


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }
}
