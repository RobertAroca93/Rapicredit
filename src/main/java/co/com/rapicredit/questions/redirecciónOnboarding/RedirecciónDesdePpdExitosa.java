package co.com.rapicredit.questions.redirecciónOnboarding;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.rapicredit.userInterface.paginaLogin.LandingPpd.VALIDACIÓN_LOGIN_UNIFICADO_PDD;


public class RedirecciónDesdePpdExitosa implements Question<Boolean> {

    private String redireccionDesdePpdExitosa;

    public RedirecciónDesdePpdExitosa verificaciónDeRedirecciónPpdExitosa(String redireccionDesdePpdExitosa){
        this.redireccionDesdePpdExitosa = redireccionDesdePpdExitosa;
        return this;

    }
    @Override
    public Boolean answeredBy(Actor actor) {

        return (VALIDACIÓN_LOGIN_UNIFICADO_PDD.resolveFor(actor).containsOnlyText(redireccionDesdePpdExitosa));


    }


    public static RedirecciónDesdePpdExitosa redirecciónDesdePpdExitosa(){
        return new RedirecciónDesdePpdExitosa();
    }
}
