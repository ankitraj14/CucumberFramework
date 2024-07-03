Feature: Place the order for Products
@PlaceOrder
Scenario Outline: Serach Experience for product search in both home and offers page

Given User is on Greenkart landing page
When user searched with shortname <Name> and extracted actual name of product
Then user clicked multiple times on  add to cart and then checkout
Then user validate the product item on checkoutpage and apply and place order button

Examples:
| Name |
| Tom  |
