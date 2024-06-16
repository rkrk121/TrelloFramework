package frameworkscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qsp.trello.genericutility.BaseClass;

public class TrelloCreateAndDeleteTheBoard extends BaseClass
{
	@Test
	public void checkWhetherTheEndUserCanLogin_CreateTheBoard_DeleteTheBoard_LogoutFromTrello()
	{
		driver.findElement(By.xpath("//div[@class=\"Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI\"]/a[.='Log in']")).click();
		driver.findElement(By.id("username")).sendKeys("rkrk121@gmail.com");
		driver.findElement(By.xpath("//span[.='Continue']")).submit();
		driver.findElement(By.id("password")).sendKeys("Rahul098@");
		driver.findElement(By.xpath("//span[.='Log in']")).submit();
		
		
		
		
	}

}
