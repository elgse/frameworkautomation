package com.gse.demo.util.driver;

import com.gse.demo.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverFactory {

    public static WebDriver get(Browser browser){

        if (Browser.chrome == browser){
            return new ChromeDriver();
        }

        if (Browser.firefox == browser){
            return  new FirefoxDriver();
        }

        if(Browser.ie == browser){
            return new InternetExplorerDriver();
        }

        throw new IllegalArgumentException("driver not found browser"+browser);
    }
}
