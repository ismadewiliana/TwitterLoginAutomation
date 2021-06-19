# Twitter Automation using Katalon Studio
Automated web testing for [Twitter](https://www.twitter.com/) web.

## Getting Started
1. Make sure you have the [Katalon Studio](https://www.katalon.com/download/) on your device
2. Clone this repository on your project directory.
    ```sh
    $ git clone git@github.com:ismadewiliana/TwitterLoginAutomation.git
    ```
3. Open the project on your Katalon Studio
4. Open the file `Test Suites/Twitter` 
5. Click `Run` butoon to running the testing

## Check the Result Collection

### For Katalon Studio Enterprise User
Once a test suite/test suite collection finishes its execution, a historical report will be automatically generated and stored in Reports.

### Open the export result
1. Open this folder project
2. Open `Reports` and open the collection reports result. There will be in `.csv` and `.html` format.

For more information, please refer to [Katalon Studio Collection Reports](https://docs.katalon.com/katalon-studio/docs/test-suite-report.html#test-cases-list) documentation.

## BDD Testing Framework
Behavior-driven development, or BDD, is a set of practices designed to reduce wasteful behavior in software development. At its core, BDD involves thinking through desired outcomes and API structure before writing any code. Automated tests are a byproduct of the process that drives implementation.

## Automation Testing with Cucumber BDD in Katalon Studio
Basically testing is divided into two sections. Feature and Step Definition.

### Features

Feature is written in [Gherkin](https://docs.cucumber.io/gherkin/reference/) dialect. The main purpose is to define testing scenario that is understandable to both business people and the developers.

In this project all Features will be lived in `Include/features` directory. It is advised to name the feature file corresponding to the feature it defines. All Features will have `.feature` as extension.

Example:
```sh
Feature: Feature name

Scenario: Scenario name
  Given
  When
  Then
```

### Step Definition
Step Definition is defining how the feature will be performed. 

In this project all Step Definition will be lived in `Include/scripts/groovy` directory. The name for Step Definition doesn't have to be same as the feature. You can refer to step definition [documentation](https://docs.cucumber.io/cucumber/step-definitions/).

Example:
```sh
class className {

  @Given("Scenario given") {
    script
  }  
  
  @When("Scenario when") {
    script
  }
  
  @Then("Scenario then") {
    script
  }
}
```

For more information, please check the [documentation BDD Framework with Katalon Studio](https://docs.katalon.com/katalon-studio/docs/cucumber-features-file.html#add-feature-files) for the detail.
