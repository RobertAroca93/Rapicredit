package co.com.rapicredit.tasks.onboardingRP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class TiempoEspera implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {


        try {
            Thread.sleep(10000); // 5000 milisegundos = 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static TiempoEspera tiempoEspera(){
        return new TiempoEspera();
    }
}

