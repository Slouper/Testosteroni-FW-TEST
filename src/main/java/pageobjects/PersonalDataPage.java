package pageobjects;

import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.components.Input;
import smartdriver.automation.framework.platforms.desktop.data.Element;
import smartdriver.automation.framework.platforms.shared.annotations.WebApplication;
import smartdriver.automation.framework.platforms.shared.annotations.synchro.WaitForVisible;
import smartdriver.automation.framework.platforms.shared.param.data.Attribute;
import smartdriver.automation.framework.platforms.shared.param.data.Function;

@WaitForVisible
@HasAttribute(element = Element.DIV, attribute = Attribute.ID, value = "__next")
public class PersonalDataPage extends Header {

    public PersonalDataPage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(element = Element.H2, attribute = Attribute.TEXT, value = "Osobní udaje", function = Function.CONTAINS)
    private Element pageHeader;

    @WaitForVisible
    @HasAttribute(attribute = Attribute.ID, value = "firstname")
    private Input<PersonalDataPage> firstName;

    @WaitForVisible
    @HasAttribute(attribute = Attribute.ID, value = "surname")
    private Input<PersonalDataPage> surname;

    @WaitForVisible
    @HasAttribute(attribute = Attribute.ID, value = "tel")
    private Input<PersonalDataPage> phone;

    @WaitForVisible
    @HasAttribute(attribute = Attribute.ID, value = "email")
    private Input<PersonalDataPage> email;

    @WaitForVisible
    @HasAttribute(attribute = Attribute.ID, value = "rc")
    private Input<PersonalDataPage> birthNumber;

    @WaitForVisible
    @HasAttribute(attribute = Attribute.ID, value = "city")
    private Input<PersonalDataPage> city;


}
