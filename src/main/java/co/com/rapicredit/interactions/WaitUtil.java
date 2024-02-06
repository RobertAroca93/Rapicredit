package co.com.rapicredit.interactions;

import co.com.rapicredit.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitUtil implements Interaction {

    private double seconds;

    public WaitUtil(double seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Wait.inSeconds(seconds);
    }

    public static WaitUtil inSeconds(double seconds){
        return Tasks.instrumented(WaitUtil.class, seconds);
    }
}
