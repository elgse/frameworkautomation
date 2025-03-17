package com.gse.demo.exceptions;

public class ScenarioNotFoundException extends Exception {
    public ScenarioNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
