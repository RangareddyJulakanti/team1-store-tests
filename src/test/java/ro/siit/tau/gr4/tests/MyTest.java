package ro.siit.tau.gr4.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MyTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.gmail.com");
        Thread.sleep(5000);
        //LoginGmailPage loginPage = PageFactory.initElements(driver, LoginGmailPage.class);
      WebElement email= driver.findElement(By.xpath("//input[@id='identifierId']"));
        email.click();
//        email.clear();
        email.sendKeys("rangareddy35@gmail.com");
        WebElement next= driver.findElement(By.id("identifierNext"));
        next.click();
        WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("R@ng@@123");
        WebElement passwordNext= driver.findElement(By.id("passwordNext"));
        passwordNext.click();
       // loginPage.login("rangareddy35@gmail.com");
    }
}
