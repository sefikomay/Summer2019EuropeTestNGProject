package com.cybertek.tests.day2_WebdriverBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://amazon.com");
        driver.navigate().to("https://facebook.com");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().refresh();





    }
}
