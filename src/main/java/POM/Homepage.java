package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;
    protected Landingpage landingpage;

    public Homepage(WebDriver driver){
        this.driver = driver;
    }

    public Landingpage logout() throws InterruptedException {
        //Get array of element and click index 1 (dropdown)
        driver.findElements(By.cssSelector(".details-reset>summary")).get(1).click();
        System.out.println("PRINTED");

        Thread.sleep(3000);
        //Click signout
        driver.findElement(By.cssSelector("body > div.position-relative.js-header-wrapper > header > div.Header-item.position-relative.mr-0.d-none.d-md-flex > details > details-menu > form > button")).click();
        Thread.sleep(2000);
        return new Landingpage(driver);
    }
}

