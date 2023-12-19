package co.com.rapicredit.questions.redirecciónOnboarding;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.rapicredit.userInterface.paginaLogin.LandingTyC.VALIDACIÓN_LOGIN_UNIFICADO_TYC;

public class RediecciónDesdeTycExitosa implements Question<Boolean> {

    private String redirecciónTycAlLoginExitosa;

    public RediecciónDesdeTycExitosa verificaciónDeRedirecciónTycExitosa(String redirecciónTycAlLoginExitosa){
        this.redirecciónTycAlLoginExitosa = redirecciónTycAlLoginExitosa;
        return this;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return (VALIDACIÓN_LOGIN_UNIFICADO_TYC.resolveFor(actor).containsOnlyText(redirecciónTycAlLoginExitosa));
    }
    public static RediecciónDesdeTycExitosa rediecciónDesdeTycExitosa(){
        return new RediecciónDesdeTycExitosa();
    }
}
