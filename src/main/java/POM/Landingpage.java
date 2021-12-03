package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingpage {
    private WebDriver driver;
    protected Homepage homepage;

    public Landingpage(WebDriver driver) {
        this.driver = driver;
    }

    public void getTitle() throws InterruptedException {
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
    }

    public void clickSignin() throws InterruptedException {
        Thread.sleep(2000);

        //click sign in link
        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(3000);
    }

    public Homepage signin(String email, String password) throws InterruptedException {
        //Enter Email address
        driver.findElement(By.id("login_field")).sendKeys(email);
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(1000);

        driver.findElement(By.name("commit")).click();
        Thread.sleep(3000);

        return new Homepage(driver);
    }
}