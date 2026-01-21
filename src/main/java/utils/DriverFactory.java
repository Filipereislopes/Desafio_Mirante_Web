package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions; // <--- Importante
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions; // <--- Importante
import java.io.File;

public class DriverFactory {

    public static WebDriver createDriver() {
        String browser = ConfigReader.getProperty("browser");
        String caminhoProjeto = System.getProperty("user.dir");
        String caminhoRelativoDriver = "";

        WebDriver driver = null;

        boolean isHeadless = System.getenv("CI") != null || System.getProperty("headless") != null;

        switch (browser.toLowerCase()) {
            case "chrome":
                caminhoRelativoDriver = ConfigReader.getProperty("driver.path.chrome");
                String caminhoCompletoChrome = caminhoProjeto + File.separator + caminhoRelativoDriver;
                System.setProperty("webdriver.chrome.driver", caminhoCompletoChrome);

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*");

                if (isHeadless) {
                    chromeOptions.addArguments("--headless=new");
                    chromeOptions.addArguments("--window-size=1920,1080");
                    chromeOptions.addArguments("--no-sandbox");
                    chromeOptions.addArguments("--disable-dev-shm-usage");
                    chromeOptions.addArguments("--disable-gpu");
                }

                driver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                caminhoRelativoDriver = ConfigReader.getProperty("driver.path.firefox");
                String caminhoCompletoFirefox = caminhoProjeto + File.separator + caminhoRelativoDriver;
                System.setProperty("webdriver.gecko.driver", caminhoCompletoFirefox);

                FirefoxOptions firefoxOptions = new FirefoxOptions();

                if (isHeadless) {
                    firefoxOptions.addArguments("-headless"); // Firefox usa um traço só geralmente
                    firefoxOptions.addArguments("--window-size=1920,1080");
                }

                driver = new FirefoxDriver(firefoxOptions);
                break;

            case "edge":
                System.setProperty("webdriver.edge.driver", ConfigReader.getProperty("driver.path.edge"));

                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--remote-allow-origins=*");
                // Como o Edge é baseado no Chromium, os argumentos são iguais aos do Chrome
                if (isHeadless) {
                    edgeOptions.addArguments("--headless=new");
                    edgeOptions.addArguments("--window-size=1920,1080");
                    edgeOptions.addArguments("--no-sandbox");
                    edgeOptions.addArguments("--disable-dev-shm-usage");
                    edgeOptions.addArguments("--disable-gpu");
                }

                driver = new EdgeDriver(edgeOptions);
                break;
        }

        if (driver != null && !isHeadless) {
            driver.manage().window().maximize();
        }

        return driver;
    }
}