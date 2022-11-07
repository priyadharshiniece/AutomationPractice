package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.BaseClass;
import base.Constants;

import pages.locators.ContactUsLocators;

public class ContactUsPage extends BaseClass {

	public ContactUsLocators ContactUsPage;

	public ContactUsPage() {

		this.ContactUsPage = new ContactUsLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 60);
		PageFactory.initElements(factory, this.ContactUsPage);
	}

	public void verifyCustomerMsg(String emailId, String orderRef, String Msg) {

		ContactUsPage.contactUs.click();
		Select subject = new Select(ContactUsPage.shoppingHeading);
		subject.selectByValue("1");
		ContactUsPage.emailId.sendKeys(emailId);
		ContactUsPage.orderRef.sendKeys(orderRef);
		ContactUsPage.message.sendKeys(Msg);
		ContactUsPage.submitBtn.click();
	}

	public void ContactusBlankerr() {

		ContactUsPage.contactUs.click();
		ContactUsPage.submitBtn.click();
		Assert.assertTrue(ContactUsPage.invalidMsg.getText().trim().contains(Constants.invalidEmailidMsg));
	}

	public void verifyContactusinvalidEmailErrMsg(String invalidEmailid) {

		ContactUsPage.emailId.clear();
		ContactUsPage.emailId.sendKeys(invalidEmailid);
		ContactUsPage.submitBtn.click();
		Assert.assertTrue(ContactUsPage.invalidMsg.getText().trim().contains(Constants.invalidEmailidMsg));
	}

	public void verifyContactusMsgErr(String validEmailid) {
		
		ContactUsPage.contactUs.click();
		Select subject = new Select(ContactUsPage.shoppingHeading);
		subject.selectByValue("1");
		ContactUsPage.emailId.clear();
		ContactUsPage.emailId.sendKeys(validEmailid);
		ContactUsPage.submitBtn.click();
		Assert.assertTrue(ContactUsPage.invalidMsg.getText().trim().contains(Constants.invalidMsg));

	}

	public void verifyContactusSubjectErr(String validEmailid, String Msg) {
		
		ContactUsPage.contactUs.click();
		ContactUsPage.emailId.clear();
		ContactUsPage.emailId.sendKeys(validEmailid);
		ContactUsPage.message.sendKeys(Msg);
		ContactUsPage.submitBtn.click();
		Assert.assertTrue(ContactUsPage.invalidMsg.getText().trim().contains(Constants.invalidSubjectMsg));

	}
	
	
}
