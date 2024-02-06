package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TercerFormulario extends PageObject {

    public static final Target LISTADO_ESTADO_CIVIL = Target
            .the("EstadoCivil").located(By.xpath("/html/body/app-root/div/app-header/mat-sidenav-container/mat-sidenav-content/div/app-account/div/div/div/app-additional-data/mat-card/form/mat-card-content/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select"));

    public static final Target ESTADO_CIVIL_SOLTERO = Target
            .the("EstadoCivilSoltero").located(By.xpath("//span[contains(text(),'Soltero(a)')]"));

    public static final Target LISTADO_NUMERO_DE_HIJOS = Target
            .the("NumeroDeHijos").located(By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-account[1]/div[1]/div[1]/div[1]/app-additional-data[1]/mat-card[1]/form[1]/mat-card-content[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]"));

    public static final Target NUMERO_DE_HIJOS_0 = Target
            .the("NumeroDeHijos0").located(By.xpath("//span[contains(text(),'0')]"));

    public static final Target LISTADO_PERSONAS_A_CARGO = Target
            .the("PersonasACargo").located(By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-account[1]/div[1]/div[1]/div[1]/app-additional-data[1]/mat-card[1]/form[1]/mat-card-content[1]/div[1]/div[4]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]"));

    public static final Target PERSONAS_A_CARGO_0 = Target
            .the("0PersonasACargo").located(By.xpath("//mat-option[@class='mat-option mat-focus-indicator mat-active ng-tns-c80-29 ng-star-inserted']/span[contains(text(), '0')]"));

    public static final Target LISTADO_NIVEL_ESTUDIOS = Target
            .the("ListadoNivelEstudios").located(By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-account[1]/div[1]/div[1]/div[1]/app-additional-data[1]/mat-card[1]/form[1]/mat-card-content[1]/div[1]/div[5]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]"));

    public static final Target NIVEL_ESTUDIOS_PREGRADO = Target
            .the("NivelEstudios").located(By.xpath("//span[contains(text(),'Pregrado')]"));

    public static final Target SITUACIÓN_LABORAL = Target
            .the("Pensionado").located(By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-account[1]/div[1]/div[1]/div[1]/app-additional-data[1]/mat-card[1]/form[1]/mat-card-content[1]/div[1]/div[7]/mat-radio-group[1]/mat-radio-button[4]/label[1]/div[2]"));

    public static final Target LISTADO_DPTO = Target
            .the("Departamento").located(By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-account[1]/div[1]/div[1]/div[1]/app-additional-data[1]/mat-card[1]/form[1]/mat-card-content[1]/div[2]/div[5]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]"));

    public static final Target DPTO_BOGOTA = Target
            .the("DptoBogota").located(By.xpath("//span[contains(text(),'BOGOTA')]"));

    public static final Target LISTADO_CIUDAD = Target
            .the("ListadoCiudad").located(By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-account[1]/div[1]/div[1]/div[1]/app-additional-data[1]/mat-card[1]/form[1]/mat-card-content[1]/div[2]/div[6]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]"));

    public static final Target CIUDAD_BOGOTA = Target
            .the("CiudadBogota").located(By.xpath("//span[contains(text(),'BOGOTA, D.C.')]"));

    public static final Target DIRECCIÓN_RESIDENCIA = Target
            .the("DirecciónResidencia").located(By.xpath("//input[@id='address_home']"));

    public static final Target LISTADO_ESTRATO = Target
            .the("ListadoEstrato").located(By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-account[1]/div[1]/div[1]/div[1]/app-additional-data[1]/mat-card[1]/form[1]/mat-card-content[1]/div[2]/div[8]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]"));

    public static final Target ESTRATO_3 = Target
            .the("Estrato3").located(By.xpath("//span[contains(text(),'Estrato 3')]"));

    public static final Target TIPO_DE_VIVIENDA_PROPIA = Target
            .the("ViviendaPropia").located(By.xpath("//app-header/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-account[1]/div[1]/div[1]/div[1]/app-additional-data[1]/mat-card[1]/form[1]/mat-card-content[1]/div[2]/div[9]/mat-radio-group[1]/mat-radio-button[2]/label[1]/div[2]"));

    public static final Target INGRESOS_MES = Target
            .the("IngresosMes").located(By.xpath("//input[@id='income_per_month']"));

    public static final Target GASTOS_MES = Target
            .the("GastosMes").located(By.xpath("//input[@id='living_expenses']"));

    public static final  Target BOTON_CONTINUAR = Target
            .the("BotonContinuar").located(By.xpath("//span[contains(text(),'CONTINUAR')]"));

    public static final Target BOTON_CANCELAR = Target
            .the("BotonCancelar").located(By.xpath("//span[contains(text(),'ANTERIOR')]"));


}
