import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.ContactUsFormPage;

/**
 * Created by Andriy on 4/21/2017.
 */
public class FillContactUsFormTest {

    static WebDriver driver = null;
    private ContactUsFormPage contactUsFormPage;

    private String firstName;
    private String lastName;
    private int phoneNumber;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("http://www.andrijk.ixloo.com/contactus");
    }

    @Test
    public void fillContactUs(){
        firstName = "Andriy";
        lastName = "Kozak";
        contactUsFormPage = new ContactUsFormPage(driver);
        contactUsFormPage.fillFirstNameField(firstName);
        contactUsFormPage.fillLastNameField(lastName);
        Assert.assertEquals(contactUsFormPage.getFirstName(), firstName);
        Assert.assertEquals(contactUsFormPage.getLastNameName(), lastName);
    }



    @AfterTest
    public void closeBrowser(){
        if(driver != null)
            driver.quit();
    }
}
