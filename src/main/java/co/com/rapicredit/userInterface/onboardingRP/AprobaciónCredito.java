package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AprobaciónCredito extends PageObject {

    public static final Target BOTON_ACEPTAR_CREDITO = Target
            .the("BotonAceptar").located(By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-disbursement-pending[1]/div[2]/div[2]/div[1]/mat-card[1]/mat-card-footer[1]/button[1]"));

}
