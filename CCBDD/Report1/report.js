$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:feature/ebay_home.feature");
formatter.feature({
  "name": "Ebay Home Page Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Advanced Search Link",
  "description": "//Given When and Then",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on Ebay Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EbayHome_Stpes.i_am_on_Ebay_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Advanced Link",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbayHome_Stpes.i_click_on_Advanced_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Advanced Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EbayHome_Stpes.i_navigate_to_Advanced_Search_Page()"
});
formatter.result({
  "status": "passed"
});
});