package co.com.rapicredit.userInterface.paginaLogin;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Landing extends PageObject {

    public static final Target LOGIN = Target
            .the("login")
            .located(By.xpath("//body[1]/app-root[1]/app-landing[1]/div[1]/app-landing-header[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[2]/li[1]"));

    public static final Target PIDE_TU_RAPIPLAZO = Target
            .the("PideTuRapiplazo").located(By.xpath("//*[@id=\"redirectEmailBtn\"]/span[1]/div"));
}
