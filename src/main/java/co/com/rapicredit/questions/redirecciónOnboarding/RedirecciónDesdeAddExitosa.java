package co.com.rapicredit.questions.redirecciónOnboarding;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.rapicredit.userInterface.paginaLogin.LandingAdd.VALIDACIÓN_LOGIN_UNIFICADO_ADD;


public class RedirecciónDesdeAddExitosa implements Question<Boolean> {

    private String redirecciónAlLoginExitosa;

    public RedirecciónDesdeAddExitosa verificaciónDeRedirecciónExitosa (String redirecciónAlLoginExitosa){
        this.redirecciónAlLoginExitosa = redirecciónAlLoginExitosa;
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return (VALIDACIÓN_LOGIN_UNIFICADO_ADD.resolveFor(actor).containsOnlyText(redirecciónAlLoginExitosa));
    }
    public static RedirecciónDesdeAddExitosa redirecciónAlLoginExitosa(){
        return new RedirecciónDesdeAddExitosa();
    }
}
