package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogInConstants;
import lippia.web.constants.MyAccountConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class MyAccountService extends ActionManager {
    public static void clickLogout() {
        waitVisibility(MyAccountConstants.LOGOUT_BUTTON);
        click(MyAccountConstants.LOGOUT_BUTTON);
    }
    public static void LoginHeather() {
        WebActionManager.isVisible(MyAccountConstants.LOGIN_HEATHER);
    }
    public static void validarCategorias(String nombreProyecto){
        WebActionManager.waitVisibility(MyAccountConstants.PRODUCTS_NAME);
        List<WebElement> listOfProducts = WebActionManager.getElements(MyAccountConstants.PRODUCTS_NAME);
        for (WebElement name : listOfProducts) {
            String expectedName = name.getText().toLowerCase();
            Assert.assertTrue(expectedName.contains(nombreProyecto));
        }
    }
    public static void clickShop() {
        waitVisibility(MyAccountConstants.SHOP_BUTTON);
        click(MyAccountConstants.SHOP_BUTTON);
    }

    public static void clickAdress(){
        click(MyAccountConstants.ADRESS_LINK);
    }
    public static void viewBillingAdress() {
        WebActionManager.isVisible(MyAccountConstants.ADRESS_HEATHER);
    }
    public static void viewShipAdress() {
        WebActionManager.isVisible(MyAccountConstants.SHIP_HEATHER);
    }
}
