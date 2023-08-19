package automationexercise.test;

import automationexercise.factory.seleniumfactory.SeleniumFactory;
import org.junit.After;
import org.junit.Before;


public class BaseTest {

    SeleniumFactory seleniumFactory = new SeleniumFactory();

    @Before
    public void abrirNavegador(){
        seleniumFactory.initBrowser("https://www.automationexercise.com/login");
    }


    @After
    public void fecharNavegador(){
        seleniumFactory.tearDown();
    }

}
