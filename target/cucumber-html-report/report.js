$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/cucumber/practice/feature/SmokeTest.feature");
formatter.feature({
  "line": 1,
  "name": "Smoke Test Cases",
  "description": "",
  "id": "smoke-test-cases",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Scenario1",
  "description": "",
  "id": "smoke-test-cases;scenario1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Smoke Test Case One",
  "keyword": "Given "
});
formatter.match({
  "location": "SmokeTestCases.smoke_Test_Case_One()"
});
formatter.result({
  "duration": 244552790,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Scenario2",
  "description": "",
  "id": "smoke-test-cases;scenario2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Smoke Test Case Two",
  "keyword": "Given "
});
formatter.match({
  "location": "SmokeTestCases.smoke_Test_Case_Two()"
});
formatter.result({
  "duration": 291538,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Scenario3",
  "description": "",
  "id": "smoke-test-cases;scenario3",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Smoke Test Case Three",
  "keyword": "Given "
});
formatter.match({
  "location": "SmokeTestCases.smoke_Test_Case_Three()"
});
formatter.result({
  "duration": 283838,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Scenario4",
  "description": "",
  "id": "smoke-test-cases;scenario4",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Smoke Test Case four",
  "keyword": "Given "
});
formatter.match({
  "location": "SmokeTestCases.smoke_Test_Case_four()"
});
formatter.result({
  "duration": 310528,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Scenario5",
  "description": "",
  "id": "smoke-test-cases;scenario5",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "Smoke Test Case five",
  "keyword": "Given "
});
formatter.match({
  "location": "SmokeTestCases.smoke_Test_Case_five()"
});
formatter.result({
  "duration": 292565,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Scenario6",
  "description": "",
  "id": "smoke-test-cases;scenario6",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Smoke Test Case six",
  "keyword": "Given "
});
formatter.match({
  "location": "SmokeTestCases.smoke_Test_Case_six()"
});
formatter.result({
  "duration": 360829,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Scenario8",
  "description": "",
  "id": "smoke-test-cases;scenario8",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "Smoke Test Case eight \"Anvai\" and \"Jawaji\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Anvai",
      "offset": 23
    },
    {
      "val": "Jawaji",
      "offset": 35
    }
  ],
  "location": "SmokeTestCases.smoke_Test_Case_eight_and(String,String)"
});
formatter.result({
  "duration": 5269233,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 32,
  "name": "Scenario7",
  "description": "",
  "id": "smoke-test-cases;scenario7",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 31,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "Smoke Test Case with \"\u003cUserName\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "line": 35,
  "name": "",
  "description": "",
  "id": "smoke-test-cases;scenario7;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 37,
      "id": "smoke-test-cases;scenario7;;1"
    },
    {
      "cells": [
        "Gagan",
        "Gagan"
      ],
      "line": 38,
      "id": "smoke-test-cases;scenario7;;2"
    },
    {
      "cells": [
        "Abhi",
        "Abhi"
      ],
      "line": 39,
      "id": "smoke-test-cases;scenario7;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 38,
  "name": "Scenario7",
  "description": "",
  "id": "smoke-test-cases;scenario7;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 31,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "Smoke Test Case with \"Gagan\" and \"Gagan\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Gagan",
      "offset": 22
    },
    {
      "val": "Gagan",
      "offset": 34
    }
  ],
  "location": "SmokeTestCases.smoke_Test_Case_with_and(String,String)"
});
formatter.result({
  "duration": 497872,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Scenario7",
  "description": "",
  "id": "smoke-test-cases;scenario7;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 31,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "Smoke Test Case with \"Abhi\" and \"Abhi\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Abhi",
      "offset": 22
    },
    {
      "val": "Abhi",
      "offset": 33
    }
  ],
  "location": "SmokeTestCases.smoke_Test_Case_with_and(String,String)"
});
formatter.result({
  "duration": 250989,
  "status": "passed"
});
});