package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.actions.LandingPage;


public class LandingPageTest  {
	
	@BeforeTest
	public void init() {
		BaseClass.initConfig();
	}

		@Test	
		public void callusNow() {
			LandingPage lp = new LandingPage();
			lp.CallusNow();
			
		}
}
