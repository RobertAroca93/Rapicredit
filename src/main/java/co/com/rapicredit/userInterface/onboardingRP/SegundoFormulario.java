package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SegundoFormulario extends PageObject {

    public static final Target PRIMER_NOMBRE = Target
            .the("PrimerNombre").located(By.xpath("//*[@id=\"first_name\"]"));

    public static final Target PRIMER_APELLIDO = Target
            .the("PrimerApellido").located(By.id("first_surname"));

    public static final Target FECHA_DE_NACIMIENTO = Target
            .the("FechaDeNacimiento").located(By.id("birth_date"));

    public static final Target FECHA_DE_EXPEDICIÓN = Target
            .the("FechaDeExpedición").located(By.id("issue_date"));

    public static final Target GENERO = Target
            .the("Genero").located(By.xpath("//*[@id=\"mat-radio-6\"]/label/div[2]/span[2]"));

    public static final Target BOTON_CONTINUAR = Target
            .the("BotonContinuar").located(By.xpath("/html/body/app-root/div/app-header/mat-sidenav-container/mat-sidenav-content/div/app-account/div/div/div/app-personal-information/mat-card/form/mat-card-footer/button[2]"));

    public static final Target BOTON_CANCELAR = Target
            .the("BotonCancelar").located(By.xpath("/html/body/app-root/div/app-header/mat-sidenav-container/mat-sidenav-content/div/app-account/div/div/div/app-personal-information/mat-card/form/mat-card-footer/button[1]"));

}
