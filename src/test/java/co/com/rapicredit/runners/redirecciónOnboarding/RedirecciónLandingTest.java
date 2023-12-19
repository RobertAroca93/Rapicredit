package co.com.rapicredit.runners.redirecciónOnboarding;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/redireccionesOnboarding/irAlLoginDesdeEnlacesOnboardingRP.feature"},
        glue = {"co.com.rapicredit.stepDefinitions"},
        tags = {""}
)
public class RedirecciónLandingTest {
}
