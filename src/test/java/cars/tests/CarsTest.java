package cars.tests;

import cars.forms.BaseForm;
import cars.forms.MainForm;
import cars.menu.Menu;
import framework.BaseEntity;
import framework.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Properties;

/**
 * Created by v.demyanova on 5/19/17.
 */
public class CarsTest {

    WebDriver driver;
    BaseEntity baseEntity;

    @BeforeTest
    public void setUp() {
        BaseForm basePage = new BaseForm();
        Properties properties = basePage.initProperties();
        basePage.initLocatorProperties();
        String br = properties.getProperty("brouser_type");
        driver = BrowserFactory.getMyDriver(br);
        String mainPage = properties.getProperty("main_page_url");
        basePage = new BaseForm(driver);
        basePage.maximaseWindow();
        basePage.navigate(mainPage);
        baseEntity = new BaseEntity();
    }

    @Test
    public void shouldWork() throws UnsupportedEncodingException {


        MainForm mainForm = new MainForm();
        mainForm.menu.navigateMenu(Menu.MenuItem.READ);;



    }

    @AfterTest
    public void exit() {
        BaseForm basePage = new BaseForm(driver);
        basePage.exit();
    }
}
