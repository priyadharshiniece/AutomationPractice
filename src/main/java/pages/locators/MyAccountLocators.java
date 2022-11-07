package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountLocators {
	
	@FindBy(xpath="//div[@class='row addresses-lists']//li//span")
	public List<WebElement> myacntHeading;

	@FindBy(xpath="//div[@id='block-history']/p")
	public WebElement orderHistoryorCreditError;
	
	@FindBy(xpath="//ul[@class='footer_links clearfix']//span")
	public List<WebElement> footerlink;
	
	@FindBy(xpath="//li[@class='address_update']//span")
	public List<WebElement> updatelinks;
		
	@FindBy(xpath="//button[@id='submitAddress']")
	public WebElement saveBtn;
	
	@FindBy(xpath="//ul[@class='last_item item box']//li")
	public List<WebElement> myAddressDtls;

	@FindBy(xpath="//div[@class='clearfix main-page-indent']//a")
	public WebElement newAddressBtn;
	
	@FindBy(xpath="//div[@class='box']//p")
	public WebElement sucessPersonalinfoMsg;
	
	@FindBy(id="address1")
	public WebElement address;
	
	@FindBy(id="city")
	public WebElement city;
	
	@FindBy(id="id_state")
	public WebElement state;
	
	@FindBy(id="postcode")
	public WebElement zip;
	
	@FindBy(id="phone_mobile")
	public WebElement phone;
	
	@FindBy(id="old_passwd")
	public WebElement passwd;
	
	@FindBy(id="name")
	public WebElement wishlistName;
	
	@FindBy(id="submitWishlist")
	public WebElement wishlistSubmitBtn;
	
	@FindBy(id="firstname")
	public WebElement CusFirstName;
	
	@FindBy(xpath="//div[@id='columns']//p[2]")
	public WebElement addressError;
	
	@FindBy(xpath="//div[@id='block-history']//table//tbody//tr[1]//td[5]//a")
	public WebElement viewLink;
	
	@FindBy(xpath="//div[@id='block-history']//table//tbody//tr[1]//td[6]//a")
	public WebElement deleteProduct;
	
	@FindBy(xpath="//div[@id='block-order-detail']//p")
	public WebElement noProducts;
	
	@FindBy(xpath="//div[@id='mywishlist']//div[@id='block-order-detail']")
	public WebElement noProductsdiv;
	
	
	//specials
	
	@FindBy(xpath="//div[@class='block_content products-block']//div//a//span")
	public WebElement specialBtn;
	
	@FindBy(xpath="//body/div[@id='page']/div/div[@id='columns']/div/div[@id='center_column']/ul[1]//li[contains(@class,'ajax')]")
	public List<WebElement> productDisplyGrid;
	
	@FindBy(xpath="//body/div[@id='page']/div/div[@id='columns']/div/div[@id='center_column']/ul//li[contains(@class,'ajax')]")
	public List<WebElement> productDisplyList;
	
	@FindBy(xpath="//li[@id='grid']")
	public WebElement displyGrid;
	
	@FindBy(xpath="//li[@id='list']")
	public WebElement displyList;	
	
	@FindBy(xpath="//select[@id='selectProductSort']")
	public WebElement sort;
	
	@FindBy(xpath="//div[@class='content_price col-xs-5 col-md-12']//span[@class='price product-price']")
	public List<WebElement> disPriceList;
	
	@FindBy(xpath="//div[@class='center-block col-xs-4 col-xs-7 col-md-4']//h5")
	public List<WebElement> productNameList;
	
	@FindBy(xpath="//div[@class='content_price col-xs-5 col-md-12']//span[@class='price-percent-reduction']")
	public List<WebElement> discountList;
	
	@FindBy(xpath="//div[@id='stores_block_left']//a[@class='btn btn-default button button-small']")
	public WebElement storesBtn;
	
	@FindBy(xpath="//div[@id='center_column']//h1")
	public WebElement storeTitle;
	
	//MyWhislist ---- Top Seller
	
	@FindBy(xpath="//ul[@class='block_content products-block']//li//a[@class='product-name']")
	public List<WebElement> topSellerProductNameList;
	
	@FindBy(xpath="//div[@class='breadcrumb clearfix']//a[2]")
	public WebElement myaacntBtn;
	
	@FindBy(xpath="//div[@id='viewed-products_block_left']//li//a[@class='product-name']")
	public  List<WebElement> viewedPrdList;
	
	@FindBy(xpath="//div[@class='header_user_info']//a[@class='account']")
	public WebElement myaccntBtnTop;
	
	@FindBy(xpath="//div[@class='header_user_info']//a[@class='logout']")
	public WebElement logoutBtn;
	
	//Information Section
	
	@FindBy(xpath="//section[@id='informations_block_left_1']//li//a")
	public  List<WebElement> infoList;
	
	@FindBy(xpath="//div[@id='center_column']//h2")
	public WebElement PageDetails;
	
	@FindBy(xpath="//div[@id='center_column']//h1")
	public WebElement abtUsandTc;
		
	@FindBy(xpath="//div[@id='center_column']//h1")
	public WebElement logoutInfo;
	
}
