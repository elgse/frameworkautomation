package com.gse.demo.conf;

import com.gse.demo.enums.Browser;
import com.gse.demo.util.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.time.Duration;

@Configuration
public class DriverConfig {

    @Value("${driver.type}")
    private Browser driverType;

    @Value("${element.wait.timeout.second}")
    private int webDriverWaitTimeout;
    @Scope("cucumber-glue")
    @Bean(destroyMethod = "quit")
    public WebDriver webDriver(){return DriverFactory.get(driverType);
    }

    @Scope("cucumber-glue")
    @Bean
    public WebDriverWait waitFor(){
        return new WebDriverWait(webDriver(), Duration.ofSeconds(webDriverWaitTimeout));
    }
}
