package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    //instantiate webdriver
    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    //locate  element on webpage
    private By ClickButton = By.xpath("//*[@id=\"menu-item-267\"]/a");
    public NewConverts NewConvertsClickButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(ClickButton).click();
        return new NewConverts(driver);
    }
}
