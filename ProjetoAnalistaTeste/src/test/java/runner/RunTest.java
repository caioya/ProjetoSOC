package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Teste Projeto para processo seletivo de automação de testes
//Autor: Caio Yabiku
//Data de apresentação: 07/12/2022 

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/cucumber.html","json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun = false,											//true para criar o cenário como um teste
		features = "src/test/resource/features",
		glue = {"steps"},
		monochrome = true,										//tudo monocromático no console
		stepNotifications = true
)
public class RunTest {
	
	//static para acessar de outros locais através do tipo que ele foi criado
	public static WebDriver driver;

	//para reaproveitar os drivers em todos os locais
	@BeforeClass
	public static void começar() {
		driver = new ChromeDriver();
	}
	
	//para finalizar os drivers após utilizado
	@AfterClass
	public static void encerrar() {
		driver.quit();
	}
}
