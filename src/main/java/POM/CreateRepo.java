package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateRepo {
    private WebDriver driver;
    public CreateRepo(WebDriver driver) {this.driver = driver;}

    public void clickNewBtn(String RepoName, String RepoDes) throws InterruptedException {
        Thread.sleep(2000);

        //Click New Button to create Repo
        driver.findElement(By.cssSelector("element.style")).click();
        Thread.sleep(2000);

        //Enter Repository Name
        driver.findElement(By.id("repository_name")).sendKeys(RepoName);

        Thread.sleep(2000);

        //Enter Repo Description
        driver.findElement(By.id("repository_description")).sendKeys(RepoDes);

        Thread.sleep(2000);

        //Click Create Repository
        driver.findElement(By.cssSelector("repository_name")).click();
        Thread.sleep(2000);

    }
}
