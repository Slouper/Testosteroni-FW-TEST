package pageobjects.redmine;

import data.PersonalData;
import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.components.Input;
import smartdriver.automation.framework.platforms.desktop.components.Select;
import smartdriver.automation.framework.platforms.shared.annotations.synchro.WaitForVisible;

import static smartdriver.automation.framework.platforms.shared.param.data.Attribute.ID;
import static smartdriver.automation.framework.platforms.shared.param.data.Attribute.TYPE;

public class RegistrationPage extends Header {

    @WaitForVisible
    @HasAttribute(attribute = ID, value = "user_login")
    private Input<RegistrationPage> userLoginInput;

    @WaitForVisible
    @HasAttribute(attribute = ID, value = "user_password")
    private Input<RegistrationPage> passwordInput;

    @WaitForVisible
    @HasAttribute(attribute = ID, value = "user_password_confirmation")
    private Input<RegistrationPage> repeatPasswordInput;

    @WaitForVisible
    @HasAttribute(attribute = ID, value = "user_firstname")
    private Input<RegistrationPage> firstNameInput;

    @WaitForVisible
    @HasAttribute(attribute = ID, value = "user_lastname")
    private Input<RegistrationPage> lastNameInput;

    @WaitForVisible
    @HasAttribute(attribute = ID, value = "user_mail")
    private Input<RegistrationPage> emailInput;

    @WaitForVisible
    @HasAttribute(attribute = TYPE, value = "submit")
    private Input<RegistrationPage> confirmButton;

    @WaitForVisible
    @HasAttribute(attribute = ID, value = "user_language")
    private Select<RegistrationPage> languageSelect;

    public RegistrationPage(Session session) {
        super(session);
    }

    public RegistrationPage fillForm(PersonalData personalData, String password) {
        fillName(personalData.getFirstName());
        fillLastName(personalData.getSurname());
        fillUserLogin(personalData.getFirstName() + personalData.getSurname());
        fillPassword(password);
        fillConfirmedPassword(password);
        emailInput.sendKeys(personalData.getEmail());
        return this;
    }

    public RegistrationPage fillName(String firstName) {
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public RegistrationPage fillLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public RegistrationPage fillPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public RegistrationPage fillUserLogin(String login) {
        userLoginInput.sendKeys(login);
        return this;
    }

    public RegistrationPage fillEmail(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    public RegistrationPage fillConfirmedPassword(String password) {
        repeatPasswordInput.sendKeys(password);
        return this;
    }

    public RegistrationPage clickSubmit() {
        confirmButton.click();
        return this;
    }
}
