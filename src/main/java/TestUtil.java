import org.apache.commons.lang3.StringUtils;

public class TestUtil {

    public static String substringByColon(String text) {
        return StringUtils.substringAfterLast(text, ":").trim();
    }
}
