Feature: Search and Place the order for Products
@Offers
Scenario Outline: Serach Experience for product search in both home and offers page

Given User is on Greenkart landing page
When user searched with shortname <Name> and extracted actual name of product
Then user serached for same shortname <Name> in offers page to check if product exist
Then user validate the searched item on both pages

Examples:
| Name |
| Tom  |
| Beet |