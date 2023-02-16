Feature: Login functionlity

Background: User is on main page 
Given user launch "chrome" browser with exe as "C:\\Automation Support 2\\chromedriver.exe"
Given user provide url as "http://primusbank.qedgetech.com/"

Scenario: Login functionality with valid credentials 
When user provide "Admin"as username 
When user provide "Admin"as password 
When user click on login button 
Then application shows user profile to user 
