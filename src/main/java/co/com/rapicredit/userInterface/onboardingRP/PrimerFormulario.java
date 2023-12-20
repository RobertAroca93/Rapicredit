package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrimerFormulario extends PageObject {

    public static final Target TIPODEIDENTIFICACIÓN_CEDULA = Target
            .the("TipoDeIdentificación:CedulaDeCiudadania").located(By.xpath("//*[@id=\"mat-radio-2\"]/label/div[2]/span[2]"));

    public static final Target NUMERO_DE_IDENTIFICACIÓN = Target
            .the("NumeroDeIdentificación").located(By.id("mat-input-2"));

    public static final Target NUMERO_DE_CELULAR = Target
            .the("NumeroDeCelular").located(By.id("mat-input-3"));

    public static final Target CONFIRMAR_EMAIL = Target
            .the("ConfirmarEmail").located(By.id("mat-input-7"));

    public static final Target INGRESAR_CONTRASEÑA = Target
            .the("IngresarContraseña").located(By.id("mat-input-5"));

    public static final Target CONFIRMAR_CONTRASEÑA = Target
            .the("ConfirmarContraseña").located(By.id("mat-input-6"));

    public static final Target ACEPTAR_TERMINOS = Target
            .the("AceptarTerminos").located(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/div"));

    public static final Target ACEPTAR_POLITICAS = Target
            .the("AceptarPoliticas").located(By.xpath("//*[@id=\"mat-checkbox-2\"]/label/div"));

    public static final Target BOTON_CONTINUAR = Target
            .the("BotonContinuar").located(By.xpath("/html/body/app-root/div/app-account/div[2]/div/div/app-new-account/mat-card/div/form/mat-card-footer/button[2]"));

    public static final Target BOTON_CANCELAR = Target
            .the("BotonCancelar").located(By.xpath("/html/body/app-root/div/app-account/div[2]/div/div/app-new-account/mat-card/div/form/mat-card-footer/button[1]"));

}
