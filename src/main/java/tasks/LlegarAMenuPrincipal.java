package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static ui.UiRecorrido.API_DEMO;
import static ui.UiRecorrido.VIEWS;

public class LlegarAMenuPrincipal implements Task {


    public LlegarAMenuPrincipal() {
    }

    public static LlegarAMenuPrincipal paraProbar() {
        return Tasks.instrumented(LlegarAMenuPrincipal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(API_DEMO, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                Click.on(API_DEMO),
                WaitUntil.the(VIEWS, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                //PulsacionLarga.enPantalla(ACCESIBILIDAD,5000)
                Click.on(VIEWS)
                //ObtenerAtributo.deElemento(ACCESIBILIDAD)
                //DeslizarPantalla.enElMenu(2)
                //AndLockAndUnlockDevice2.inApp()
                //WebViewAndAutomate2.inApp()
        );







    }
}