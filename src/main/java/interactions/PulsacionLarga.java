package interactions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;

import java.time.Duration;

public class PulsacionLarga implements Interaction {

    private final By elementoAPresionar;
    private final int tiempoEnMilisegundos;

    public PulsacionLarga(By elementoAPresionar, int tiempoEnMilisegundos) {
        this.elementoAPresionar = elementoAPresionar;
        this.tiempoEnMilisegundos = tiempoEnMilisegundos;
    }

    public static PulsacionLarga enPantalla(By elementoAPresionar, int tiempoEnMilisegundos) {
        return Tasks.instrumented(PulsacionLarga.class, elementoAPresionar, tiempoEnMilisegundos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        TouchAction t = new TouchAction(GetDriver.as(actor).appiumDriver());
        t.longPress(ElementOption.element(GetDriver.as(actor).appiumDriver().findElement(elementoAPresionar)))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(tiempoEnMilisegundos))).release().perform();
    }
}