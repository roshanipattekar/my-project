Feature: Login functionlity

Background: User is on main page 
Given user launch "chrome" browser with exe as "C:\\Automation Support 2\\chromedriver.exe"
Given user provide url as "http://primusbank.qedgetech.com/"
When user provide "Admin"as username 
When user provide "Admin"as password 
When user click on login button 


Scenario: Search functionality	
When user click on branches
When user select "INDIA"as country
When user select "MAHARASHTRA"as state
When user select "MUMBAI"as city
When user click on submit
Then application shows list of branches for mumbai city




