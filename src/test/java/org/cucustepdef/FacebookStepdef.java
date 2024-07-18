package org.cucustepdef;

import org.openqa.selenium.WebElement;
import org.support.BaseClass;
import org.support.FacebookPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookStepdef extends BaseClass{
	public static FacebookPojo f;
	@Given("To launch the chrome browser and hit the facebook url")
	public void to_launch_the_chrome_browser_and_hit_the_facebook_url() {
		EdgeLaunch();
		launchUrl("https://www.facebook.com/");
	}

	@When("To enter valid username in email field")
	public void to_enter_valid_username_in_email_field() {
		FacebookPojo f= new FacebookPojo();
		WebElement email = f.getEmail();
		filltextBox(email, "apple@123");
	}

	@When("To enter invalid password in password field")
	public void to_enter_invalid_password_in_password_field() {
		f=new FacebookPojo();
		WebElement password = f.getPassword();
		filltextBox(password, "123456");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f= new FacebookPojo();
		WebElement bttn= f.getLogin();
		buttonClk(bttn);
	}

	@Then("to close the browser")
	public void to_close_the_browser() {
		closeBrowser();
	}

}
