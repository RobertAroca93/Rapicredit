package co.com.rapicredit.tasks.misCreditos;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Set;

import static co.com.rapicredit.userInterface.paginaLogin.OnboardingRP.ENLACE_TYC;

public class AbrirPaginaTyc implements Task {

   /* public void manejarVentanaEmergente(Actor actor, WebDriver driver) {
        String ventanaPrincipal = driver.getWindowHandle();
        String nuevaVentana = "";

        // Captura todos los identificadores de las ventanas abiertas
        Set<String> handles = driver.getWindowHandles();

        // Itera sobre las ventanas y cambia el foco a la nueva ventana
        for (String ventana : handles) {
            if (!ventana.equalsIgnoreCase(ventanaPrincipal)) {
                driver.switchTo().window(ventana);
                break;
            }
        }

    }*/

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ENLACE_TYC),
                Click.on(ENLACE_TYC)
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


    public static AbrirPaginaTyc manejarVentanaEmergente() {
        return new AbrirPaginaTyc();
    }
}
