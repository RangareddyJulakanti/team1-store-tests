package ro.siit.tau.gr4.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ro.siit.tau.gr4.pages.LoginGmailPage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GmailDemo extends BaseTest{

@BeforeMethod
public void setUp(){
    super.driver();
}
   /* public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("start-maximized");
            driver = new ChromeDriver(chromeOptions);
            basePage = PageFactory.initElements(driver, BasePage.class);
            basePage.setDriver(driver);

          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




        //driver.manage().window().maximize();

        String url = "";

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebElement email= driver.findElement(By.id("identifierId"));
       email.clear();
         email   .sendKeys("rangareddy35@gmail.com");



        WebDriverWait wait=new WebDriverWait(driver, 20);

        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("asassassa");

        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

    }*/
    @DataProvider(name = "LoginDataProvider")
    public Iterator<Object[]> loginDataProvider() {
        Collection<Object[]> dp = new ArrayList<Object[]>();
        dp.add(new String[]{"rangareddy35@gmail.com"});
        //dp.add(new String[]{"", "", "Warning: No match for E-Mail Address and/or Password.", "false"});
//        dp.add(new String[]{"SomeUser", "somePassword", " Warning: No match for E-Mail Address and/or Password."});
        return dp.iterator();
    }
    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String emailAddres) {
        LoginGmailPage loginPage = PageFactory.initElements(driver, LoginGmailPage.class);
        loginPage.login(emailAddres);
    }

}