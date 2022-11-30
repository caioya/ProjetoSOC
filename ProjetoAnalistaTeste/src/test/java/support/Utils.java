package support;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunTest;

public class Utils extends RunTest{

	public  void esperar_elemento_estar_presente(By element ,int tempo) {						
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tempo));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
}
