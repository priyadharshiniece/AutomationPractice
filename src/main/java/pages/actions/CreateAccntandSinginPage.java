package pages.actions;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import base.BaseClass;
import base.Constants;
import pages.locators.CreateAccntandSignInLocators;

public class CreateAccntandSinginPage extends BaseClass {

	public CreateAccntandSignInLocators CreateAcntPage;

	public CreateAccntandSinginPage() {

		this.CreateAcntPage = new CreateAccntandSignInLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 60);
		PageFactory.initElements(factory, this.CreateAcntPage);
	}

	public void verfiyErrorCreateAcnt(String invalidEmailid) {

		CreateAcntPage.singinBtn.click();
		CreateAcntPage.CreateAccuntEmailid.sendKeys(invalidEmailid);
		CreateAcntPage.CreatAccntBtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(CreateAcntPage.CreateAcntError));
		Assert.assertTrue(CreateAcntPage.CreateAcntError.getText().trim().contains(Constants.CreateAccntInvalidEmail));

	}

	public void verfiyErrorAlreadysignedinEmail(String usedEmailid) {

		CreateAcntPage.singinBtn.click();
		CreateAcntPage.CreateAccuntEmailid.sendKeys(usedEmailid);
		CreateAcntPage.CreatAccntBtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(CreateAcntPage.CreateAcntError));
		Assert.assertTrue(CreateAcntPage.CreateAcntError.getText().contains(Constants.AlreadyUsedEmail));

	}

	public void verfiyErrorCreateAccntPage(String newEmailid) {

		CreateAcntPage.singinBtn.click();
		CreateAcntPage.CreateAccuntEmailid.sendKeys(newEmailid);
		CreateAcntPage.CreatAccntBtn.click();
		CreateAcntPage.RegisterBtn.click();
			for (int i = 0; i <CreateAcntPage.error.size()-1; i++) {
			String err = CreateAcntPage.error.get(i).getText();
			Assert.assertTrue(Constants.CreateAccntPgeError.contains(err));
			}
		}
	

	public void verfiyError1CreateAccntPage(String firstName, String lastName, String invalidpassword, String date,
			String address, String city, String State, String invalidzip, String invalidPhone) {
		CreateAcntPage.CusFirstName.click();
		CreateAcntPage.CusFirstName.clear();
		CreateAcntPage.CusFirstName.sendKeys(firstName);
		CreateAcntPage.CusLastName.click();
		CreateAcntPage.CusLastName.clear();
		CreateAcntPage.CusLastName.sendKeys(lastName);
		CreateAcntPage.CusPswd.click();
		CreateAcntPage.CusPswd.clear();
		CreateAcntPage.CusPswd.sendKeys(invalidpassword);
		Select s = new Select(CreateAcntPage.CusDays);
		s.selectByValue(date);
		CreateAcntPage.CusAddress.click();
		CreateAcntPage.CusAddress.sendKeys(address);
		CreateAcntPage.CusCity.click();
		CreateAcntPage.CusCity.sendKeys(city);
		Select s1 = new Select(CreateAcntPage.CusState);
		s1.selectByValue(State);
		CreateAcntPage.CusZip.click();
		CreateAcntPage.CusZip.clear();
		CreateAcntPage.CusZip.sendKeys(invalidzip);
		CreateAcntPage.CusPhone.click();
		CreateAcntPage.CusPhone.clear();
		CreateAcntPage.CusPhone.sendKeys(invalidPhone);
		CreateAcntPage.RegisterBtn.click();
	
		for (int i = 0; i <CreateAcntPage.error.size(); i++) {
			String err = CreateAcntPage.error.get(i).getText();
			Assert.assertTrue(Constants.CreateAccntPgeError1.contains(err));
			}
	}

	public void verfiySucessfulAcntCreationCreateAccntPage(String firstName, String lastName, String validpassword,
			String day, String month, String year, String address, String city, String State, String zip,
			String Phone) {
		CreateAcntPage.CusFirstName.click();
		CreateAcntPage.CusFirstName.clear();
		CreateAcntPage.CusFirstName.sendKeys(firstName);
		CreateAcntPage.CusLastName.click();
		CreateAcntPage.CusLastName.clear();
		CreateAcntPage.CusLastName.sendKeys(lastName);
		CreateAcntPage.CusPswd.click();
		CreateAcntPage.CusPswd.clear();
		CreateAcntPage.CusPswd.sendKeys(validpassword);
		Select s = new Select(CreateAcntPage.CusDays);
		s.selectByValue(day);
		Select s1 = new Select(CreateAcntPage.CusMonth);
		s1.selectByValue(month);
		Select s2 = new Select(CreateAcntPage.CusYear);
		s2.selectByValue(year);
		CreateAcntPage.CusAddress.click();
		CreateAcntPage.CusAddress.sendKeys(address);
		CreateAcntPage.CusCity.click();
		CreateAcntPage.CusCity.sendKeys(city);
		Select s3 = new Select(CreateAcntPage.CusState);
		s3.selectByValue(State);
		CreateAcntPage.CusZip.click();
		CreateAcntPage.CusZip.clear();
		CreateAcntPage.CusZip.sendKeys(zip);
		CreateAcntPage.CusPhone.click();
		CreateAcntPage.CusPhone.clear();
		CreateAcntPage.CusPhone.sendKeys(Phone);
		CreateAcntPage.RegisterBtn.click();
		wait.until(ExpectedConditions.visibilityOf(CreateAcntPage.CreateAcntSucessMsg));
		Assert.assertTrue(CreateAcntPage.CreateAcntSucessMsg.getText().contains(Constants.CreateAccntSucessMsg));

	}
	
	public void blankEmailPswdErrorValidation() {
	
		CreateAcntPage.singinBtn.click();
		CreateAcntPage.emailId.click();
		CreateAcntPage.login.click();
		wait.until(ExpectedConditions.visibilityOf(CreateAcntPage.loginError));
		Assert.assertTrue(CreateAcntPage.loginError.getText().contains(Constants.blankEmailError));
	}
	public void blankPswdErrorValidation(String email) {
		CreateAcntPage.emailId.sendKeys(email);
		CreateAcntPage.login.click();
		wait.until(ExpectedConditions.visibilityOf(CreateAcntPage.loginError));
		Assert.assertTrue(CreateAcntPage.loginError.getText().contains(Constants.blankPsswdErr));
	}
	public void invalidEmailErrorValidation(String invalidEmail) {
		CreateAcntPage.emailId.clear();
		CreateAcntPage.emailId.sendKeys(invalidEmail);
		CreateAcntPage.login.click();
		wait.until(ExpectedConditions.visibilityOf(CreateAcntPage.loginError));
		Assert.assertTrue(CreateAcntPage.loginError.getText().contains(Constants.invalidEmailerror));
	}
	
	public void invalidPswdErrorValidation(String vailEmail,String invalidPaswd) {
		
		CreateAcntPage.emailId.clear();
		CreateAcntPage.emailId.sendKeys(vailEmail);
		CreateAcntPage.psswd.sendKeys(invalidPaswd);
		CreateAcntPage.login.click();
		wait.until(ExpectedConditions.visibilityOf(CreateAcntPage.loginError));
	    Assert.assertTrue(CreateAcntPage.loginError.getText().contains(Constants.invalidPaswd));
	}
	
	public void verifyForgotPaswd(String validEmailid) {
		CreateAcntPage.frogotPswd.click();
		CreateAcntPage.retriveEmailId.sendKeys(validEmailid);
		CreateAcntPage.retrivePaswBtn.click();
		wait.until(ExpectedConditions.visibilityOf(CreateAcntPage.loginsucess));
		String error = Constants.retrivepasswdSuccessMsg + validEmailid;
		System.out.println(error);
		Assert.assertTrue(CreateAcntPage.loginsucess.getText().contains(error));
		CreateAcntPage.backToLoginBtn.click();
	}
	
	public void verifyLogin(String validEmailid, String validPaswd) {
		CreateAcntPage.emailId.clear();
		CreateAcntPage.emailId.sendKeys(validEmailid);
		CreateAcntPage.psswd.clear();
		CreateAcntPage.psswd.sendKeys(validPaswd);
		CreateAcntPage.login.click();
		wait.until(ExpectedConditions.visibilityOf(CreateAcntPage.myaccountHeading));
		Assert.assertTrue(CreateAcntPage.myaccountHeading.getText().equalsIgnoreCase(Constants.myAccntHeading));
	}
	
}
