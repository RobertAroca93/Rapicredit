package co.com.rapicredit.questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.rapicredit.userInterface.paginaLogin.LoginUnificado.VALIDACIÓN_LOGIN_EXITOSO;

public class LoginExitoso implements Question<Boolean> {

    private String mensajeDeLoginExitoso;

    public LoginExitoso verificaciónDeLoginExitoso (String mensajeDeLoginExitoso){
        this.mensajeDeLoginExitoso = mensajeDeLoginExitoso;
        return this;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return (VALIDACIÓN_LOGIN_EXITOSO.resolveFor(actor).containsOnlyText(mensajeDeLoginExitoso));
    }
    public static LoginExitoso loginExitoso(){
        return new LoginExitoso();
    }
}
