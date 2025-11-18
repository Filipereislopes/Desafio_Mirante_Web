package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class DriverFactory {

    public static WebDriver createDriver() {
        String browser = ConfigReader.getProperty("browser");
        String caminhoProjeto = System.getProperty("user.dir");
        String caminhoRelativoDriver = "";

        WebDriver driver = null;

        switch (browser.toLowerCase()) {
            case "chrome":
                caminhoRelativoDriver = ConfigReader.getProperty("driver.path.chrome");

                String caminhoCompletoChrome = caminhoProjeto + File.separator + caminhoRelativoDriver;

                System.setProperty("webdriver.chrome.driver", caminhoCompletoChrome);
                driver = new ChromeDriver();
                break;

            case "firefox":
                caminhoRelativoDriver = ConfigReader.getProperty("driver.path.firefox");
                String caminhoCompletoFirefox = caminhoProjeto + File.separator + caminhoRelativoDriver;

                System.setProperty("webdriver.gecko.driver", caminhoCompletoFirefox);
                driver = new FirefoxDriver();
                break;

            case "edge":
                System.setProperty("webdriver.edge.driver", ConfigReader.getProperty("driver.path.edge"));
                driver = new EdgeDriver();
                break;
        }

        driver.manage().window().maximize();
        return driver;
    }
}