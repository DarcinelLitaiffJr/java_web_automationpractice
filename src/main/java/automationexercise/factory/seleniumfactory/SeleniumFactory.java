package automationexercise.factory.seleniumfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFactory {

    public static WebDriver driver;
    public static WebDriverWait wait;

    // inicia o browser
    public void initBrowser(String url){

        String caminhoDriver = "/opt/chromedriver114/chromedriver";
        System.setProperty("webdriver.chrome.driver", caminhoDriver);

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 40);
        driver.get(url);  // Abre o navegador
        driver.manage().window().maximize();  // Maximizar navegador

    }

    // finaliza o browser
    public void tearDown(){
        driver.close();
    }



}
