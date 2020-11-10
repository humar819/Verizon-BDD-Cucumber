package runnerTest.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PhonePage extends ElementUtil {


    public PhonePage(WebDriver driver){
        this.driver = driver;

    }

    By shop = By.id("gnav20-Shop-L1");
    By smartPhone = By.id("gnav20-Shop-L3-1");
    By iphone = By.id("tile_dev12360040");
    By phoneColor = By.xpath("//input[@aria-label='Red color']");
    By phoneSize =By.xpath("//p[text()='64GB']");
    By phonePrice = By.xpath("//span[text()='$599.99']");
    By continutBtn = By.id("ATC-Btn");
    By zipcode = By.id("zipcode");
    By confirmLocation = By.xpath("//button[contains(text(),'Confirm Location')]");
    By newCustomer = By.xpath("//button[contains(text(),'New Customer')]");
    By addCartSign = By.xpath("//div[@class='gnav20-unifiedcart']//button[@aria-expanded='false']");
    By solutionBtn = By.xpath("//a[contains(text(),'Mobile solutions')]");
    By selectedPhone = By.xpath("//span[text()='iPhone 11']");

    public String phonePageTitle(){
        String title = driver.getTitle();
        System.out.println("Title : " + title);
        return title;
    }

    public void clickOnPhoneAndSmartPhone(){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(shop);
        actions.moveToElement(element).build().perform();
        clickOn(smartPhone);
    }
    public void selectSmartPhone(){
        WebDriverWait wait =new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(iphone));
        clickOn(iphone);
    }


    public void handZipCode(){
        clickOn(continutBtn);
        clear(zipcode);
        sendValue(zipcode, "33647");
        clickOn(confirmLocation);
        clickOn(newCustomer);

    }

    public void addProductToCart(){
       clickOn(addCartSign);
       clickOn(solutionBtn);
    }

    public String getSelectedPhone(){
    String Phone = getTextFromElement(selectedPhone);
    System.out.println("I selected : " + Phone);
    return Phone;
    }



}
