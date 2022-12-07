package steps;

import java.io.IOException;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.BuscaBlogPage;
import pages.BuscaCredenciadoPage;
import runner.RunTest;

//extends RunTest para herdar as variáveis de RunTest
public class BuscaCredenciadoSteps extends RunTest {
	
	//instanciar para criar uma cópia de uma classe e ela se tornar útil nesta classe
	BuscaCredenciadoPage buscaCredenciadoPage = new BuscaCredenciadoPage(driver);
	BuscaBlogPage buscaBlogPage = new BuscaBlogPage(driver);
	
	@Quando("acesso a funcionalidade Rede SOCNET")
	public void acesso_a_funcionalidade_rede_socnet()  {
		buscaCredenciadoPage.aceitar_cookies();
		buscaCredenciadoPage.rolar_página_até_o_final();
		buscaCredenciadoPage.acessar_rede_SOCNET();
	}
	
	@Quando("acesso buscar credenciados")
	public void acesso_buscar_credenciados() {
		buscaCredenciadoPage.acessar_buscar_credenciados();
	}
	
	@Quando("preencho os filtros de busca")
	public void preencho_os_filtros_de_busca() {
		buscaCredenciadoPage.clicar_area_pesquisa();
		buscaCredenciadoPage.selecionar_area_pesquisa_40km();
		buscaCredenciadoPage.mostrar_todas_conveniencias();
		buscaCredenciadoPage.clicar_wifi();
		buscaCredenciadoPage.clicar_ar_condicionado();
		buscaCredenciadoPage.clicar_ambulancia();
		buscaCredenciadoPage.clicar_acessibilidade();
		buscaCredenciadoPage.mostrar_todos_serviços();
		buscaCredenciadoPage.clicar_PCMSO();
		buscaCredenciadoPage.clicar_PPP();
		buscaCredenciadoPage.clicar_eSocial();
		buscaCredenciadoPage.selecionar_cidade();
	}
	
	@Quando("seleciono o credenciado desejado")
	public void seleciono_o_credenciado_desejado() {
		buscaCredenciadoPage.selecionar_credenciado();
	}
	
	@Então("visualizo o perfil do credenciado")
	public void visualizo_o_perfil_do_credenciado() {
		buscaCredenciadoPage.checar_perfil();
	}
	
	//função para tirar screenshot após cada step
	//exceção IOException: ignorar entradas e saídas
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		buscaBlogPage.screenshot(scenario);
	}
}
