package tests;


import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class TestGoogle5 {
	
	//VARIABLES
	private WebDriver driver;
	private static final String TIPO_DRIVER = "webdriver.chrome.driver";
	private static final String PATH_DRIVER = "./src/test/resources/webDriver/chromedriver.exe";
    private String URL = "http://www.google.com";
    
    
    @BeforeClass
    public static void setUpBeforeClass()
    {
     System.out.println("INICIO DE TESTS");
     System.setProperty(TIPO_DRIVER, PATH_DRIVER);
    }
     @Before
     public void setUp()
     {
    	 // LO QUE SE VA EJECUTAR ANTES DE CADA TEST SERAN LAS 2 LINEAS SIGUIENTES 
    	 driver = new ChromeDriver(); // ABRE EL NAVEGADOR
    	 driver.get(URL); // INGRESA A LA URL
     }
     @Test
     public void testSourch01()
     {
     WebElement element = driver.findElement(By.tagName("form"));
     //DECLARAR UNA LISTA
     List<WebElement> elements = element.findElements(By.tagName("input"));
     for(WebElement elemento:elements)
     {
    	System.out.println("Elemento:"+elemento.getTagName());//VERIFICAR QUE CONTENGA LA LISTA
     }
     
     }
     //POSTCONDICION
     @After
    
     public void tearDown()
     {
    	 driver.quit();
     }
     @AfterClass
     
     public static void tearDownAfterClass()
     {
    	 System.out.println("FINALIZA LOS TESTS");
     }
     
}




