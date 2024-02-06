package co.com.rapicredit.tasks.onboardingRP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.onboardingRP.AprobaciónCredito.BOTON_ACEPTAR_CREDITO;
import static co.com.rapicredit.userInterface.onboardingRP.CalculaTuRapiplazo.PIDE_TU_RAPIPLAZO_YA;

public class AceptarCredito implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(BOTON_ACEPTAR_CREDITO),
                Click.on(BOTON_ACEPTAR_CREDITO)
        );

    }
    public static AceptarCredito aceptarCredito(){
        return new AceptarCredito();
    }
}
