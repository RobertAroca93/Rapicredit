package co.com.rapicredit.tasks.abrirPaginaWeb;

import co.com.rapicredit.userInterface.enLaPaginaWeb.EnLaPaginaWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaWeb implements Task {

    private EnLaPaginaWeb enLaPaginaWeb;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.browserOn(enLaPaginaWeb)
        );

    }

    public static AbrirPaginaWeb abrirPaginaWeb(){
        return new AbrirPaginaWeb();

    }
}
