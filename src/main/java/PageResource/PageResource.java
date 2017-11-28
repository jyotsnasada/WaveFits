package PageResource;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageResource {
    WebDriver driver;

    private LoginPage lp;

    public PageResource(WebDriver driver) {
        this.driver = driver;

    }
}
