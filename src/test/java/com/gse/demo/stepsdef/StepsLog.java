package com.gse.demo.stepsdef;

import com.gse.demo.model.DataTest;
import com.gse.demo.question.GetDataTestBy;
import com.gse.demo.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class StepsLog {
    Scenario scenario;
    DataTest data;
    @Before
    public void before(Scenario scenario) throws Exception {
        this.scenario = scenario;
        this.data = GetDataTestBy.scenario(this.scenario.getName());
    }

    @Autowired
    private Login login;
    @Given("Abro la pagina a probar")
    public void abro_la_pagina_a_probar() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        login.login(this.data);
    }
    @When("Ingreso mi usuario y contraseña")
    public void ingreso_mi_usuario_y_contraseña() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("Me logueo correctamente")
    public void me_logueo_correctamente() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("Veo mensaje de error en el login")
    public void veo_mensaje_de_error_en_el_login() {
        // Write code here that turns the phrase above into concrete actions

    }

}
