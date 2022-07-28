package interactions;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.Set;

public class WebViewAndAutomate2 implements Interaction {

    public WebViewAndAutomate2() {
    }

    public static WebViewAndAutomate2 inApp() {
        return Tasks.instrumented(WebViewAndAutomate2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        AppiumDriver driver = GetDriver.as(actor).appiumDriver();

        Set<String> contextHandles = driver.getContextHandles();
        for(String contextHandle : contextHandles){
            System.out.println(contextHandle);
        }//Busca los id de las app abiertas

        //     driver.context("WEBVIEW");
        driver.context(contextHandles.toArray()[1].toString());
        //System.out.println(driver.findElement(By.cssSelector("body > h1")).getText());
        //System.out.println(driver.findElement(By.xpath("//*[@id=\"i_am_a_textbox\"]")).getText());

        driver.context("NATIVE_APP");
    }
}
