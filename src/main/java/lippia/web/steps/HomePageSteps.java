package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.HomePageService;

public class HomePageSteps extends PageSteps {
    @And("Click on Home menu button")
    public void clickOnHome() {
        HomePageService.clickHome();
    }

    @Then("Verifies that the home page contains only three sliders")
    public void verifiesThatTheHomePageMustContainsOnlyThreeSliders() {
        HomePageService.sliderVerification();
    }

    @Then("Verifies that the Home page contains only three Arrivals")
    public void verifiesThatTheHomePageMustContainsOnlyThreeArrivals() {
        HomePageService.arrivalsVerification();
    }
}
