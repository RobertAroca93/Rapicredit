package co.com.rapicredit.tasks.onboardingRP;

import co.com.rapicredit.interactions.WaitUtil;
import co.com.rapicredit.userInterface.onboardingRP.DatosFinancieros;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.rapicredit.userInterface.onboardingRP.DatosFinancieros.*;

public class SeleccionarCuenta implements Task {

    public String numeroDeCuenta;

    public String confirmarNumeroDeCuenta;

    public SeleccionarCuenta ingresarNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
        return this;

    }

    public SeleccionarCuenta confirmarciónNumeroDeCuenta(String confirmarNumeroDeCuenta) {
        this.confirmarNumeroDeCuenta = confirmarNumeroDeCuenta;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUtil.inSeconds(2),
                WaitUntil.the(LISTADO_CUENTAS, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(5).seconds(),
                Scroll.to(LISTADO_CUENTAS),
                Click.on(LISTADO_CUENTAS),

                WaitUtil.inSeconds(2),
                WaitUntil.the(CUENTA_BANCOLOMBIA, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(5).seconds(),
                Scroll.to(CUENTA_BANCOLOMBIA),
                Click.on(CUENTA_BANCOLOMBIA),

                WaitUtil.inSeconds(2),
                WaitUntil.the(INGRESAR_CUENTA, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(5).seconds(),
                Scroll.to(INGRESAR_CUENTA),
                Enter.theValue(numeroDeCuenta).into(INGRESAR_CUENTA),

                WaitUtil.inSeconds(2),
                WaitUntil.the(CONFIRMAR_CUENTA, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(5).seconds(),
                Scroll.to(CONFIRMAR_CUENTA),
                Enter.theValue(confirmarNumeroDeCuenta).into(CONFIRMAR_CUENTA),

                Scroll.to(BOTON_CONTINUAR),
                Click.on(BOTON_CONTINUAR)


        );
    }

    public static SeleccionarCuenta seleccionarCuenta() {
        return new SeleccionarCuenta();
    }
}
