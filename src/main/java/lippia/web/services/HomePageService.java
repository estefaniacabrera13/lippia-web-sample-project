package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomePageConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePageService extends ActionManager {

    public static void clickHome(){
        click(HomePageConstants.HOME_BUTTON);
    }

    public static void sliderVerification(){
        List<WebElement> sliders =  getElementsByParent(HomePageConstants.SLICER_DIV,HomePageConstants.IMG_SLICER);
        Assert.assertEquals(3, sliders.size());
    }

    public static void arrivalsVerification(){
        List<WebElement> imagenes =  getElementsByParent(HomePageConstants.ARRIVALS_DIV,HomePageConstants.IMG_ARRIVALS);
        System.out.println("Elementos encontrados: " + imagenes.size());
        Assert.assertEquals(3, imagenes.size());
    }
}
