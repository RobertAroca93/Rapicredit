package co.com.rapicredit.tasks.misCreditos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rapicredit.userInterface.paginaLogin.Landing.PIDE_TU_RAPIPLAZO;

public class IrAlOnboarding implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PIDE_TU_RAPIPLAZO),
                Click.on(PIDE_TU_RAPIPLAZO)
        );

    }
    public static IrAlOnboarding irAlOnboarding(){
        return new IrAlOnboarding();
    }

}
