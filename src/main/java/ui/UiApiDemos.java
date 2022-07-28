package ui;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class UiApiDemos {

    public static final By ACCESIBILIDAD =
            MobileBy.xpath("//*[@class='android.widget.TextView' and @package='com.touchboarder.android.api.demos' and @text = 'Accessibility']");
}
