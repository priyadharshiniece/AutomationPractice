package testcases;

import org.testng.annotations.Test;

import pages.actions.CreateAccntandSinginPage;

public class CreateAccntTest {

	@Test(priority = 1, dataProviderClass = ContactUsTest.class, dataProvider = "getData1")
	public void VerifyInvalidEmailCreateAcnt(String invalidEmailid) {
		CreateAccntandSinginPage ca = new CreateAccntandSinginPage();
		ca.verfiyErrorCreateAcnt(invalidEmailid);
	}

	@Test(priority = 2, dataProviderClass = ContactUsTest.class, dataProvider = "getData2")
	public void VerifyRegEmailCreateAcnt(String usedEmailid) {
		CreateAccntandSinginPage ca = new CreateAccntandSinginPage();
		ca.verfiyErrorAlreadysignedinEmail(usedEmailid);
	}

	@Test(priority = 3, dataProviderClass = ContactUsTest.class, dataProvider = "getData4")
	public void VerifyNewEmailCreateAcnt(String newEmailid) {
		CreateAccntandSinginPage ca = new CreateAccntandSinginPage();
		ca.verfiyErrorCreateAccntPage(newEmailid);
	}

	@Test(priority = 4, dataProviderClass = ContactUsTest.class, dataProvider = "getData5")
	public void VerifyErrorsCreateAcnt(String firstName, String lastName, String invalidpassword, String date,
			String address, String city, String State, String invalidzip, String invalidPhone) {
		CreateAccntandSinginPage ca = new CreateAccntandSinginPage();
		ca.verfiyError1CreateAccntPage(firstName, lastName, invalidpassword, date, address, city, State, invalidzip,
				invalidPhone);
	}

	@Test(priority = 5, dataProviderClass = ContactUsTest.class, dataProvider = "getData6")
	public void VerifySucessAcntCreation(String firstName, String lastName, String validpassword, String day,
			String month, String year, String address, String city, String State, String zip, String Phone) {
		CreateAccntandSinginPage ca = new CreateAccntandSinginPage();
		ca.verfiySucessfulAcntCreationCreateAccntPage(firstName, lastName, validpassword, day, month, year, address,
				city, State, zip, Phone);
	}
	

	

}
