package co.com.rapicredit.stepDefinitions.login;

import co.com.rapicredit.stepDefinitions.SetUp;
import com.github.javafaker.Faker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.rapicredit.questions.login.LoginUsuarioAdminFallido.loginUsuarioAdminFallido;
import static co.com.rapicredit.tasks.abrirPaginaWeb.AbrirPaginaWeb.abrirPaginaWeb;
import static co.com.rapicredit.tasks.appMisCreditos.DiligenciarLogin.diligenciarLogin;
import static co.com.rapicredit.tasks.appMisCreditos.NavegarHaciaElLogin.navegarHaciaElLogin;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginConCuentaAdminStepDefinition extends SetUp {

    Faker faker = new Faker();

    public static final String ACTOR_NAME = "Usuario";

    public static final String LOGIN_FALLIDO = "Error";
    
    @Dado("que me encuentro en el login unificado")
    public void que_me_encuentro_en_el_login_unificado() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaWeb()
        );
    }
    @Cuando("ingreso las credenciales administrativas")
    public void ingreso_las_credenciales_administrativas() {
        theActorInTheSpotlight().attemptsTo(
                navegarHaciaElLogin(),
                diligenciarLogin().ingresarCorreo("gallego@yopmail.com").ingresarContraseña("123456")
        );

    }
    @Entonces("se debe mostrar mensaje de error")
    public void se_debe_mostrar_mensaje_de_error() {
        theActorInTheSpotlight().should(
                seeThat(loginUsuarioAdminFallido().verificaciónDeErrorDeLogin(LOGIN_FALLIDO),
                        equalTo(true))
        );


    }

}
