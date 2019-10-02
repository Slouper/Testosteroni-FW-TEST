package pagecomponents;

import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.core.page_object.Component;
import smartdriver.automation.framework.core.page_object.IPage;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.components.Button;
import smartdriver.automation.framework.platforms.shared.param.data.Attribute;

public class GenericWindow<T extends IPage> extends Component<T> {

    @HasAttribute(attribute = Attribute.ANY, value = "someAny")
    private Button<T> basicButton;

    public GenericWindow(Session session) {
        super(session);
    }

    public T clickOnElement(T... klass) {
        return basicButton.clickOn(klass);
    }

    public <R extends IPage> R doRealMagic(R... klass) {
        return basicButton.clickTo(klass);
    }

}
