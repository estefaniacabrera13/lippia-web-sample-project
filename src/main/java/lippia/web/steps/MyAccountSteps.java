package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogInService;
import lippia.web.services.MyAccountService;

public class MyAccountSteps {

    @And("Click on Logout button")
    public void clickOnLogoutButton() {
        MyAccountService.clickLogout();
    }

    @Then("User successfully comes out from the site and returns to login page")
    public void userSuccessfullyComesOutFromTheSiteAndReturnsToLoginPage() {
        MyAccountService.LoginHeather();
    }

    @When("Click on Shop Menu")
    public void clickOnShopMenu() {
        MyAccountService.clickShop();
    }

    @And("Click on Address link")
    public void clickOnAddressLink() {
        MyAccountService.clickAdress();
    }

    @Then("User must view billing address and ship address")
    public void userMustViewBillingAddressAndShipAddress() {
        MyAccountService.viewBillingAdress();
        MyAccountService.viewShipAdress();
    }
}
