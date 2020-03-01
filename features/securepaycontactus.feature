@ContactUs
Feature: Fill the Contact us form


  @ContactUs
  Scenario: Contact Us Form Submission
    Given url "https://www.google.com.au"
    And search "securepay"
    And click search result "https://www.securepay.com.au/"
    And click support link "Support"
    And click contactUs link "Contact us"
    Given generate contactUsRecord for "Support" with message "Please call me"
    And verify contactUs page loaded
    And input fields "First Name" As "FirstName"
    And input fields "Last Name" As "LastName"
    And input fields "Email Address" As "Email"
    And input fields "Phone Number" As "Phone"
    And input fields "https://" As "WebsiteURL"
    And input fields "Company" As "Company"
    And Select Value "reason-for-enquiry" As "ReasonForEnquiry"
    And textArea fields "message" As "Message"
    Then quit
