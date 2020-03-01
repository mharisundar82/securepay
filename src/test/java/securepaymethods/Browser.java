package securepaymethods;


import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Browser {
    private static WebDriver driver = null;

    public static synchronized WebDriver launch() throws Exception {
        if (driver == null) {
            File configFile = new File("src/test/resources/config.properties");
            FileReader ip = new FileReader(configFile);
            Properties prop = new Properties();
            prop.load(ip);

            driver = getDriver(prop.getProperty("BROWSERTYPE"));
            driver.manage().window().maximize();

        }
        return driver;
    }

    public static WebDriver getDriver(String browserType) throws IllegalArgumentException{
        WebDriver driver;
        if(browserType.equals("FIREFOX")){
            WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
            DesiredCapabilities desired = new DesiredCapabilities();
            desired.setCapability("pageLoadStrategy", "eager");
            driver = new FirefoxDriver();

        }else if(browserType.equals("CHROME"))
        {
            WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.EAGER);
            options.addArguments("--disable-features=NetworkService");
            options.addArguments("--dns-prefetch-disable");
            driver = new ChromeDriver(options);

        }else
        {
            throw  new IllegalArgumentException("Browser Type not Supported");
        }
        return driver;

    }

    public synchronized static void logout() {
        if (driver != null)
            driver = null;
    }
}