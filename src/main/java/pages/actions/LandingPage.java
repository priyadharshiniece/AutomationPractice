package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import base.BaseClass;
import base.Constants;
import pages.locators.LandingLocators;

public class LandingPage extends BaseClass {

	public LandingLocators landingPage;

	public LandingPage() {

		this.landingPage = new LandingLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 60);
		PageFactory.initElements(factory, this.landingPage);
	}

	
	
	public void CallusNow() {
		System.out.println(landingPage.callusNow.getText());
		Assert.assertEquals(landingPage.callusNow.getText(), Constants.CallUs);
		
	}


}
