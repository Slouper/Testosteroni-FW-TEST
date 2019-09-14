package pageobjects;

import smartdriver.automation.framework.core.configuration.timeouts.Timeout;
import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.components.Button;
import smartdriver.automation.framework.platforms.desktop.components.Input;
import smartdriver.automation.framework.platforms.desktop.data.Element;
import smartdriver.automation.framework.platforms.shared.annotations.WebApplication;
import smartdriver.automation.framework.platforms.shared.annotations.synchro.WaitForVisible;
import smartdriver.automation.framework.platforms.shared.param.data.Attribute;
import smartdriver.automation.framework.platforms.shared.param.data.Function;

public class IdCardPage extends Header {

    public IdCardPage(Session session) {
        super(session);
    }

    @WaitForVisible(timeout = Timeout.LONG)
    @HasAttribute(element = Element.H2, attribute = Attribute.TEXT, value = "Průkaz totožnosti", function = Function.CONTAINS)
    private Element pageHeader;

    @HasAttribute(attribute = Attribute.ID, value = "frontSide")
    private Input<IdCardPage> chooseFile;

    @HasAttribute(attribute = Attribute.TEXT, value = "Nahrát", function = Function.CONTAINS)
    private Button<IdCardPage> upload;

    public IdCardPage uploadIdCard() {
        chooseFile.sendKeys("obcanka.jpg");
        return this;
    }
}
