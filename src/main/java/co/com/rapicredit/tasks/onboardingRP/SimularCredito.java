package co.com.rapicredit.tasks.onboardingRP;

import co.com.rapicredit.interactions.WaitUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.rapicredit.userInterface.onboardingRP.CalculaTuRapiplazo.PIDE_TU_RAPIPLAZO_YA;

public class SimularCredito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUtil.inSeconds(2),
                WaitUntil.the(PIDE_TU_RAPIPLAZO_YA, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(5).seconds(),
                Scroll.to(PIDE_TU_RAPIPLAZO_YA),
                Click.on(PIDE_TU_RAPIPLAZO_YA)

        );
    }
    public static SimularCredito simularCredito(){
        return new SimularCredito();
    }
}
