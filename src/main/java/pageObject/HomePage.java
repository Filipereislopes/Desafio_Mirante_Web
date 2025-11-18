//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.Utils;

public class HomePage {

    By botaoLoginXpath = By.xpath("//a[contains(.,'Login')]");
    By botaoProdutoXpath = By.xpath("//a[contains(.,'Products')]");
    By loginUsuario = By.xpath("//b[contains(.,'TesteFilipe')]");

    public void clicarBotaoLogin() throws Exception {
        Utils.esperaElementoVisivel(this.botaoLoginXpath).click();
    }

    public void validacaoLogin(String mensagem) throws Exception {
        Assert.assertEquals(mensagem, Utils.esperaElementoVisivel(this.loginUsuario).getText());
    }

    public void clicarProdutos() throws Exception {
        Utils.esperaElementoVisivel(this.botaoProdutoXpath).click();
    }
}
