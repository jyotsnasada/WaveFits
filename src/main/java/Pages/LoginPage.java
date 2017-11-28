package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class LoginPage{
    //method for login

    public static WebElement txtbxUserName(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath(".//*[@id='exampleInputEmail1']"));
        return element;
    }
    public static WebElement txtbxPassword(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath(".//*[@id='exampleInputPassword1']"));
        return element;
    }

    public void btnLogin(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
        element.click();
    }




    }



