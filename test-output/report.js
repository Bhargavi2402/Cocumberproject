$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/flightsdt.feature");
formatter.feature({
  "line": 1,
  "name": "Flights booking",
  "description": "",
  "id": "flights-booking",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Flights booking with values",
  "description": "",
  "id": "flights-booking;flights-booking-with-values",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is already login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of the login page is makemytrip",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters credentials to login",
  "rows": [
    {
      "cells": [
        "9553524225",
        "Bh@rgavi24$"
      ],
      "line": 6
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters from to and date",
  "rows": [
    {
      "cells": [
        "Goa, India",
        "Bangalore, India",
        "FEBRUARY",
        "10"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginstepdefinition.user_is_already_login_page()"
});
formatter.result({
  "duration": 73888157485,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefinition.title_of_the_login_page_is_makemytrip()"
});
formatter.result({
  "duration": 69020446,
  "status": "passed"
});
formatter.match({
  "location": "Flightsstepdefinition.user_enters_credentials_to_login(DataTable)"
});
formatter.result({
  "duration": 1609981526,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 132692339,
  "status": "passed"
});
formatter.match({
  "location": "Flightsstepdefinition.user_enters_from_to_and_date(DataTable)"
});
formatter.result({
  "duration": 103062810576,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027AMIL5CG51708BG\u0027, ip: \u002710.195.124.36\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_51\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.42.591088 (7b2b2dca23cca0..., userDataDir: C:\\Users\\rbharga1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:57626}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: fdb9f69fb2a67d73a6d8979c7ec7569c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.getText(RemoteWebElement.java:160)\r\n\tat stepdefinitions.Flightsstepdefinition.user_enters_from_to_and_date(Flightsstepdefinition.java:67)\r\n\tat ✽.And user enters from to and date(src/main/java/Features/flightsdt.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Flightsstepdefinition.user_clicks_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
});