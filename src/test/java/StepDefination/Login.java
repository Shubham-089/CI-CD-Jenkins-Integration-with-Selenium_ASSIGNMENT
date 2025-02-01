package StepDefination;



import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class Login {
    WebDriver driver;
   

    @Then("user is redirected to sumit")
    public void user_is_redirected_to_sumit() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("user launches the Chrome browser")
    public void user_launches_the_chrome_browser() {
        driver = new ChromeDriver();
    }

    @When("user opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @When("user enters the firstName as")
    public void user_enters_the_first_Name_as(String string) {
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys(string);
        
    }

    @When("user enters the lastName as")
    public void user_enters_the_last_Name_as(String string) {
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys(string);
        
    }

    @Then("user clicks on Email as")
    public void user_clicks_on_Email_as(String string) {
        // Write code here that turns the phrase above into concrete actions
    	 driver.findElement(By.id("email")).clear();
         driver.findElement(By.id("email")).sendKeys(string);
    }

    @When("user clicks on the Filed ")
    public void user_clicks_on_the_Filed(String string) {
    	driver.findElement(By.id("field")).clear();
    	 driver.findElement(By.xpath("//input[type='submit']")).sendKeys(string);
    }

    @Then("user is redirected to Sumit")
    public void user_is_redirected_to_Sumit() {
        // Write code here that turns the phrase above into concrete actions
    	 driver.findElement(By.xpath("//div[class=\"field\"]")).click();
    }

    

    @And("close Browser")
    public void close_browser() {
        driver.quit();
    }
}