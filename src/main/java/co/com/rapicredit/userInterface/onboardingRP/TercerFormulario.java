package co.com.rapicredit.userInterface.onboardingRP;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TercerFormulario extends PageObject {

    public static final Target LISTADO_ESTADO_CIVIL = Target
            .the("EstadoCivil").located(By.xpath("//*[@id=\"mat-select-value-1\"]/span"));

    public static final Target ESTADO_CIVIL_SOLTERO = Target
            .the("EstadoCivilSoltero").located(By.id("mat-option-2"));

    public static final Target LISTADO_NUMERO_DE_HIJOS = Target
            .the("NumeroDeHijos").located(By.xpath("//*[@id=\"mat-select-value-3\"]/span"));

    public static final Target NUMERO_DE_HIJOS_0 = Target
            .the("NumeroDeHijos0").located(By.id("mat-option-5"));

    public static final Target LISTADO_PERSONAS_A_CARGO = Target
            .the("PersonasACargo").located(By.xpath("//*[@id=\"mat-select-value-5\"]/span"));

    public static final Target PERSONAS_A_CARGO_0 = Target
            .the("0PersonasACargo").located(By.id("mat-option-11"));

    public static final Target LISTADO_NIVEL_ESTUDIOS = Target
            .the("ListadoNivelEstudios").located(By.xpath("//*[@id=\"mat-select-value-7\"]/span"));

    public static final Target NIVEL_ESTUDIOS_PREGRADO = Target
            .the("NivelEstudios").located(By.id("mat-option-21"));

    public static final Target SITUACIÓN_LABORAL = Target
            .the("Pensionado").located(By.xpath("//*[@id=\"mat-radio-6\"]"));

    public static final Target LISTADO_DPTO = Target
            .the("Departamento").located(By.xpath("//*[@id=\"mat-select-value-11\"]/span"));

    public static final Target DPTO_BOGOTA = Target
            .the("DptoBogota").located(By.id("mat-option-25"));

    public static final Target LISTADO_CIUDAD = Target
            .the("ListadoCiudad").located(By.xpath("//*[@id=\"mat-select-value-13\"]/span"));

    public static final Target CIUDAD_BOGOTA = Target
            .the("CiudadBogota").located(By.id("mat-option-63"));

    public static final Target DIRECCIÓN_RESIDENCIA = Target
            .the("DirecciónResidencia").located(By.id("address_home"));

    public static final Target LISTADO_ESTRATO = Target
            .the("ListadoEstrato").located(By.xpath("//*[@id=\"mat-select-value-15\"]/span"));

    public static final Target ESTRATO_3 = Target
            .the("Estrato3").located(By.id("mat-option-59"));

    public static final Target TIPO_DE_VIVIENDA_PROPIA = Target
            .the("ViviendaPropia").located(By.id("mat-radio-8"));

    public static final Target INGRESOS_MES = Target
            .the("IngresosMes").located(By.id("income_per_month"));

    public static final Target GASTOS_MES = Target
            .the("GastosMes").located(By.id("living_expenses"));

    public static final  Target BOTON_CONTINUAR = Target
            .the("BotonContinuar").located(By.xpath("/html/body/app-root/div/app-header/mat-sidenav-container/mat-sidenav-content/div/app-account/div/div/div/app-additional-data/mat-card/form/mat-card-footer/button[2]"));

    public static final Target BOTON_CANCELAR = Target
            .the("BotonCancelar").located(By.xpath("/html/body/app-root/div/app-header/mat-sidenav-container/mat-sidenav-content/div/app-account/div/div/div/app-additional-data/mat-card/form/mat-card-footer/button[1]/span[1]"));


}
