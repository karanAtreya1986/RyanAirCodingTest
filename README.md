# RyanAirCodingTest
Below is the sample project structure:

**Config file reader class will read the properties from the configuration file.**

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/1619a4fa-a8b7-429d-83ef-55384656e458)

**Enums package contains two classes-**
Driver Type - This will have the list of all browser names.
Environment Type - This will have the list of environment names.
This enum package is used bu dataProviders -> ConfigFileReader to call the correct browser and environment.

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/f67a6155-63dc-49ab-a5ae-fd883bc9ee8f)

**Then we have the managers package.**
It contains three files-
FileReaderManager - which will read instantiate the config file reader if not done, else if it is instantiated return the object of that class.
PageObjectManager - which will instantiate the individual page classes if not done, else if it is instantiated return the object of that class.
WebDriverManager - this is for driver management. This will get the environment details, browser on where to run the code. If the driver is not created, create a new one. Maximise the window. Close the browser.

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/90698d13-7da4-4ce4-bca8-38d9c7f76094)

**We have the pageObjects package which contain two classes-**
HomePage.java - all locators of home page and the methods in homepage
SelectDesiredFlights.java - all locators of select flight page and the methods in select flights page.

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/5f03adaf-7d2a-44ea-b7f0-9c3a9f063008)

**We have the cucumber package which contains the class TestContext.java.**
This is basically to maintain the same context of webdriver and page objects when traversing multiple step definition files, to avoid null pointer exceptions.

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/faa4ede9-e451-4586-82d5-88d159ba4b5b)

**Runners package contains the runner file to run the E2E scenarios.**

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/ba2a455e-96da-4767-9d2c-926a8fb702e1)

**stepDefinitions package-**
This contain the two step definition files for homePage and selectFlightsPage.
The methods in these classes calls the respective page objects.

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/1bc06c6f-614e-4519-bac3-26810907c1a9)

**featureFiles package-**
Contains the E2E scenario.

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/ccbd1155-9e05-4625-af77-278e45896355)

**extent.properties and extent-config.xml -> the files needed for generating extent spark html and pdf reports**

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/1ffd5251-89d2-4a27-a353-c1bef46283dc)

**BrowserDrivers - these are the browser executables for Chrome and Edge**

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/452c73e0-f3c1-4594-89b1-4d56ca4183d2)

**configs -**
This contain the configuration.properties file.

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/e8763697-ce5a-4bdd-ae38-ac482fbaf8c4)

**test output folder - contains the spark pdf report
test-output folder contains the report in html form**

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/e91e4514-112c-4a6a-92f0-a024cca32b05)

**pom file**

![image](https://github.com/karanAtreya1986/RyanAirCodingTest/assets/140405970/85965084-1882-4507-ae5d-5276b2d93970)

**Sample pdf report which got generated-**

[ExtentPdf.pdf](https://github.com/karanAtreya1986/RyanAirCodingTest/files/13400361/ExtentPdf.pdf)

**Sample index.html report which got generated-**


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Extent</title>
<link rel="apple-touch-icon" href="https://cdn.jsdelivr.net/gh/extent-framework/extent-github-cdn@b00a2d0486596e73dd7326beacf352c639623a0e/commons/img/logo.png">
<link rel="shortcut icon" href="https://cdn.jsdelivr.net/gh/extent-framework/extent-github-cdn@b00a2d0486596e73dd7326beacf352c639623a0e/commons/img/logo.png">
<link href="https://cdn.jsdelivr.net/gh/extent-framework/extent-github-cdn@c952cc003431b643d7a73337421ff42b75bac784/spark/css/spark-style.css" rel="stylesheet" />
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script src="https://cdn.rawgit.com/extent-framework/extent-github-cdn/7cc78ce/spark/js/jsontree.js"></script>
<style type="text/css"></style></head><body class="spa bdd-report dark">
  <div class="app">
    <div class="layout">
<div class="header navbar">
<div class="vheader">
<div class="nav-logo">
<a href="#">
<div class="logo" style="background-image: url('https://cdn.jsdelivr.net/gh/extent-framework/extent-github-cdn@b00a2d0486596e73dd7326beacf352c639623a0e/commons/img/logo.png')"></div>
</a>
</div>
<ul class="nav-left">
<li class="search-box">
<a class="search-toggle" href="#">
<i class="search-icon fa fa-search"></i>
<i class="search-icon-close fa fa-close"></i>
</a>
</li>
<li class="search-input"><input id="search-tests" class="form-control" type="text" placeholder="Search..."></li>
</ul>
<ul class="nav-right">
<li class="m-r-10">
<a href="#"><span class="badge badge-primary">Grasshopper Report</span></a>
</li>
<li class="m-r-10">
<a href="#"><span class="badge badge-primary">Nov 18, 2023 02:19:45 pm</span></a>
</li>
</ul>
</div>
</div><div class="side-nav">
<div class="side-nav-inner">
<ul class="side-nav-menu">
<li class="nav-item dropdown" onclick="toggleView('dashboard-view')">
<a id="nav-dashboard" class="dropdown-toggle" href="#">
<span class="ico"><i class="fa fa-bar-chart"></i></span>
</a>
</li>
<li class="nav-item dropdown" onclick="toggleView('test-view')">
<a id="nav-test" class="dropdown-toggle" href="#">
<span class="ico"><i class="fa fa-list"></i></span>
</a>
</li>
</ul>
</div>
</div>      <div class="vcontainer">
        <div class="main-content">
<div class="container-fluid p-4 view dashboard-view">
<div class="row">
<div class="col-md-3">
<div class="card"><div class="card-body">
<p class="m-b-0">Started</p>
<h3>Nov 18, 2023 02:19:45 pm</h3>
</div></div>
</div>
<div class="col-md-3">
<div class="card"><div class="card-body">
<p class="m-b-0">Ended</p>
<h3>Nov 18, 2023 02:20:10 pm</h3>
</div></div>
</div>
<div class="col-md-3">
<div class="card"><div class="card-body">
<p class="m-b-0 text-pass">Features Passed</p>
<h3>1</h3>
</div></div>
</div>
<div class="col-md-3">
<div class="card"><div class="card-body">
<p class="m-b-0 text-fail">Features Failed</p>
<h3>0</h3>
</div></div>
</div>
</div>
<div class="row">
<div class="col-md-4">
<div class="card">
<div class="card-header">
<h6 class="card-title">Features</h6>
</div>
<div class="card-body">
<div class="">
<canvas id='parent-analysis' width='115' height='90'></canvas>
</div>
</div>
<div class="card-footer">
<div><small data-tooltip='100%'>
<b>1</b> features passed
</small>
</div>
<div>
<small data-tooltip='0%'><b>0</b> features failed,
<b>0</b> skipped, <b data-tooltip='0%'>0</b> others
</small>
</div>
</div>
</div>
</div>
<div class="col-md-4">
<div class="card">
<div class="card-header">
<h6 class="card-title">Scenarios</h6>
</div>
<div class="card-body">
<div class="">
<canvas id='child-analysis' width='115' height='90'></canvas>
</div>
</div>
<div class="card-footer">
<div><small data-tooltip='100%'><b>1</b> scenarios passed</small></div>
<div>
<small data-tooltip='0%'><b>0</b> scenarios failed,
<b>0</b> skipped, <b data-tooltip='%'>0</b> others
</small>
</div>
</div>
</div>
</div>
<div class="col-md-4">
<div class="card">
<div class="card-header">
<h6 class="card-title">Steps</h6>
</div>
<div class="card-body">
<div class="">
<canvas id='grandchild-analysis' width='115' height='90'></canvas>
</div>
</div>
<div class="card-footer">
<div><small data-tooltip='100%'><b>15</b> steps passed</small></div>
<div>
<small data-tooltip='0%'><b>0</b> steps failed,
<b>0</b> skipped, <b data-tooltip='%'>0</b> others
</small>
</div>
</div>
</div>
</div>
</div>
<div class="row"><div class="col-md-12">
<div class="card"><div class="card-header"><p>Timeline</p></div>
<div class="card-body pt-0"><div>
<canvas id="timeline" height="120"></canvas>
</div></div>
</div>
</div></div>
<script>
var timeline = {
"Automate booking for Ryan Air":23.283
};
</script>
<div class="row">
<div class="col-lg-6 col-md-12 sysenv-container">
<div class="card">
<div class="card-header"><p>System/Environment</p></div>
<div class="card-body pb-0 pt-0"><table class="table table-sm table-bordered">
<thead><tr class="bg-gray"><th>Name</th><th>Value</th></tr></thead>
<tbody>
<tr>
<td>AppName</td>
<td>AutomateRyanAirLogin</td>
</tr>
<tr>
<td>user</td>
<td>KaranAtreya</td>
</tr>
<tr>
<td>build</td>
<td>1.1</td>
</tr>
<tr>
<td>os</td>
<td>Windows</td>
</tr>
</tbody>
</table></div>
</div>
</div>
</div>
</div>
<script>
var statusGroup = {
parentCount: 5,
passParent: 1,
failParent: 0,
warningParent: 0,
skipParent: 0,
childCount: 5,
passChild: 1,
failChild: 0,
warningChild: 0,
skipChild: 0,
infoChild: 0,
grandChildCount: 5,
passGrandChild: 15,
failGrandChild: 0,
warningGrandChild: 0,
skipGrandChild: 0,
infoGrandChild: 0,
eventsCount: 5,
};
</script><div class="test-wrapper row view test-view">
  <div class="test-list">
    <div class="test-list-tools">
<ul class="tools pull-left">
<li><a href="#"><span class="font-size-14">Tests</span></a></li>
</ul>
<ul class="tools text-right">
<li class="dropdown">
<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-exclamation-circle"></i></a>
<ul id="status-toggle" class="dropdown-menu dropdown-md p-v-0">
<a class="dropdown-item" status="pass" href="#"><span>Pass</span><span class="status success"></span></a>
<div class="dropdown-divider"></div>
<a status="clear" class="dropdown-item" href="#"><span>Clear</span><span class="pull-right"><i class="fa fa-close"></i></span></a>
</ul>
</li>
</ul>
</div>    <div class="test-list-wrapper scrollable">
      <ul class="test-list-item">
        <li class="test-item"  status="pass" test-id="1"
          author=""
          tag=""
          device="">
          <div class="test-detail">
            <p class="name">Automate booking for Ryan Air</p>
            <p class="text-sm">
              <span>14:19:47 pm</span> / <span>00:00:23:283</span>
              <span class="badge pass-bg log float-right">Pass</span>
            </p>
          </div>
          <div class="test-contents d-none">
<div class="detail-head">
<div class="p-v-10">
<div class="info">
<h5 class="test-status text-pass">Automate booking for Ryan Air</h5>
<span class='badge badge-success'>11.18.2023 14:19:47</span>
<span class='badge badge-danger'>11.18.2023 14:20:10</span>
<span class='badge badge-default'>00:00:23:283</span>
&middot; <span class='uri-anchor badge badge-default'>#test-id=1</span>
</div>
<div class="m-t-10 m-l-5"></div>
</div>
</div>
<div class="accordion mt-4">
  <div class="card">
    <div class="card-header" role="tab">
      <div class="card-title">
        <div class="node" id="2"><span class="badge log pass-bg mr-2">Pass</span>User is on home page and selects the options</div>
      </div>
    </div>
        <div class="collapse">
          <div class="card-body">
              <div class="step pass-bg" title="stepDefinitions.HomePageSteps.user_is_on_homepage()">
                <span>Given user is on homepage</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.HomePageSteps.user_clicks_from()">
                <span>When user clicks From</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.HomePageSteps.user_clicks_to()">
                <span>And user clicks To</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.HomePageSteps.user_selects_from_date()">
                <span>And user selects from date</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.HomePageSteps.user_selects_return_date()">
                <span>And user selects return date</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.HomePageSteps.user_selects_number_of_passengers()">
                <span>And user selects number of passengers</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.HomePageSteps.user_accepts_the_terms_and_agreement()">
                <span>And user accepts the terms and agreement</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.HomePageSteps.user_clicks_on_search_button()">
                <span>And user clicks on search button</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.SelectDesiredFlightsSteps.user_is_navigated_to_flight_selection_page_with_page_title_as(java.lang.String)">
                <span>Then user is navigated to flight selection page with Page Title as "Ryanair"</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.SelectDesiredFlightsSteps.user_clicks_on_the_first_flight()">
                <span>When user clicks on the first flight</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.SelectDesiredFlightsSteps.user_clicks_on_the_second_flight()">
                <span>And user clicks on the second flight</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.SelectDesiredFlightsSteps.user_clicks_on_continue_with_basic_fare()">
                <span>And user clicks on Continue with Basic Fare</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.SelectDesiredFlightsSteps.user_accepts_the_basic_fare_on_the_pop_up()">
                <span>And user accepts the basic fare on the pop up</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.SelectDesiredFlightsSteps.user_clicks_on_Login_Button()">
                <span>And user clicks on Login Button</span>
      <div>
      </div>
              </div>
              <div class="step pass-bg" title="stepDefinitions.SelectDesiredFlightsSteps.verify_if_the_login_window_contains_the_string(java.lang.String)">
                <span>And verify if the Login window contains the String "Make it simple with myRyanair"</span>
      <div>
      </div>
              </div>
          </div>
        </div>
  </div>
</div>
          </div>
        </li>
      </ul>
    </div>
  </div>
<div class="test-content scrollable">
<div class="test-content-tools">
<ul><li><a class="back-to-test" href="#"><i class="fa fa-arrow-left"></i></a></li></ul>
</div>
<div class="test-content-detail"><div class="detail-body"></div></div>
</div></div>
        </div>
      </div>
    </div>
  </div>
<script src="https://cdn.jsdelivr.net/gh/extent-framework/extent-github-cdn@14e9bb345ef7e2ed3a102f271d84e9f0267c88e7/spark/js/spark-script.js"></script>
<script type="text/javascript"></script></body>
</html>



















