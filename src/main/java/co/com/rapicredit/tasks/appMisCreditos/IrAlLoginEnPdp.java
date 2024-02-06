package co.com.rapicredit.tasks.appMisCreditos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.paginaLogin.LandingPpd.BOTON_INICIAR_SESIÓN_PDP;



public class IrAlLoginEnPdp implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                /*Scroll.to(CERRAR_AVISO),
                Click.on(CERRAR_AVISO),*/

                Scroll.to(BOTON_INICIAR_SESIÓN_PDP),
                Click.on(BOTON_INICIAR_SESIÓN_PDP)



        );


    }
    public static IrAlLoginEnPdp irAlLoginEnPdp(){
        return new IrAlLoginEnPdp();
    }
}
