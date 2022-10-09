package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LogInService;

public class LogInSteps extends PageSteps {

    @Given("The user is placed in the practice page")
    public void theClientEnterIntoThePracticePage() {
        LogInService.navegarWeb();
    }
    @When("Click on My Account Menu")
    public void clickOnMyAccountMenu() {
        LogInService.clickMyAccount();
    }

    @And("^Enter the username (.*) and password (.*) in the text boxes$")
    public void enterRegisteredUsernameUsernameInUsernameTextbox(String username, String password) {
        LogInService.enterUserName(username);
        LogInService.enterPassWord(password);
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        LogInService.clickLogin();
    }

    @Then("User must successfully login to the web page")
    public void userMustSuccessfullyLoginToTheWebPage() {
        LogInService.LoginPage();
    }

    @Then("^Proper error (.*) must be displayed and prompt to enter login again$")
    public void properErrorMustBeDisplayedAndPromptToEnterLoginAgain(String mensaje) {
        LogInService.LoginErrorPage(mensaje);
    }

}
