package pageobjects.hackathon;

import smartdriver.automation.framework.core.configuration.timeouts.Timeout;
import smartdriver.automation.framework.core.driver.DriverManager;
import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.components.Button;
import smartdriver.automation.framework.platforms.desktop.components.Input;
import smartdriver.automation.framework.platforms.desktop.data.Element;
import smartdriver.automation.framework.platforms.shared.annotations.synchro.WaitForVisible;
import smartdriver.automation.framework.platforms.shared.param.data.Attribute;
import smartdriver.automation.framework.platforms.shared.param.data.Function;

import static smartdriver.automation.framework.core.configuration.timeouts.Timeout.*;
import static smartdriver.automation.framework.platforms.desktop.data.Element.*;
import static smartdriver.automation.framework.platforms.shared.param.data.Attribute.*;

public class IdCardPage extends Header {

    public IdCardPage(Session session) {
        super(session);
    }

    @WaitForVisible(timeout = LONG)
    @HasAttribute(element = H2, attribute = TEXT, value = "Průkaz totožnosti", function = Function.CONTAINS)
    private Element pageHeader;

    @HasAttribute(attribute = ID, value = "frontSide")
    private Input<IdCardPage> chooseFile;

    @HasAttribute(attribute = TEXT, value = "Nahrát", function = Function.CONTAINS)
    private Button<IdCardPage> upload;

    public IdCardPage uploadIdCard() {
        chooseFile.sendKeys("/Users/petrfifka/IdeaProjects/Testosteroni-FW-TEST/src/main/resources/obcanka.jpg");
        upload.click();
        DriverManager.pause(session, 2000);
        chooseFile.sendKeys("/Users/petrfifka/IdeaProjects/Testosteroni-FW-TEST/src/main/resources/obcanka.jpg");
        upload.click();
        DriverManager.pause(session, 200000);
        return this;
    }
}
