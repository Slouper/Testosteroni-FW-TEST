import org.apache.commons.lang3.StringUtils;

public class TestUtil {

    public static String substringByColon(String text) {
        return StringUtils.substringAfterLast(text, ":").trim();
    }

    public static String generatePhone() {
        //TODO create generator
        return  "+420773898064";
    }

    public static String generateBirthNumber() {
        //TODO create generator
        return  "901107/4853";
    }
}
