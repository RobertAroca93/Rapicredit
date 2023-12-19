package co.com.rapicredit.tasks.appMisCreditos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.paginaLogin.Landing.LOGIN;

public class NavegarHaciaElLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LOGIN),
                Click.on(LOGIN)
        );

    }

    public static NavegarHaciaElLogin navegarHaciaElLogin(){
        return new NavegarHaciaElLogin();
    }
}
