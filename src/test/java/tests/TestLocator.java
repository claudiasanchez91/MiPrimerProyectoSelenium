package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLocator {

	//CAMPOS
	
		WebDriver driver;
		String TIPO_DRIVER = "webdriver.chrome.driver";
		String PATH_DRIVER = "./src/test/resources/webDriver/chromedriver.exe";
		String URL = "http://automationpractice.com/";

@Before

public void setUp()
{
	System.setProperty(TIPO_DRIVER, PATH_DRIVER);
	driver = new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
}
  @Test
   public void testLocators() throws InterruptedException 
{
 //By ID
   WebElement elemento = driver.findElement(By.id("search_query_top"));
   elemento.sendKeys("POR ID");
   Thread.sleep(3000);
   //By Name
   elemento.clear();
   elemento = driver.findElement(By.name("search_query"));
   elemento.sendKeys("POR NAME");
   Thread.sleep(3000);
   //By CLASNAME
   elemento.clear();
   elemento = driver.findElement(By.className("login"));
   elemento.click();
   Thread.sleep(3000);
   //By TAGNAME
   elemento = driver.findElement(By.tagName("body"));
   elemento.click();
   //By LINKTEXT
   elemento = driver.findElement(By.linkText("Contact us"));
   elemento.click();
   //By partLinText
   elemento = driver.findElement(By.partialLinkText("Contact"));
   elemento.click();
   
   //BY CSSSELECTOR
   elemento =driver.findElement(By.cssSelector(".search_query.form-control.ac_input"));
   elemento.sendKeys("POR CSSSELECTOR");
   //By XPATH
   elemento.clear();
   elemento = driver.findElement(By.xpath("//input[@id='search_query_top']"));
   elemento.sendKeys("POR XPATH"); 
   Thread.sleep(3000);
}
  @After
  public void tearDown()
  {
  driver.quit();
  }
}


