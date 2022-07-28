package clasesCurso;

public class AndInteractWithKeyboard {

    public static void main(String[] args) throws Exception {
        /*
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
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
        Thread.sleep(3000);

        System.out.println(((AndroidDriver) driver).isKeyboardShown());

        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.C));
        driver.getKeyboard().pressKey(Keys.ARROW_DOWN); //Salto de linea
        //((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME)); //Minimiza la app
        //((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.CALENDAR)); //Abre el calendario
        //((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.B)); //Escribe una letra
        Thread.sleep(3000);
        driver.getKeyboard().pressKey(Keys.HOME);
        //     driver.hideKeyboard();

         */

    }
}