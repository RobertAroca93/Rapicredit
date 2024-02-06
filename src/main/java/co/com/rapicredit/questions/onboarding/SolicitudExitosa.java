package co.com.rapicredit.questions.onboarding;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.rapicredit.userInterface.onboardingRP.AvisoDesembolso.ESTADO_DESEMBOLSO_PENDIENTE;

public class SolicitudExitosa implements Question<Boolean> {

    private String avisoSolicitudExitosa ;

    public SolicitudExitosa verificaciónDeSolicitudExitosa (String avisoSolicitudExitosa){
        this.avisoSolicitudExitosa = avisoSolicitudExitosa;
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return (ESTADO_DESEMBOLSO_PENDIENTE.resolveFor(actor).containsOnlyText(avisoSolicitudExitosa));
    }
    public static SolicitudExitosa solicitudExitosa(){
        return new SolicitudExitosa();
    }
}
