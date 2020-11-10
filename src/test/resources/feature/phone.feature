@web
  Feature: Verizon shopping phone page

    Background:
    Given: I am on Verizon Home page

      @phone
      Scenario: Verify selected correct phone

      When I click smartphones option on manin page
      And I select a smartphone
      And I handled zipcode and select new customer
      And I added that phone to the cart
      Then I verified that i selected correct phone
