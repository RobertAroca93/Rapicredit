package co.com.rapicredit.tasks.misCreditos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.paginaLogin.LoginUnificado.*;

public class DiligenciarLogin implements Task {

    public String correo;

    public String contraseña;

    public DiligenciarLogin ingresarCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public DiligenciarLogin ingresarContraseña(String contraseña) {
        this.contraseña = contraseña;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CORREO),
                Enter.theValue(correo).into(CORREO),

                Scroll.to(CONTRASEÑA),
                Enter.theValue(contraseña).into(CONTRASEÑA),

                Scroll.to(BOTON_INGRESAR),
                Click.on(BOTON_INGRESAR)
        );

    }

    public static DiligenciarLogin diligenciarLogin() {
        return new DiligenciarLogin();
    }
}
