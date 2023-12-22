package co.com.rapicredit.tasks.onboardingRP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.onboardingRP.ValidaciónSolicitud.ACEPTAR_USO_DE_DATOS;
import static co.com.rapicredit.userInterface.onboardingRP.ValidaciónSolicitud.BOTON_ENVIAR_SOLICITUD;

public class ConfirmarSolicitud implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ACEPTAR_USO_DE_DATOS),
                Click.on(ACEPTAR_USO_DE_DATOS),

                Scroll.to(BOTON_ENVIAR_SOLICITUD),
                Click.on(BOTON_ENVIAR_SOLICITUD)

        );

    }
}
