package co.com.rapicredit.tasks.onboardingRP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.onboardingRP.CalculaTuRapiplazo.PIDE_TU_RAPIPLAZO_YA;
import static co.com.rapicredit.userInterface.onboardingRP.TercerFormulario.*;

public class DiligenciarDatosAdicionales implements Task {

    public String direcciónResidencia;

    public String ingresosMes;

    public String gastosMes;

    public DiligenciarDatosAdicionales ingresarDirecciónResidencia(String direcciónResidencia) {
        this.direcciónResidencia = direcciónResidencia;
        return this;
    }

    public DiligenciarDatosAdicionales ingresarIngresosMes(String ingresosMes) {
        this.ingresosMes = ingresosMes;
        return this;
    }

    public DiligenciarDatosAdicionales ingresarGastosMes(String gastosMes) {
        this.gastosMes = gastosMes;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LISTADO_ESTADO_CIVIL),
                Click.on(LISTADO_ESTADO_CIVIL),

                Scroll.to(ESTADO_CIVIL_SOLTERO),
                Click.on(ESTADO_CIVIL_SOLTERO),

                Scroll.to(LISTADO_NUMERO_DE_HIJOS),
                Click.on(LISTADO_NUMERO_DE_HIJOS),

                Scroll.to(NUMERO_DE_HIJOS_0),
                Click.on(NUMERO_DE_HIJOS_0),

                Scroll.to(LISTADO_PERSONAS_A_CARGO),
                Click.on(LISTADO_PERSONAS_A_CARGO),

                Scroll.to(PERSONAS_A_CARGO_0),
                Click.on(PERSONAS_A_CARGO_0),

                Scroll.to(LISTADO_NIVEL_ESTUDIOS),
                Click.on(LISTADO_NIVEL_ESTUDIOS),

                Scroll.to(NIVEL_ESTUDIOS_PREGRADO),
                Click.on(NIVEL_ESTUDIOS_PREGRADO),

                Scroll.to(SITUACIÓN_LABORAL),
                Click.on(SITUACIÓN_LABORAL),

                Scroll.to(LISTADO_DPTO),
                Click.on(LISTADO_DPTO),

                Scroll.to(DPTO_BOGOTA),
                Click.on(DPTO_BOGOTA),

                Scroll.to(LISTADO_CIUDAD),
                Click.on(LISTADO_CIUDAD),

                Scroll.to(CIUDAD_BOGOTA),
                Click.on(CIUDAD_BOGOTA),

                Scroll.to(DIRECCIÓN_RESIDENCIA),
                Enter.theValue(direcciónResidencia).into(DIRECCIÓN_RESIDENCIA),

                Scroll.to(LISTADO_ESTRATO),
                Click.on(LISTADO_ESTRATO),

                Scroll.to(ESTRATO_3),
                Click.on(ESTRATO_3),

                Scroll.to(TIPO_DE_VIVIENDA_PROPIA),
                Click.on(TIPO_DE_VIVIENDA_PROPIA),

                Scroll.to(INGRESOS_MES),
                Enter.theValue(ingresosMes).into(INGRESOS_MES),

                Scroll.to(GASTOS_MES),
                Enter.theValue(gastosMes).into(GASTOS_MES),

                Scroll.to(BOTON_CONTINUAR),
                Click.on(BOTON_CONTINUAR)


        );

    }

    public static DiligenciarDatosAdicionales diligenciarDatosAdicionales() {
        return new DiligenciarDatosAdicionales();

    }
}

