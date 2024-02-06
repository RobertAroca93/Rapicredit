package co.com.rapicredit.tasks.onboardingRP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.onboardingRP.PrimerFormulario.CONFIRMAR_EMAIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmarCorreo implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        // Recupera el correo electrónico generado desde el contexto del actor
        String emailGenerado = GenerarCorreo.obtenerResultado(actor);

        actor.attemptsTo(

                Scroll.to(CONFIRMAR_EMAIL),
                Enter.theValue(emailGenerado).into(CONFIRMAR_EMAIL)
        );

    }

    public static ConfirmarCorreo enCampoDelFormulario() {
        return instrumented(ConfirmarCorreo.class);
    }

}
