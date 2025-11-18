//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.Utils;

public class LoginPage {

    HomePage hp = new HomePage();
    By campoEmailXpath = By.xpath("//input[@data-qa='login-email']");
    By campoSenhaXpath = By.xpath("//input[@data-qa='login-password']");
    By botaoConectaXpath = By.xpath("//button[@data-qa='login-button']");
    By textoErroLoginXpath = By.xpath("//p[contains(.,'Your email or password is incorrect!')]");

    public void retornoErroLogin(String mensagem) {
        Assert.assertEquals(mensagem, Utils.esperaElementoVisivel(this.textoErroLoginXpath).getText());
    }

    public void digitarCampoEmail(String email) throws Exception {
        Utils.esperaElementoVisivel(this.campoEmailXpath).sendKeys(new CharSequence[]{email});
    }

    public void digitarCampoSenha(String senha) throws Exception {
        Utils.esperaElementoVisivel(this.campoSenhaXpath).sendKeys(new CharSequence[]{senha});
    }

    public void clicarBotaoConecta() throws Exception {
        Utils.esperaElementoVisivel(this.botaoConectaXpath).click();
    }

    public void loginCompleto(String email, String senha) throws Exception {
        this.hp.clicarBotaoLogin();
        this.digitarCampoEmail(email);
        this.digitarCampoSenha(senha);
        this.clicarBotaoConecta();
    }
}
