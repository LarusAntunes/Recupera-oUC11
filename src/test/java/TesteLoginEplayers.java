import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.Test;

public class TesteLoginEplayers {
	private WebDriver driver;
	
	@Before
	public void ConfigurarTeste()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USUARIO\\Desktop\\Programas\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:4200");
	}
	
	@Test
	public void TestarLogin()
	{
		driver.findElement(By.id("input-email")).sendKeys("larus@email.com");
		driver.findElement(By.id("input-senha")).sendKeys("senha123");
		driver.findElement(By.id("botao-enviar")).click();
	}
	
}
