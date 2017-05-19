package cars.forms;


import cars.menu.Menu;
import framework.Select;
import org.openqa.selenium.By;

/**
 * Created by v.demyanova on 5/19/17.
 */
public class MainForm extends BaseForm{

    private static final String tabsLocator = "//span[@class='at-least-desktop-inline' and contains(text(),'Read Specs & Reviews')]";
    Select selTabs;
    public Menu menu;

    public void navigateMenu(){
        selTabs =  new Select(By.xpath(tabsLocator));
        selTabs.click();

    }




}
