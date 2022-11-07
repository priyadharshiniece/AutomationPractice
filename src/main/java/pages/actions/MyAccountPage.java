package pages.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;
import base.Constants;
import pages.locators.MyAccountLocators;

public class MyAccountPage extends BaseClass {
	public MyAccountLocators MyAccntPage;

	public MyAccountPage() {

		this.MyAccntPage = new MyAccountLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 60);
		PageFactory.initElements(factory, this.MyAccntPage);
	}

	public void noOrderHistory() {
		for (int i = 0; i < MyAccntPage.myacntHeading.size(); i++) {
			if (MyAccntPage.myacntHeading.get(i).getText().equalsIgnoreCase("Order history and details")) {
				MyAccntPage.myacntHeading.get(i).click();
				break;
			}
		}
		Assert.assertTrue(MyAccntPage.orderHistoryorCreditError.getText().equalsIgnoreCase(Constants.noOrderHistory));
		for (int j = 0; j < MyAccntPage.footerlink.size(); j++) {
			if (MyAccntPage.footerlink.get(j).getText().contains("Back to your account")) {
				MyAccntPage.footerlink.get(j).click();
				break;
			}
		}

	}

	public void noCreditSlips() {
		for (int i = 0; i < MyAccntPage.myacntHeading.size(); i++) {
			if (MyAccntPage.myacntHeading.get(i).getText().equalsIgnoreCase("My credit slips")) {
				MyAccntPage.myacntHeading.get(i).click();
				break;
			}
		}
		Assert.assertTrue(MyAccntPage.orderHistoryorCreditError.getText().equalsIgnoreCase(Constants.noCreditSlips));
		for (int j = 0; j < MyAccntPage.footerlink.size(); j++) {
			if (MyAccntPage.footerlink.get(j).getText().contains("Back to your account")) {
				MyAccntPage.footerlink.get(j).click();
				break;
			}
		}

	}

	public void updateAddress(String firstName) {
		for (int i = 0; i < MyAccntPage.myacntHeading.size(); i++) {
			if (MyAccntPage.myacntHeading.get(i).getText().equalsIgnoreCase("My addresses")) {
				MyAccntPage.myacntHeading.get(i).click();
				break;
			}
		}

		for (int k = 0; k < MyAccntPage.updatelinks.size(); k++) {
			if (MyAccntPage.updatelinks.get(k).getText().contains("Update")) {
				MyAccntPage.updatelinks.get(k).click();
				break;
			}
		}
		MyAccntPage.CusFirstName.click();
		MyAccntPage.CusFirstName.clear();
		MyAccntPage.CusFirstName.sendKeys(firstName);
		MyAccntPage.saveBtn.click();

		for (int i = 0; i < MyAccntPage.myAddressDtls.size();) {
			if (MyAccntPage.myAddressDtls.get(i).getText().contains(firstName)) {
				Assert.assertTrue(MyAccntPage.myAddressDtls.get(i).getText().contains(firstName));
				break;
			} else {
				i++;
			}
		}
	}

	public void deleteAddress() {

		for (int k = 0; k < MyAccntPage.updatelinks.size(); k++) {
			if (MyAccntPage.updatelinks.get(k).getText().contains("Delete")) {
				MyAccntPage.updatelinks.get(k).click();
				break;
			}
		}
		driver.switchTo().alert().accept();
		Assert.assertTrue(MyAccntPage.addressError.getText().contains(Constants.noAddress));

	}

	public void addNewAddress(String address, String city, String state, String zip, String phone) {

		MyAccntPage.newAddressBtn.click();
		MyAccntPage.address.click();
		MyAccntPage.address.sendKeys(address);
		MyAccntPage.city.click();
		MyAccntPage.city.sendKeys(city);
		Select f = new Select(MyAccntPage.state);
		f.selectByValue("4");
		MyAccntPage.zip.click();
		MyAccntPage.zip.sendKeys(zip);
		MyAccntPage.phone.click();
		MyAccntPage.phone.sendKeys(phone);
		MyAccntPage.saveBtn.click();
		for (int i = 0; i < MyAccntPage.updatelinks.size(); i++) {
			if (MyAccntPage.updatelinks.get(i).getText().equalsIgnoreCase(address)) {
				Assert.assertTrue(MyAccntPage.updatelinks.get(i).getText().equalsIgnoreCase(address));
			} else if (MyAccntPage.updatelinks.get(i).getText().equalsIgnoreCase(city)) {
				Assert.assertTrue(MyAccntPage.updatelinks.get(i).getText().equalsIgnoreCase(city));
			} else if (MyAccntPage.updatelinks.get(i).getText().contains(state)) {
				Assert.assertTrue(MyAccntPage.updatelinks.get(i).getText().contains(state));
			} else if (MyAccntPage.updatelinks.get(i).getText().equalsIgnoreCase(zip)) {
				Assert.assertTrue(MyAccntPage.updatelinks.get(i).getText().contains(zip));
			} else if (MyAccntPage.updatelinks.get(i).getText().equalsIgnoreCase(phone)) {
				Assert.assertTrue(MyAccntPage.updatelinks.get(i).getText().contains(phone));
				break;
			}
		}
		for (int j = 0; j < MyAccntPage.footerlink.size(); j++) {
			if (MyAccntPage.footerlink.get(j).getText().contains("Back to your account")) {
				MyAccntPage.footerlink.get(j).click();
				break;
			}
		}

	}

	public void updatePersonalInfo(String firstname, String pswd) {
		for (int i = 0; i < MyAccntPage.myacntHeading.size(); i++) {
			if (MyAccntPage.myacntHeading.get(i).getText().equalsIgnoreCase("My personal information")) {
				MyAccntPage.myacntHeading.get(i).click();
				break;
			}
		}
		MyAccntPage.CusFirstName.click();
		MyAccntPage.CusFirstName.clear();
		MyAccntPage.CusFirstName.sendKeys(firstname);
		MyAccntPage.passwd.click();
		MyAccntPage.passwd.sendKeys(pswd);
		MyAccntPage.saveBtn.click();
		Assert.assertTrue(
				MyAccntPage.sucessPersonalinfoMsg.getText().equalsIgnoreCase(Constants.updatePersonaleinforMsg));
		for (int j = 0; j < MyAccntPage.footerlink.size(); j++) {
			if (MyAccntPage.footerlink.get(j).getText().contains("Back to your account")) {
				MyAccntPage.footerlink.get(j).click();
				break;
			}
		}
	}

	public void createWhishList(String name) {
		for (int i = 0; i < MyAccntPage.myacntHeading.size(); i++) {
			if (MyAccntPage.myacntHeading.get(i).getText().equalsIgnoreCase("My wishlists")) {
				MyAccntPage.myacntHeading.get(i).click();
				break;
			}
		}

		MyAccntPage.wishlistName.click();
		MyAccntPage.wishlistName.sendKeys(name);
		MyAccntPage.wishlistSubmitBtn.click();
	}

	public void viewNoProductMsg() {
		MyAccntPage.viewLink.click();
		wait.until(ExpectedConditions.visibilityOf(MyAccntPage.noProducts));
		Assert.assertTrue(MyAccntPage.noProducts.getText().equalsIgnoreCase(Constants.noProducts));
	}

	public void deleteWhishlist() throws InterruptedException {

		try {

			MyAccntPage.deleteProduct.click();
			driver.switchTo().alert().accept();
			// wait.until(ExpectedConditions.visibilityOf(MyAccntPage.noProductsdiv));
			Thread.sleep(1000);
			Assert.assertTrue(MyAccntPage.viewLink.isDisplayed());
		} catch (NoSuchElementException e) {
			System.out.println("Product is deleted");
		}
	}

	public void verifySpecials() {
		MyAccntPage.specialBtn.click();
		for (int i = 0; i < MyAccntPage.productDisplyGrid.size(); i++) {

			Assert.assertTrue(MyAccntPage.productDisplyGrid.get(i).isDisplayed());
		}
		MyAccntPage.displyList.click();
		for (int i = 0; i < MyAccntPage.productDisplyGrid.size(); i++) {

			Assert.assertTrue(MyAccntPage.productDisplyGrid.get(i).isDisplayed());
		}
	}

	public void sortByLowestPrice() {
		MyAccntPage.displyList.click();
		Select s = new Select(MyAccntPage.sort);
		s.selectByValue("price:asc");
		ArrayList<String> originalnameList = new ArrayList<String>();
		ArrayList<String> copiednameList = new ArrayList<String>();
		for (int i = 0; i < MyAccntPage.productDisplyList.size(); i++) {
			originalnameList.add((MyAccntPage.disPriceList.get(i).getText()));
			System.out.println(originalnameList);
		}

		for (int j = 0; j < originalnameList.size(); j++) {
			copiednameList.add(originalnameList.get(j));
		}
		Collections.sort(copiednameList);
		System.out.println(copiednameList);
		Assert.assertTrue(originalnameList.equals(copiednameList));
	}

	public void sortByHighestPrice() {

		Select s = new Select(MyAccntPage.sort);
		s.selectByValue("price:desc");
		ArrayList<String> originalnameList = new ArrayList<String>();
		ArrayList<String> copiednameList = new ArrayList<String>();
		for (int i = 0; i < MyAccntPage.productDisplyList.size(); i++) {
			originalnameList.add((MyAccntPage.disPriceList.get(i).getText()));
			System.out.println(originalnameList);
		}

		for (int j = 0; j < originalnameList.size(); j++) {
			copiednameList.add(originalnameList.get(j));
		}
		Collections.sort(copiednameList);
		Collections.reverse(copiednameList);
		System.out.println(copiednameList);
		Assert.assertTrue(originalnameList.equals(copiednameList));
	}

	public void sortByProductAsc() {
		MyAccntPage.displyList.click();
		Select s = new Select(MyAccntPage.sort);
		s.selectByValue("name:asc");
		ArrayList<String> originalnameList = new ArrayList<String>();
		ArrayList<String> copiednameList = new ArrayList<String>();
		for (int i = 0; i < MyAccntPage.productDisplyList.size(); i++) {
			originalnameList.add((MyAccntPage.productNameList.get(i).getText()));
			System.out.println(originalnameList);
		}

		for (int j = 0; j < originalnameList.size(); j++) {
			copiednameList.add(originalnameList.get(j));
		}
		Collections.sort(copiednameList);
		System.out.println(copiednameList);
		Assert.assertTrue(originalnameList.equals(copiednameList));
	}

	public void sortByProductDsc() {

		Select s = new Select(MyAccntPage.sort);
		s.selectByValue("name:desc");
		ArrayList<String> originalnameList = new ArrayList<String>();
		ArrayList<String> copiednameList = new ArrayList<String>();
		for (int i = 0; i < MyAccntPage.productDisplyList.size(); i++) {
			originalnameList.add((MyAccntPage.productNameList.get(i).getText()));
			System.out.println(originalnameList);
		}

		for (int j = 0; j < originalnameList.size(); j++) {
			copiednameList.add(originalnameList.get(j));
		}
		Collections.sort(copiednameList);
		Collections.reverse(copiednameList);
		System.out.println(copiednameList);
		Assert.assertTrue(originalnameList.equals(copiednameList));
	}

	public void sortByDiscountAsc() {
		MyAccntPage.displyList.click();
		Select s = new Select(MyAccntPage.sort);
		s.selectByValue("reference:asc");
		ArrayList<String> originalnameList = new ArrayList<String>();
		ArrayList<String> copiednameList = new ArrayList<String>();
		for (int i = 0; i < MyAccntPage.productDisplyList.size(); i++) {
			originalnameList.add((MyAccntPage.discountList.get(i).getText()));
			System.out.println(originalnameList);
		}

		for (int j = 0; j < originalnameList.size(); j++) {
			copiednameList.add(originalnameList.get(j));
		}
		Collections.sort(copiednameList);
		Collections.reverse(copiednameList);
		System.out.println(copiednameList);
		Assert.assertTrue(originalnameList.equals(copiednameList));
	}

	public void sortByDiscountDsc() {

		Select s = new Select(MyAccntPage.sort);
		s.selectByValue("reference:desc");
		ArrayList<String> originalnameList = new ArrayList<String>();
		ArrayList<String> copiednameList = new ArrayList<String>();
		for (int i = 0; i < MyAccntPage.productDisplyList.size(); i++) {
			originalnameList.add((MyAccntPage.discountList.get(i).getText()));
			System.out.println(originalnameList);
		}

		for (int j = 0; j < originalnameList.size(); j++) {
			copiednameList.add(originalnameList.get(j));
		}
		Collections.sort(copiednameList);
		System.out.println(copiednameList);
		Assert.assertTrue(originalnameList.equals(copiednameList));
	}

	public void viewStore() {

		// open the link in new tab
		String i = Keys.chord(Keys.CONTROL, Keys.ENTER);
		MyAccntPage.storesBtn.sendKeys(i);
		// storing the main tab
		String mainWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(mainWindow)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		Assert.assertTrue(MyAccntPage.storeTitle.getText().equalsIgnoreCase("OUR STORE(S)!"));
		// closing the newly opened tab and switching the control to main/default tab
		driver.close();
		driver.switchTo().window(mainWindow);

	}

	public void VerifyRecentlyViewedPrdt() {

		for (int i = 0; i < MyAccntPage.topSellerProductNameList.size(); i++) {
			if (MyAccntPage.topSellerProductNameList.get(i).getText()
					.equalsIgnoreCase(Constants.topsellerProdcutName)) {
				MyAccntPage.topSellerProductNameList.get(i).click();
				driver.navigate().back();
			} else if (MyAccntPage.topSellerProductNameList.get(i).getText()
					.equalsIgnoreCase(Constants.topsellerProdcutName1)) {
				MyAccntPage.topSellerProductNameList.get(i).click();
				driver.navigate().back();
				break;
			}
		}
		MyAccntPage.myaccntBtnTop.click();
		for (int k = 0; k < MyAccntPage.myacntHeading.size(); k++) {
			if (MyAccntPage.myacntHeading.get(k).getText().equalsIgnoreCase("My wishlists")) {
				MyAccntPage.myacntHeading.get(k).click();
				break;
			}
		}

		for (int j = 0; j < MyAccntPage.viewedPrdList.size(); j++) {
			if (MyAccntPage.viewedPrdList.get(j).getText().equalsIgnoreCase(Constants.topsellerProdcutName)) {
				Assert.assertTrue(
						MyAccntPage.viewedPrdList.get(j).getText().equalsIgnoreCase(Constants.topsellerProdcutName));
			} else if (MyAccntPage.viewedPrdList.get(j).getText().equalsIgnoreCase(Constants.topsellerProdcutName1)) {
				Assert.assertTrue(
						MyAccntPage.viewedPrdList.get(j).getText().equalsIgnoreCase(Constants.topsellerProdcutName1));
			}
		}

	}
	
	public void verifyInfo() {
		for(int i=0; i<MyAccntPage.infoList.size(); i++) {
			if(MyAccntPage.infoList.get(i).getText().equalsIgnoreCase(Constants.Deliveryinfo)) {
				String key = Keys.chord(Keys.CONTROL, Keys.ENTER);
				MyAccntPage.infoList.get(i).sendKeys(key);
				Set<String> mainWindow = driver.getWindowHandles();
				Iterator<String>it =mainWindow.iterator();
				String parentId =it.next();
				String childId = it.next();
				driver.switchTo().window(childId);
				Assert.assertTrue(MyAccntPage.PageDetails.getText().equalsIgnoreCase(Constants.delivery));
				driver.close();
				driver.switchTo().window(parentId);
			}else if(MyAccntPage.infoList.get(i).getText().equalsIgnoreCase(Constants.legalinfo)) {
				String key = Keys.chord(Keys.CONTROL, Keys.ENTER);
				MyAccntPage.infoList.get(i).sendKeys(key);
				Set<String> mainWindow = driver.getWindowHandles();
				Iterator<String>it =mainWindow.iterator();
				String parentId =it.next();
				String childId = it.next();
				driver.switchTo().window(childId);
				Assert.assertTrue(MyAccntPage.PageDetails.getText().equalsIgnoreCase(Constants.legal));
				driver.close();
				driver.switchTo().window(parentId);
			}else if(MyAccntPage.infoList.get(i).getText().equalsIgnoreCase(Constants.payents)) {
				String key = Keys.chord(Keys.CONTROL, Keys.ENTER);
				MyAccntPage.infoList.get(i).sendKeys(key);
				Set<String> mainWindow = driver.getWindowHandles();
				Iterator<String>it =mainWindow.iterator();
				String parentId =it.next();
				String childId = it.next();
				driver.switchTo().window(childId);
				Assert.assertTrue(MyAccntPage.PageDetails.getText().equalsIgnoreCase(Constants.payents));
				driver.close();
				driver.switchTo().window(parentId);
			}else if(MyAccntPage.infoList.get(i).getText().equalsIgnoreCase(Constants.ourStore)) {
				String key = Keys.chord(Keys.CONTROL, Keys.ENTER);
				MyAccntPage.infoList.get(i).sendKeys(key);
				Set<String> mainWindow = driver.getWindowHandles();
				Iterator<String>it =mainWindow.iterator();
				String parentId =it.next();
				String childId = it.next();
				driver.switchTo().window(childId);
				Assert.assertTrue(MyAccntPage.abtUsandTc.getText().equalsIgnoreCase(Constants.store));
				driver.close();
				driver.switchTo().window(parentId);
			}else if(MyAccntPage.infoList.get(i).getText().equalsIgnoreCase(Constants.tc)) {
				String key = Keys.chord(Keys.CONTROL, Keys.ENTER);
				MyAccntPage.infoList.get(i).sendKeys(key);
				Set<String> mainWindow = driver.getWindowHandles();
				Iterator<String>it =mainWindow.iterator();
				String parentId =it.next();
				String childId = it.next();
				driver.switchTo().window(childId);
				Assert.assertTrue(MyAccntPage.abtUsandTc.getText().equalsIgnoreCase(Constants.tc));
				driver.close();
				driver.switchTo().window(parentId);
			}else if(MyAccntPage.infoList.get(i).getText().equalsIgnoreCase(Constants.about)) {
				String key = Keys.chord(Keys.CONTROL, Keys.ENTER);
				MyAccntPage.infoList.get(i).sendKeys(key);
				Set<String> mainWindow = driver.getWindowHandles();
				Iterator<String>it =mainWindow.iterator();
				String parentId =it.next();
				String childId = it.next();
				driver.switchTo().window(childId);
				Assert.assertTrue(MyAccntPage.abtUsandTc.getText().equalsIgnoreCase(Constants.about));
				driver.close();
				driver.switchTo().window(parentId);
			}
		}
	}
	
	public void verifyLogout() {
		MyAccntPage.logoutBtn.click();
		Assert.assertTrue(MyAccntPage.logoutInfo.getText().equalsIgnoreCase(Constants.login));
	}

}
