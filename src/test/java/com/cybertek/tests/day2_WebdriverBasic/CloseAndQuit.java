package com.cybertek.tests.day2_WebdriverBasic;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://facebook.com");
        Thread.sleep(3000);

driver.close();

driver =new ChromeDriver();
driver.get("https://amazon.com");
Thread.sleep(5000);
driver.quit();


    }

}
