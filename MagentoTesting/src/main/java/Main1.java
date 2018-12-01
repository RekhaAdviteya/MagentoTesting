

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main1
{	
	WebDriver driver;
By logout=By.linkText("Log Out");
public Main1(WebDriver driver) 
{
	this.driver=driver;
}
public void clickOnLogOut()
{
	driver.findElement(logout).click();
}

}
