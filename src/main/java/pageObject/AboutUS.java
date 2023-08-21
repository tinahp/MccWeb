package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUS {

    public WebDriver driver;

    public AboutUS(WebDriver driver){this.driver = driver;}

    // Locate element//

    private By ChkABT =By.xpath("//body/div/header/div/div/nav/ul/li[1]");

    public Sermon sermon() throws InterruptedException{
        driver.findElement(ChkABT ).click();
        return new Sermon(driver);

    }
}
