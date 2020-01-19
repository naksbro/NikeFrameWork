package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static final String propPath = "src/main/resources/config/config.properties";
    private static long implicitWait = Long.parseLong(ConfigReader.readProperty(propPath, "implicitWait"));
    private static String url = ConfigReader.readProperty(propPath, "url");
    private static String browser = ConfigReader.readProperty(propPath, "browser");

    public static void initializer () {
        String browser = ConfigReader.readProperty(propPath, "browser");
        if ("chrome".equals(browser)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicitWait , TimeUnit.SECONDS);
        driver.get(url);
    }
}
