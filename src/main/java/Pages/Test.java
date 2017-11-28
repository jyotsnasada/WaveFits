package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;



public class Test {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ravi.eluri/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
        driver.get("http://fits.qauber.com/#/page/login");
        driver.manage().window().maximize();

        WebElement emailTextBox = driver.findElement(By.xpath(".//*[@id='exampleInputEmail1']"));
        emailTextBox.sendKeys("jyotsnas54a@gmail.com");

        WebElement passwordTextBox = driver.findElement(By.xpath(".//*[@id='exampleInputPassword1']"));
        passwordTextBox.sendKeys("robsnoop");

        Thread.sleep(5000);

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        Thread.sleep(5000);

       WebElement profile = driver.findElement(By.xpath("//span[@class='mr-sm ng-binding']"));
       String a = profile.getText();
       Assert.assertEquals(a,"jyo");

        WebElement addReport = driver.findElement(
                By.xpath("//a[@title='Add Report']/span"));
        String d = addReport.getText();
        Assert.assertEquals(d, "Add Report");

        Thread.sleep(5000);
        addReport.click();

        WebElement radio = driver.findElement(By.xpath("//label[text()='dps1']/span"));
        Thread.sleep(5000);
        radio.click();
        Thread.sleep(5000);


        WebElement next = driver.findElement(By.xpath("//div[@ng-show='wizard.active(1)']/ul/li/a"));
        Capabilities cp = ((RemoteWebDriver) driver).getCapabilities();
        if (cp.getBrowserName().equals("chrome")) {
            try {
                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].scrollIntoView(true);", next);
            } catch (Exception e) {

            }
        }
        next.click();

        WebElement EmailId = driver.findElement(By.xpath("//div[9]/div[2]/div/div/input[@placeholder='Contact E-Mail']"));
        EmailId.sendKeys("abc.com");
        WebElement ErrorMsg = driver.findElement(By.xpath("//div[9]/div[2]/div/div/span[text()='Please enter a valid email address']"));
        String errorMsg = ErrorMsg.getText();
        Assert.assertEquals(errorMsg, "Please enter a valid email address");








    }

}
