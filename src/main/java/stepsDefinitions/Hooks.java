//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageObject.LoginPage;
import utils.Utils;

public class Hooks {
    @Before("@login")
    public void login() {
        Utils.acessarSistema();
    }

    @Before("@Teste")
    public void comecoTeste() throws Exception {
        Utils.acessarSistema();
        LoginPage lp = new LoginPage();
        lp.loginCompleto("Teste@Filipe.com", "12345678");
    }

    @After
    public void fimTeste(Scenario scenario) throws Exception {
        Utils.capturarScreenshot(scenario);
        Utils.driver.quit();
        System.out.println("===============  " + scenario.getStatus() + "  ===============");
    }
}
