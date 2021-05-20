package com.aviaca.qa.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.aviaca.qa.stepsdefinitions",
        snippets = CAMELCASE,
        features = "src/test/resources/features/reserva.feature",
        tags = {"@reservaSoloIda"}
)
public class ReservarRunner {
}
