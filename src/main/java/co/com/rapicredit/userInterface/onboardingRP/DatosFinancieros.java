package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosFinancieros extends PageObject {

    public static final Target LISTADO_CUENTAS = Target
            .the("ListadoCuentasBancarias").located(By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-account[1]/div[1]/div[1]/div[1]/app-bank-account-verification[1]/mat-card[1]/form[1]/mat-card-content[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]"));

    public static final Target CUENTA_BANCOLOMBIA = Target
            .the("CuentaBancolombia").located(By.xpath("//mat-option[contains(@class, 'mat-option') and contains(@class, 'ng-tns-c80-46') and not(@aria-disabled='true')]"));

    public static final Target INGRESAR_CUENTA = Target
            .the("IngresarNumeroDeCuenta").located(By.xpath("//body[1]/app-root[1]/div[1]/app-header[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-account[1]/div[1]/div[1]/div[1]/app-bank-account-verification[1]/mat-card[1]/form[1]/mat-card-content[1]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));

    public static final Target CONFIRMAR_CUENTA = Target
            .the("ConfirmarNumeroDeCuenta").located(By.xpath("//body[1]/app-root[1]/div[1]/app-header[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-account[1]/div[1]/div[1]/div[1]/app-bank-account-verification[1]/mat-card[1]/form[1]/mat-card-content[1]/div[4]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));

    public static final Target BOTON_CONTINUAR = Target
            .the("BotonContinuar").located(By.xpath("//span[contains(text(),'CONTINUAR')]"));

    public static final Target BOTON_ANTERIOR = Target
            .the("BotonAnterior").located(By.xpath("//span[contains(text(),'ANTERIOR')]"));

}
