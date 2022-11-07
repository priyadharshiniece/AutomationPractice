package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsLocators {
	
	//contact us
	
	@FindBy(id="contact-link")
	public WebElement contactUs;
	
	@FindBy(id="id_contact")
	public WebElement shoppingHeading;
	
	@FindBy(id="email")
	public WebElement emailId;
	
	@FindBy(id="id_order")
	public WebElement orderRef;
	
	@FindBy(id="message")
	public WebElement message;
	
	@FindBy(id="submitMessage")
	public WebElement submitBtn;
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	public WebElement sucessMsg;
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	public WebElement invalidMsg;
	

}
