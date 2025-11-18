//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

import static org.junit.Assert.*;

public class ProdutosPage {

    By campoPesquisaXpath = By.xpath("//input[@name='search']");
    By botaoPesquisarId = By.id("submit_search");
    By produtoPesquisadoXpath = By.xpath("//div[@class='productinfo text-center']/p");
    By produtoXpath = By.xpath("//div[@class='product-image-wrapper']");

    public void digitarCampoPesquisa(String produto) throws Exception{
        Utils.esperaElementoVisivel(this.campoPesquisaXpath).sendKeys(produto);
    }

    public void clicarBotaoPesquisar() throws Exception{
        Utils.esperaElementoClicavel(this.botaoPesquisarId).click();
    }

    public void produtoPesquisado(String produto) throws Exception{
        assertEquals(produto,Utils.esperaElementoVisivel(this.produtoPesquisadoXpath).getText());
    }

    public void produtoPesquisadoInvalido() throws Exception{
        assertTrue(Utils.esperaElementoInvisivel(produtoXpath));
    }

}
