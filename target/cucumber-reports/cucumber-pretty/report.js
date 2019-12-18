$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/featureFile.feature");
formatter.feature({
  "line": 3,
  "name": "Open Tekshool page and navigate to test environment and check for test environment title",
  "description": "",
  "id": "open-tekshool-page-and-navigate-to-test-environment-and-check-for-test-environment-title",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4456888800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Check for test environment title",
  "description": "",
  "id": "open-tekshool-page-and-navigate-to-test-environment-and-check-for-test-environment-title;check-for-test-environment-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User Open tekschool of America website",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click on test environment link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should see Test environment webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "OussamaStepDefinition.user_Open_tekschool_of_America_website()"
});
formatter.result({
  "duration": 179291700,
  "status": "passed"
});
formatter.match({
  "location": "OussamaStepDefinition.user_click_on_test_environment_link()"
});
formatter.result({
  "duration": 6370852500,
  "status": "passed"
});
formatter.match({
  "location": "OussamaStepDefinition.user_should_see_Test_environment_webpage()"
});
formatter.result({
  "duration": 9066800,
  "status": "passed"
});
formatter.after({
  "duration": 1311161600,
  "status": "passed"
});
});