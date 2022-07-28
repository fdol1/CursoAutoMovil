package interactions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class DeslizarPantalla implements Interaction {

    private final int cantidad;

    public DeslizarPantalla(int cantidad) {
        this.cantidad = cantidad;
    }

    public static DeslizarPantalla enElMenu(int cantidad) {
        return Tasks.instrumented(DeslizarPantalla.class, cantidad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Dimension size = GetDriver.as(actor).appiumDriver().manage().window().getSize();
        int startX = size.width / 2;
        int endX = startX;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);

        //Para moverse con el tamaño de la pantalla
        for (int i=0; i<cantidad;i++){
            TouchAction to = new TouchAction(GetDriver.as(actor).appiumDriver());
            to.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                    .moveTo(PointOption.point(endX, endY))
                    .release()
                    .perform();
        }
    }
}
