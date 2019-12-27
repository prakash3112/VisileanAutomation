$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login.feature :Login Visilean Web Application",
  "description": "",
  "id": "login.feature-:login-visilean-web-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4240904796,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Below are the common step for each scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Open Chrome Browser and Start Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter URL \"https://go.visilean.com/Visilean/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should should see visilean login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestcases.startApplication()"
});
formatter.result({
  "duration": 201135809,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://go.visilean.com/Visilean/login",
      "offset": 13
    }
  ],
  "location": "LoginTestcases.enterURL(String)"
});
formatter.result({
  "duration": 3549106242,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestcases.lpPageTitle()"
});
formatter.result({
  "duration": 38413135,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Test Login with Valid Credentials",
  "description": "",
  "id": "login.feature-:login-visilean-web-application;test-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I enter username \"admin@visilean.com\" and password \"6G:N3;\u0026xu.\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on Submit button on login page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should login sucessfully",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click on System button dropdown button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on logout button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should should see visilean login page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "admin@visilean.com",
      "offset": 18
    },
    {
      "val": "6G:N3;\u0026xu.",
      "offset": 52
    }
  ],
  "location": "LoginTestcases.usernameAndpassword(String,String)"
});
formatter.result({
  "duration": 154408142,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestcases.submitButtonLoginPage()"
});
formatter.result({
  "duration": 4206663878,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestcases.loginSucessfully()"
});
formatter.result({
  "duration": 12206316,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestcases.selectSystemDropDown()"
});
formatter.result({
  "duration": 28680410562,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestcases.clickOnLogoutButton()"
});
formatter.result({
  "duration": 1069840970,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestcases.lpPageTitle()"
});
formatter.result({
  "duration": 87600153,
  "status": "passed"
});
formatter.before({
  "duration": 3170103279,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Below are the common step for each scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Open Chrome Browser and Start Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter URL \"https://go.visilean.com/Visilean/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should should see visilean login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestcases.startApplication()"
});
formatter.result({
  "duration": 940126,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://go.visilean.com/Visilean/login",
      "offset": 13
    }
  ],
  "location": "LoginTestcases.enterURL(String)"
});
formatter.result({
  "duration": 3148047890,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestcases.lpPageTitle()"
});
formatter.result({
  "duration": 5332240,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Test Login with InValid Credentials",
  "description": "",
  "id": "login.feature-:login-visilean-web-application;test-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I enter username \"admin@visilean.com\" and password \"56985\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I click on Submit button on login page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should See validation message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "admin@visilean.com",
      "offset": 18
    },
    {
      "val": "56985",
      "offset": 52
    }
  ],
  "location": "LoginTestcases.usernameAndpassword(String,String)"
});
formatter.result({
  "duration": 155334046,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestcases.submitButtonLoginPage()"
});
formatter.result({
  "duration": 1707776676,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestcases.validationMessage()"
});
formatter.result({
  "duration": 113917468,
  "status": "passed"
});
});