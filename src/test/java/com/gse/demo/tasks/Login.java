package com.gse.demo.tasks;

import com.gse.demo.model.DataTest;
import com.gse.demo.pom.ActionsLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("cucumber-glue")
@Component
public class Login {
    @Autowired
    private ActionsLogin actLog;

    @Value("${url}")
    private String url;

    public void login(DataTest dataTest) throws InterruptedException {
        try {
            actLog.goTo(url);
            actLog.enterUser(dataTest.getDataUser());
            actLog.enterPassword(dataTest.getDataPassword());
            actLog.clickBtn();

            Thread.sleep(2000);
        }catch(Exception e){
            //Assert.fail("Error al ingresar a DDH: "+e);
        }

    }
}
