package co.com.rapicredit.tasks.onboardingRP;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.rapicredit.userInterface.paginaLogin.LoginUnificado.*;
import static co.com.rapicredit.userInterface.paginaLogin.LoginUnificado.BOTON_INGRESAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginCorreo implements Task {


    public String contraseña;

    public LoginCorreo ingresarContraseña (String contraseña) {
        this.contraseña = contraseña;
        return this;
    }



    @Override

    public <T extends Actor> void performAs(T actor) {

        // Recupera el correo electrónico generado desde el contexto del actor
        String emailGenerado = GenerarCorreo.obtenerResultado(actor);

        actor.attemptsTo(

                Scroll.to(CORREO),
                Enter.theValue(emailGenerado).into(CORREO),

                Scroll.to(CONTRASEÑA),
                Enter.theValue(contraseña).into(CONTRASEÑA),

                Scroll.to(BOTON_INGRESAR),
                Click.on(BOTON_INGRESAR)
        );

    }
    public static LoginCorreo loginCorreoCreado(){
        return instrumented(LoginCorreo.class);
    }
}
