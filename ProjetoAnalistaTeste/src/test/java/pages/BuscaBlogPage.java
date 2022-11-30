package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;
import support.Utils;

public class BuscaBlogPage extends Utils {

	public WebDriver driver;
	public String resultado_esperado;
	private By lacuna_procurar = By.cssSelector("div[data-id='0d410f5'] > div > form > div > input");
	private By botao_procurar = By.cssSelector("div[data-id='0d410f5'] > div > form > div > button");
	private By resultado_obtido_pesquisa = By.cssSelector("div[data-id='a57d20c'] > div > h2");
	private By botao_fechar_anuncio = By.cssSelector("a[class='elementor-icon'] > svg >polygon");
	
	//criação de construtor do driver
	//para entregar um objeto de um modo específico
	public BuscaBlogPage(WebDriver driver) {
		//this. para diferenciar o parâmetro do atributo
		this.driver = driver;
	}
	
	//função para iniciar o navegador e acessar o link desejado
	public void acessar_site() {
		driver.get("https://ww2.soc.com.br/blog/");
		driver.findElement(botao_fechar_anuncio).click();
	}
	
	//função para localizar e preenhcer o campo de pesquisa
	public void preencher_lacuna_procurar(String info) {
		resultado_esperado = info;
		driver.findElement(lacuna_procurar).sendKeys(info);
	}
	
	//função para clicar em procurar
	public void procurar_info() {
		driver.findElement(botao_procurar).click();
	}
	
	//função para obter o resultado da pesquisa e compará-lo com o esperado
	public void verificar_resultado() {
		String resultado_obtido = driver.findElement(resultado_obtido_pesquisa).getText();
		Assert.assertEquals(resultado_obtido, "Resultados da Pesquisa por: " + resultado_esperado);
	}
	
	public void screenshot(Scenario scenario) throws IOException {
		File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//converter File para byte para usar o attach
		//uso pom apache commons IO para converter
		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(fileContent, "image/png", "image");
	}
}
	

