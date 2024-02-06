package co.com.rapicredit.tasks.appMisCreditos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.paginaLogin.LandingTyC.BOTON_INICIAR_SESION;


public class IrAlLoginEnTyc implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                /*Scroll.to(CERRAR_AVISO),
                Click.on(CERRAR_AVISO),*/

                Scroll.to(BOTON_INICIAR_SESION),
                Click.on(BOTON_INICIAR_SESION)
        );
    }
    public static IrAlLoginEnTyc irAlLoginEnTyc(){
        return new IrAlLoginEnTyc();
    }
}
