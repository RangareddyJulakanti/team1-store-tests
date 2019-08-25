package ro.siit.tau.gr4.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginGmailPage{
    @FindBy(how = How.ID,using = "identifierId")
    private WebElement identifierId;
    @FindBy(how = How.ID,using = "identifierNext")
    private WebElement next;
    public void login(String emailAddress) {
        //emailAddressField.clear();
        identifierId.sendKeys(emailAddress);
        next.click();

    }



}
