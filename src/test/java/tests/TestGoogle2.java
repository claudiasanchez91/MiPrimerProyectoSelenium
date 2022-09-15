package tests;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle2 {
	
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
      //ESCRIBIR TEXTO EN LA CAJA DE BUSQUEDA
    	 String textEnviado ="TEST01";
    	 WebElement txtSourch = driver.findElement(By.name("q"));
         txtSourch.sendKeys("buscando un elemento web");
         
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




