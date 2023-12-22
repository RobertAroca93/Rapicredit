package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidaciónSolicitud extends PageObject {

    public static final Target ACEPTAR_USO_DE_DATOS = Target
            .the("AceptarUsoDeDatos").located(By.xpath("//*[@id=\"acepto\"]/label/div"));

    public static final Target BOTON_ENVIAR_SOLICITUD = Target
            .the("BotonEnviarSolicitud").located(By.xpath("/html/body/app-root/div/app-header/mat-sidenav-container/mat-sidenav-content/div/app-data-validation/div[2]/div[2]/div/app-your-acceptance/form/mat-card/mat-card-footer/button/span[1]"));

}
