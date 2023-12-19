package co.com.rapicredit.userInterface.paginaLogin;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Landing extends PageObject {

    public static final Target LOGIN = Target
            .the("login")
            .located(By.xpath("/html/body/app-root/app-landing/div/app-landing-header/div/div[1]/div[2]/div/div[2]/ul[2]/li[1]"));

    public static final Target PIDE_TU_RAPIPLAZO = Target
            .the("PideTuRapiplazo").located(By.xpath("//*[@id=\"redirectEmailBtn\"]/span[1]/div"));
}
