package adactin;

import java.util.List;
import java.util.Map;


import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class bookahotel extends Baseclass {
	
	
		
		@Given("the user is on the login page")
		public void the_user_is_on_the_login_page() {
			
			
			
		}


		@When("the user enters valid username  and password then clicks on the login button")
		public void the_user_enters_valid_username_and_password_then_clicks_on_the_login_button(io.cucumber.datatable.DataTable dataTable) {
		    
			WebElement username = findelement("xpath","//input[@id='username']");
			WebElement password = findelement("xpath","//input[@id='password']");
			
			List<Map<String, String>> asMaps = dataTable.asMaps();
			for (Map<String, String> map : asMaps) {
				
				String usernamevalue = map.get("username");
				String passwordvalue = map.get("password");
				
				sendkeys(username, usernamevalue);
				sendkeys(password, passwordvalue);
				
				 WebElement login = findelement("id","login");
				    clickElement(login);}
		}





		@Then("the user should be redirected to the search hotel page")
		public void the_user_should_be_redirected_to_the_search_hotel_page() {
		    
			boolean status1 = findelement("id","search_form").isDisplayed();
			Assert.assertEquals(status1,true);
		}

		@When("user fills the search hotel page")
		public void user_fills_the_search_hotel_page() {
			
			WebElement location = findelement("xpath","//select[@id='location']");
		    selectbyVisibleText(location,"Brisbane");
			WebElement hotels = findelement("xpath","//select[@id='hotels']");
			selectbyVisibleText(hotels, "Hotel Creek");
			WebElement roomtype = findelement("xpath","//select[@id='room_type']");
			selectbyVisibleText(roomtype,"Super Deluxe");
			WebElement noofroom = findelement("xpath","//select[@id='room_nos']");
			selectbyVisibleText(noofroom,"4 - Four");
			WebElement datein = findelement("xpath","//input[@id='datepick_in']");
			sendkeys(datein,"10/06/2024");
			WebElement dateout = findelement("xpath","//input[@id='datepick_out']");
			sendkeys(dateout,"10/07/2024");
			WebElement noofadult = findelement("xpath","//select[@id='adult_room']");
			selectbyVisibleText(noofadult,"2 - Two");
			WebElement noodchildren = findelement("xpath","//select[@id='child_room']");
			selectbyVisibleText(noodchildren,"2 - Two");
		    
		}

		@When("the user clicks on the search button")
		public void the_user_clicks_on_the_search_button() {
		    
			WebElement submit = findelement("id","Submit");
			submit.click();
			
		}

		@Then("the user should be redirected to the select hotel page")
		public void the_user_should_be_redirected_to_the_select_hotel_page() {
			
			boolean status2 = findelement("xpath","//input[@name='radiobutton_0']").isDisplayed();
			Assert.assertEquals(status2, true);
			
		   
		}

		@When("the user selects the hotel")
		public void the_user_selects_the_hotel() {
			findelement("xpath","//input[@name='radiobutton_0']").click();
		}

		@When("the user clicks on the continue button")
		public void the_user_clicks_on_the_continue_button() {
		   
			findelement("id","continue").click();
			
			
			
		}

		@Then("the user should be redirected to the book a hotel page")
		public void the_user_should_be_redirected_to_the_book_a_hotel_page() {
		   
		}

		@When("the user fills the firstname, lastname,address,creditcardno, and cvv")
		public void the_user_fills_the_firstname_lastname_address_creditcardno_and_cvv(io.cucumber.datatable.DataTable dataTable) {
		    
			List<Map<String, String>> asMaps = dataTable.asMaps();
			for (Map<String, String> map : asMaps) {
				
				String fnamevalue = map.get("firstname");
				String lnamevalue = map.get("lastname");
				String addressvalue = map.get("address");
				String ccnovalue = map.get("creditcardno");
				String ccvvalue = map.get("cvv");
				
				WebElement fname = findelement("xpath","//input[@id='first_name']");
				sendkeys(fname, fnamevalue);
				
				WebElement lname = findelement("xpath","//input[@id='last_name']");
				sendkeys(lname, lnamevalue);
				WebElement address = findelement("xpath","//textarea[@id='address']");
				sendkeys(address, addressvalue);
				WebElement ccnum = findelement("xpath","//input[@id='cc_num']");
				sendkeys(ccnum, ccnovalue);
				
				
				WebElement ccvno = findelement("xpath","//input[@id='cc_cvv']");
				sendkeys(ccvno, ccvvalue);
				
				
			}
		    
		}

		@When("the user selects the credit card type and expiration date")
		public void the_user_selects_the_credit_card_type_and_expiration_date() {
			
			WebElement cctype = findelement("xpath","//select[@id='cc_type']");
			selectbyVisibleText(cctype,"American Express");
			WebElement month = findelement("xpath","//select[@id='cc_exp_month']");
			selectbyVisibleText(month,"April");
			WebElement year = findelement("xpath","//select[@id='cc_exp_year']");
			selectbyVisibleText(year, "2029");
		}

		@When("the user clicks on the book now button")
		public void the_user_clicks_on_the_book_now_button() {
		   
			findelement("xpath","//input[@id='book_now']").click();
			
		}

		@Then("the user should be redirected to the booking confirmation page")
		public void the_user_should_be_redirected_to_the_booking_confirmation_page() {
		   
			
			
			
			
		}



			
		}



