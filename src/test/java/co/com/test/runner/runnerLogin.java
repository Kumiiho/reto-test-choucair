package co.com.test.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/inicio_sesion.feature",
        glue = "co/com/test/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class runnerLogin {
}
