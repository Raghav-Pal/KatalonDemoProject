import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://lifecharger.org/')

WebUI.click(findTestObject('Page_Life Charger   a new beginning/a_Break It Win It'))

WebUI.click(findTestObject('Object Repository/Page_Break It Win It  Life Charger/a_Home'))

WebUI.click(findTestObject('Page_Life Charger   a new beginning/a_Archives'))

WebUI.click(findTestObject('Object Repository/Page_Archives  Life Charger/h1_Life Charger'))

WebUI.setText(findTestObject('Page_Life Charger   a new beginning/input_Search for_s'), 'life')

WebUI.sendKeys(findTestObject('Page_Life Charger   a new beginning/input_Search for_s'), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

