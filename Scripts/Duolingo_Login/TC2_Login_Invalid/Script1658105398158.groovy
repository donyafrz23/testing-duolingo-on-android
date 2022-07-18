import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\Testing\\Belajar Testing\\Duolingo\\androidapp\\Duolingo language lessons_v5.65.6_apkpure.com.apk', 
    true)

Mobile.tap(findTestObject('Page_Duolingo/android.widget.TextView - I ALREADY HAVE AN ACCOUNT'), 0)

Mobile.setText(findTestObject('Page_Duolingo/android.widget.EditText - Username or email'), 'email@email.com', 0)

Mobile.setEncryptedText(findTestObject('Page_Duolingo/android.widget.EditText - Password'), 'aeHFOx8jV/A=', 0)

Mobile.tap(findTestObject('Page_Duolingo/android.widget.TextView - SIGN IN'), 0)

Mobile.getText(findTestObject('Object Repository/Page_Duolingo/android.widget.TextView - Wrong username or password'), 0)

Mobile.takeScreenshot('C:\\Users\\Dony\\AppData\\Local\\Temp\\screenshot8396533729719281245.png')

Mobile.closeApplication()

