package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosFinancieros extends PageObject {

    public static final Target LISTADO_CUENTAS = Target
            .the("ListadoCuentasBancarias").located(By.id("mat-select-value-17"));

    public static final Target CUENTA_BANCOLOMBIA = Target
            .the("CuentaBancolombia").located(By.id("mat-option-64"));

    public static final Target INGRESAR_CUENTA = Target
            .the("IngresarNumeroDeCuenta").located(By.id("mat-input-7"));

    public static final Target CONFIRMAR_CUENTA = Target
            .the("ConfirmarNumeroDeCuenta").located(By.id("mat-input-8"));

    public static final Target BOTON_CONTINUAR = Target
            .the("BotonContinuar").located(By.xpath("/html/body/app-root/div/app-header/mat-sidenav-container/mat-sidenav-content/div/app-account/div/div/div/app-bank-account-verification/mat-card/form/mat-card-footer/button[2]/span[1]"));

    public static final Target BOTON_ANTERIOR = Target
            .the("BotonAnterior").located(By.xpath("/html/body/app-root/div/app-header/mat-sidenav-container/mat-sidenav-content/div/app-account/div/div/div/app-bank-account-verification/mat-card/form/mat-card-footer/button[1]/span[1]"));

}
