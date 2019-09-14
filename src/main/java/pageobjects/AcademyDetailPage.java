package pageobjects;

import core.driver.Session;
import core.page_object.PageObject;
import platforms.desktop.HasAttribute;
import platforms.desktop.HasAttributes;
import platforms.desktop.components.Button;
import platforms.desktop.components.Div;
import platforms.desktop.components.Input;
import platforms.desktop.components.TextArea;
import platforms.desktop.data.Element;
import platforms.shared.annotations.synchro.WaitForVisible;
import platforms.shared.param.data.Attribute;

public class AcademyDetailPage extends PageObject {

    public AcademyDetailPage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttributes(attributes = {
            @HasAttribute(element = Element.DIV, attribute = Attribute.CLASS, value = "BasicInfo__Details-sc-1arbm17-1 iiemck"),
            @HasAttribute(element = Element.BUTTON, attribute = Attribute.CLASS, value = "BasicInfo__RegisterButton-sc-1arbm17-4 YaSsP StyledButton__Button-sc-1z00jeb-0 igMHJC"),
            @HasAttribute(element = Element.DIV, attribute = Attribute.CLASS, value = "StyledText__HeadingFour-sc-1d0houl-3 eVnknq"),
    })
    private Div academyRegistration;

    @HasAttribute(attribute = Attribute.TEXT, value = "Jméno a příjmení*")
    private Div clickOnFullName;

    @HasAttribute(attribute = Attribute.NAME, value = "fullName")
    private Input fullName;

    @HasAttribute(attribute = Attribute.TEXT, value = "Email*")
    private Div clickOnEmail;

    @HasAttribute(attribute = Attribute.NAME, value = "email")
    private Input email;

    @HasAttribute(attribute = Attribute.TEXT, value = "Telefon*")
    private Div clickOnTelephone;

    @HasAttribute(attribute = Attribute.NAME, value = "telephone")
    private Input telephone;

    @HasAttribute(attribute = Attribute.TEXT, value = "Proč se chceš zúčastnit akademie?*")
    private Div clickOnWhyAttend;

    @HasAttribute(attribute = Attribute.NAME, value = "whyAttend")
    private TextArea whyAttend;

    @HasAttribute(attribute = Attribute.TEXT, value = "Máš s tématikou akademie již nějaké zkušenosti?*")
    private Div clickOnExperience;

    @HasAttribute(attribute = Attribute.NAME, value = "experience")
    private TextArea experience;

    @HasAttribute(attribute = Attribute.TEXT, value = "Do čeho se chceš po skončení akademie pustit?*")
    private Div clickOnDirection;

    @HasAttribute(attribute = Attribute.NAME, value = "direction")
    private TextArea direction;

    @HasAttribute(attribute = Attribute.TEXT, value = "Můj profil na Linkedinu, webu a pod.*")
    private Div clickOnLinkedInProfile;

    @HasAttribute(attribute = Attribute.NAME, value = "profile")
    private Input profile;

    @HasAttribute(attribute = Attribute.TYPE, value = "submit")
    private Button<AcademyDetailPage> submit;

    @HasAttribute(attribute = Attribute.TEXT, value = "Váš formulář byl úspěšně odeslán.")
    private Div confirmationText;

    public AcademyDetailPage registrationToAcademy(String fullName, String email, String telephone, String whyAttend, String experience, String direction, String profile, String expected) {

        this.academyRegistration.click();
        this.clickOnFullName.click();
        this.fullName.sendKeys(fullName);
        this.clickOnEmail.click();
        this.email.sendKeys(email);
        this.clickOnTelephone.click();
        this.telephone.sendKeys(telephone);
        this.clickOnWhyAttend.click();
        this.whyAttend.sendKeys(whyAttend);
        this.clickOnExperience.click();
        this.experience.sendKeys(experience);
        this.clickOnDirection.click();
        this.direction.sendKeys(direction);
        this.clickOnLinkedInProfile.click();
        this.profile.sendKeys(profile);
        this.submit.clickOn();
        this.confirmationText.assertText(expected);
        return this;
    }
}
