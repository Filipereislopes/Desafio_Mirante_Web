//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObject.HomePage;
import pageObject.LoginPage;

public class LoginStep {

    LoginPage lp = new LoginPage();
    HomePage hp = new HomePage();

    @Quando("o usuario clicar no botao login")
    public void oUsuarioClicarNoBotaoLogin() throws Exception {
        this.hp.clicarBotaoLogin();
    }

    @Quando("clicar no botao confirmar")
    public void clicarNoBotaoConfirmar() throws Exception {
        this.lp.clicarBotaoConecta();
    }

    @Entao("o sistema apresenta {string}")
    public void oSistemaRealizaOLogin(String mensagem) throws Exception {
        this.hp.validacaoLogin(mensagem);
    }

    @E("preencher o email {string}")
    public void preencherOEmail(String email) throws Exception {
        this.lp.digitarCampoEmail(email);
    }

    @E("preencher a senha {string}")
    public void preencherASenha(String senha) throws Exception {
        this.lp.digitarCampoSenha(senha);
    }

    @Então("o sistema apresenta erro {string}")
    public void oSistemaApresentaErro(String mensagem) {
        this.lp.retornoErroLogin(mensagem);
    }
}
