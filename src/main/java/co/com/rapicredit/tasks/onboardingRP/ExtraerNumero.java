package co.com.rapicredit.tasks.onboardingRP;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;

import static co.com.rapicredit.userInterface.onboardingRP.Firma.*;
import static co.com.rapicredit.userInterface.onboardingRP.Firma.BOTON_ACEPTAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ExtraerNumero implements Performable{

    private static String numeroGenerado;


    /*@Override
    public <T extends Actor> void performAs(T actor) {

        String numeroTexto = Text.of(CODIGO_FIRMA).viewedBy(actor).asString();
        int numero = Integer.parseInt(numeroTexto);

        actor.remember("numeroGenerado", numero);


    }*/

        @Override
        public <T extends Actor> void performAs(T actor) {
            // Capturar el número de 4 dígitos generado en el formulario web
            String numeroGenerado = the(CODIGO_FIRMA).answeredBy(actor).getText();

            // Ingresar cada dígito en un campo diferente
            actor.attemptsTo(
                    Enter.theValue(numeroGenerado.substring(0, 1)).into(PRIMER_CASILLA),
                    Enter.theValue(numeroGenerado.substring(1, 2)).into(SEGUNDA_CASILLA),
                    Enter.theValue(numeroGenerado.substring(2, 3)).into(TERCER_CASILLA),
                    Enter.theValue(numeroGenerado.substring(3, 4)).into(CUARTA_CASILLA),

                    Scroll.to(ACEPTAR_TODAS_LAS_OPCIONES),
                    Click.on(ACEPTAR_TODAS_LAS_OPCIONES),

                    Scroll.to(BOTON_ACEPTAR),
                    Click.on(BOTON_ACEPTAR)
            );
        }
    public static Performable numeroFirma() {
        return instrumented(ExtraerNumero.class);
    }

    public static String obtenerNumero(Actor actor) {
        return actor.recall("numeroGenerado");
    }
}

