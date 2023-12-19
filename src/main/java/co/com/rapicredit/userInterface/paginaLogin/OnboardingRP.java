package co.com.rapicredit.userInterface.paginaLogin;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OnboardingRP extends PageObject {

    public static final Target CORREO_SOLICITUD = Target
            .the("CorreoSolicitud").located(By.id("mat-input-0"));

    public static final Target BOTON_ENVIAR = Target
            .the("BotonEnviar")
            .located(By.xpath("/html/body/app-root/div/app-account/div[2]/div/div/app-email-verification/div/mat-card/form/mat-card-footer/div/div[1]/button/span[1]"));

    public static final Target BOTON_CONFIRMACIÓN = Target
            .the("BotonConfirmarSolicitud").located(By.xpath("/html/body/div/div/div[3]/button[1]"));

    public static final Target ENLACE_TYC = Target
            .the("EnlaceTerminosyCondiciones").located(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/span/span[2]/a"));

    public static final Target ENLACE_PPD = Target
            .the("EnlaceTerminosyCondiciones").located(By.xpath("//*[@id=\"mat-checkbox-2\"]/label/span/span[2]"));

    public static final Target ENLACE_ADD = Target
            .the("EnlaceAutorizaciónDeDatos").located(By.xpath("//*[@id=\"mat-checkbox-2\"]/label/span/span[2]/a[2]"));


}
