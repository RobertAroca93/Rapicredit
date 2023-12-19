package co.com.rapicredit.tasks.appMisCreditos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Set;

import static co.com.rapicredit.userInterface.paginaLogin.OnboardingRP.ENLACE_PPD;

public class AbrirPaginaPpd implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ENLACE_PPD),
                Click.on(ENLACE_PPD)
        );
        // Enfocarse en la nueva pestaña
        String ventanaPrincipal = actor.abilityTo(net.serenitybdd.screenplay.abilities.BrowseTheWeb.class).getDriver().getWindowHandle();
        Set<String> ventanas = actor.abilityTo(net.serenitybdd.screenplay.abilities.BrowseTheWeb.class).getDriver().getWindowHandles();

        for (String ventana : ventanas) {
            if (!ventana.equals(ventanaPrincipal)) {
                actor.abilityTo(net.serenitybdd.screenplay.abilities.BrowseTheWeb.class).getDriver().switchTo().window(ventana);
                break;
            }
        }
    }

    public static AbrirPaginaPpd abrirPaginaPpd() {
        return new AbrirPaginaPpd();
    }

}

