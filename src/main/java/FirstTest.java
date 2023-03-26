import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        WebDriver driver = new EdgeDriver();
        //   WebDriver driver = new SafariDriver();//driverda olmadigi icin kabul etmedi

        driver.get("https://www.hepsiburada.com/");




    }



}
