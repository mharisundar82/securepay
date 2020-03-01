$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("securepaycontactus.feature");
formatter.feature({
  "line": 2,
  "name": "Fill the Contact us form",
  "description": "",
  "id": "fill-the-contact-us-form",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ContactUs"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Contact Us Form Submission",
  "description": "",
  "id": "fill-the-contact-us-form;contact-us-form-submission",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@ContactUs"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "url \"https://www.google.com.au\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "search \"securepay\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click search result \"https://www.securepay.com.au/\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click support link \"Support\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click contactUs link \"Contact us\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "generate contactUsRecord for \"Support\" with message \"Please call me\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "verify contactUs page loaded",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "input fields \"First Name\" As \"FirstName\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "input fields \"Last Name\" As \"LastName\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "input fields \"Email Address\" As \"Email\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "input fields \"Phone Number\" As \"Phone\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "input fields \"https://\" As \"WebsiteURL\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "input fields \"Company\" As \"Company\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select Value \"reason-for-enquiry\" As \"ReasonForEnquiry\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "textArea fields \"message\" As \"Message\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "quit",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com.au",
      "offset": 5
    }
  ],
  "location": "ContactUs.url(String)"
});
formatter.result({
  "duration": 8800155699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "securepay",
      "offset": 8
    }
  ],
  "location": "ContactUs.google_search(String)"
});
formatter.result({
  "duration": 200041034,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.securepay.com.au/",
      "offset": 21
    }
  ],
  "location": "ContactUs.click_Search_Result(String)"
});
formatter.result({
  "duration": 6416970508,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Support",
      "offset": 20
    }
  ],
  "location": "ContactUs.click_support_link(String)"
});
formatter.result({
  "duration": 2920796453,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact us",
      "offset": 22
    }
  ],
  "location": "ContactUs.click_contactUs_link(String)"
});
formatter.result({
  "duration": 2897041166,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Support",
      "offset": 30
    },
    {
      "val": "Please call me",
      "offset": 53
    }
  ],
  "location": "ContactUs.generate_record(String,String)"
});
formatter.result({
  "duration": 327718616,
  "status": "passed"
});
formatter.match({
  "location": "ContactUs.verify_contactUs_page_loaded()"
});
formatter.result({
  "duration": 38638691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "First Name",
      "offset": 14
    },
    {
      "val": "FirstName",
      "offset": 30
    }
  ],
  "location": "ContactUs.input_fields(String,String)"
});
formatter.result({
  "duration": 33435263,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Last Name",
      "offset": 14
    },
    {
      "val": "LastName",
      "offset": 29
    }
  ],
  "location": "ContactUs.input_fields(String,String)"
});
formatter.result({
  "duration": 42604838,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email Address",
      "offset": 14
    },
    {
      "val": "Email",
      "offset": 33
    }
  ],
  "location": "ContactUs.input_fields(String,String)"
});
formatter.result({
  "duration": 65565246,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Phone Number",
      "offset": 14
    },
    {
      "val": "Phone",
      "offset": 32
    }
  ],
  "location": "ContactUs.input_fields(String,String)"
});
formatter.result({
  "duration": 76109275,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://",
      "offset": 14
    },
    {
      "val": "WebsiteURL",
      "offset": 28
    }
  ],
  "location": "ContactUs.input_fields(String,String)"
});
formatter.result({
  "duration": 127145598,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Company",
      "offset": 14
    },
    {
      "val": "Company",
      "offset": 27
    }
  ],
  "location": "ContactUs.input_fields(String,String)"
});
formatter.result({
  "duration": 111693188,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "reason-for-enquiry",
      "offset": 14
    },
    {
      "val": "ReasonForEnquiry",
      "offset": 38
    }
  ],
  "location": "ContactUs.select_value(String,String)"
});
formatter.result({
  "duration": 391876148,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "message",
      "offset": 17
    },
    {
      "val": "Message",
      "offset": 30
    }
  ],
  "location": "ContactUs.textArea_fields(String,String)"
});
formatter.result({
  "duration": 87777242,
  "status": "passed"
});
formatter.match({
  "location": "ContactUs.quit()"
});
formatter.result({
  "duration": 2986371030,
  "status": "passed"
});
});