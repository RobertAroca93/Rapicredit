package co.com.rapicredit.runners.crearCuentayHacerLogin;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/crearCuentaRapiplazo/crearCuentaRPeIniciarSesión.feature"},
        glue = {"co.com.rapicredit.stepDefinitions.crearCuentayhacerLogin"},
        tags = {""}
)
public class CrearCuentayHacerLoginTest {
}
