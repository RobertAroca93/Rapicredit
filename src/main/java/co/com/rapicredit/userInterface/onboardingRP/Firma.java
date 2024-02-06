package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Firma extends PageObject {

    public static final Target CODIGO_FIRMA = Target
            .the("CodigoFirma").located(By.xpath("//body[1]/app-root[1]/div[1]/app-header[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-sign-loan[1]/div[2]/div[2]/div[1]/app-signature[1]/form[1]/mat-card[1]/mat-card-header[1]/div[2]/div[1]/div[3]/div[1]/div[1]/strong[1]"));

    public static final Target PRIMER_CASILLA = Target
            .the("PrimerCasilla").located(By.xpath("//*[@id=\"one\"]"));

    public static final Target SEGUNDA_CASILLA = Target
            .the("PrimerCasilla").located(By.xpath("//*[@id=\"second\"]"));

    public static final Target TERCER_CASILLA = Target
            .the("PrimerCasilla").located(By.xpath("//*[@id=\"third\"]"));

    public static final Target CUARTA_CASILLA = Target
            .the("PrimerCasilla").located(By.xpath("//*[@id=\"four\"]"));

    public static final Target ACEPTAR_TODAS_LAS_OPCIONES = Target
            .the("AceptarOpciones").located(By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-sign-loan[1]/div[2]/div[2]/div[1]/app-signature[1]/form[1]/mat-card[1]/mat-card-content[1]/div[2]/div[1]/mat-checkbox[1]/label[1]/div[1]"));

    public static final Target BOTON_ACEPTAR = Target
            .the("BotonAceptar").located(By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-sign-loan[1]/div[2]/div[2]/div[1]/app-signature[1]/form[1]/mat-card[1]/mat-card-footer[1]/button[1]"));



    public static Firma firma(){
        return new Firma();
    }
}

