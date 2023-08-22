package automationexercise.page;

import org.openqa.selenium.By;


public class LoginPage extends BasePage {


    // mapeamento (Padrão)
    private static final By campoEmail =
            By.id("email");

    private static final By campoSenha =
            By.id("passwd");

    private static final By btnAcessar =
            By.id("SubmitLogin");

    private static final By TextMsgmBtn =
            By.cssSelector("a[class='logout']");

    private static final By msgmEmailIncorreto =
            By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/p[1]");

    // Ações (clicar, escrever etc)
    public void preencherCampoEmail(String email){
        preencherInput(campoEmail,email);
    }

    public void preencherCampoSenha(String senha){
        preencherInput(campoSenha,senha);
    }

    public void clicarBtnAcessar(){
        clicar(btnAcessar);
    }
    public String validarTextoBtnAposLogin(){
        return lerTexto(TextMsgmBtn);

    }

    public String validarMsgmEmailIncorreto(){
        return lerTexto(msgmEmailIncorreto);

    }

    public String fazerLogin(String email, String senha){
        preencherInput(campoEmail,email);
        preencherInput(campoSenha,senha);
        clicar(btnAcessar);
        return lerTexto(TextMsgmBtn);
    }

    public String loginEmailIncorreto(String email, String senha){
        preencherInput(campoEmail,email);
        preencherInput(campoSenha,senha);
        clicar(btnAcessar);
        return lerTexto(msgmEmailIncorreto);
    }
}
