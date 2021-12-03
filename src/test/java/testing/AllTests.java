package testing;

import POM.Homepage;
import org.testng.annotations.Test;
import setup.Setting;

public class AllTests extends Setting {
    Homepage homepage;

    @Test
    public void testing() throws InterruptedException {
        landingpage.getTitle();

        landingpage.clickSignin();

        homepage = landingpage.signin();

        landingpage = homepage.logout();
    }
}