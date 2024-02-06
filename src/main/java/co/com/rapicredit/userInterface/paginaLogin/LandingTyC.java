package co.com.rapicredit.userInterface.paginaLogin;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LandingTyC extends PageObject {

    /*public static final Target CERRAR_AVISO = Target
            .the("CerrarAvisoDeDescuento").located(By.xpath("//*[@id=\"om-eoh5krny3rkskzgckqf5-optin\"]/div/button"));*/

    public static final Target BOTON_INICIAR_SESION = Target
            .the("BotonIniciarSesion").located(By.xpath("//*[@id=\"menu-item-23\"]/a"));

    public static final Target VALIDACIÓN_LOGIN_UNIFICADO_TYC = Target
            .the("VerificaciónRedirecciónLogin").located(By.xpath("/html/body/app-root/div/app-login/div/div[2]/mat-card/mat-card-content/div/div[2]/form/div[1]/div/p"));


}
