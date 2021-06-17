package com.googleTranslate.automation.stepdefinitions;

import com.googleTranslate.automation.tasks.GoTo;
import com.googleTranslate.automation.tasks.TranslateTheWord;
import com.googleTranslate.automation.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class GoogleSuiteStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor martin = Actor.named("martin");

    @Before
    public void setUp(){
        martin.can(BrowseTheWeb.with(hisBrowser));
        martin.wasAbleTo(Open.browserOn(new GoogleHomePage()));
    }


    @Given("^that Martin enters the google option translate$")
    public void thatMartinEntersTheGoogleOptionTranslate() {
         martin.attemptsTo(GoTo.theApp());
         hisBrowser.get("https://translate.google.com.co/?hl=es-419");
    }


    @When("^he translate the word \"([^\"]*)\" from \"([^\"]*)\" to Spanish$")
    public void heTranslateTheWordFromToSpanish(String word, String languaje) {
         martin.attemptsTo(TranslateTheWord.theApp(word));
    }

    @Then("^she should see the word \"([^\"]*)\" in the screen$")
    public void sheShouldSeeTheWordInTheScreen(String arg1) {

    }

}
