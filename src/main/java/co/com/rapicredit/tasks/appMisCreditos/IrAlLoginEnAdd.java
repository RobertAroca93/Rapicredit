package co.com.rapicredit.tasks.appMisCreditos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.paginaLogin.LandingAdd.BOTON_INICIAR_SESION_ADD;


public class IrAlLoginEnAdd implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                /*Scroll.to(CERRAR_AVISO_ADD),
                Click.on(CERRAR_AVISO_ADD),*/

                Scroll.to(BOTON_INICIAR_SESION_ADD),
                Click.on(BOTON_INICIAR_SESION_ADD)

        );
    }
    public static IrAlLoginEnAdd irAlLoginEnAdd(){
        return new IrAlLoginEnAdd();
    }
}
