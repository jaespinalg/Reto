package co.com.sura.runners.rest;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/features/rest/getbooking/get_booking.feature",
        glue="co.com.sura.stepdefinitions.rest.getbooking"
)
public class GetBookingRunner {
}
