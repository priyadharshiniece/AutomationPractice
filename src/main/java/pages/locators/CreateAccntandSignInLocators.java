package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccntandSignInLocators {
	
	// sign in
	
	@FindBy(xpath="//div[@class='header_user_info']//a")
	public WebElement singinBtn;
	
	//create account

	@FindBy(id="email_create")
	public WebElement CreateAccuntEmailid;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	public WebElement CreatAccntBtn;
	
	@FindBy(id="create_account_error")
	public WebElement CreateAcntError;
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	public WebElement CreateAcntPgeError;
	
	@FindBy(id="customer_firstname")
	public WebElement CusFirstName;
	
	@FindBy(id="customer_lastname")
	public WebElement CusLastName;

	@FindBy(id="email")
	public WebElement CusEmail;

	@FindBy(id="passwd")
	public WebElement CusPswd;

	@FindBy(id="days")
	public WebElement CusDays;

	@FindBy(id="months")
	public WebElement CusMonth;

	@FindBy(id="years")
	public WebElement CusYear;

	@FindBy(id="address1")
	public WebElement CusAddress;

	@FindBy(id="city")
	public WebElement CusCity;

	@FindBy(id="id_state")
	public WebElement CusState;
	
	@FindBy(id="postcode")
	public WebElement CusZip;

	@FindBy(id="phone_mobile")
	public WebElement CusPhone;
	
	@FindBy(id="submitAccount")
	public WebElement RegisterBtn;
	
	@FindBy(css="div[id='center_column'] p")
	public WebElement CreateAcntSucessMsg;
	
	@FindBy(xpath="//div[@class='alert alert-danger']//li")
	public List<WebElement> error;
	
	//Login
	
	@FindBy(xpath="//p[@class='lost_password form-group']//a")
	public WebElement frogotPswd;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement emailId;
	
	@FindBy(xpath="//input[@id='passwd']")
	public WebElement psswd;
	
	@FindBy(xpath="//i[@class='icon-lock left']")
	public WebElement login;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement retriveEmailId;
	
	@FindBy(xpath="//button[@class='btn btn-default button button-medium']")
	public WebElement retrivePaswBtn;
	
	@FindBy(xpath="//div[@class='alert alert-danger']//li")
	public WebElement loginError;
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	public WebElement loginsucess;

	
	@FindBy(xpath="//span[normalize-space()='Back to Login']")
	public WebElement backToLoginBtn;
	
	@FindBy(xpath="//div[@id='center_column']//h1")
	public WebElement myaccountHeading;
	//shortcut login to be reomoved once pjt is complete
	/*
	 * @FindBy(xpath="//div[@class='header_user_info']//a[@class='login']") public
	 * WebElement singninBtnMyaccnt;
	 */
}