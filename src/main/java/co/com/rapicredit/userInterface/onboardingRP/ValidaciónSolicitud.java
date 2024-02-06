package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidaciónSolicitud extends PageObject {

    public static final Target ACEPTAR_USO_DE_DATOS = Target
            .the("AceptarUsoDeDatos").located(By.id("acepto"));

    public static final Target BOTON_ENVIAR_SOLICITUD = Target
            .the("BotonEnviarSolicitud").located(
                    By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-data-validation[1]/div[2]/div[2]/div[1]/app-your-acceptance[1]/form[1]/mat-card[1]/mat-card-footer[1]/button[1]"));

}
