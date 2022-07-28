package clasesCurso;

public class WebViewAndAutomate {

    /*public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(MobileBy.AccessibilityId("Views")).click();

        Dimension size = driver.manage().window().getSize();

        for(int i=0;i<4;i++){
            TouchAction t = new TouchAction(driver);
            t.press(PointOption.point(size.width / 2, (int) (size.height * 0.8)))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                    .moveTo(PointOption.point(size.width / 2, (int) (size.height * 0.2)))
                    .release()
                    .perform();
        }

        driver.findElement(MobileBy.AccessibilityId("WebView")).click();

        Set<String> contextHandles = driver.getContextHandles();
        for(String contextHandle : contextHandles){
            System.out.println(contextHandle);
        }

   //     driver.context("WEBVIEW");
        driver.context(contextHandles.toArray()[1].toString());
        System.out.println(driver.findElement(By.cssSelector("body > h1")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"i_am_a_textbox\"]")).getText());

        driver.context("NATIVE_APP");
    }*/
}
