package automationexercise.page;


import automationexercise.factory.seleniumfactory.Elements;
import org.openqa.selenium.By;


public class BasePage extends Elements {


    static void preencherInput(By by, String text) {
        esperarElemento(by);
        element(by).sendKeys(text);
    }

    static void clicar(By by) {
        esperarElemento(by);
        element(by).click();
    }

    protected static String lerTexto(By by) {
        esperarElemento(by);
        return element(by).getText();
    }

    protected static void tab(By by){
        esperarElemento(by);
        element(by).sendKeys("\t");
    }
}
