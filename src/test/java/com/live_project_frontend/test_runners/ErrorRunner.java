package com.live_project_frontend.test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"@target/failed-tests/failed.txt"},
        glue = {"com/live_project_frontend/step_definitions"},
        plugin = {"pretty", "html:target/failed-tests/rerun-cucumber-report.html",
                "rerun:target/failed-tests/failed.txt"}
)
public class ErrorRunner {
}
