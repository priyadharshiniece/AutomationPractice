package base;

public class Constants extends BaseClass{
	
	public static String url = "http://automationpractice.com/index.php";
	//public static String url = "http://automationpractice.com/index.php?controller=prices-drop";
	//public static String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	public static int implicitwait = 10;
	public static String browser ="chrome";
	public static String CallUs = "0123-456-789";
	
	//Contact US Page
	public static String SucessMsg = "Your message has been successfully sent to our team.";
	public static String invalidEmailidMsg = "Invalid email address.";
	public static String invalidMsg = "The message cannot be blank.";
	public static String invalidSubjectMsg = "Please select a subject from the list provided.";
	
	//Create Account
	
	public static String CreateAccntInvalidEmail  = "Invalid email address";
	public static String AlreadyUsedEmail = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
	
 // 'create Account Page error
	public static String CreateAccntPgeError1 ="There are 4 errors passwd is invalid. phone_mobile is invalid.The Zip/Postal code you've entered is invalid. It must follow this format: 00000 Invalid date of birth";
	public static String CreateAccntPgeError = "You must register at least one phone number. lastname is required. firstname is required. passwd is required. address1 is required. city is required. The Zip/Postal code you've entered is invalid. It must follow this format: 00000";
	public static String CreateAccntSucessMsg = "Welcome to your account. Here you can manage all of your personal information and orders.";
	
	//MyAccount PAge
	
	public static String noOrderHistory = "You have not placed any orders.";
	public static String noCreditSlips ="You have not received any credit slips.";
	public static String noAddress ="No addresses are available.";
	public static String updatePersonaleinforMsg = "Your personal information has been successfully updated.";
	public static String noProducts = "No products";
	
	
	//MYWhishList
	
	public static String topsellerProdcutName = "Blouse";
	public static String topsellerProdcutName1 = "Printed Summer Dress";
	
	//Information
	public static String legal = "Legal";
	public static String delivery ="Shipments and returns";
	public static String payents="Secure payment";
	public static String tc ="TERMS AND CONDITIONS OF USE";
	public static String about ="ABOUT US";
	public static String store ="OUR STORE(S)!";
	public static String Deliveryinfo = "Delivery";
	public static String legalinfo = "Legal Notice";
	public static String ourStore = "Our stores";
	
	//login
	public static String login = "AUTHENTICATION";
	public static String singinblankError ="An email address required.";
	public static String invalidEmailerror="Invalid email address.";
	public static String invalidPaswd ="Invalid password.";
	public static String blankEmailError= "An email address required.";
	public static String blankPsswdErr = "Password is required.";
	public static String retrivepasswdSuccessMsg = "A confirmation email has been sent to your address: ";
	public static String myAccntHeading = "MY ACCOUNT";
	
}
