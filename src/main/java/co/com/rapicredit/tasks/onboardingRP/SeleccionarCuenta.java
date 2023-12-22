package co.com.rapicredit.tasks.onboardingRP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.onboardingRP.DatosFinancieros.*;

public class SeleccionarCuenta implements Task {

    public String numeroDeCuenta;

    public String confirmarNumeroDeCuenta;

    public SeleccionarCuenta ingresarNumeroDeCuenta(String numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
        return this;

    }
    public SeleccionarCuenta confirmarciónNumeroDeCuenta(String confirmarNumeroDeCuenta){
        this.confirmarNumeroDeCuenta = confirmarNumeroDeCuenta;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LISTADO_CUENTAS),
                Click.on(LISTADO_CUENTAS),

                Scroll.to(CUENTA_BANCOLOMBIA),
                Click.on(CUENTA_BANCOLOMBIA),

                Scroll.to(INGRESAR_CUENTA),
                Enter.theValue(numeroDeCuenta).into(INGRESAR_CUENTA),

                Scroll.to(CONFIRMAR_CUENTA),
                Enter.theValue(confirmarNumeroDeCuenta).into(CONFIRMAR_CUENTA),

                Scroll.to(BOTON_CONTINUAR),
                Click.on(BOTON_CONTINUAR)


        );
    }
}
