package com.gse;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"com.aventstack.chaintest.plugins.ChainTestCucumberListener:"}
)
public class Runner {
}
