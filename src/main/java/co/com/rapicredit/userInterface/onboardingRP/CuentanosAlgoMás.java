package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CuentanosAlgoMás extends PageObject {

    public static final Target BOTON_CONTINUAR = Target
            .the("BotonContinuar").located(By.xpath("//body[1]/app-root[1]/div[1]/app-header[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-account[1]/div[1]/div[1]/div[1]/app-references[1]/mat-card[1]/form[1]/mat-card-footer[1]/button[1]"));

}
