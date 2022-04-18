Feature: Sign Up functionality
Scenario Outline: verify Sign Up functionality
Given Open the browser "https://www.mcdelivery.co.in/"
And click on '<Login/Sign Up>' button
And user enters '<mobile number>' and '<otp>'
And click on continue
And user enters details '<username>' and '<setpassword>'
And user clicks on Sign Up button
Then user is navigate to home page




Examples:
| Mobilenumber | otp | username | setpassword |
| "9440374987" | "4678" | "Ishu" | "Vyshu@78" |




