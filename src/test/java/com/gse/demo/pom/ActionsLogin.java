package com.gse.demo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("cucumber-glue")
@Component
public class ActionsLogin {

    @Autowired
    private ObjectsLogin objLogin;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void goTo(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }
    public WebElement find(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void enterUser(String user) {
        find(this.objLogin.getUserField()).sendKeys(user);
    }

    public void enterPassword(String password){
        this.objLogin.getPassField().sendKeys(password);
    }

    public void clickBtn() {
        this.objLogin.getButtonLogin().click();
    }
}
