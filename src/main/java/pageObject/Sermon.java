
package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sermon {

    public WebDriver driver;

    public Sermon(WebDriver driver){this.driver = driver;}


    //Locate Web Element
    private By sermon = By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]");

    //Select the actions
    public void messagesermon (){ driver.findElement(sermon).click();}

    public NewConverts clickmbutton() {
        driver.findElement(sermon).click();
        return new NewConverts(driver);


    }
    }



