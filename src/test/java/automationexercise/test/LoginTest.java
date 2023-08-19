package automationexercise.test;

import automationexercise.dto.LoginDto;
import automationexercise.factory.data.LoginData;
import automationexercise.page.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest{

    LoginPage loginPage = new LoginPage();
    LoginData loginData = new LoginData();

    // Fluxo positivo - Cenário automatizado com execução de passo a passo
    @Test
    @Epic("Login")
    @Story("Como usuário do sistema, " +
           "desejo fazer login na aplicação " +
           "quando inserir email e senha validos")
    @DisplayName("Test 1 - Validar Login com dados validos")
    public void validarLoginDadosValidos(){
        LoginDto usu =  loginData.loginDadosValidos();      // Criando a massa
        loginPage.preencherCampoEmail( usu.getEmail());      // Preenhce campo email
        loginPage.preencherCampoSenha(usu.getSenha());      // Preenhce campo senha
        loginPage.clicarBtnAcessar();                       // Clicar em botao
        String msgm = loginPage.validarTextoBtnAposLogin(); // Ler o texto no elemento
        Assert.assertEquals(msgm,"Logout");         // Validando os resultados
    }

    // Fluxo positivo - Cenário automatizado com execução de passo a passo
    @Test
    @Epic("Login")
    @Story("Como usuário do sistema, " +
            "desejo fazer login na aplicação " +
            "quando inserir email e senha validos")
    @DisplayName("Test 2 - Validar Login com dados invalidos")
    public void validarLoginDadosInvalidos(){
        LoginDto usu =  loginData.LoginDadoDinamicos();     // Criando a massa
        loginPage.preencherCampoEmail(usu.getEmail());      // Preenhce campo email
        loginPage.preencherCampoSenha(usu.getSenha());      // Preenhce campo senha
        loginPage.clicarBtnAcessar();                       // Clicar em botao
        String msgm = loginPage.validarMsgmEmailIncorreto(); // Ler o texto no elemento
        Assert.assertEquals(msgm,"Your email or password is incorrect!"); // Validando o resultado
    }

    // Fluxo alternativo - Cenário automatizado com execução de fluxo
    @Test
    @Epic("Login")
    @Story("Como usuário do sistema, " +
            "desejo fazer login na aplicação " +
            "quando inserir email e senha validos")
    @DisplayName("Test 3 - Validar Login com dados validos")
    public void validarLoginComDadosValidosTest3(){

        LoginDto usu =  loginData.loginDadosValidos();                      // Criando a massa
        String msgm = loginPage.fazerLogin(usu.getEmail(),usu.getSenha());  // Executando fluxo
        Assert.assertEquals(msgm,"Logout");                         // Validando o resultado

    }

    // Fluxo alternativo - Cenário automatizado com execução de fluxo
    @Test
    @Epic("Login")
    @Story("Como usuário do sistema, " +
            "desejo fazer login na aplicação " +
            "quando inserir email e senha validos")
    @DisplayName("Test 4 - Validar Login com dados invalidos")
    public void validarLoginDadosInvalidosTest4(){

        LoginDto usu =  loginData.LoginDadoDinamicos();                              // Criando a massa
        String msgm = loginPage.loginEmailIncorreto(usu.getEmail(), usu.getSenha()); // Executando fluxo
        Assert.assertEquals(msgm,"Your email or password is incorrect!");    // Validando o resultado

    }

}
