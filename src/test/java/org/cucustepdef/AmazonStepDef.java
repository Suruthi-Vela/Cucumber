package org.cucustepdef;

import org.support.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDef extends BaseClass {
	@When("To Click the sign in button")
	public void to_click_the_sign_in_button1() {
		FirefoxLaunch();
		launchUrl("https://www.amazon.in/");
	}

	@When("To enter the valid phone number in an email field")
	public void to_enter_the_valid_phone_number_in_an_email_field() {
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
	}

	@When("To enter the valid password in the password field")
	public void to_enter_the_valid_password_in_the_password_field() {
	}

	@When("To click the sign in button")
	public void to_click_the_sign_in_button() {
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeBrowser();
}}
