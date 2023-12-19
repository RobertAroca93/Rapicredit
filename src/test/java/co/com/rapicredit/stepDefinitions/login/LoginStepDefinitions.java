package co.com.rapicredit.stepDefinitions.login;

import co.com.rapicredit.stepDefinitions.SetUp;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.rapicredit.questions.login.LoginExitoso.loginExitoso;
import static co.com.rapicredit.questions.login.LoginFallido.loginFallido;
import static co.com.rapicredit.tasks.abrirPaginaWeb.AbrirPaginaWeb.abrirPaginaWeb;
import static co.com.rapicredit.tasks.appMisCreditos.DiligenciarLogin.diligenciarLogin;
import static co.com.rapicredit.tasks.appMisCreditos.NavegarHaciaElLogin.navegarHaciaElLogin;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginStepDefinitions extends SetUp {

    private static final String ACTOR_NAME = "User";

    private static final String LOGIN_EXITOSO = "MENÚ";

    private static final String LOGIN_FALLIDO = "Error";

    @Dado("que el usuario se encuentra en el login unificado de rapicredit")
    public void que_el_usuario_se_encuentra_en_el_login_unificado_de_rapicredit() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaWeb()
        );
    }

    @Cuando("ingresa las credenciales correctamente")
    public void ingresa_las_credenciales_correctamente() {
        theActorInTheSpotlight().attemptsTo(
                navegarHaciaElLogin(),
                diligenciarLogin().ingresarCorreo("correodeprueba40@yopmail.com").ingresarContraseña("qa123456")
        );

    }

    @Entonces("el usuario de debe loguear exitosamente")
    public void el_usuario_de_debe_loguear_exitosamente() {
        theActorInTheSpotlight().should(
                seeThat(loginExitoso().verificaciónDeLoginExitoso(LOGIN_EXITOSO),
                        equalTo(true))
        );
    }

    @Cuando("ingresa las credenciales erroneamente")
    public void ingresa_las_credenciales_erroneamente() {
        theActorInTheSpotlight().attemptsTo(
                navegarHaciaElLogin(),
                diligenciarLogin().ingresarCorreo("correodeprueba40@yopmail.com").ingresarContraseña("123456")
        );

    }

    @Entonces("el usuario No debe poder autenticarse")
    public void el_usuario_No_debe_poder_autenticarse() {
        theActorInTheSpotlight().should(
                seeThat(loginFallido().verificaciónDeLoginFallido(LOGIN_FALLIDO),
                        equalTo(true))
        );

    }


}
