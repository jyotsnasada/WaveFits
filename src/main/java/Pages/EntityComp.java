package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class EntityComp {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ravi.eluri/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
        driver.get("http://fits.qauber.com/#/page/login");
        driver.manage().window().maximize();

        WebElement emailTextBox = driver.findElement(By.xpath(".//*[@id='exampleInputEmail1']"));
        emailTextBox.sendKeys("jyotsnas54a@gmail.com");

        WebElement passwordTextBox = driver.findElement(By.xpath(".//*[@id='exampleInputPassword1']"));
        passwordTextBox.sendKeys("robsnoop");

        Thread.sleep(5000);

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();


        WebElement entitiesComp = driver.findElement(By.xpath("//a[@title='Entities']/span"));
        entitiesComp.click();

        WebElement addEntity = driver.findElement(By.xpath("//h3/button"));
        addEntity.click();

        WebElement entityName = driver.findElement(By.xpath("//form/div[1]/div[1]/div/input"));
        entityName.sendKeys("jyo");

        WebElement phNum = driver.findElement(By.xpath("//input[@placeholder='(999) 999-9999']"));
        phNum.sendKeys("4445566777");

        WebElement sel = driver.findElement(By.xpath("//div[2]/div[1]/div[1]/div/div[2]/button[1]"));
        sel.click();

        String fileLocation = "C:\\Users\\ravi.eluri\\Desktop\\cancel.PNG";

        StringSelection filepath = new StringSelection(fileLocation);

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

        Robot robot = new Robot();

        try{

            robot.delay(500);

            robot.keyPress(KeyEvent.VK_CONTROL);

            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.keyPress(KeyEvent.VK_ENTER);

            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (Exception e1) {

            e1.printStackTrace();

        }



        WebElement country = driver.findElement(By.xpath("//div[2]/div[1]/div[2]/select"));
        Select countryType = new Select(country);
        countryType.selectByVisibleText("United States");

        WebElement addrss = driver.findElement(By.xpath("//div[2]/div[1]/div[3]/input"));
        addrss.sendKeys("stender way");

        WebElement city = driver.findElement(By.xpath("//div[2]/div[1]/div[5]/input"));
        city.sendKeys("santa claus");

        WebElement state = driver.findElement(By.xpath("//div[2]/div[1]/div[6]/select"));
        Capabilities cp = ((RemoteWebDriver) driver).getCapabilities();
        if (cp.getBrowserName().equals("chrome")) {
            try {
                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].scrollIntoView(true);", state);
            } catch (Exception e) {

            }
        }
        Select stateType = new Select(state);
        stateType.selectByVisibleText("California");

        WebElement zipNum = driver.findElement(By.xpath("//div[2]/div[1]/div[7]/input"));
        zipNum.sendKeys("94086");

        WebElement nextStep = driver.findElement(By.xpath("//section/div/div/div[2]/button[2]"));
        nextStep.click();

        WebElement regUser = driver.findElement(By.xpath("//div/div/div[1]/div[2]/form/div/div/input"));
        regUser.sendKeys("kabhkabh@mailinator.com");

        WebElement regNext = driver.findElement(By.xpath("//section/div/div/div[2]/button[2]"));
        regNext.click();

        Thread.sleep(5000);

        WebElement regdn = driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div/button"));
        regdn.click();

        WebElement adminUser = driver.findElement(By.xpath("//div[3]/form/div/div/input[@type='text']"));
        adminUser.sendKeys("youyouyouy@mailinator.com");

        Thread.sleep(5000);

        WebElement adminNext = driver.findElement(By.xpath("//span[text()='Next step']"));
        adminNext.click();

        Thread.sleep(10000);

        WebElement admindn = driver.findElement(By.xpath("//button[text()='Done']"));
        admindn.click();

        Thread.sleep(10000);

        WebElement fin = driver.findElement(By.xpath("//section/div/div/div[2]/button[2]"));
        fin.click();

        Thread.sleep(30000);

        WebElement pplogin = driver.findElement(By.xpath(".//*[@id='loadLogin']"));
        pplogin.click();

        WebElement emailTxt = driver.findElement(By.xpath(".//*[@id='login_email']"));
        emailTxt.sendKeys("hudhud@amail.club");

        WebElement pwdText = driver.findElement(By.xpath(".//*[@id='login_password']"));
        pwdText.sendKeys("hudhudhudhud");

        WebElement lin = driver.findElement(By.xpath(".//*[@id='submitLogin']"));
        lin.click();

        Thread.sleep(20000);



        WebElement ctn = driver.findElement(By.xpath(".//*[@id='continue']"));
        if (cp.getBrowserName().equals("chrome")) {
            try {
                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].scrollIntoView(true);", ctn);
            } catch (Exception e) {

            }
        }
        ctn.click();

        Thread.sleep(30000);

        WebElement nwEntity = driver.findElement(By.xpath("//tr[6]/td[1]/div/div[1]/a"));
        String nw = nwEntity.getText();
        Assert.assertEquals(nw,"jyo");
        /*if(nw.equals("jyo")){
            System.out.println("Test Case passed ...");
        }else{
            System.out.println("Test Case Failed ...");
        }
        nwEntity.click();*/

        driver.quit();
    }




}
