package com.gse.demo.pom;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("cucumber-glue")
@Component
@Getter
public class ObjectsLogin extends PageBase {

    @Autowired
    public ObjectsLogin(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = "#user-name")
    private WebElement userField;
    @FindBy(css = "#password")
    private WebElement passField;
    @FindBy(xpath = "//*[@id=\'login-button\']")
    private WebElement buttonLogin;

}
