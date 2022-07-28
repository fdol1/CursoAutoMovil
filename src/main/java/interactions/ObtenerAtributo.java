package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;

public class ObtenerAtributo implements Interaction {

    private By elemento;

    public ObtenerAtributo(By elemento) {
        this.elemento = elemento;
    }

    public static ObtenerAtributo deElemento(By elemento) {
        return Tasks.instrumented(ObtenerAtributo.class, elemento);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("Text:" + GetDriver.as(actor).appiumDriver().findElement(elemento).getText());
        //System.out.println("label:" + GetDriver.as(actor).appiumDriver().findElement(elemento).getAttribute("label"));
        //System.out.println("value:" + GetDriver.as(actor).appiumDriver().findElement(elemento).getAttribute("value"));
        System.out.println("enabled:" + GetDriver.as(actor).appiumDriver().findElement(elemento).getAttribute("enabled"));
        System.out.println("selected:" + GetDriver.as(actor).appiumDriver().findElement(elemento).getAttribute("selected"));
        //System.out.println("visible:" + GetDriver.as(actor).appiumDriver().findElement(elemento).getAttribute("visible"));

        System.out.println("selected:" + GetDriver.as(actor).appiumDriver().findElement(elemento).isSelected());
        System.out.println("enabled:" + GetDriver.as(actor).appiumDriver().findElement(elemento).isEnabled());
        System.out.println("displayed:" + GetDriver.as(actor).appiumDriver().findElement(elemento).isDisplayed());
    }
}
