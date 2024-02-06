package co.com.rapicredit.tasks.onboardingRP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.rapicredit.userInterface.onboardingRP.SegundoFormulario.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DiligenciarDatosPersonales implements Task {

    public String primerNombre;

    public String primerApellido;

    public String fechaNacimiento;

    public String fechaExpedición;

    public DiligenciarDatosPersonales ingresarPrimerNombre (String primerNombre){
        this.primerNombre = primerNombre;
        return this;
    }
    public DiligenciarDatosPersonales ingresarPrimerApellido (String primerApellido){
        this.primerApellido = primerApellido;
        return this;
    }
    public DiligenciarDatosPersonales ingresarFechaNacimiento (String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }
    public DiligenciarDatosPersonales ingresarFechaExpedición (String fechaExpedición){
        this.fechaExpedición = fechaExpedición;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PRIMER_NOMBRE),
                WaitUntil.the(PRIMER_NOMBRE, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(primerNombre).into(PRIMER_NOMBRE),

                Scroll.to(PRIMER_APELLIDO),
                Enter.theValue(primerApellido).into(PRIMER_APELLIDO),

                Scroll.to(FECHA_DE_NACIMIENTO),
                Enter.theValue(fechaNacimiento).into(FECHA_DE_NACIMIENTO),

                Scroll.to(FECHA_DE_EXPEDICIÓN),
                Enter.theValue(fechaExpedición).into(FECHA_DE_EXPEDICIÓN),

                Scroll.to(GENERO),
                Click.on(GENERO),

                Scroll.to(BOTON_CONTINUAR),
                Click.on(BOTON_CONTINUAR)
        );

    }
    public static DiligenciarDatosPersonales diligenciarDatosPersonales(){
        return new DiligenciarDatosPersonales();
    }
}
