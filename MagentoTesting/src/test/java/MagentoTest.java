

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest 
{
	@Test
	public void posCredential()
	{
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("https://www.magento.com");
Welcome w=new Welcome(driver);
w.clickOnMyAcct();
Login l=new Login(driver);
l.typeEmail("rekhaadviteya.br@gmail.com");
l.typePassword("Adviteya10");
l.clickOnLogin();
Main1 m=new Main1(driver);
m.clickOnLogOut();
driver.quit();
	}

}
