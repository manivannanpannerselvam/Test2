$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/IMDB/Create_new_account.feature");
formatter.feature({
  "line": 2,
  "name": "verify the account by filling the registration",
  "description": "",
  "id": "verify-the-account-by-filling-the-registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@IMDB_Create_account"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify the   account by filling the registration",
  "description": "",
  "id": "verify-the-account-by-filling-the-registration;verify-the---account-by-filling-the-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "open the valid url in IMDb application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click the sigin icon",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click the create new button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the UserName in username field \"\u003cUsername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter the Email id in Eamil field \"\u003cEmailid\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter the password in password field \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Enter the reenter password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click the Create your ImDb account",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click the Sign out button",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "verify-the-account-by-filling-the-registration;verify-the---account-by-filling-the-registration;",
  "rows": [
    {
      "cells": [
        "Username",
        "Emailid",
        "password"
      ],
      "line": 16,
      "id": "verify-the-account-by-filling-the-registration;verify-the---account-by-filling-the-registration;;1"
    },
    {
      "cells": [
        "jlgetertertertertetretrhlet",
        "@example.com",
        "@password"
      ],
      "line": 17,
      "id": "verify-the-account-by-filling-the-registration;verify-the---account-by-filling-the-registration;;2"
    },
    {
      "cells": [
        "test",
        "@examplet.com",
        "@passworda"
      ],
      "line": 18,
      "id": "verify-the-account-by-filling-the-registration;verify-the---account-by-filling-the-registration;;3"
    },
    {
      "cells": [
        "testplan",
        "@examples.com",
        "@passwords"
      ],
      "line": 19,
      "id": "verify-the-account-by-filling-the-registration;verify-the---account-by-filling-the-registration;;4"
    },
    {
      "cells": [
        "testcase",
        "@exampless.com",
        "@passwordd"
      ],
      "line": 20,
      "id": "verify-the-account-by-filling-the-registration;verify-the---account-by-filling-the-registration;;5"
    }
  ],
  "keyword": "Examples"
});
