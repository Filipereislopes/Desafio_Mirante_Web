//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.HomePage;
import pageObject.ProdutosPage;

public class ProdutosStep {
    HomePage hp = new HomePage();
    ProdutosPage pg = new ProdutosPage();

    @Dado("o usuario tenha feito login no site")
    public void oUsuarioTenhaFeitoLoginNoSite() throws Exception {
    }

    @Quando("clicar na aba produtos")
    public void clicarNaAbaProdutos() throws Exception {
        hp.clicarProdutos();
    }

    @E("digitar o {string}")
    public void digitarO(String produto) throws Exception {
        pg.digitarCampoPesquisa(produto);
    }

    @E("clicar no botao pesquisar")
    public void clicarNoBotaoPesquisar() throws Exception {
        pg.clicarBotaoPesquisar();
    }

    @Entao("o sistema apresenta o {string}")
    public void oSistemaApresentaO(String produto) throws Exception {
        pg.produtoPesquisado(produto);
    }

    @Entao("o sistema nao apresenta produto")
    public void oSistemaNaoApresentaProduto() throws Exception {
        pg.produtoPesquisadoInvalido();
    }
}
