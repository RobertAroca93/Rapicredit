package co.com.rapicredit.userInterface.paginaLogin;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUnificado extends PageObject {

    public static final Target CORREO = Target
            .the("Correo").located(By.id("username"));

    public static final Target CONTRASEÑA = Target
            .the("Contraseña").located(By.id("password"));

    public static final Target BOTON_INGRESAR = Target
            .the("Ingresar")
            .located(By.xpath("/html/body/app-root/div/app-login/div/div[2]/mat-card/mat-card-content/div/div[2]/form/div[5]/div[1]/button"));

    public static final Target VALIDACIÓN_LOGIN_EXITOSO = Target
            .the("LoginCorrecto").located(By.xpath("/html/body/app-root/div/app-header/mat-toolbar/div/div/div[1]/div/span"));

    public static final  Target VALIDACIÓN_LOGIN_FALLIDO = Target
            .the("LoginIncorrecto").located(By.xpath("//*[@id=\"swal2-title\"]"));


}
