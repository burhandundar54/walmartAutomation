package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name="q")
    public WebElement searchBox;
    @FindBy(linkText= "Services")
    public WebElement servicesDropdown;
    @FindBy(linkText = "Departments")
    public WebElement departmentsDropdown;
    @FindBy(xpath="(//*[@class='list ma0 pa0 pb3'])[2]//li")
    public List<WebElement> services;
    @FindBy (xpath="(//*[@class='list ma0 pa0 pb3'])[1]//li")
    public List<WebElement> departments;
    @FindBy (xpath = "(//button[@type='button'])[8]")
    public WebElement babyElement;
    @FindBy (linkText = "Give feedback")
    public WebElement feedBackButton;
    @FindBy(xpath="(//div[@class='b'])[1]")
    public WebElement myItemsButton;
    @FindBy (xpath = "(//div[@class='b'])[2]")
    public WebElement acountButton;

}
