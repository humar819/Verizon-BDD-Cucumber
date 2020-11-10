package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import runnerTest.webPages.PhonePage;
import utilis.BasePage;
import java.util.Properties;

public class PhoneSD {

       BasePage basePage = new BasePage();
       Properties prop = basePage.initialize_prop();
       WebDriver driver = basePage.initialize_driver();
       PhonePage phonePage = new PhonePage(driver) ;


@Given("^I am on Verizon Home page$")
    public void VerifyHomePageTitle (){
    Assert.assertEquals(driver.getTitle(), "Verizon: Wireless, Internet, TV and Phone Services | Official Site");
}

    @When("^I click smartphones option on manin page$")
    public void iClickSmartphonesOptionOnManinPage() {
      phonePage.clickOnPhoneAndSmartPhone();
    }

    @And("I select a smartphone")
    public void iSelectASmartphone() {
    phonePage.selectSmartPhone();
    }


    @And("I handled zipcode and select new customer")
    public void iHandledZipcodeAndSelectNewCustomer() {
          phonePage.handZipCode();
    }

    @And("I added that phone to the cart")
    public void iAddedThatPhoneToTheCart() {
    phonePage.addProductToCart();
    }

    @Then("I verified that i selected correct phone")
    public void iVerifiedThatISelectedCorrectPhone() {
    Assert.assertEquals(phonePage.getSelectedPhone(),"iPhone 11");

    BasePage.quitBrowser();
    }
}
