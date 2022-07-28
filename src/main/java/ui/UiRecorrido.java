package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiRecorrido {

    public static final Target BTN_CONTINUAR =
            Target.the("")
                    .locatedForAndroid(By.id("com.android.permissioncontroller:id/continue_button"))
                    .locatedForIOS(By.id(""));

    public static final Target BTN_ACEPTAR =
            Target.the("")
                    .locatedForAndroid(By.id( "android:id/button1"))
                    .locatedForIOS(By.id(""));

    public static final Target BTN_ACEPTAR_MENSAJE =
            Target.the("")
                    .locatedForAndroid(By.id( "com.touchboarder.android.api.demos:id/buttonDefaultPositive"))
                    .locatedForIOS(By.id(""));

    public static final Target API_DEMO =
            Target.the("")
                    .locatedForAndroid(By.xpath( "//*[@class='android.widget.TextView' and @package='com.touchboarder.android.api.demos' and @text = 'API Demos']"))
                    .locatedForIOS(By.id(""));

    public static final Target VIEWS =
            Target.the("")
                    .locatedForAndroid(By.xpath( "//*[@class='android.widget.TextView' and @package='com.touchboarder.android.api.demos' and @text = 'Views']"))
                    .locatedForIOS(By.id(""));


}
