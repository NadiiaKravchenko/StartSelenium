import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wb;

    @BeforeMethod
    public void precondition(){
        wb = new ChromeDriver();
    }

    @Test
    public void startGoogle(){
        wb.get("https://www.google.co.il/");
       // wb.navigate().to("https://www.google.co.il/");
    }

    @AfterMethod
    public void tearDown(){
        //wb.close();
        wb.quit();

    }
}
