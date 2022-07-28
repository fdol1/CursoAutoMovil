package interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

public class GetDriver {

	private Actor actor;
	
	public GetDriver(Actor actor) {
		this.actor = actor;
	}
	
	public static GetDriver as(Actor actor) {
		return new GetDriver(actor);
	}
	
	@SuppressWarnings("unchecked")
	public AppiumDriver<MobileElement> appiumDriver() {
		return ((AppiumDriver<MobileElement>) webDriver());
	}
	
	@SuppressWarnings("unchecked")
	public AndroidDriver<AndroidElement> androidDriver() {
		return (AndroidDriver<AndroidElement>) webDriver();
	}

	@SuppressWarnings("unchecked")
	public IOSDriver<IOSElement> iosDriver() {
		return (IOSDriver<IOSElement>) webDriver();
	}
	
	public WebDriver webDriver() {
		return ((WebDriverFacade) BrowseTheWeb.as(actor)
				.getDriver())
				.getProxiedDriver();
	}
}