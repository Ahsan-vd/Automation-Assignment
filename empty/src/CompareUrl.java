import org.openqa.selenium.WebDriver;

/**
 * Created by VD on 12/31/2017.
 */
public class CompareUrl {

    public static boolean assertURL (WebDriver driver , String expURL)
    {
        boolean result=false;
        if (driver.getCurrentUrl().equalsIgnoreCase(expURL))
        {
            result=true;
        }

        return result;
    }
}
