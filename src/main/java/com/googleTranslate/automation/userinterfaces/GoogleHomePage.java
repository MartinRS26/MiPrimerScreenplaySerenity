package com.googleTranslate.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/")
public class GoogleHomePage extends PageObject {
   public static final Target GOOGLE_APPS = Target.the("Google apps button").located(By.id("gbwa"));
   //public static final Target GOOGLE_TRANSLATE = Target.the("Google translate option").located(By.xpath("//*/ul/li[@class='j1ei8c'][13]"));

}
