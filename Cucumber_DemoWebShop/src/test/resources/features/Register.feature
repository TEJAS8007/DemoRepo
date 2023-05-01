
Feature:Register FUnctionality DemowebShop
@Register
Scenario:Register Check
Given User Shuold Navigate To DemowebShop Website
When click on gender Button
And send First Name As "Tejas"
And Send Last name As "Aware"
And Use email as "MNPLKMPON@123gmail.com"
And use PassWord as "Pass@123"
And Confirm PassWord "Pass@123"
And click on the Register Button
Then Login Should be Success

@Continue
Scenario:Click on The  Continue
Given User Should Register Successfully
When Click on Continue Button

@AddToCart
Scenario:Add to Cart Product
Given User Should have Clicked On Continue Button
When click on any Product
And Add To cart product
And View Cart
And Click on checkbox
And Click on CheckOut
Then user should chekout Sucessfull

@AddressDetails
Scenario:Fill up Address Deatils
Given User Should have Checkout SuccessFully

When user should send Company name as "ABC Corporation"
And User Should Select Country  
And User Should select state
And user shoud send City as "Pune"
And User Should send Address1 as "Amravati"
And User should Send Address2 as "Paratwada"
And user should send zip/postal code as "OO9090"
And user Should send phone Number as "9090909090"
And User Should send Fax Number as "89808978686"
And User click on Continue Button
And User click on Continue Button1
And User click on Continue Button2
And User click on Continue Button3
And User click on Continue Button4
And User click on Continue Button5
Then User Shoud View Thankyou Massage


