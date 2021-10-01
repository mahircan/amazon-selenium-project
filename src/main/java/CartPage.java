import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage{

    By cartPageProductLocater = new By.ByCssSelector("span.a-truncate-cut");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
       // return isDisplayed(cartPageProductLocater);
        return getProducts().size()>0;
    }
    private List<WebElement> getProducts(){
        return findAll(cartPageProductLocater);
    }
}
