package Pages;

import Base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Base {
    @FindBy(id = "accept-cookies")
    WebElement accCOOKIES;

    @FindBy(xpath = "//*[@id=\"hero\"]/div[1]/a[1]/button")
    WebElement startTRACK;



    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void setAccCOOKIES(){
        wdWait.until(ExpectedConditions.elementToBeClickable(accCOOKIES));
        accCOOKIES.click();
    }
    public void setStartTRACK(){
        wdWait.until(ExpectedConditions.elementToBeClickable(startTRACK));
        startTRACK.click();
    }



}
