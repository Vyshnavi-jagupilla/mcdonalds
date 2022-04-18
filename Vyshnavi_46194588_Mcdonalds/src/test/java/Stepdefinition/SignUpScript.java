package Stepdefinition;




import Browser.Browser;
import Browser.SignUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class SignUpScript extends SignUp{
@Given("Open the browser {string}")
public void open_the_browser(String string) throws Exception {
Browser.setDriver();
Browser.getUrl(string);
}



@And("click on {string} button")
public void click_on_button(String string) throws Exception {
SignUp.login();
}



@Given("user enters {string} and {string}")
public void user_enters_and(String string, String string2) throws Exception {
SignUp.Number();
SignUp.Otpmethod();
//SignUp.clickOtp();
}



@And("click on continue")
public void click_on_continue() throws Exception {
SignUp.continuemethod();

}

@Given("user enters details {string} and {string}")
public void user_enters_details_and(String string, String string2) throws Exception {
SignUp.Name();
SignUp.setpassword();




}


@And("user clicks on Sign Up button")
public void user_clicks_on_Sign_Up_button() {	
SignUp.SignUpmethod();
}



@Then("user is navigate to home page")
public void user_is_navigate_to_home_page() {

}




}

