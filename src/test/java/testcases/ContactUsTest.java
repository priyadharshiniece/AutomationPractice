package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.actions.ContactUsPage;

public class ContactUsTest {

	@Test(dataProvider = "getData")
	public void sendMsg(String email, String ref, String msg) {

		ContactUsPage cp = new ContactUsPage();
		cp.verifyCustomerMsg(email, ref, msg);

	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[1][3];
		data[0][0] = "odkd@gmail.com";
		data[0][1] = "test";
		data[0][2] = "This is the first message";

		return data;

	}

	@Test(dataProvider = "getData1")
	public void ContactusemailError(String invalidemailid) {

		ContactUsPage cp = new ContactUsPage();
		cp.verifyContactusinvalidEmailErrMsg(invalidemailid);

	}

	@Test(dataProvider = "getData2")
	public void ContactusMsgError(String validemailid) {

		ContactUsPage cp = new ContactUsPage();
		cp.verifyContactusMsgErr(validemailid);

	}

	@Test(dataProvider = "getData3")
	public void ContactusSubjectError(String validemailid, String Msg) {

		ContactUsPage cp = new ContactUsPage();
		cp.verifyContactusSubjectErr(validemailid, Msg);

	}

	@Test
	public void contactusBlankerror() {
		ContactUsPage cp = new ContactUsPage();
		cp.ContactusBlankerr();

	}

	@DataProvider
	public Object[][] getData1() {

		Object[][] data = new Object[1][1];
		data[0][0] = "a@gom";
		return data;

	}

	@DataProvider
	public Object[][] getData2() {

		Object[][] data = new Object[1][1];
		data[0][0] = "qabc@gmail.com";
		return data;

	}

	@DataProvider
	public Object[][] getData3() {

		Object[][] data = new Object[1][2];
		data[0][0] = "ski@gmail.com";
		data[0][1] = "This is the first message";

		return data;

	}

	// create account new email id
	@DataProvider
	public Object[][] getData4() {

		Object[][] data = new Object[1][1];
		data[0][0] = "dsadadtt@gmail.com";
		return data;

	}

	@DataProvider
	public Object[][] getData5() {

		Object[][] data = new Object[1][9];
		data[0][0] = "test";
		data[0][1] = "qa";
		data[0][2] = "12";
		data[0][3] = "3";
		data[0][4] = "coimbatore";
		data[0][5] = "Bombay";
		data[0][6] = "4";
		data[0][7] = "14";
		data[0][8] = "dsfs";
		return data;

	}

	@DataProvider
	public Object[][] getData6() {

		Object[][] data = new Object[1][11];
		data[0][0] = "test";
		data[0][1] = "qa";
		data[0][2] = "12345";
		data[0][3] = "3";
		data[0][4] = "4";
		data[0][5] = "2016";
		data[0][6] = "coimbatore";
		data[0][7] = "Bombay";
		data[0][8] = "4";
		data[0][9] = "14236";
		data[0][10] = "1236547896";

		return data;

	}

	@DataProvider
	public Object[][] getData7() {

		Object[][] data = new Object[1][1];
		data[0][0] = "tet";
		return data;
	}

	@DataProvider
	public Object[][] getData8() {

		Object[][] data = new Object[1][5];
		data[0][0] = "coimbatore";
		data[0][1] = "Bombay";
		data[0][2] = "4";
		data[0][3] = "14236";
		data[0][4] = "1236547896";
		return data;
	}

	@DataProvider
	public Object[][] getData9() {

		Object[][] data = new Object[1][2];
		data[0][0] = "qabc@gmail.com";
		data[0][1] = "test123456";
		return data;
	}
	
	@DataProvider
	public Object[][] getData10() {

		Object[][] data = new Object[1][2];
		data[0][0] = "qabc@gmail.com";
		data[0][1] = "tet";
		return data;

	}
	/*
	 * @AfterTest public void quit() { BaseClass.quit(); }
	 */
}
