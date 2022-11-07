package testcases;

import org.testng.annotations.Test;

import pages.actions.CreateAccntandSinginPage;

public class LoginPageTest {
	
	@Test(priority = 1)
	public void verifyblankEmailandPaswdError() {
		CreateAccntandSinginPage ca = new CreateAccntandSinginPage();
		ca.blankEmailPswdErrorValidation();
	}
	
	@Test(priority = 2, dataProviderClass = ContactUsTest.class, dataProvider = "getData2")
	public void verifyblankPasswdError(String vaildEmail) {
		CreateAccntandSinginPage ca = new CreateAccntandSinginPage();
		ca.blankPswdErrorValidation(vaildEmail);
	}
	
	@Test(priority = 3, dataProviderClass = ContactUsTest.class, dataProvider = "getData1")
	public void  verifyinvaidEmailError(String invaildEmail) {
		CreateAccntandSinginPage ca = new CreateAccntandSinginPage();
		ca.invalidEmailErrorValidation(invaildEmail);
	}
	
	@Test(priority = 4, dataProviderClass = ContactUsTest.class, dataProvider = "getData10")
	public void verifyinvalidPswdError(String validEmail,String invaildpswd) {
		CreateAccntandSinginPage ca = new CreateAccntandSinginPage();
		ca.invalidPswdErrorValidation(validEmail,invaildpswd);
	}
	
	@Test(priority = 5, dataProviderClass = ContactUsTest.class, dataProvider = "getData2")
	public void verifyFogotPaswd(String vaildEmail) {
		CreateAccntandSinginPage ca = new CreateAccntandSinginPage();
		ca.verifyForgotPaswd(vaildEmail);
	}
		
	@Test(priority = 6, dataProviderClass = ContactUsTest.class, dataProvider = "getData9")
	public void verifyLogin(String vaildEmail,String vaildPaswd) {
		CreateAccntandSinginPage ca = new CreateAccntandSinginPage();
		ca.verifyLogin(vaildEmail,vaildPaswd);
	}

}
