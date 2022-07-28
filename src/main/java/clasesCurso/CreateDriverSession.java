package clasesCurso;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {

    public static void main(String[] args) {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galax j8");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.UDID, "ae139049");
        capabilities.setCapability("appPakage", "misurtii.grupo.exito");
        capabilities.setCapability("AppActivity", "misurtii.grupo.exito.MainActivity");
        //String urlApp = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + "app-misurtii.apk";
        //capabilities.setCapability(MobileCapabilityType.APP, urlApp);

        try {
            URL url = new URL("http://127.0.0.1:4723/wb/hub");
            AppiumDriver driver = new AndroidDriver(url,capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}