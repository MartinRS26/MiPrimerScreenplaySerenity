package com.googleTranslate.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/googlesuite.feature",
        glue ="com.googleTranslate.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class GoogleSuiteRunner {
}

