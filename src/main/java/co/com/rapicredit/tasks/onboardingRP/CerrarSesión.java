package co.com.rapicredit.tasks.onboardingRP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.onboardingRP.AvisoDesembolso.CERRAR_SESION;
import static co.com.rapicredit.userInterface.onboardingRP.AvisoDesembolso.FLECHA_PERFIL;

public class CerrarSesión implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Scroll.to(FLECHA_PERFIL),
                Click.on(FLECHA_PERFIL),

                Scroll.to(CERRAR_SESION),
                Click.on(CERRAR_SESION)
        );

    }
    public static CerrarSesión cerrarSesión(){
        return new CerrarSesión();
    }
}
