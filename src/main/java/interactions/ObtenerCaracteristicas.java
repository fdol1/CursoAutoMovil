package interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class ObtenerCaracteristicas implements Interaction {

    private final int cantidad;

    public ObtenerCaracteristicas(int cantidad) {
        this.cantidad = cantidad;
    }

    public static ObtenerCaracteristicas deLaApp(int cantidad) {
        return Tasks.instrumented(ObtenerCaracteristicas.class, cantidad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            AppiumDriver<MobileElement> getDriver;
            getDriver = GetDriver.as(actor).appiumDriver();

            Thread.sleep(2000);
            //VEr si la app està instalada con el app activity
            System.out.println(getDriver.queryAppState("io.appium.android.apis"));
            Thread.sleep(2000);
            System.out.println(getDriver.terminateApp("io.appium.android.apis"));
            Thread.sleep(2000);
            System.out.println(getDriver.queryAppState("io.appium.android.apis"));
            //     driver.runAppInBackground(Duration.ofMillis(5000));
            //*driver.terminateApp("io.appium.android.apis");
            Thread.sleep(2000);
            getDriver.activateApp("com.android.settings");
            Thread.sleep(2000);
            getDriver.activateApp("io.appium.android.apis");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
