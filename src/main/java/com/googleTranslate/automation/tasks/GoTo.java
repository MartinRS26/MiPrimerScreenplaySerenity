package com.googleTranslate.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.googleTranslate.automation.userinterfaces.GoogleHomePage.GOOGLE_APPS;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task{
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(GOOGLE_APPS));
                //Click.on(GOOGLE_TRANSLATE));
    }
    public static GoTo theApp(){
        return instrumented(GoTo.class);
    }


}
