package utilis;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BasePage {

    public static WebDriver driver;
    Properties prop;


    public  WebDriver initialize_driver(){
        String browsername = prop.getProperty("browser");
        if(browsername.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browsername.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else{
            System.out.println("No correct browser found ! ");
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("url"));
        return driver;
    }




  public Properties initialize_prop()  {

       prop = new Properties();
       String path = "/Users/dilhumarablet/IdeaProjects/Verizon_Cucumber/config.properties";


          try {
              FileInputStream ip = new FileInputStream(path);
                   prop.load(ip);
          } catch (IOException e) {
              e.printStackTrace();
          }
          return prop;
      }

      public static void quitBrowser() {
          try {
              driver.quit();
          } catch (Exception e) {
              System.out.println("Some Exceptions occured while closing the browser");
          }
      }

  }
