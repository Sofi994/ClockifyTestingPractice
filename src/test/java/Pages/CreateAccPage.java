package Pages;

import Base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateAccPage extends Base {
    @FindBy(name = "emailSignup")
    WebElement emailField;

    @FindBy(name = "passSignup")
    WebElement passField;

    @FindBy(xpath = "/html/body/app-root/register-layout/div/div/div/div/div[2]/signup/div/form/div/div/div/div[2]/div[4]/button")
    WebElement singUP;

    public CreateAccPage(){
        PageFactory.initElements(driver,this);
    }

    public CreateAccPage
    INPUTemail(String email){
        wdWait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public  CreateAccPage
    SETpassword(String password){
        wdWait.until(ExpectedConditions.elementToBeClickable(passField));
        passField.clear();
        passField.sendKeys(password);
        return this;
    }
    public void setSingUP(){
        wdWait.until(ExpectedConditions.elementToBeClickable(singUP));
        singUP.click();
    }
}


