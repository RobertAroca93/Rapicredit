package co.com.rapicredit.questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.rapicredit.userInterface.paginaLogin.LoginUnificado.VALIDACIÓN_LOGIN_FALLIDO;

public class LoginFallido implements Question<Boolean> {

    private String mensajeDeLoginFallido;

    public LoginFallido verificaciónDeLoginFallido(String mensajeDeLoginFallido){
        this.mensajeDeLoginFallido = mensajeDeLoginFallido;
        return this;

    }



    @Override
    public Boolean answeredBy(Actor actor) {
        return (VALIDACIÓN_LOGIN_FALLIDO.resolveFor(actor).containsOnlyText(mensajeDeLoginFallido));
    }
    public static LoginFallido loginFallido(){
        return new LoginFallido();
    }
}
