package automationexercise.factory.seleniumfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elements extends SeleniumFactory {

    // Método para pegar um elemento
    public static WebElement element(By by){
        return driver.findElement(by);
    }
    // Metodo para esperar um elemento
    public static void esperarElemento(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
