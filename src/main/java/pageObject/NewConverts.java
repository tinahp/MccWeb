package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewConverts {

    public WebDriver driver;

    public NewConverts(WebDriver driver) {
        this.driver = driver;
    }

    //locate  web Element
    private By LButton = By.xpath("//body//div//header//div//div//nav//ul//li//a[normalize-space()='New Converts']");

    public void newbutton(){driver.findElement(LButton).click();}
    //get church name


    }


