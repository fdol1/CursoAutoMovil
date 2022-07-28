package interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class InteraccionesConTeclado implements Interaction {

    public InteraccionesConTeclado() {
    }

    public static InteraccionesConTeclado enLaApp() {
        return Tasks.instrumented(InteraccionesConTeclado.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        AppiumDriver driver = GetDriver.as(actor).appiumDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Views");
        By textFields = MobileBy.AccessibilityId("TextFields");
        By editText = MobileBy.id("io.appium.android.apis:id/edit");

        driver.findElement(views).click();

        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int endX = startX;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);

        for (int i = 0; i < 3; i++) {
            TouchAction t = new TouchAction(driver);
            t.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                    .moveTo(PointOption.point(endX, endY))
                    .release()
                    .perform();
        }

        driver.findElement(textFields).click();
        driver.findElement(editText).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(((AndroidDriver) driver).isKeyboardShown());

        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.C));
        driver.getKeyboard().pressKey(Keys.ARROW_DOWN); //Salto de linea
        //((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME)); //Minimiza la app
        //((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.CALENDAR)); //Abre el calendario
        //((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.B)); //Escribe una letra
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.getKeyboard().pressKey(Keys.HOME);
        //     driver.hideKeyboard();
    }
}
