package utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void acessarSistema(){
        driver = DriverFactory.createDriver();
        wait = new WebDriverWait(Utils.driver , Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(ConfigReader.getProperty("base.url"));
    }

    public static WebElement esperaElementoVisivel(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static WebElement esperaElementoClicavel(By by){
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static Boolean esperaElementoInvisivel(By by){
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static void capturarScreenshot(Scenario scenario)throws Exception{
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String screenshotName = scenario.getName().replaceAll("[^a-zA-Z0-9]", "_") + "_" + timestamp + ".png";
        File destination = new File("screenshots/" + screenshotName);
        FileUtils.copyFile(screenshot, destination);
        byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshotBytes, "image/png", screenshotName);
    }

}
