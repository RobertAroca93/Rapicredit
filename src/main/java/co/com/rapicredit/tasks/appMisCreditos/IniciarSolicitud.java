package co.com.rapicredit.tasks.appMisCreditos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.paginaLogin.OnboardingRP.*;

public class IniciarSolicitud implements Task {

    public String correoSolicitud;

    public IniciarSolicitud ingresarCorreoSolicitud(String correoSolicitud){
        this.correoSolicitud = correoSolicitud;
        return this;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CORREO_SOLICITUD),
                Enter.theValue(correoSolicitud).into(CORREO_SOLICITUD),

                Scroll.to(BOTON_ENVIAR),
                Click.on(BOTON_ENVIAR),

                Scroll.to(BOTON_CONFIRMACIÓN),
                Click.on(BOTON_CONFIRMACIÓN)

        );

    }
    public static IniciarSolicitud iniciarSolicitud(){
        return new IniciarSolicitud();
    }
}
