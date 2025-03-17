package com.gse.demo.question;

import com.gse.demo.exceptions.ScenarioNotFoundException;
import com.gse.demo.model.DataTest;

public class GetDataTestBy {
    public static DataTest scenario(String scenario) throws Exception {
        return GetDataTest
                .fromDataSource()
                .stream()
                .filter(dataTest -> dataTest.getScenario().equalsIgnoreCase(scenario))
                .findFirst().orElseThrow(() -> new ScenarioNotFoundException("scenario data not found: " + scenario));
    }
}
