package bdd.demo.genapp.repository;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:build/reports/cucumber/cucumber-report.json"}, strict = true)
public class CucumberRunner {
}
