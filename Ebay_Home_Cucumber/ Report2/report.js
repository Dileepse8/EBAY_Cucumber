$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/EbayAdvancedSearch.feature");
formatter.feature({
  "name": "EBAY Advanced Search Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "EBAY logo on Advanced Search Page 2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@p2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Ebay Advanced Search Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EbayAdvancedSearch_Steps.i_am_on_Ebay_Advanced_Search_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clickn Ebay logo",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbayAdvancedSearch_Steps.i_clickn_Ebay_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigated Ebay Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EbayAdvancedSearch_Steps.navigated_Ebay_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Advanced Search Page an Item 6",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@p300"
    },
    {
      "name": "@setCookies"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Ebay Advanced Search Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EbayAdvancedSearch_Steps.i_am_on_Ebay_Advanced_Search_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I advanced Search an Item",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbayAdvancedSearch_Steps.i_advanced_Search_an_Item(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:Features/EbayHome.feature");
formatter.feature({
  "name": "EBAY Advanced page link working",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Advanced Search Link open 1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@p1"
    },
    {
      "name": "@setCookies"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on eBay Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_am_on_eBay_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Advanced Link",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_click_on_Advanced_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate toAdvanced Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_navigate_toAdvanced_Search_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Items Count 3",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@p2"
    },
    {
      "name": "@setCookies"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on eBay Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_am_on_eBay_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \u0027iphone12\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_search_for_iphone12(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate atleast 100 search items present",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_validate_atleast_search_items_present(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Items Count 5",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@p2"
    },
    {
      "name": "@setCookies"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on eBay Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_am_on_eBay_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \u0027soap\u0027 in \u0027baby\u0027 category",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_search_for_in_category(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate atleast 10 search items present",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_validate_atleast_search_items_present(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});