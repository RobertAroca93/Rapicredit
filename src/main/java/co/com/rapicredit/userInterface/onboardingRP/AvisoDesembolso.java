package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AvisoDesembolso extends PageObject {

    // Créditos Pendientes de Desembolso
    public static final Target ESTADO_DESEMBOLSO_PENDIENTE= Target
            .the("TuDineroEstaráEnTuCuentaMuyPronto").located(By.xpath("//div[contains(text(),'Tu dinero estará en tu cuenta muy pronto.')]"));

    public static final Target FLECHA_PERFIL = Target
            .the("CerrarSesion").located(By.xpath("//mat-icon[contains(@class, 'mat-icon') and contains(@class, 'md-18') and contains(text(), 'keyboard_arrow_down')]"));

    public static final Target CERRAR_SESION = Target
            .the("CerrarSesion").located(By.xpath("//body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/button[2]"));




}
