package br.seleniumwebdriver.com.br;



import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestePagOlx {

	@Test
	public void deveInteragirComLinks() {

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://conta.olx.com.br/cadastro/");
		driver.manage().window().setSize(new Dimension(1200, 760));
		
		driver.findElement(By.linkText("Entrar com o Facebook")).click();
		Assert.assertEquals("Entrar com o Facebook",driver.findElement(By.linkText("Entrar com o Facebook")).getText());
		
		
		driver.quit();
	}

	@Test
	public void deveInteragirComLink2() {

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://conta.olx.com.br/cadastro/");
		driver.manage().window().setSize(new Dimension(1200, 760));
		
		driver.findElement(By.linkText("Entrar com o Google")).click();
		Assert.assertEquals("Entrar com o Google",driver.findElement(By.linkText("Entrar com o Google")).getText());
		
		driver.quit();
	}
    
	@Test
	public void escreverField() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://conta.olx.com.br/cadastro/");
		driver.manage().window().setSize(new Dimension(1200, 760));
		
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/form/div[1]/div[2]/input")).sendKeys("vanda");
	    Assert.assertEquals("vanda",driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/form/div[1]/div[2]/input")).getAttribute("value"));
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/form/div[2]/div[2]/input")).sendKeys("joanasousaleites6025@gmail.com");
	    Assert.assertEquals("joanasousaleites6025@gmail.com", driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/form/div[2]/div[2]/input")).getAttribute("value"));
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/form/div[3]/div[2]/div/input")).sendKeys("saraleites10420304050");
	    Assert.assertEquals("saraleites10420304050", driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/form/div[3]/div[2]/div/input")).getAttribute("value"));
	    driver.findElement(By.cssSelector("#__next > div > div > div.sc-krDsej.gLBCAZ > div.sc-lnrBVv.EnMfK > form > div.sc-hvvHee.jPXJhH > button")).click();
	  
	  driver.quit();
	}
	
	
	
	
	
	
}