package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CuentanosAlgoMás extends PageObject {

    public static final Target BOTON_CONTINUAR = Target
            .the("BotonContinuar").located(By.xpath("/html/body/app-root/div/app-header/mat-sidenav-container/mat-sidenav-content/div/app-account/div/div/div/app-references/mat-card/form/mat-card-footer/button/span[1]"));

}
