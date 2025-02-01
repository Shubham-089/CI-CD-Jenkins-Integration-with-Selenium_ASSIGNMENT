package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
public Login(WebDriver driver) {
	driver = this.driver;
	PageFactory.initElements(driver,this);;
}
@FindBy(id = "firstName")
WebElement firstname ;
@FindBy(id = "firstName")
WebElement lastname;
@FindBy(id = "email")
WebElement Email;
@FindBy(xpath = "//div[class=\"field\"]")
WebElement message;


@FindBy(xpath = "//input[type='submit']")
WebElement Submit;
public void setFirstName(String firstName) {	
	firstname.clear();
	firstname.sendKeys(firstName);
}
public void setfirstName(String firstName) {	
	firstname.clear();
	firstname.sendKeys(firstName);
}
public void setEmail(String email) {	
	Email.clear();
	Email.sendKeys(email);
}
public void setfield(String field) {	
	message.clear();
	message.sendKeys(field);
}
public void clicksubmit() {
	Submit.click();
}


}
