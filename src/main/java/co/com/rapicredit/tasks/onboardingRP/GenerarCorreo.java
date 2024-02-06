package co.com.rapicredit.tasks.onboardingRP;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.rapicredit.userInterface.paginaLogin.OnboardingRP.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GenerarCorreo implements Task {

    private static String emailGenerado;

    private static int contador = 0;


    @Override
    public <T extends Actor> void performAs(T actor) {


        Faker faker = new Faker();

        int randomNumber = faker.number().randomDigit();

        String email =  "correoprueba" + randomNumber + "@yopmail.com";

        /*Increment the counter for each email generation
        contador++;

        // Construct the email address with a numeric suffix
        String email = "automationtest" + String.format("%02d", contador) + "@yopmail.com";*/

        // Almacena el correo electrónico en el contexto del actor para que pueda ser recuperado más tarde
        actor.remember("emailGenerado", email);


        actor.attemptsTo(
                Scroll.to(CORREO_SOLICITUD),
                Enter.theValue(email).into(CORREO_SOLICITUD),

                Scroll.to(BOTON_ENVIAR),
                Click.on(BOTON_ENVIAR),

                Scroll.to(BOTON_CONFIRMACIÓN),
                Click.on(BOTON_CONFIRMACIÓN)

        );
    }

    public static Performable email() {
        return instrumented(GenerarCorreo.class);
    }

    public static String obtenerResultado(Actor actor) {
        // Recupera el correo electrónico generado desde el contexto del actor
        return actor.recall("emailGenerado");
    }


}
