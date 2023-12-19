package co.com.rapicredit.questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.rapicredit.userInterface.paginaLogin.LoginUnificado.VALIDACIÓN_LOGIN_FALLIDO;

public class LoginUsuarioAdminFallido implements Question<Boolean> {

    private String mensajeDeErrorDeLogin;

    public LoginUsuarioAdminFallido verificaciónDeErrorDeLogin(String mensajeDeErrorDeLogin){
        this.mensajeDeErrorDeLogin = mensajeDeErrorDeLogin;
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (VALIDACIÓN_LOGIN_FALLIDO.resolveFor(actor).containsOnlyText(mensajeDeErrorDeLogin));
    }
    public static LoginUsuarioAdminFallido loginUsuarioAdminFallido(){
        return new  LoginUsuarioAdminFallido();
    }
}
