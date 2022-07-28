package interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.concurrent.TimeUnit;

public class AndLockAndUnlockDevice2 implements Interaction {
    //Bloque y desbloquea la pantalla del dispositivo
    public AndLockAndUnlockDevice2() {
    }

    public static AndLockAndUnlockDevice2 inApp() {
        return Tasks.instrumented(AndLockAndUnlockDevice2.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        AppiumDriver<MobileElement> driver = GetDriver.as(actor).appiumDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        ((AndroidDriver<?>) driver).lockDevice();
        System.out.println(((AndroidDriver<?>) driver).isDeviceLocked());
        ((AndroidDriver<?>) driver).unlockDevice();

    }
}
