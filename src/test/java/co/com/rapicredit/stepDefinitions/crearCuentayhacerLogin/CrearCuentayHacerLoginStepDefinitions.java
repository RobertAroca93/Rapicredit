package co.com.rapicredit.stepDefinitions.crearCuentayhacerLogin;

import co.com.rapicredit.stepDefinitions.SetUp;
import co.com.rapicredit.utils.Wait;
import com.github.javafaker.Faker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import static co.com.rapicredit.questions.login.LoginExitoso.loginExitoso;
import static co.com.rapicredit.questions.onboarding.SolicitudExitosa.solicitudExitosa;
import static co.com.rapicredit.tasks.abrirPaginaWeb.AbrirPaginaWeb.abrirPaginaWeb;
import static co.com.rapicredit.tasks.appMisCreditos.DiligenciarLogin.diligenciarLogin;
import static co.com.rapicredit.tasks.appMisCreditos.IrAlOnboarding.irAlOnboarding;
import static co.com.rapicredit.tasks.onboardingRP.AceptarCredito.aceptarCredito;
import static co.com.rapicredit.tasks.onboardingRP.CerrarSesión.cerrarSesión;
import static co.com.rapicredit.tasks.onboardingRP.ConfirmarSolicitud.confirmarSolicitud;
import static co.com.rapicredit.tasks.onboardingRP.ContinuarSolicitud.continuarSolicitud;
import static co.com.rapicredit.tasks.onboardingRP.DiligenciarCreaciónDeCuenta.diligenciarPrimerForm;
import static co.com.rapicredit.tasks.onboardingRP.DiligenciarDatosAdicionales.diligenciarDatosAdicionales;
import static co.com.rapicredit.tasks.onboardingRP.DiligenciarDatosPersonales.diligenciarDatosPersonales;
import static co.com.rapicredit.tasks.onboardingRP.ExtraerNumero.numeroFirma;
import static co.com.rapicredit.tasks.onboardingRP.GenerarCorreo.email;
import static co.com.rapicredit.tasks.onboardingRP.ConfirmarCorreo.enCampoDelFormulario;
import static co.com.rapicredit.tasks.onboardingRP.LoginCorreo.loginCorreoCreado;
import static co.com.rapicredit.tasks.onboardingRP.SeleccionarCuenta.seleccionarCuenta;
import static co.com.rapicredit.tasks.onboardingRP.SimularCredito.simularCredito;
import static co.com.rapicredit.tasks.onboardingRP.TiempoEspera.tiempoEspera;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.hamcrest.CoreMatchers.equalTo;

public class CrearCuentayHacerLoginStepDefinitions extends SetUp {

    WebDriver driver = getDriver();

    Faker faker = new Faker();

    private static final String ACTOR_NAME = "User";

    private static final String SOLICITUD_EXITOSA = "Tu dinero estará en tu cuenta muy pronto.";

    private static final String LOGIN_EXITOSO = "MENÚ";

    @Dado("que realizo una solicitud exitosa en el onboarding de rapiplazo")
    public void que_realizo_una_solicitud_exitosa_en_el_onboarding_de_rapiplazo() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaWeb());

        theActorInTheSpotlight().attemptsTo(
                irAlOnboarding(),
                email(),enCampoDelFormulario(),
                //iniciarSolicitud().ingresarCorreoSolicitud("correoprueba43@yopmail.com"),
                diligenciarPrimerForm().ingresarNumeroDeIdentificación(faker.number().digits(8)).ingresarNumeroDeCelular("3" + faker.number().digits(9))
                        .ingresarContraseña("123456").ingresarConfirmaciónContraseña("123456")//.ingresarConfirmacionEmail("correoprueba43@yopmail.com")

        );

        theActorInTheSpotlight().attemptsTo(
                tiempoEspera(), diligenciarDatosPersonales().ingresarPrimerNombre("test").ingresarPrimerApellido("random")
                        .ingresarFechaNacimiento("01-07-1981").ingresarFechaExpedición("28-08-2000")
        );
        theActorInTheSpotlight().attemptsTo(
                tiempoEspera(), diligenciarDatosAdicionales().ingresarDirecciónResidencia("carrera 100").ingresarIngresosMes("1800000").ingresarGastosMes("800000")
        );
        theActorInTheSpotlight().attemptsTo(
                tiempoEspera(), simularCredito(),
                tiempoEspera(), confirmarSolicitud(),
                seleccionarCuenta().ingresarNumeroDeCuenta("487874545").confirmarciónNumeroDeCuenta("487874545"),
                tiempoEspera(), continuarSolicitud(),
                tiempoEspera(), numeroFirma(),
                tiempoEspera(), aceptarCredito(),
                tiempoEspera()

        );
        theActorInTheSpotlight().should(
                seeThat(solicitudExitosa().verificaciónDeSolicitudExitosa(SOLICITUD_EXITOSA),
                        equalTo(true))
        );
        theActorInTheSpotlight().attemptsTo(
                cerrarSesión()
        );

    }
    @Cuando("me autentico en el login unificado de rapicredit")
    public void me_autentico_en_el_login_unificado_de_rapicredit() {
        Wait.inSeconds(2);
        theActorInTheSpotlight().attemptsTo(
                loginCorreoCreado()
        );
    }
    @Entonces("debo poder ver la información del credito")
    public void debo_poder_ver_la_información_del_credito() {
        theActorInTheSpotlight().should(
                seeThat(loginExitoso().verificaciónDeLoginExitoso(LOGIN_EXITOSO),
                        equalTo(true))
        );

    }

}
