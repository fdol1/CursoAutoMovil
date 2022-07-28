package clasesCurso;

public class MapeoDeElementosDeNavegador {

    /*public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateBrowserSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://tesla.com");
        driver.findElement(By.xpath("//*[@id=\"tds-menu-header-main\"]/div[2]/div/label/span")).click();
        driver.findElement(By.xpath("//*[@id=\"tds-menu-header-main\"]/div[2]/div/nav/nav[2]/ol/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"tesla-hero-showcase-1838\"]/div/div[1]/div/div[2]/div/div[6]/a")).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select Your Car')]")));

        Dimension size = driver.manage().window().getSize();
        for(int i=0;i<2;i++){
            TouchAction t = new TouchAction(driver);
            t.press(PointOption.point(size.width / 2, (int) (size.height * 0.8)))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                    .moveTo(PointOption.point(size.width / 2, (int) (size.height * 0.2)))
                    .release()
                    .perform();
        }
//        Thread.sleep(10000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[@class='tds-btn tds-btn tds-btn--blue tds-btn--large']")
        )).click();
    //    driver.findElement(By.xpath("//button[@class='tds-btn tds-btn tds-btn--blue tds-btn--large']")).click();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"FIRST_NAME\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.sendKeys("Omprakash");
    }*/
}
