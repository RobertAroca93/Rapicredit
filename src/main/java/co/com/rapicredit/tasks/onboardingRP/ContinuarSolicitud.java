package co.com.rapicredit.tasks.onboardingRP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.onboardingRP.CuentanosAlgoMás.BOTON_CONTINUAR;

public class ContinuarSolicitud implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(BOTON_CONTINUAR),
                Click.on(BOTON_CONTINUAR)
        );

    }
}
