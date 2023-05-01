Feature: Login Fuctionality check

@SignUpAction
Scenario:Login and Signup Check
Given User Should Navigate To DemoBlaze.com
When click On the signup button
And send The username value as "TEJAS5"
And send the password value as "Pass@123"
And Click On the Signup button
Then Sign up Action Should Be Successfull

@LoginAction
Scenario:For Checking Login Functionality
Given User Should Sign up Successfully
When click on the Login button
And user loguser send the value as "TEJAS5"
And user logpass send the value as "Pass@123"
And Click on the login button
Then Login action Should be Succesfull


