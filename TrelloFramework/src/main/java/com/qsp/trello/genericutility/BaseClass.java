package com.qsp.trello.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
public WebDriverUtility webdriverutils = new WebDriverUtility();
	public JavaUtility javautils=new JavaUtility();
	public FileUtility fileutils=new FileUtility();
	public ExcelUtility excelutils=new ExcelUtility();
	
	public WebDriver driver;
	
	@BeforeMethod
	public void precondition() throws IOException
	{
		//launch the browser
		String browserName = fileutils.readTheDataFromPropertyFile("browser");
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		webdriverutils.implicitwait(driver);
		driver.get(fileutils.readTheDataFromPropertyFile("url"));
		
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.manage().window().minimize();
		driver.quit();
	}

}
