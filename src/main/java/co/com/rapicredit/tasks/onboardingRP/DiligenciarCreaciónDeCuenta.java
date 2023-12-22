package co.com.rapicredit.tasks.onboardingRP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.onboardingRP.PrimerFormulario.*;

public class DiligenciarPrimerForm implements Task {

    public String numeroDeIdentificación;

    public String numeroDeCelular;

    public String confirmarEmail;

    public String contraseña;

    public String confirmarContraseña;

    public DiligenciarPrimerForm ingresarNumeroDeIdentificación(String numeroDeIdentificación) {
        this.numeroDeIdentificación = numeroDeIdentificación;
        return this;
    }

    public DiligenciarPrimerForm ingresarNumeroDeCelular(String numeroDeCelular) {
        this.numeroDeCelular = numeroDeCelular;
        return this;
    }

    public DiligenciarPrimerForm ingresarEmail(String confirmarEmail) {
        this.confirmarEmail = confirmarEmail;
        return this;
    }

    public DiligenciarPrimerForm ingresarContraseña(String contraseña) {
        this.contraseña = contraseña;
        return this;
    }

    public DiligenciarPrimerForm ingresarConfirmaciónContraseña(String confirmarContraseña) {
        this.confirmarContraseña = confirmarContraseña;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TIPODEIDENTIFICACIÓN_CEDULA),
                Click.on(TIPODEIDENTIFICACIÓN_CEDULA),

                Scroll.to(NUMERO_DE_IDENTIFICACIÓN),
                Enter.theValue(numeroDeIdentificación).into(NUMERO_DE_IDENTIFICACIÓN),

                Scroll.to(NUMERO_DE_CELULAR),
                Enter.theValue(numeroDeCelular).into(NUMERO_DE_CELULAR),

                Scroll.to(CONFIRMAR_EMAIL),
                Enter.theValue(confirmarEmail).into(CONFIRMAR_EMAIL),

                Scroll.to(INGRESAR_CONTRASEÑA),
                Enter.theValue(contraseña).into(INGRESAR_CONTRASEÑA),

                Scroll.to(CONFIRMAR_CONTRASEÑA),
                Enter.theValue(confirmarContraseña).into(CONFIRMAR_CONTRASEÑA),

                Scroll.to(ACEPTAR_TERMINOS),
                Click.on(ACEPTAR_TERMINOS),

                Scroll.to(ACEPTAR_POLITICAS),
                Click.on(ACEPTAR_POLITICAS),

                Scroll.to(BOTON_CONTINUAR),
                Click.on(BOTON_CONTINUAR)
        );


    }
    public static DiligenciarPrimerForm diligenciarPrimerForm(){
        return new DiligenciarPrimerForm();
    }
}
