package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to landing page")
	def navigateToLandingPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.twitter.com/')
	}

	@When("User click login button on landing page")
	def buttonLoginLandingPage() {
		WebUI.click(findTestObject('Page_Landing/LoginButton'))
	}

	@And("User input username (.*)")
	def inputUsername(String username) {
		WebUI.setText(findTestObject('Page_Login/input_username'), username)
	}

	@And("User input password (.*)")
	def inputPassword(String password) {
		WebUI.setEncryptedText(findTestObject('Page_Login/input_password'), password)
	}

	@And("User click login button")
	def buttonLoginPageLogin() {
		WebUI.click(findTestObject('Page_Login/LoginButton'))
	}

	@Then("User navigate to home page")
	def VerifyHeaderHome() {
		WebUI.verifyElementPresent(findTestObject('Home/Header_Home'), 5)
	}

	@And("Close Browser")
	def closeBrowser() {
		WebUI.closeBrowser()
	}
}