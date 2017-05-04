package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Andriy on 4/21/2017.
 */
public class ContactUsFormPage {

    public ContactUsFormPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(css = "input[name='first_name']")
    private WebElement firstNameField;

    @FindBy(css = "input[name='last_name']")
    private WebElement lastNameField;

    @FindBy(css = "input[name='phone']")
    private WebElement phoneNumberField;

    @FindBy(css = "input[name='email']")
    private WebElement emailField;

    @FindBy(css = "input[name='international_phone']")
    private WebElement internationalPhoneNumberField;

    @FindBy(css = "input[name='street']")
    private WebElement streetField;

    @FindBy(css = "input[name='city']")
    private WebElement cityField;

    @FindBy(css = "input[name='state']")
    private WebElement stateField;

    @FindBy(css = "input[name='zip']")
    private WebElement zipField;

    @FindBy(css = "textarea[name='comments']")
    private WebElement commentsField;

    @FindBy(css = ".panel-body > form > div > div > span:nth-of-type(2)")
    private WebElement submitButton;

    public void fillFirstNameField(String firstName){
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void fillLastNameField(String lastName){
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public void clickOnSubmitButton(){
        submitButton.click();
    }

    public String getFirstName(){
        return firstNameField.getAttribute("value");
    }

    public String getLastNameName(){
        return lastNameField.getAttribute("value");
    }
}

