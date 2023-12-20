Feature: Add Item to cart

Background: User Login
Given User is on login Page
When User enters "Lalitha799" and "Lalitha@2001"
Then User should be on Home page


Scenario: Add Items to cart
When Add an item to cart
Then Items must be added to cart

Scenario: Delete an Item
When List of Items should be available in cart
Then Delete an item from cart

Scenario: Place Order
Given Items should be available in cart
When Place Order
Then Purchase Items


 
