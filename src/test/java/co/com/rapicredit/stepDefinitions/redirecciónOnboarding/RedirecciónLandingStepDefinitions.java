package co.com.rapicredit.stepDefinitions.redirecciónOnboarding;

import co.com.rapicredit.stepDefinitions.SetUp;
import co.com.rapicredit.tasks.appMisCreditos.AbrirPaginaAdd;
import co.com.rapicredit.tasks.appMisCreditos.AbrirPaginaPpd;
import co.com.rapicredit.tasks.appMisCreditos.AbrirPaginaTyc;
import com.github.javafaker.Faker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.rapicredit.questions.redirecciónOnboarding.RediecciónDesdeTycExitosa.rediecciónDesdeTycExitosa;
import static co.com.rapicredit.questions.redirecciónOnboarding.RedirecciónDesdeAddExitosa.redirecciónAlLoginExitosa;
import static co.com.rapicredit.questions.redirecciónOnboarding.RedirecciónDesdePpdExitosa.redirecciónDesdePpdExitosa;
import static co.com.rapicredit.tasks.abrirPaginaWeb.AbrirPaginaWeb.abrirPaginaWeb;
import static co.com.rapicredit.tasks.appMisCreditos.IniciarSolicitud.iniciarSolicitud;
import static co.com.rapicredit.tasks.appMisCreditos.IrAlLoginEnAdd.irAlLoginEnAdd;
import static co.com.rapicredit.tasks.appMisCreditos.IrAlLoginEnPdp.irAlLoginEnPdp;
import static co.com.rapicredit.tasks.appMisCreditos.IrAlLoginEnTyc.irAlLoginEnTyc;
import static co.com.rapicredit.tasks.appMisCreditos.IrAlOnboarding.irAlOnboarding;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RedirecciónLandingStepDefinitions extends SetUp {

    Faker faker = new Faker();

    private static final String ACTOR_NAME = "User";

    private static final String REDIRECCIÓN_EXITOSA = "Inicio de sesión";

    @Dado("que me encuentro en el onboarding de rapiplazo")
    public void que_me_encuentro_en_el_onboarding_de_rapiplazo() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaWeb());

        theActorInTheSpotlight().attemptsTo(
                irAlOnboarding(),
                iniciarSolicitud().ingresarCorreoSolicitud(faker.internet().emailAddress())
        );
    }

    @Cuando("ingreso al enlace de terminos y condiciones")
    public void ingreso_al_enlace_de_terminos_y_condiciones() {
        theActorInTheSpotlight().attemptsTo(
                AbrirPaginaTyc.manejarVentanaEmergente()
        );
    }

    @Cuando("me dirijo al login")
    public void me_dirijo_al_login() {
        theActorInTheSpotlight().attemptsTo(
                irAlLoginEnTyc()

        );
    }
    @Entonces("se debe mostrar el login unificado")
    public void se_debe_mostrar_el_login_unificado() {
        theActorInTheSpotlight().should(
                seeThat(rediecciónDesdeTycExitosa().verificaciónDeRedirecciónTycExitosa(REDIRECCIÓN_EXITOSA),
                        equalTo(true))
        );
    }

    @Dado("que estoy en el onboarding de rapiplazo")
    public void que_estoy_en_el_onboarding_de_rapiplazo() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaWeb());

        theActorInTheSpotlight().attemptsTo(
                irAlOnboarding(),
                iniciarSolicitud().ingresarCorreoSolicitud(faker.internet().emailAddress())
        );
    }

    @Cuando("ingreso al enlace de politica de protección de datos")
    public void ingreso_al_enlace_de_politica_de_protección_de_datos() {
        theActorInTheSpotlight().attemptsTo(
                AbrirPaginaPpd.abrirPaginaPpd()
        );
    }

    @Cuando("me quiero dirigir al login")
    public void me_quiero_dirigir_al_login() {
        theActorInTheSpotlight().attemptsTo(
                irAlLoginEnPdp()
        );
    }

    @Entonces("se deberá mostrar el login unificado")
    public void se_deberá_mostrar_el_login_unificado() {
        theActorInTheSpotlight().should(
                seeThat(redirecciónDesdePpdExitosa().verificaciónDeRedirecciónPpdExitosa(REDIRECCIÓN_EXITOSA),
                        equalTo(true))
        );
    }

    @Dado("que me dirijo al onboarding de rapiplazo")
    public void que_me_dirijo_al_onboarding_de_rapiplazo() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaWeb());

        theActorInTheSpotlight().attemptsTo(
                irAlOnboarding(),
                iniciarSolicitud().ingresarCorreoSolicitud(faker.internet().emailAddress())
        );
    }

    @Cuando("ingreso en el enlace de autorización de datos")
    public void ingreso_en_el_enlace_de_autorización_de_datos() {
        theActorInTheSpotlight().attemptsTo(
                AbrirPaginaAdd.abrirPaginaAdd()
        );
    }

    @Cuando("deseo ingresar dirigir al login")
    public void deseo_ingresar_dirigir_al_login() {
        theActorInTheSpotlight().attemptsTo(
                irAlLoginEnAdd()
        );
    }

    @Entonces("se deberá mostrar el login de rapicredit")
    public void se_deberá_mostrar_el_login_de_rapicredit() {
        theActorInTheSpotlight().should(
                seeThat(redirecciónAlLoginExitosa().verificaciónDeRedirecciónExitosa(REDIRECCIÓN_EXITOSA),
                        equalTo(true))
        );
    }

}
