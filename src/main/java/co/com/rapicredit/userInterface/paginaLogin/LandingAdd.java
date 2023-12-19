package co.com.rapicredit.userInterface.paginaLogin;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LandingAdd extends PageObject {

    public static final Target CERRAR_AVISO_ADD = Target
            .the("CerrarAvisoDeDescuento").located(By.xpath("//*[@id=\"om-eoh5krny3rkskzgckqf5-optin\"]/div/button"));

    public static final Target BOTON_INICIAR_SESION_ADD = Target
            .the("BotonIniciarSesion").located(By.xpath("//*[@id=\"menu-item-23\"]/a"));

    public static final Target VALIDACIÓN_LOGIN_UNIFICADO_ADD = Target
            .the("VerificaciónRedirecciónLogin").located(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div[1]"));
}
