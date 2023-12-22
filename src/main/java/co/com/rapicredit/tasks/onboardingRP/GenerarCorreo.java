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

public class GeneraryReutilizarCorreo implements Task {

    private String correoGenerado;


    public static Performable email() {
        return Task.where("{0} genera un correo aleatorio",)
        actor -> {
            GenerarCorreo generarCorreo = new GenerarCorreo();
            generarCorreo.correo = Faker.instance().internet().emailAddress();
            actor.remember("correoGenerado", generarCorreo.correo);
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {



        Faker faker = new Faker();

        String email = faker.internet().emailAddress();

        // Almacena el correo electrónico en el contexto del actor para que pueda ser recuperado más tarde
        actor.remember("emailGenerado", email);

        // Devuelve el correo electrónico generado como resultado de la tarea
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


    public static GeneraryReutilizarCorreo generaryReutilizarCorreo() {
        return new GeneraryReutilizarCorreo();
    }

    public static String obtenerResultado(Actor actor) {
        // Recupera el correo electrónico generado desde el contexto del actor
        return actor.recall("result");

    }

}

    /*public static void main(String[] args) {

        // Crea una instancia de JavaFaker
        Faker faker = new Faker();

        // Genera un correo electrónico ficticio
        String emailFake = generarEmailFake(faker);

        // Imprime el correo electrónico generado
        System.out.println("Correo electrónico generado: " + emailFake);

        // Puedes reutilizar el correo electrónico en diferentes partes de tu código
        // Por ejemplo, puedes usarlo en un formulario, base de datos, etc.
        String reusedEmail = reuseEmail(emailFake);
        System.out.println("Correo electrónico reutilizado: " + reusedEmail);
    }

    private static String generarEmailFake(Faker faker) {
        // Genera un correo electrónico ficticio
        return faker.internet().emailAddress();
    }

    private static String reuseEmail(String email) {
        // Aquí puedes realizar cualquier acción que necesites con el correo electrónico,
        // como almacenarlo en una base de datos, utilizarlo en un formulario, etc.
        return email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
    public static GenerarCorreo generarCorreo(){
        return new GenerarCorreo();
    }*/
