$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "MercuryTours Automate",
  "description": "",
  "id": "mercurytours-automate",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "LogIn To The MercuryTours Application",
  "description": "",
  "id": "mercurytours-automate;login-to-the-mercurytours-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User Already in Log In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of the page is Welcome: Mercury Tours",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and click on Login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "mercurytours-automate;login-to-the-mercurytours-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Passenger",
        "departingfrom"
      ],
      "line": 9,
      "id": "mercurytours-automate;login-to-the-mercurytours-application;;1"
    },
    {
      "cells": [
        "ShivarajR",
        "Reset123",
        "2",
        "Acapulco"
      ],
      "line": 10,
      "id": "mercurytours-automate;login-to-the-mercurytours-application;;2"
    }
  ],
  "keyword": "Examples"
});
