package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class OperaBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk/";
        System.setProperty("webdriver.opera.driver", "drivers/operadriver.exe");
        WebDriver driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String Title = driver.getTitle();
        System.out.println(Title);
        driver.quit();
    }
}
