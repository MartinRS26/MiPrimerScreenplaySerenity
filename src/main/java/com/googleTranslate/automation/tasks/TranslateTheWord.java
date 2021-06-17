package com.googleTranslate.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

import static com.googleTranslate.automation.userinterfaces.GoogleHomePage.GOOGLE_APPS;


import static com.googleTranslate.automation.userinterfaces.GoogleTranslatePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TranslateTheWord implements Task{

    private  String word;

    public TranslateTheWord(String word){
        this.word = word;
    }
    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(
                Click.on(BUTTON_LANGUAGES),
                Click.on(SOURCE_LANGUAGE_ONE),
                Enter.theValue(word).into(BOX));
    }
    public static TranslateTheWord theApp(String word)  {
        return instrumented(TranslateTheWord.class,word);
    }


}
