package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculaTuRapiplazo extends PageObject {

    public static final Target PIDE_TU_RAPIPLAZO_YA = Target
            .the("PideTuRapiplazoYa").located(
                    By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-nueva-solicitud[1]/div[2]/div[1]/div[1]/mat-card[1]/mat-card-content[1]/div[1]/div[2]/app-simulator[1]/div[1]/div[2]/div[4]/button[1]"));

}
