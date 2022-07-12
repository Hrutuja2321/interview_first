package com.code1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass
{
	WebDriver drive;
	
	
	@Parameters("browsername")
	@Test
	public void openUrl(String browsername)
	{
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			
		WebDriverManager.chromedriver().setup();
		
		 drive=new ChromeDriver();
		
		}
		
		
		else if(browsername.equalsIgnoreCase("fire"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			drive=new FirefoxDriver();
			
			
			WebDriverManager.edgedriver().setup();
			
		}
		
		
		
		else if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			
			drive=new EdgeDriver();
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
