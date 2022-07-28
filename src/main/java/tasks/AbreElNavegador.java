package tasks;

import interactions.GetDriver;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class AbreElNavegador implements Task {

    public AbreElNavegador(){}

    public static AbreElNavegador delCelular(){
        return Tasks.instrumented(AbreElNavegador.class);
    }

    @Override
    @Step("The MiSurtii app opens")
    public <T extends Actor> void performAs(T actor) {

        AppiumDriver driver = GetDriver.as(actor).appiumDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.google.com");

        Logger.getAnonymousLogger().info("The MiSurtii app opens");
    }
}